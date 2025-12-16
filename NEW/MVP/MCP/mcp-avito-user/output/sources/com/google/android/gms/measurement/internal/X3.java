package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class X3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354984c;

    public X3(C36967s3 c36967s3, AtomicReference atomicReference) {
        this.f354983b = atomicReference;
        this.f354984c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354983b) {
            try {
                try {
                    AtomicReference atomicReference = this.f354983b;
                    I2 i22 = this.f354984c.f355183a;
                    atomicReference.set(Long.valueOf(i22.f354715g.l(i22.k().m(), E.f354586N)));
                } finally {
                    this.f354983b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
