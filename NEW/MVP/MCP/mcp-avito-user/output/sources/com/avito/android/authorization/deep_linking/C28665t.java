package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.ResetPasswordLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideResetPasswordLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28665t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f93802a;

    public C28665t(g0 g0Var) {
        this.f93802a = g0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g0 g0Var = this.f93802a;
        C28655i.f93789a.getClass();
        return new C43834a(ResetPasswordLink.class, null, new C43834a.b.C11809b(g0Var));
    }
}
