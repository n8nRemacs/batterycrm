package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.PerformResetPasswordLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvidePerformResetPasswordLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28662p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final W f93798a;

    public C28662p(W w12) {
        this.f93798a = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        W w12 = this.f93798a;
        C28655i.f93789a.getClass();
        return new C43834a(PerformResetPasswordLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PerformResetPasswordLink.class), w12));
    }
}
