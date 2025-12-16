package com.avito.android.extended_profile_selection_create.name.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionNameActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_selection_create.name.f> f151899a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f151900b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f151901c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f151902d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f151903e;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f151899a = provider;
        this.f151900b = lVar;
        this.f151901c = lVar2;
        this.f151902d = provider2;
        this.f151903e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f151899a.get(), (Z1) this.f151900b.f393949a, (ExtendedProfileSetSelectionNameConfig) this.f151901c.f393949a, this.f151902d.get(), this.f151903e.get());
    }
}
