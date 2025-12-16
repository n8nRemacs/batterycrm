package com.avito.android.serp.adapter.carousel_widget;

import android.os.Parcelable;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/h;", "LTV0/e;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/advert/viewed/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34698h extends TV0.e, com.avito.android.favorite.s, com.avito.android.advert.viewed.j {

    /* compiled from: CarouselItemsWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.carousel_widget.h$a */
    public static final class a {
    }

    void E10(@Y61.l SerpDisplayType serpDisplayType, boolean z12, boolean z13, boolean z14);

    void I3(@Y61.l Long l12, @Y61.l Timer.TimerStyle timerStyle);

    void I6(@Y61.k Y41.a<G0> aVar);

    void L4();

    void M(@Y61.l UniversalImage universalImage);

    void NS(@Y61.l ItemsCarouselWidget.Button button);

    void W4(@Y61.l Parcelable parcelable);

    void Y1(@Y61.k AttributedText attributedText);

    boolean YV(@Y61.l UniversalImage universalImage, boolean z12);

    void a0(@Y61.k Y41.a<G0> aVar);

    @Y61.k
    String bO(@Y61.k AttributedText attributedText, boolean z12, @InterfaceC42150f @Y61.l Integer num, @Y61.l ItemsCarouselWidget.ButtonColors buttonColors);

    void ce(@Y61.k UV0.c cVar);

    void f(@Y61.l String str);

    void il(@Y61.l SerpDisplayType serpDisplayType);

    boolean mx(@Y61.l UniversalColor universalColor, boolean z12);

    void t(@Y61.k Y41.a<G0> aVar);

    void v20(boolean z12, boolean z13);

    void xc(@Y61.k UV0.c cVar, int i12, @Y61.l SerpDisplayType serpDisplayType);

    void zG(@Y61.k String str, boolean z12, @InterfaceC42150f @Y61.l Integer num, @Y61.l ItemsCarouselWidget.ButtonColors buttonColors);

    void zb(@Y61.k UV0.c cVar);
}
