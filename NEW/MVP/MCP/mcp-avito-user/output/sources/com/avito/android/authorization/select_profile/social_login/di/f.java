package com.avito.android.authorization.select_profile.social_login.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SocialRegistrationSuggestsScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SocialRegistrationSuggestsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f94386a;

    public f(l lVar) {
        this.f94386a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f94386a.f393949a;
        d.f94384a.getClass();
        return new C28478k(SocialRegistrationSuggestsScreen.f90498d, rVar, "socialProceedCreating");
    }
}
