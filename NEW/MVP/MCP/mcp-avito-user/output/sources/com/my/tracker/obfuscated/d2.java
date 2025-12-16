package com.my.tracker.obfuscated;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    final Handler f365583a = C37835i.f365658a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f365584b;

    /* renamed from: c, reason: collision with root package name */
    final Runnable f365585c;

    /* renamed from: d, reason: collision with root package name */
    final long f365586d;

    private d2(long j12, Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f365584b = atomicBoolean;
        this.f365586d = j12;
        this.f365585c = new H(6, this, runnable);
        atomicBoolean.set(false);
    }

    private void c() {
        this.f365583a.removeCallbacks(this.f365585c);
        this.f365584b.set(true);
        this.f365583a.postDelayed(this.f365585c, this.f365586d);
    }

    public boolean b() {
        boolean z12;
        synchronized (this.f365584b) {
            z12 = !this.f365584b.get();
        }
        return z12;
    }

    public void d() {
        synchronized (this.f365584b) {
            try {
                if (a()) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f365584b) {
            try {
                if (this.f365584b.get()) {
                    return;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        synchronized (this.f365584b) {
            this.f365584b.set(false);
            this.f365583a.removeCallbacks(this.f365585c);
        }
    }

    public static d2 a(long j12, Runnable runnable) {
        return new d2(j12, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        synchronized (this.f365584b) {
            try {
                if (this.f365584b.get()) {
                    c();
                    runnable.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        boolean z12;
        synchronized (this.f365584b) {
            z12 = !b();
        }
        return z12;
    }
}
