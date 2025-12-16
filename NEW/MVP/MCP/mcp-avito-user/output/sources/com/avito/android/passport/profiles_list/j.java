package com.avito.android.passport.profiles_list;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: PassportProfilesListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profiles_list.mvi.h f213806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Z1<String>> f213807b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f213808c;

    public j(com.avito.android.passport.profiles_list.mvi.h hVar, Provider provider, Provider provider2) {
        this.f213806a = hVar;
        this.f213807b = provider;
        this.f213808c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.passport.profiles_list.mvi.g) this.f213806a.get(), this.f213807b.get(), this.f213808c.get());
    }
}
