package com.avito.android.sx_address.selectaddresslist.mvi;

import com.avito.android.sx_address.SelectAddressListParams;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectAddressListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.selectaddresslist.domain.a> f294131a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f294132b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f294133c;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f294131a = provider;
        this.f294132b = provider2;
        this.f294133c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f294131a.get(), this.f294132b.get(), (SelectAddressListParams) this.f294133c.f393949a);
    }
}
