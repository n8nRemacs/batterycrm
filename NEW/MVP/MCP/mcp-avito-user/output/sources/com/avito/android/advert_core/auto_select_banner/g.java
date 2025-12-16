package com.avito.android.advert_core.auto_select_banner;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoSelectBannerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/auto_select_banner/g;", "LTV0/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface g extends TV0.e {

    /* compiled from: AutoSelectBannerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Az(@k SelectButtonParams selectButtonParams, @k l<? super DeepLink, G0> lVar);

    void e(@k AttributedText attributedText);

    void g(@k AttributedText attributedText);

    void g5(@Y61.l String str);

    void l(@k Image image);

    void pm(@k UniversalImage universalImage);
}
