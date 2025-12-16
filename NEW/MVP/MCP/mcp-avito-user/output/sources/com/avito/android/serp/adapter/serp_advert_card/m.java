package com.avito.android.serp.adapter.serp_advert_card;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.price_list.PriceList;
import hw.InterfaceC41177b;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SerpAdvertRichServiceCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/m;", "LQ81/a;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface m extends Q81.a, AsyncViewportTracker {

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Bt(@Y61.k Y41.a<G0> aVar);

    void C(@Y61.l String str);

    void D0(@Y61.l QuorumFilterInfo quorumFilterInfo);

    void E0(@Y61.l String str);

    void Fo(@Y61.k Y41.a<G0> aVar);

    void H0();

    void H1(@Y61.l Parcelable parcelable);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void P5(@Y61.k Y41.l<? super Integer, G0> lVar);

    void R0(@Y61.k Y41.l<? super String, G0> lVar);

    void RF();

    void S0(@Y61.l String str);

    void W2();

    void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar);

    void cw(@Y61.k Y41.a<G0> aVar);

    void ee(@Y61.l PriceList priceList);

    void h(@Y61.l String str);

    void h2(@Y61.k List<? extends AdvertAction> list);

    void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list);

    void iu(@Y61.k Y41.a<G0> aVar);

    void jb(boolean z12, boolean z13);

    void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list);

    void kq(@Y61.k String str, @Y61.l com.avito.android.image_loader.a aVar, @Y61.l SerpBadgeBar serpBadgeBar, boolean z12, @Y61.l SellerRating sellerRating);

    void l5(@Y61.l Y41.a<G0> aVar);

    void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar);

    void q7(boolean z12, boolean z13);

    void sR(@Y61.k Y41.a<G0> aVar);

    void setActive(boolean z12);

    void setTitle(@Y61.k String str);

    void t80(@Y61.l String str, @Y61.l ArrayList arrayList);

    void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);

    void w4();

    void y30();

    void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor);
}
