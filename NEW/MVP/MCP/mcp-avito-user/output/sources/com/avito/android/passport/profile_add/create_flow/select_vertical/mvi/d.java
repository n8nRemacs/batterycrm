package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectVerticalActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.create_flow.select_vertical.i> f211943a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.domain.interactor.h> f211944b;

    /* renamed from: c, reason: collision with root package name */
    public final M50.c f211945c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f211946d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f211947e;

    public d(Provider provider, Provider provider2, M50.c cVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f211943a = provider;
        this.f211944b = provider2;
        this.f211945c = cVar;
        this.f211946d = lVar;
        this.f211947e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f211943a.get(), this.f211944b.get(), (M50.a) this.f211945c.get(), (SelectVerticalArguments) this.f211946d.f393949a, (Z1) this.f211947e.f393949a);
    }
}
