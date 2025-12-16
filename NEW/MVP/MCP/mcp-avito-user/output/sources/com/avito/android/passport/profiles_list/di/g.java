package com.avito.android.passport.profiles_list.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportProfilesListScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfilesListModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final e f213790a;

    /* renamed from: b, reason: collision with root package name */
    public final l f213791b;

    public g(e eVar, l lVar) {
        this.f213790a = eVar;
        this.f213791b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f213791b.f393949a;
        this.f213790a.getClass();
        return new C28478k(PassportProfilesListScreen.f211163d, rVar, "passportProfileList");
    }
}
