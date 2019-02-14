#pragma once

namespace mbgl {

// Initializes all the background services needed by mbgl::
// classes. Every application needs to call ::Init() once,
// before creating any other object in the mbgl:: namespace
// and ::Cleanup() after mbgl:: objects are no longer needed.
void Init();
void Cleanup();

} // namespace mbgl
