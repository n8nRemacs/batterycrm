package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.PasswordUpgradeLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvidePasswordUpgradeLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28661o implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.deep_linking.m f93797a;

    public C28661o(com.avito.android.profile.deep_linking.m mVar) {
        this.f93797a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.deep_linking.m mVar = this.f93797a;
        C28655i.f93789a.getClass();
        return new C43834a(PasswordUpgradeLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PasswordUpgradeLink.class), mVar));
    }
}
