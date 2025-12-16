package com.avito.android.universal_map.map.mvi.reducer;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalMapReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final i f305691a;

    /* renamed from: b, reason: collision with root package name */
    public final f f305692b;

    /* renamed from: c, reason: collision with root package name */
    public final n f305693c;

    /* renamed from: d, reason: collision with root package name */
    public final p f305694d;

    public r(i iVar, f fVar, n nVar, p pVar) {
        this.f305691a = iVar;
        this.f305692b = fVar;
        this.f305693c = nVar;
        this.f305694d = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f305691a.get();
        this.f305692b.getClass();
        e eVar = new e();
        this.f305693c.getClass();
        m mVar = new m();
        this.f305694d.getClass();
        return new q(gVar, eVar, mVar, new o());
    }
}
