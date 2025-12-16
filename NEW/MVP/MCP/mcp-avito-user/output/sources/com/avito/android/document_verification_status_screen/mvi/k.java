package com.avito.android.document_verification_status_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationStatusFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f144858a;

    /* renamed from: b, reason: collision with root package name */
    public final m f144859b;

    /* renamed from: c, reason: collision with root package name */
    public final h f144860c;

    /* renamed from: d, reason: collision with root package name */
    public final o f144861d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f144862e;

    public k(f fVar, m mVar, h hVar, o oVar, dagger.internal.l lVar) {
        this.f144858a = fVar;
        this.f144859b = mVar;
        this.f144860c = hVar;
        this.f144861d = oVar;
        this.f144862e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f144858a.get();
        this.f144859b.getClass();
        l lVar = new l();
        g gVar = (g) this.f144860c.get();
        this.f144861d.getClass();
        return new j("DocumentVerificationStatusScreen", new Fx.d(null, null, null, null, null, null, new com.avito.android.lib.design.nav_bar.a(null, (Y41.a) this.f144862e.f393949a, false, null, null, null, null, 125, null), false, false, false, false, 1983, null), new i(eVar, lVar, gVar, new n()));
    }
}
