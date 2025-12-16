package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportBlockingErrorLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvidePassportBlockingErrorSyncDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.e f211075a;

    public l(com.avito.android.passport.profile_add.merge.deeplinking.e eVar) {
        this.f211075a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.deeplinking.e eVar = this.f211075a;
        C32957d.f211067a.getClass();
        return new C43834a(PassportBlockingErrorLink.class, null, new C43834a.b.C11809b(eVar));
    }
}
