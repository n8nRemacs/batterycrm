package com.avito.android.sx_address.list.view.recycler.address;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.list.di.InterfaceC35176a;
import com.avito.android.sx_address.list.domain.AddressItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AddressItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/view/recycler/address/e;", "Lcom/avito/android/sx_address/list/view/recycler/address/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y1<AddressItem> f293525b;

    @Inject
    public e(@k @InterfaceC35176a Y1<AddressItem> y12) {
        this.f293525b = y12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AddressItem addressItem = (AddressItem) aVar;
        gVar.iO(addressItem.f293128i);
        gVar.UR(addressItem.f293123d);
        gVar.d10(addressItem.f293121b);
        gVar.e80(addressItem.f293126g, addressItem.f293124e);
        gVar.UO(new d(this, addressItem));
    }
}
