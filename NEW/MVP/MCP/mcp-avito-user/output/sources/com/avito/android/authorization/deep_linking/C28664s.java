package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.RequireTfaRecoveryLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideRequireTfaRecoveryLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28664s implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f93801a;

    public C28664s(e0 e0Var) {
        this.f93801a = e0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e0 e0Var = this.f93801a;
        C28655i.f93789a.getClass();
        return new C43834a(RequireTfaRecoveryLink.class, null, new C43834a.b.C11809b(e0Var));
    }
}
