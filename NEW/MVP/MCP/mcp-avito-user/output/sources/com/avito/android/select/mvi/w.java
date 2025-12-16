package com.avito.android.select.mvi;

import Wp0.InterfaceC15789a;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.select.Arguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class w implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f265654a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.i> f265655b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.select.variant.b> f265656c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.select.bottom_sheet.blueprints.group.e> f265657d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f265658e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f265659f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.select.glow_animation.e f265660g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.g<AutoGlowFiltersTestGroup>> f265661h;

    public w(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, Provider provider4, com.avito.android.select.glow_animation.e eVar, Provider provider5) {
        this.f265654a = lVar;
        this.f265655b = provider;
        this.f265656c = provider2;
        this.f265657d = provider3;
        this.f265658e = uVar;
        this.f265659f = provider4;
        this.f265660g = eVar;
        this.f265661h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Arguments arguments = (Arguments) this.f265654a.f393949a;
        com.avito.android.select.i iVar = this.f265655b.get();
        com.avito.android.select.variant.b bVar = this.f265656c.get();
        com.avito.android.select.bottom_sheet.blueprints.group.e eVar = this.f265657d.get();
        InterfaceC15789a interfaceC15789a = (InterfaceC15789a) this.f265658e.get();
        com.avito.android.remote.error.f fVar = this.f265659f.get();
        this.f265660g.getClass();
        return new r(arguments, iVar, bVar, eVar, interfaceC15789a, fVar, new com.avito.android.select.glow_animation.d(), this.f265661h.get());
    }
}
