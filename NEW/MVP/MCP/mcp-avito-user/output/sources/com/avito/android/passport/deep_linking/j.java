package com.avito.android.passport.deep_linking;

import com.avito.android.passport.deeplinks.PassportAccountsProfileErrorLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvidePassportAccountsProfileErrorLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.c f211073a;

    public j(com.avito.android.passport.profile_add.merge.deeplinking.c cVar) {
        this.f211073a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.deeplinking.c cVar = this.f211073a;
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportAccountsProfileErrorLink.class, new com.avito.android.passport.profile_add.merge.deeplinking.a(), new C43834a.b.C11809b(cVar));
    }
}
