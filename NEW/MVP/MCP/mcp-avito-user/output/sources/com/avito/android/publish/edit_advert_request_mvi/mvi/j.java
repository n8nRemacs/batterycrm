package com.avito.android.publish.edit_advert_request_mvi.mvi;

import dagger.internal.x;
import dagger.internal.y;
import ee0.C40097d;

/* compiled from: EditRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f235629a;

    /* renamed from: b, reason: collision with root package name */
    public final e f235630b;

    /* renamed from: c, reason: collision with root package name */
    public final l f235631c;

    /* renamed from: d, reason: collision with root package name */
    public final n f235632d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f235629a = gVar;
        this.f235630b = eVar;
        this.f235631c = lVar;
        this.f235632d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f235629a.get();
        d dVar = (d) this.f235630b.get();
        this.f235631c.getClass();
        k kVar = new k();
        this.f235632d.getClass();
        m mVar = new m();
        C40097d.f395302d.getClass();
        return new i("EditRequest", C40097d.f395303e, new h(fVar, dVar, mVar, kVar));
    }
}
