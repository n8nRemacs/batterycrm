package com.avito.android.authorization.deep_linking;

import Gu.C13918b;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideAuthenticateLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28657k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C28654h f93793a;

    public C28657k(C28654h c28654h) {
        this.f93793a = c28654h;
    }

    public static C43834a a(C28654h c28654h) {
        C28655i.f93789a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuthenticateLink.class, new C13918b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuthenticateLink.class), c28654h));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f93793a);
    }
}
