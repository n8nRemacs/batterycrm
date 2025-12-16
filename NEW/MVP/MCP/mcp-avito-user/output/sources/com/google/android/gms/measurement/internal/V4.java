package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class V4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f354950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q4 f354951c;

    public V4(Q4 q42, L1 l12) {
        this.f354950b = l12;
        this.f354951c = q42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f354951c) {
            try {
                this.f354951c.f354862b = false;
                if (!this.f354951c.f354864d.J()) {
                    this.f354951c.f354864d.zzj().f354896m.b("Connected to remote service");
                    this.f354951c.f354864d.q(this.f354950b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
