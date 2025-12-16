package com.avito.android.sx_address.selectaddresslist.view.recycler;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AddressItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/view/recycler/e;", "Lcom/avito/android/sx_address/selectaddresslist/view/recycler/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y1<AddressListViewItem> f294204b;

    @Inject
    public e(@k Y1<AddressListViewItem> y12) {
        this.f294204b = y12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AddressListViewItem addressListViewItem = (AddressListViewItem) aVar;
        ((g) eVar).zR(addressListViewItem, new d(this, addressListViewItem));
    }
}
