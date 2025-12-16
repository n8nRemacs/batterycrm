package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Ew.InterfaceC13538c;
import Qw.InterfaceC14939a;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HelpCenterActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f138012a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f138013b;

    /* renamed from: c, reason: collision with root package name */
    public final u f138014c;

    public f(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f138012a = lVar;
        this.f138013b = provider;
        this.f138014c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((HelpCenterArguments) this.f138012a.f393949a, this.f138013b.get(), (InterfaceC13538c) this.f138014c.get());
    }
}
