package com.avito.android.registration_self_employment_redirect_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelfEmploymentRedirectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f252762a;

    /* renamed from: b, reason: collision with root package name */
    public final m f252763b;

    /* renamed from: c, reason: collision with root package name */
    public final h f252764c;

    /* renamed from: d, reason: collision with root package name */
    public final o f252765d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f252766e;

    public k(f fVar, m mVar, h hVar, o oVar, dagger.internal.l lVar) {
        this.f252762a = fVar;
        this.f252763b = mVar;
        this.f252764c = hVar;
        this.f252765d = oVar;
        this.f252766e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f252762a.get();
        this.f252763b.getClass();
        l lVar = new l();
        g gVar = (g) this.f252764c.get();
        this.f252765d.getClass();
        return new j("RegistrationSelfEmploymentRedirectScreen", new aj0.e(null, null, null, null, null, new com.avito.android.lib.design.nav_bar.a(null, (Y41.a) this.f252766e.f393949a, false, null, null, null, null, 125, null), false, false, false, false, 991, null), new i(eVar, lVar, gVar, new n()));
    }
}
