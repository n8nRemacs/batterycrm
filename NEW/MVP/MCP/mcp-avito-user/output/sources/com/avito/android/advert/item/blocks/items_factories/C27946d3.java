package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.parking.AdvertDetailsParkingAddressItem;
import com.avito.android.advert.item.parking.ParkingAddressShowOnMapParams;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.user_address_public.api.AdditionalInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: AdvertDetailsParkingAddressItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/d3;", "Lcom/avito/android/advert/item/blocks/items_factories/c3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.d3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27946d3 implements InterfaceC27939c3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43617a f73936b;

    @Inject
    public C27946d3(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k C43617a c43617a) {
        this.f73935a = jVar;
        this.f73936b = c43617a;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27939c3
    @Y61.l
    public final AdvertDetailsParkingAddressItem a(@Y61.k AdvertDetails advertDetails) {
        MultiAddressesInfo multiAddressesInfo = advertDetails.getMultiAddressesInfo();
        if (multiAddressesInfo == null) {
            return null;
        }
        C43617a c43617a = this.f73936b;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[30];
        if (((Boolean) c43617a.f413594F.a().invoke()).booleanValue()) {
            AdditionalInfo additionalInfo = multiAddressesInfo.getAdditionalInfo();
            if (kotlin.jvm.internal.L.f(additionalInfo != null ? additionalInfo.getBlockType() : null, "comtrans") && !multiAddressesInfo.getAddresses().isEmpty()) {
                int iA2 = this.f73935a.a();
                AdditionalInfo additionalInfo2 = multiAddressesInfo.getAdditionalInfo();
                if (additionalInfo2 == null) {
                    return null;
                }
                List<MultiAddressesItem> addresses = multiAddressesInfo.getAddresses();
                String title = multiAddressesInfo.getTitle();
                if (title == null) {
                    return null;
                }
                return new AdvertDetailsParkingAddressItem(0L, null, title, addresses, additionalInfo2, new ParkingAddressShowOnMapParams(advertDetails.getTitle(), advertDetails.getCoordinates(), advertDetails.getAddress(), advertDetails.getRouteButtons()), multiAddressesInfo, iA2, null, null, 771, null);
            }
        }
        return null;
    }
}
