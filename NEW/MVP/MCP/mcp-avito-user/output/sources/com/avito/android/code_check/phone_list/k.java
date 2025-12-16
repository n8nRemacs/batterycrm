package com.avito.android.code_check.phone_list;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneListModule_ProvideAdapterPresenter$_avito_code_check_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f118982a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f118983b;

    public k(i iVar, dagger.internal.u uVar) {
        this.f118982a = iVar;
        this.f118983b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f118983b.get();
        this.f118982a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
