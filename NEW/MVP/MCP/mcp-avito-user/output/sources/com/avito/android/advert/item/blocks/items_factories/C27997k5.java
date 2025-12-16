package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.wallet_info.WalletInfoItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.WalletInfo;
import com.facebook.imageutils.JfifUtil;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsWalletInfoItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/k5;", "Lcom/avito/android/advert/item/blocks/items_factories/j5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.k5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27997k5 implements InterfaceC27990j5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73982a;

    @Inject
    public C27997k5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73982a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27990j5
    @Y61.l
    public final WalletInfoItem a(@Y61.k AdvertDetails advertDetails) {
        WalletInfo walletInfo = advertDetails.getWalletInfo();
        if (walletInfo == null) {
            return null;
        }
        return new WalletInfoItem(walletInfo.getDeeplink(), walletInfo.getTitle(), walletInfo.getIcon(), 0L, null, this.f73982a.a(), null, null, JfifUtil.MARKER_SOI, null);
    }
}
