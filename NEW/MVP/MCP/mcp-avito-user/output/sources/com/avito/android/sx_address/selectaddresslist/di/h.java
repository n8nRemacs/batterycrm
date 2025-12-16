package com.avito.android.sx_address.selectaddresslist.di;

import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.d2;

/* compiled from: SelectAddressListModule_ProvideOnBedTypeItemClickFlowFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<d2<AddressListViewItem>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<AddressListViewItem>> f294058a;

    public h(Provider<Y1<AddressListViewItem>> provider) {
        this.f294058a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y1<AddressListViewItem> y12 = this.f294058a.get();
        d.f294054a.getClass();
        return C43175k.a(y12);
    }
}
