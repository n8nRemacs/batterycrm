package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.RestorePasswordLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideRestorePasswordLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28666u implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f93803a;

    public C28666u(i0 i0Var) {
        this.f93803a = i0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i0 i0Var = this.f93803a;
        C28655i.f93789a.getClass();
        return new C43834a(RestorePasswordLink.class, null, new C43834a.b.C11809b(i0Var));
    }
}
