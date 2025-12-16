package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list;

import Y41.l;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.MyAdvertAddressesListActivity;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: MyAdvertAddressesListActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class e extends H implements l<k, G0> {
    @Override // Y41.l
    public final G0 invoke(k kVar) {
        h hVar;
        k kVar2 = kVar;
        MyAdvertAddressesListActivity myAdvertAddressesListActivity = (MyAdvertAddressesListActivity) this.receiver;
        MyAdvertAddressesListActivity.a aVar = MyAdvertAddressesListActivity.f309677r;
        myAdvertAddressesListActivity.getClass();
        if ((kVar2 instanceof k.a) && (hVar = myAdvertAddressesListActivity.f309682q) != null) {
            hVar.f309702c.c(new UV0.c(((k.a) kVar2).f309722a));
            hVar.f309701b.notifyDataSetChanged();
        }
        return G0.f406611a;
    }
}
