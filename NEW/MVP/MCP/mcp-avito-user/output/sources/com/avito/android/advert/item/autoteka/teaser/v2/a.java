package com.avito.android.advert.item.autoteka.teaser.v2;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.teaser.TeaserError;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/v2/a;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a extends TV0.e {

    /* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.autoteka.teaser.v2.a$a, reason: collision with other inner class name */
    public static final class C2196a {
    }

    void t10(@l String str, @k AutotekaTeaserResult autotekaTeaserResult, @k Y41.l<? super DeepLink, G0> lVar, @k Y41.l<? super Uri, G0> lVar2, @k Y41.a<G0> aVar);

    void w9(@k TeaserError teaserError);
}
