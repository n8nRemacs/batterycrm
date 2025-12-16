package com.google.android.play.core.splitinstall.internal;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class x0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37214g f358804c;

    public x0(C37214g c37214g) {
        this.f358804c = c37214g;
    }

    @Override // com.google.android.play.core.splitinstall.internal.t0
    public final void a() {
        C37214g c37214g = this.f358804c;
        if (c37214g.f358771m != null) {
            c37214g.f358760b.d("Unbind from service.", new Object[0]);
            c37214g.f358759a.unbindService(c37214g.f358770l);
            c37214g.f358765g = false;
            c37214g.f358771m = null;
            c37214g.f358770l = null;
        }
        c37214g.e();
    }
}
