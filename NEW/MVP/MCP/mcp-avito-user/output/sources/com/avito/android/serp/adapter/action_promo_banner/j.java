package com.avito.android.serp.adapter.action_promo_banner;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionPromoBannerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/action_promo_banner/j;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface j extends TV0.e {

    /* compiled from: ActionPromoBannerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void SP(@Y61.k ActionPromoBannerItem.Background background);

    void Xw(boolean z12, @Y61.k UniversalColor universalColor, @Y61.k m mVar);

    void e(@Y61.k AttributedText attributedText);

    void gc(@l ButtonAction buttonAction, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void i(@l UniversalImage universalImage);

    void r(@l AttributedText attributedText);
}
