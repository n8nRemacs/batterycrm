package com.avito.android.auction.details.di;

import Y61.k;
import com.avito.android.auction.details.AuctionDetailsSheetActivity;
import com.avito.android.deep_linking.links.AuctionDetails;
import com.avito.android.di.InterfaceC30272y;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: AuctionDetailsSheetComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/details/di/b;", "", "a", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@d
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: AuctionDetailsSheetComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/details/di/b$a;", "", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k InterfaceC39417a interfaceC39417a);

        @k
        a b(@k com.avito.android.auction.details.di.a aVar);

        @k
        b build();

        @h31.b
        @k
        a c(@k AuctionDetails auctionDetails);
    }

    void a(@k AuctionDetailsSheetActivity auctionDetailsSheetActivity);
}
