package com.avito.android.comparison.mvi;

/* compiled from: ComparisonFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final t f124177a;

    /* renamed from: b, reason: collision with root package name */
    public final n f124178b;

    /* renamed from: c, reason: collision with root package name */
    public final y f124179c;

    /* renamed from: d, reason: collision with root package name */
    public final A f124180d;

    public w(t tVar, n nVar, y yVar, A a12) {
        this.f124177a = tVar;
        this.f124178b = nVar;
        this.f124179c = yVar;
        this.f124180d = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s sVar = (s) this.f124177a.get();
        m mVar = (m) this.f124178b.get();
        this.f124179c.getClass();
        x xVar = new x();
        this.f124180d.getClass();
        z zVar = new z();
        Rq.d.f14690e.getClass();
        return new v("Comparison", Rq.d.f14691f, new u(sVar, mVar, zVar, xVar));
    }
}
