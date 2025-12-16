package com.avito.android.advert.item.autoteka.teaser_v2;

import Y61.k;
import android.net.Uri;
import com.avito.android.advert.item.W0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserV2Presenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v2/c;", "LTV0/d;", "Lcom/avito/android/advert/item/autoteka/teaser/v2/a;", "Lcom/avito/android/advert/item/autoteka/teaser_v2/AdvertDetailsAutotekaTeaserV2Item;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c extends TV0.d<com.avito.android.advert.item.autoteka.teaser.v2.a, AdvertDetailsAutotekaTeaserV2Item> {

    /* compiled from: AdvertDetailsAutotekaTeaserV2Presenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v2/c$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k DeepLink deepLink);

        void b();

        void c(@k Uri uri);
    }

    void c0();

    void d6(@k W0 w02);
}
