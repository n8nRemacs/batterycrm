package com.avito.android.universal_map.map;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.ParametrizedEvent;
import javax.inject.Provider;

/* compiled from: UniversalMapAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.universal_map.map.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35320h implements dagger.internal.h<C35319g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f305219a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f305220b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f305221c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<String> f305222d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f305223e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f305224f;

    public C35320h(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.l lVar, Provider provider, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f305219a = uVar;
        this.f305220b = uVar2;
        this.f305221c = lVar;
        this.f305222d = provider;
        this.f305223e = lVar2;
        this.f305224f = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35319g((InterfaceC28373a) this.f305219a.get(), (com.avito.android.P) this.f305220b.get(), (String) this.f305221c.f393949a, this.f305222d.get(), (String) this.f305223e.f393949a, (ParametrizedEvent) this.f305224f.f393949a);
    }
}
