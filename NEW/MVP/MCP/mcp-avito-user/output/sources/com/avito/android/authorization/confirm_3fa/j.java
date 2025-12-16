package com.avito.android.authorization.confirm_3fa;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmEmailListModule_ProvideAdapterPresenter$_avito_authorization_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f93588a;

    /* renamed from: b, reason: collision with root package name */
    public final u f93589b;

    public j(h hVar, u uVar) {
        this.f93588a = hVar;
        this.f93589b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f93589b.get();
        this.f93588a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
