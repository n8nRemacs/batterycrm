package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportMergeAccountsLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvideMergeAccountsDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.h f211069a;

    public f(com.avito.android.passport.profile_add.merge.deeplinking.h hVar) {
        this.f211069a = hVar;
    }

    public static C43834a a(com.avito.android.passport.profile_add.merge.deeplinking.h hVar) {
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportMergeAccountsLink.class, new com.avito.android.passport.profile_add.merge.deeplinking.n(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportMergeAccountsLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211069a);
    }
}
