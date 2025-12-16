package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class n extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f358628c;

    public n(t tVar) {
        this.f358628c = tVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        t tVar = this.f358628c;
        if (tVar.f358646m != null) {
            tVar.f358635b.a("Unbind from service.", new Object[0]);
            tVar.f358634a.unbindService(tVar.f358645l);
            tVar.f358640g = false;
            tVar.f358646m = null;
            tVar.f358645l = null;
        }
        tVar.d();
    }
}
