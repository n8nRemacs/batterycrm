package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class W3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354971c;

    public W3(C36967s3 c36967s3, AtomicReference atomicReference) {
        this.f354970b = atomicReference;
        this.f354971c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354970b) {
            try {
                try {
                    AtomicReference atomicReference = this.f354970b;
                    I2 i22 = this.f354971c.f355183a;
                    atomicReference.set(Integer.valueOf(i22.f354715g.j(i22.k().m(), E.f354588O)));
                } finally {
                    this.f354970b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
