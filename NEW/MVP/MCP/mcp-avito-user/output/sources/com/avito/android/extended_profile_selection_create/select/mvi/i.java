package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30498c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSelectionCreateBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30498c> f152387a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f152388b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f152389c;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f152387a = provider;
        this.f152388b = lVar;
        this.f152389c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f152387a.get(), (ExtendedProfileSelectionCreateConfig) this.f152388b.f393949a, (Z1) this.f152389c.f393949a);
    }
}
