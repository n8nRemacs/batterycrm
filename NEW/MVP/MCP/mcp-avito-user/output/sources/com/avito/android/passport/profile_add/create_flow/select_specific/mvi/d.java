package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectSpecificActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.domain.interactor.h> f211729a;

    /* renamed from: b, reason: collision with root package name */
    public final M50.c f211730b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f211731c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f211732d;

    public d(Provider provider, M50.c cVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f211729a = provider;
        this.f211730b = cVar;
        this.f211731c = lVar;
        this.f211732d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f211729a.get(), (M50.a) this.f211730b.get(), (SelectSpecificArguments) this.f211731c.f393949a, (Z1) this.f211732d.f393949a);
    }
}
