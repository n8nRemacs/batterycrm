package com.avito.android.code_check.phone_list;

import com.avito.android.code_check.phone_list.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.code_check.phone_list.mvi.e f119025a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.code_check.phone_request.mvi.l f119026b;

    /* renamed from: c, reason: collision with root package name */
    public final w f119027c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f119028d;

    public t(com.avito.android.code_check.phone_list.mvi.e eVar, com.avito.android.code_check.phone_request.mvi.l lVar, w wVar, Provider provider) {
        this.f119025a = eVar;
        this.f119026b = lVar;
        this.f119027c = wVar;
        this.f119028d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check.phone_list.mvi.d dVar = (com.avito.android.code_check.phone_list.mvi.d) this.f119025a.get();
        com.avito.android.code_check.phone_request.mvi.k kVar = (com.avito.android.code_check.phone_request.mvi.k) this.f119026b.get();
        this.f119027c.getClass();
        return new s(dVar, kVar, new v(), ((a.c.C3468c) this.f119028d).f118916a.c());
    }
}
