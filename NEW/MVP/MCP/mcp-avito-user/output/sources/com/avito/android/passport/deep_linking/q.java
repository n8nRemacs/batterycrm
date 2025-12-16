package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportProfilesListLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvideProfileListLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final t f211080a;

    public q(t tVar) {
        this.f211080a = tVar;
    }

    public static C43834a a(t tVar) {
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportProfilesListLink.class, new u(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportProfilesListLink.class), tVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211080a);
    }
}
