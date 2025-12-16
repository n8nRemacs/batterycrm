package com.google.android.play.core.appupdate.internal;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class x extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f358053c;

    public x(D d12) {
        this.f358053c = d12;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        synchronized (this.f358053c.f358023f) {
            try {
                if (this.f358053c.f358028k.get() > 0 && this.f358053c.f358028k.decrementAndGet() > 0) {
                    this.f358053c.f358019b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                D d12 = this.f358053c;
                if (d12.f358030m != null) {
                    d12.f358019b.c("Unbind from service.", new Object[0]);
                    D d13 = this.f358053c;
                    d13.f358018a.unbindService(d13.f358029l);
                    D d14 = this.f358053c;
                    d14.f358024g = false;
                    d14.f358030m = null;
                    d14.f358029l = null;
                }
                this.f358053c.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
