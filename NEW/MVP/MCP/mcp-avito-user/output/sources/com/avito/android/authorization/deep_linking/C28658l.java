package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideAutoRecoveryLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28658l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final E f93794a;

    public C28658l(E e12) {
        this.f93794a = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E e12 = this.f93794a;
        C28655i.f93789a.getClass();
        return new C43834a(AutoRecoveryLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoRecoveryLink.class), e12));
    }
}
