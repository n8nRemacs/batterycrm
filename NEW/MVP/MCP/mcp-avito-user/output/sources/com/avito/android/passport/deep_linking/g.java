package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportMergeAccountsProfilesListLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvideMergeAccountsProfilesListDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.w f211070a;

    public g(com.avito.android.passport.profile_add.merge.deeplinking.w wVar) {
        this.f211070a = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.deeplinking.w wVar = this.f211070a;
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportMergeAccountsProfilesListLink.class, new com.avito.android.passport.profile_add.merge.deeplinking.r(), new C43834a.b.C11809b(wVar));
    }
}
