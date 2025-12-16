package com.avito.android.serp.adapter.constructor.rich;

import Bu0.InterfaceC13187a;
import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GalleryConfigModel;
import com.avito.android.remote.model.ImageV2GalleryItemModel;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.new_advert_badge.NewAdvertBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertItemRichView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/rich/C;", "LTV0/e;", "LQ81/a;", "LBu0/a;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface C extends TV0.e, Q81.a, InterfaceC13187a, AsyncViewportTracker {

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Bb(@Y61.l com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar);

    void CB();

    void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2);

    void G0(@Y61.k List<ImageV2GalleryItemModel> list);

    void H0();

    void H1(@Y61.l Parcelable parcelable);

    void IO(boolean z12);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void P1(@Y61.l Y41.l<? super Integer, G0> lVar);

    void P5(@Y61.k Y41.l<? super Integer, G0> lVar);

    void R0(@Y61.k Y41.l<? super String, G0> lVar);

    void S20(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void a00(@Y61.l NewAdvertBadge newAdvertBadge);

    void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar);

    void b6(@Y61.l BadgeSticker badgeSticker);

    void b60(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void fQ(boolean z12);

    void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list);

    void iD(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    @Y61.l
    Parcelable k2();

    void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list);

    void lt(@Y61.l String str);

    void n80();

    void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar);

    void sT(@Y61.k SnippetSize snippetSize, @Y61.l GalleryConfigModel galleryConfigModel, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, @Y61.k i iVar);

    void setViewed(boolean z12);

    void t(@Y61.k Y41.a<G0> aVar);

    void t0(@Y61.l List<SerpBadge> list);

    void tw(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list);

    void wd(@Y61.k Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set);

    void wh(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void z8(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);
}
