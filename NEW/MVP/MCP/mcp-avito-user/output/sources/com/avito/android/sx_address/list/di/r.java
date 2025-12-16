package com.avito.android.sx_address.list.di;

import com.avito.android.sx_address.list.domain.AddressItem;
import javax.inject.Provider;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.d2;

/* compiled from: SxAddressListModule_ProvideOnBedTypeItemClickFlowFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<d2<AddressItem>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<AddressItem>> f293112a;

    public r(Provider<Y1<AddressItem>> provider) {
        this.f293112a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y1<AddressItem> y12 = this.f293112a.get();
        p.f293111a.getClass();
        return C43175k.a(y12);
    }
}
