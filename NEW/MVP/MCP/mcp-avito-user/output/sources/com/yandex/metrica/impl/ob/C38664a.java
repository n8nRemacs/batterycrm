package com.yandex.metrica.impl.ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38664a {

    /* renamed from: f, reason: collision with root package name */
    private static final long f380022f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    private final b f380023a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f380024b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Thread f380025c = new c();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f380026d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f380027e = new RunnableC10956a();

    /* renamed from: com.yandex.metrica.impl.ob.a$a, reason: collision with other inner class name */
    public class RunnableC10956a implements Runnable {
        public RunnableC10956a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C38664a.this.f380026d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a$b */
    public interface b {
        @j.l0
        void a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.a$c */
    public class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            boolean z12 = false;
            int i12 = 0;
            while (!isInterrupted()) {
                if (!z12) {
                    C38664a.this.f380026d.set(false);
                    C38664a.this.f380024b.post(C38664a.this.f380027e);
                    i12 = 0;
                }
                try {
                    Thread.sleep(C38664a.f380022f);
                    if (C38664a.this.f380026d.get()) {
                        z12 = false;
                    } else {
                        i12++;
                        if (i12 == 4 && !Debug.isDebuggerConnected()) {
                            C38664a.this.b();
                        }
                        z12 = true;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C38664a(b bVar) {
        this.f380023a = bVar;
    }

    @j.k0
    public void b() {
        this.f380023a.a();
    }

    public void c() {
        try {
            this.f380025c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f380025c.start();
    }
}
