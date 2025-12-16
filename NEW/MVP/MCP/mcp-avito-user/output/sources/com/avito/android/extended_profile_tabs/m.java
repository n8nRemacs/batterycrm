package com.avito.android.extended_profile_tabs;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iA.InterfaceC41258a;
import javax.inject.Provider;

/* compiled from: ExtendedProfileTabsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41258a> f153215a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f153216b;

    /* renamed from: c, reason: collision with root package name */
    public final u f153217c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f153218d;

    public m(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f153215a = provider;
        this.f153216b = lVar;
        this.f153217c = uVar;
        this.f153218d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(dagger.internal.g.b(this.f153215a), (ExtendedProfileTabsArguments) this.f153216b.f393949a, (SearchParamsConverter) this.f153217c.get(), this.f153218d.get());
    }
}
