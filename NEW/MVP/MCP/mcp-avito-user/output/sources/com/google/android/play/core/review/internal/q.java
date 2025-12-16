package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class q extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f358631c;

    public q(s sVar) {
        this.f358631c = sVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        t tVar = this.f358631c.f358632b;
        tVar.f358635b.a("unlinkToDeath", new Object[0]);
        tVar.f358646m.asBinder().unlinkToDeath(tVar.f358643j, 0);
        tVar.f358646m = null;
        tVar.f358640g = false;
    }
}
