package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.LoginLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideLoginLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28660n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final J f93796a;

    public C28660n(J j12) {
        this.f93796a = j12;
    }

    public static C43834a a(J j12) {
        C28655i.f93789a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(LoginLink.class, new K(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(LoginLink.class), j12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f93796a);
    }
}
