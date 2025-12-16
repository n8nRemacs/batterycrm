package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.b1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38691b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f380142a;

    /* renamed from: b, reason: collision with root package name */
    private final B f380143b;

    /* renamed from: c, reason: collision with root package name */
    private final RunnableC38716c1 f380144c;

    public C38691b1(Handler handler, B b12) {
        this.f380142a = handler;
        this.f380143b = b12;
        this.f380144c = new RunnableC38716c1(handler, b12);
    }

    public void a() {
        this.f380142a.removeCallbacks(this.f380144c, this.f380143b.f377793b.b().c());
    }

    public void b() {
        a(this.f380142a, this.f380143b, this.f380144c);
    }

    public static void a(Handler handler, B b12, Runnable runnable) {
        handler.removeCallbacks(runnable, b12.f377793b.b().c());
        String strC = b12.f377793b.b().c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        Integer asInteger = b12.f377793b.b().f377493b.getAsInteger("CFG_SESSION_TIMEOUT");
        if (asInteger == null) {
            asInteger = 10;
        }
        handler.postAtTime(runnable, strC, jUptimeMillis + (asInteger.intValue() * 500));
    }
}
