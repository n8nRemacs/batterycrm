package com.yandex.runtime.graphics_state;

import j.N;

/* loaded from: classes8.dex */
public class GraphicsViewState {
    public static native void logViewCreateAttempt(@N GraphicsViewType graphicsViewType);

    public static native boolean viewCreateAttempted(@N GraphicsViewType graphicsViewType);
}
