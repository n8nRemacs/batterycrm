package com.my.tracker.core;

import com.my.tracker.core.utils.Consumer;

/* loaded from: classes.dex */
public interface AsyncCore {
    void onEngineWorker(Runnable runnable);

    void onEngineWorkerWithEngineCore(Consumer<EngineCore> consumer);

    void onUi(Runnable runnable);
}
