package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportAddProfileLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvideProfileAddDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.add_dialog.e f211079a;

    public p(com.avito.android.passport.profile_add.add_dialog.e eVar) {
        this.f211079a = eVar;
    }

    public static C43834a a(com.avito.android.passport.profile_add.add_dialog.e eVar) {
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportAddProfileLink.class, new com.avito.android.passport.profile_add.add_dialog.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportAddProfileLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211079a);
    }
}
