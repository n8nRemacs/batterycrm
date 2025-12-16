package com.avito.android.profile.pro.impl.di;

import com.avito.android.ownership.Owners;
import com.avito.android.profile.pro.impl.ProfileTabScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileTabSummaryModule_ProvideScenarioIdentityFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<ZS.b> {

    /* renamed from: a, reason: collision with root package name */
    public final m f222655a;

    public r(m mVar) {
        this.f222655a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f222655a.getClass();
        return new ZS.b(ProfileTabScreen.f222433d, Owners.f210450U2, "ProfileTab");
    }
}
