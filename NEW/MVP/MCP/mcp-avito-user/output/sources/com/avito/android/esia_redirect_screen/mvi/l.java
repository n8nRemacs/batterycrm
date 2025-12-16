package com.avito.android.esia_redirect_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaRedirectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final f f148087a;

    /* renamed from: b, reason: collision with root package name */
    public final n f148088b;

    /* renamed from: c, reason: collision with root package name */
    public final i f148089c;

    /* renamed from: d, reason: collision with root package name */
    public final p f148090d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f148091e;

    public l(f fVar, n nVar, i iVar, p pVar, dagger.internal.l lVar) {
        this.f148087a = fVar;
        this.f148088b = nVar;
        this.f148089c = iVar;
        this.f148090d = pVar;
        this.f148091e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f148087a.get();
        this.f148088b.getClass();
        m mVar = new m();
        h hVar = (h) this.f148089c.get();
        this.f148090d.getClass();
        return new k("EsiaRedirectScreen", new Iz.e(null, null, null, new com.avito.android.lib.design.nav_bar.a(null, (Y41.a) this.f148091e.f393949a, false, null, null, null, null, 125, null), false, false, true, false, false, 439, null), new j(eVar, mVar, hVar, new o()));
    }
}
