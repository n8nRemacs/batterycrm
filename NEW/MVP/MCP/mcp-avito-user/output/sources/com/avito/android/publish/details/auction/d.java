package com.avito.android.publish.details.auction;

import Y61.k;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.details.InterfaceC33746e0;
import com.avito.android.publish.details.w2;
import kotlin.Metadata;

/* compiled from: PublishAuctionDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/details/auction/d;", "Lcom/avito/android/deeplink_handler/view/a$g;", "Lcom/avito/android/publish/details/w2;", "Lcom/avito/android/publish/details/e0$a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d extends a.g, w2, InterfaceC33746e0.a {

    /* compiled from: PublishAuctionDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/auction/d$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void E0();
    }

    void M7(@k AuctionAddLink auctionAddLink);

    void b3(@k a aVar);

    void c0();

    void m7(@k AddAutoToC2CTrxLink addAutoToC2CTrxLink);
}
