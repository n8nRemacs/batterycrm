package com.avito.android.passport.deep_linking;

import com.avito.android.passport.deeplinks.PassportCreationBusinessVrfLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvidePassportCreationBusinessVrfLinkMapping$_avito_passport_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling.c f211076a;

    public m(com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling.c cVar) {
        this.f211076a = cVar;
    }

    public static C43834a a(com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling.c cVar) {
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportCreationBusinessVrfLink.class, new com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportCreationBusinessVrfLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211076a);
    }
}
