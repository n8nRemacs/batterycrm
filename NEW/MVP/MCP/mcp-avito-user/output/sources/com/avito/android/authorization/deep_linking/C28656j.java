package com.avito.android.authorization.deep_linking;

import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideAuthResulLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28656j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C28650d f93792a;

    public C28656j(C28650d c28650d) {
        this.f93792a = c28650d;
    }

    public static C43834a a(C28650d c28650d) {
        C28655i.f93789a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuthResultLink.class, new C28651e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuthResultLink.class), c28650d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f93792a);
    }
}
