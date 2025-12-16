package com.avito.android.shift_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final h f281073a;

    /* renamed from: b, reason: collision with root package name */
    public final o f281074b;

    /* renamed from: c, reason: collision with root package name */
    public final q f281075c;

    /* renamed from: d, reason: collision with root package name */
    public final j f281076d;

    public m(h hVar, o oVar, q qVar, j jVar) {
        this.f281073a = hVar;
        this.f281074b = oVar;
        this.f281075c = qVar;
        this.f281076d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f281073a.get();
        this.f281074b.getClass();
        n nVar = new n();
        this.f281075c.getClass();
        return new l("ShiftListScreen", new Vv0.d(null, null, false, false, false, false, false, false, 255, null), new k(gVar, nVar, new p(), (i) this.f281076d.get()));
    }
}
