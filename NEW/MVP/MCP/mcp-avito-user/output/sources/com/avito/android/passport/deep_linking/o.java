package com.avito.android.passport.deep_linking;

import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvidePassportSelectBusinessVrfLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.deeplinking.y f211078a;

    public o(com.avito.android.passport.profile_add.merge.deeplinking.y yVar) {
        this.f211078a = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.deeplinking.y yVar = this.f211078a;
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportSelectBusinessVrfLink.class, new com.avito.android.passport.profile_add.merge.deeplinking.z(), new C43834a.b.C11809b(yVar));
    }
}
