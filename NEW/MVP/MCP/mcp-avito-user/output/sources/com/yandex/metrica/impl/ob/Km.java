package com.yandex.metrica.impl.ob;

import android.os.HandlerThread;
import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

/* loaded from: classes7.dex */
public class Km extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f378714a;

    public Km(@j.N String str) {
        super(str);
        this.f378714a = true;
    }

    public synchronized boolean isRunning() {
        return this.f378714a;
    }

    public synchronized void stopRunning() {
        this.f378714a = false;
        interrupt();
    }
}
