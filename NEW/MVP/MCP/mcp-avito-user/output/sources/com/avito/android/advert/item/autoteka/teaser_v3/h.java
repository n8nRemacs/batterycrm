package com.avito.android.advert.item.autoteka.teaser_v3;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.teaser.TeaserError;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserV3View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v3/h;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface h extends TV0.e {

    /* compiled from: AdvertDetailsAutotekaTeaserV3View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void us(@Y61.l String str, @Y61.k AutotekaTeaserResult autotekaTeaserResult, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super Uri, G0> lVar2);

    void w9(@Y61.k TeaserError teaserError);
}
