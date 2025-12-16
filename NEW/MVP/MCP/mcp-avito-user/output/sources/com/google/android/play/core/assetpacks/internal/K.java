package com.google.android.play.core.assetpacks.internal;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class K extends G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f358353c;

    public K(Q q12) {
        this.f358353c = q12;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        synchronized (this.f358353c.f358364f) {
            try {
                if (this.f358353c.f358369k.get() > 0 && this.f358353c.f358369k.decrementAndGet() > 0) {
                    this.f358353c.f358360b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                Q q12 = this.f358353c;
                if (q12.f358371m != null) {
                    q12.f358360b.d("Unbind from service.", new Object[0]);
                    Q q13 = this.f358353c;
                    q13.f358359a.unbindService(q13.f358370l);
                    Q q14 = this.f358353c;
                    q14.f358365g = false;
                    q14.f358371m = null;
                    q14.f358370l = null;
                }
                this.f358353c.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
