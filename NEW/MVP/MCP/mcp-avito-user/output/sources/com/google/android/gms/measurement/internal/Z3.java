package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class Z3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f355009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f355010c;

    public Z3(C36967s3 c36967s3, AtomicReference atomicReference) {
        this.f355009b = atomicReference;
        this.f355010c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f355009b) {
            try {
                try {
                    AtomicReference atomicReference = this.f355009b;
                    I2 i22 = this.f355010c.f355183a;
                    atomicReference.set(Double.valueOf(i22.f354715g.f(i22.k().m(), E.f354590P)));
                } finally {
                    this.f355009b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
