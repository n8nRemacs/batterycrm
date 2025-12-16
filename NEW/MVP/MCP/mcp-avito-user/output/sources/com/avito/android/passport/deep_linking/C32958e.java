package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvideMergeAccountsCloseDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.passport.deep_linking.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32958e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.l f211068a;

    public C32958e(com.avito.android.passport.profile_add.merge.deeplinking.l lVar) {
        this.f211068a = lVar;
    }

    public static C43834a a(com.avito.android.passport.profile_add.merge.deeplinking.l lVar) {
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportMergeAccountsCloseLink.class, new com.avito.android.passport.profile_add.merge.deeplinking.m(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportMergeAccountsCloseLink.class), lVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211068a);
    }
}
