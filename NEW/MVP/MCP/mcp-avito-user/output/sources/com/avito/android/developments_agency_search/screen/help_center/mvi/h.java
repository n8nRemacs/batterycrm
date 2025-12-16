package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Ew.InterfaceC13538c;
import Qw.InterfaceC14939a;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HelpCenterBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f138024a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.features.a> f138025b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f138026c;

    /* renamed from: d, reason: collision with root package name */
    public final u f138027d;

    public h(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f138024a = provider;
        this.f138025b = provider2;
        this.f138026c = lVar;
        this.f138027d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f138024a.get(), this.f138025b.get(), (HelpCenterArguments) this.f138026c.f393949a, (InterfaceC13538c) this.f138027d.get());
    }
}
