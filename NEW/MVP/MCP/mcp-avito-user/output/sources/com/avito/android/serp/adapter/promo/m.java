package com.avito.android.serp.adapter.promo;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.promo.PromoHeaderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.promo.PromoHeaderItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PromoHeaderView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/promo/m;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface m extends TV0.e {

    /* compiled from: PromoHeaderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void G0(@Y61.l List<PromoHeaderWidget.Image> list);

    void Mw(@Y61.l PromoHeaderWidget.Button button, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void Pc(@Y61.l List<PromoHeaderItem.BadgeData> list);

    @Y61.l
    String e(@Y61.l AttributedText attributedText);

    void iM(float f12);

    void k(@Y61.l AttributedText attributedText);

    void v(@Y61.l UniversalColor universalColor);
}
