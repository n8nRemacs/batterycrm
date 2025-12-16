package com.avito.android.authorization.select_social.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSocialModule_ProvideAdapterPresenter$_avito_authorization_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f94527a;

    public e(u uVar) {
        this.f94527a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f94527a.get();
        int i12 = d.f94526a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
