#include <mbgl/actor/scheduler.hpp>
#include <mbgl/util/thread_local.hpp>
#include <mbgl/util/thread_pool.hpp>

namespace mbgl {

extern std::unique_ptr<ThreadPool> g_backgroundScheduler;

static auto& current() {
    static util::ThreadLocal<Scheduler> scheduler;
    return scheduler;
};

void Scheduler::SetCurrent(Scheduler* scheduler) {
    current().set(scheduler);
}

Scheduler* Scheduler::GetCurrent() {
    return current().get();
}

// static
Scheduler& Scheduler::GetBackground() {
    return *g_backgroundScheduler;
}

} //namespace mbgl
