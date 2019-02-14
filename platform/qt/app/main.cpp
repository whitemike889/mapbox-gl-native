#include "mapwindow.hpp"

#include <QApplication>

#include <cstdlib>

int main(int argc, char **argv)
{
    QApplication app(argc, argv);

    QMapbox::init();
    atexit([] { QMapbox::cleanup(); });

    QMapboxGLSettings settings;
    settings.setCacheDatabasePath("/tmp/mbgl-cache.db");
    settings.setCacheDatabaseMaximumSize(20 * 1024 * 1024);

    MapWindow window(settings);

    window.resize(800, 600);
    window.show();

    if (argc == 2 && QString("--test") == argv[1]) {
        window.selfTest();
    }

    return app.exec();
}
