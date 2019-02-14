#include <mbgl/mbgl.hpp>

#include <mbgl/util/thread_pool.hpp>

#include <cassert>
#include <memory>
#include <thread>

namespace mbgl {

std::unique_ptr<ThreadPool> g_backgroundScheduler;

void Init() {
    assert(!g_backgroundScheduler);
    g_backgroundScheduler = std::make_unique<ThreadPool>(4);
}

void Cleanup() {
    assert(g_backgroundScheduler);
    g_backgroundScheduler.reset();
}

} // namespace mbgl