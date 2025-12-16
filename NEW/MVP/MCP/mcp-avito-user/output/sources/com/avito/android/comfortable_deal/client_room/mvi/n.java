package com.avito.android.comfortable_deal.client_room.mvi;

import dagger.internal.x;
import dagger.internal.y;
import fp.c;

/* compiled from: ClientRoomFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f119923a;

    /* renamed from: b, reason: collision with root package name */
    public final i f119924b;

    /* renamed from: c, reason: collision with root package name */
    public final p f119925c;

    /* renamed from: d, reason: collision with root package name */
    public final r f119926d;

    public n(k kVar, i iVar, p pVar, r rVar) {
        this.f119923a = kVar;
        this.f119924b = iVar;
        this.f119925c = pVar;
        this.f119926d = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f119923a.get();
        h hVar = (h) this.f119924b.get();
        this.f119925c.getClass();
        o oVar = new o();
        q qVar = (q) this.f119926d.get();
        fp.g.f396117f.getClass();
        return new m("ClientRoom", new fp.g("", "", c.a.f396091a, null, 8, null), new l(jVar, hVar, qVar, oVar));
    }
}
