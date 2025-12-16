package com.avito.android.auction.di;

import Y61.k;
import com.avito.android.auction.AuctionFragment;
import com.avito.android.deep_linking.links.AuctionBody;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: AuctionComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/di/a;", "", "a", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: AuctionComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/di/a$a;", "", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.auction.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2727a {
        @k
        InterfaceC2727a a(@k InterfaceC39417a interfaceC39417a);

        @k
        InterfaceC2727a b(@k com.avito.android.auction.details.di.a aVar);

        @k
        a build();

        @h31.b
        @k
        InterfaceC2727a c(@k AuctionBody auctionBody);
    }

    void a(@k AuctionFragment auctionFragment);
}
