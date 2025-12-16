package com.avito.android.advert_details_items.address;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsAddressPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/address/d;", "Lcom/avito/android/advert_details_items/address/c;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public f.b f84442b;

    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        List<MultiAddressesItem> addresses;
        f fVar = (f) eVar;
        AdvertDetailsAddressItem advertDetailsAddressItem = (AdvertDetailsAddressItem) aVar;
        MultiAddressesInfo multiAddressesInfo = advertDetailsAddressItem.f84433l;
        MultiAddressesItem multiAddressesItem = (multiAddressesInfo == null || (addresses = multiAddressesInfo.getAddresses()) == null) ? null : (MultiAddressesItem) C42745f0.K(0, addresses);
        boolean z12 = !advertDetailsAddressItem.f84429h;
        SellerAddressesInfo sellerAddressesInfo = advertDetailsAddressItem.f84434m;
        if (sellerAddressesInfo != null) {
            String locality = sellerAddressesInfo.getFullAddress().getLocality();
            String house = sellerAddressesInfo.getFullAddress().getHouse();
            f.b bVar = this.f84442b;
            f.b bVar2 = bVar == null ? null : bVar;
            Integer num = advertDetailsAddressItem.f84432k;
            fVar.Pj(locality, house, advertDetailsAddressItem.f84426e, advertDetailsAddressItem.f84427f, advertDetailsAddressItem.f84428g, bVar2, advertDetailsAddressItem.f84431j, advertDetailsAddressItem.f84430i, num != null ? num.intValue() : 1);
            return;
        }
        if (multiAddressesItem == null) {
            f.b bVar3 = this.f84442b;
            fVar.d40(advertDetailsAddressItem.f84425d, advertDetailsAddressItem.f84426e, advertDetailsAddressItem.f84427f, advertDetailsAddressItem.f84428g, z12, bVar3 == null ? null : bVar3, advertDetailsAddressItem.f84431j, advertDetailsAddressItem.f84430i, advertDetailsAddressItem.f84432k, advertDetailsAddressItem.f84433l);
            return;
        }
        String house2 = multiAddressesItem.getComponents().getHouse();
        if (house2 == null || C43066x.K(house2)) {
            str = "";
        } else {
            str = ", " + multiAddressesItem.getComponents().getHouse();
        }
        String str2 = multiAddressesItem.getComponents().getLocality() + str;
        f.b bVar4 = this.f84442b;
        fVar.d40(str2, advertDetailsAddressItem.f84426e, advertDetailsAddressItem.f84427f, advertDetailsAddressItem.f84428g, z12, bVar4 == null ? null : bVar4, advertDetailsAddressItem.f84431j, advertDetailsAddressItem.f84430i, advertDetailsAddressItem.f84432k, advertDetailsAddressItem.f84433l);
    }

    @Override // com.avito.android.advert_details_items.address.c
    public final void Z3(@k f.b bVar) {
        this.f84442b = bVar;
    }
}
