package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class B3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354538c;

    public B3(C36967s3 c36967s3, AtomicReference atomicReference) {
        this.f354537b = atomicReference;
        this.f354538c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354537b) {
            try {
                try {
                    AtomicReference atomicReference = this.f354537b;
                    I2 i22 = this.f354538c.f355183a;
                    C36880g c36880g = i22.f354715g;
                    String strM = i22.k().m();
                    c36880g.getClass();
                    atomicReference.set(Boolean.valueOf(c36880g.o(strM, E.f354582L)));
                } finally {
                    this.f354537b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
