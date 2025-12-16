package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.c1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC38716c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Handler> f380271a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<B> f380272b;

    public RunnableC38716c1(Handler handler, B b12) {
        this.f380271a = new WeakReference<>(handler);
        this.f380272b = new WeakReference<>(b12);
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.f380271a.get();
        B b12 = this.f380272b.get();
        if (handler == null || b12 == null || !b12.e()) {
            return;
        }
        C38691b1.a(handler, b12, this);
    }
}
