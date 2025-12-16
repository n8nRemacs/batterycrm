package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.advert.item.autoteka.teaser.AdvertDetailsAutotekaTeaserItem;
import com.avito.android.advert.item.autoteka.teaser_v2.AdvertDetailsAutotekaTeaserV2Item;
import com.avito.android.advert.item.autoteka.teaser_v3.AdvertDetailsAutotekaTeaserV3Item;
import com.avito.android.autoteka.helpers.AutotekaAbUtil;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/H;", "Lcom/avito/android/advert/item/blocks/items_factories/G;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73758a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f73759b;

    @Inject
    public H(@Y61.k com.avito.android.advert.item.similars.j jVar, @C27710t.InterfaceC2166t @Y61.l String str) {
        this.f73758a = jVar;
        this.f73759b = str;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.G
    @Y61.l
    public final AdvertDetailsAutotekaTeaserItemCommon<AutotekaTeaserItemResponse> a(@Y61.l AdvertDetails advertDetails) {
        AutotekaTeaserItemResponse autotekaTeaser;
        List<String> abs;
        List<String> abs2;
        if (advertDetails == null || (autotekaTeaser = advertDetails.getAutotekaTeaser()) == null) {
            return null;
        }
        AutotekaTeaserResult autotekaData = autotekaTeaser.getAutotekaData();
        com.avito.android.advert.item.similars.j jVar = this.f73758a;
        if (autotekaData != null && (abs2 = autotekaData.getAbs()) != null) {
            AutotekaAbUtil.TeaserTest[] teaserTestArr = AutotekaAbUtil.TeaserTest.f96645b;
            if (abs2.contains("autoteka_teaser_locks_q3_25.teaser_with_locks")) {
                AutotekaTeaserResult autotekaData2 = autotekaTeaser.getAutotekaData();
                if ((autotekaData2 != null ? autotekaData2.getCpo() : null) == null) {
                    return new AdvertDetailsAutotekaTeaserV2Item(jVar.a(), null, autotekaTeaser, this.f73759b, 2, null);
                }
            }
        }
        AutotekaTeaserResult autotekaData3 = autotekaTeaser.getAutotekaData();
        if (autotekaData3 != null && (abs = autotekaData3.getAbs()) != null) {
            AutotekaAbUtil.TeaserTest[] teaserTestArr2 = AutotekaAbUtil.TeaserTest.f96645b;
            if (abs.contains("autoteka_teaser_locks_q3_25.teaser_minimal")) {
                AutotekaTeaserResult autotekaData4 = autotekaTeaser.getAutotekaData();
                if ((autotekaData4 != null ? autotekaData4.getCpo() : null) == null) {
                    return new AdvertDetailsAutotekaTeaserV3Item(jVar.a(), null, autotekaTeaser, this.f73759b, 2, null);
                }
            }
        }
        return new AdvertDetailsAutotekaTeaserItem(jVar.a(), null, autotekaTeaser, this.f73759b, 2, null);
    }
}
