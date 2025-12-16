package com.google.android.play.core.splitinstall;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class k0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC37204f f358815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f358816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f358817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f358818e;

    public k0(l0 l0Var, AbstractC37204f abstractC37204f, int i12, int i13) {
        this.f358818e = l0Var;
        this.f358815b = abstractC37204f;
        this.f358816c = i12;
        this.f358817d = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37206h c37206h = (C37206h) this.f358815b;
        this.f358818e.d(new C37206h(c37206h.f358718a, this.f358816c, this.f358817d, c37206h.f358721d, c37206h.f358722e, c37206h.f358723f, c37206h.f358724g, c37206h.f358725h, c37206h.f358726i));
    }
}
