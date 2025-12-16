package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

/* loaded from: classes7.dex */
public class Lm extends Thread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f378857a;

    public Lm() {
        this.f378857a = true;
    }

    public synchronized boolean isRunning() {
        return this.f378857a;
    }

    public synchronized void stopRunning() {
        this.f378857a = false;
        interrupt();
    }

    public Lm(@j.N Runnable runnable, @j.N String str) {
        super(runnable, str);
        this.f378857a = true;
    }

    public Lm(@j.N String str) {
        super(str);
        this.f378857a = true;
    }
}
