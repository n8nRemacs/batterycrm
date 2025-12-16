package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportMergeAccountsProfilesListOnboardingLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvideMergeAccountsProfilesListOnboardingLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.t f211072a;

    public i(com.avito.android.passport.profile_add.merge.deeplinking.t tVar) {
        this.f211072a = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.deeplinking.t tVar = this.f211072a;
        C32957d.f211067a.getClass();
        return new C43834a(PassportMergeAccountsProfilesListOnboardingLink.class, null, new C43834a.b.C11809b(tVar));
    }
}
