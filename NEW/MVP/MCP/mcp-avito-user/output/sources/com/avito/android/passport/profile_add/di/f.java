package com.avito.android.passport.profile_add.di;

import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PassportEditDeepLinkHandlerModule_ProvideProfileCreateDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create_flow.c f212296a;

    public f(com.avito.android.passport.profile_add.create_flow.c cVar) {
        this.f212296a = cVar;
    }

    public static C43834a a(com.avito.android.passport.profile_add.create_flow.c cVar) {
        e.f212295a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileCreateExtendedLink.class, new com.avito.android.passport.profile_add.create_flow.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileCreateExtendedLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f212296a);
    }
}
