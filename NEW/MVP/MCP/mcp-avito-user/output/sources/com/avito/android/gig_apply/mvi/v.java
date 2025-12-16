package com.avito.android.gig_apply.mvi;

/* compiled from: GigSlotFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final p f159789a;

    /* renamed from: b, reason: collision with root package name */
    public final x f159790b;

    /* renamed from: c, reason: collision with root package name */
    public final z f159791c;

    /* renamed from: d, reason: collision with root package name */
    public final s f159792d;

    public v(p pVar, x xVar, z zVar, s sVar) {
        this.f159789a = pVar;
        this.f159790b = xVar;
        this.f159791c = zVar;
        this.f159792d = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f159789a.get();
        w wVar = (w) this.f159790b.get();
        y yVar = (y) this.f159791c.get();
        return new u("GigSlotScreen", new pH.w(false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 127, null), new t((r) this.f159792d.get(), nVar, wVar, yVar));
    }
}
