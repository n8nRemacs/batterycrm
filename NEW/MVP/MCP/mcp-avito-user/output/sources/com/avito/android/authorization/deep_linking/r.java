package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.RegisterLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvideRegisterLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f93800a;

    public r(b0 b0Var) {
        this.f93800a = b0Var;
    }

    public static C43834a a(b0 b0Var) {
        C28655i.f93789a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RegisterLink.class, new c0(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RegisterLink.class), b0Var));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f93800a);
    }
}
