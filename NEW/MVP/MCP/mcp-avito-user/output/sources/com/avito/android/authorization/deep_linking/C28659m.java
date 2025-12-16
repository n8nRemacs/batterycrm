package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.EmailUnavailableReasonLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideEmailUnavailableReasonLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28659m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final G f93795a;

    public C28659m(G g12) {
        this.f93795a = g12;
    }

    public static C43834a a(G g12) {
        C28655i.f93789a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EmailUnavailableReasonLink.class, new H(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(EmailUnavailableReasonLink.class), g12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f93795a);
    }
}
