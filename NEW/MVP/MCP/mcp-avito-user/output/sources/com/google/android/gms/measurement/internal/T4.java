package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class T4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f354919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q4 f354920c;

    public T4(Q4 q42, L1 l12) {
        this.f354919b = l12;
        this.f354920c = q42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354920c) {
            try {
                this.f354920c.f354862b = false;
                if (!this.f354920c.f354864d.J()) {
                    this.f354920c.f354864d.zzj().f354897n.b("Connected to service");
                    this.f354920c.f354864d.q(this.f354919b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
