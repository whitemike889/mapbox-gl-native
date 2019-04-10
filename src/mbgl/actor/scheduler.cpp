#include <mbgl/actor/scheduler.hpp>
#include <mbgl/util/thread_local.hpp>
#include <mbgl/util/thread_pool.hpp>

#include <cassert>

namespace mbgl {

std::unique_ptr<ThreadPool> g_backgroundScheduler;
util::ThreadLocal<Scheduler> g_currentScheduler;

// static
Scheduler& Scheduler::GetCurrent() {
    assert(g_currentScheduler.get());
    return *(g_currentScheduler.get());
}

// static
Scheduler& Scheduler::GetBackground() {
    return *g_backgroundScheduler;
}

} //namespace mbgl
