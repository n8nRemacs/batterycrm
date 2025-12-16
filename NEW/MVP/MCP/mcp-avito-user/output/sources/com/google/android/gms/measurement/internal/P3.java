package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class P3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354846c;

    public P3(C36967s3 c36967s3, AtomicReference atomicReference) {
        this.f354845b = atomicReference;
        this.f354846c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354845b) {
            try {
                try {
                    AtomicReference atomicReference = this.f354845b;
                    I2 i22 = this.f354846c.f355183a;
                    C36880g c36880g = i22.f354715g;
                    String strM = i22.k().m();
                    c36880g.getClass();
                    atomicReference.set(c36880g.m(strM, E.f354584M));
                } finally {
                    this.f354845b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
