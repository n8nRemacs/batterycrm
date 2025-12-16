package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.BannerItem;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerItemPayloadFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b.a<BannerItem> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b.a
    public final Object a(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar2) {
        BannerItem bannerItem = (BannerItem) aVar;
        BannerItem bannerItem2 = (BannerItem) aVar2;
        ArrayList arrayList = new ArrayList();
        if (!bannerItem.f220856c.equals(bannerItem2.f220856c)) {
            arrayList.add(BannerItem.b.f.f220879a);
        }
        if (!bannerItem.f220857d.equals(bannerItem2.f220857d)) {
            arrayList.add(BannerItem.b.c.f220876a);
        }
        if (!L.f(bannerItem.f220858e, bannerItem2.f220858e)) {
            arrayList.add(BannerItem.b.a.f220874a);
        }
        if (bannerItem.f220859f != bannerItem2.f220859f) {
            arrayList.add(BannerItem.b.e.f220878a);
        }
        if (!L.f(bannerItem.f220860g, bannerItem2.f220860g)) {
            arrayList.add(BannerItem.b.C6670b.f220875a);
        }
        if (bannerItem.f220861h != bannerItem2.f220861h) {
            arrayList.add(BannerItem.b.d.f220877a);
        }
        return new BannerItem.a(arrayList);
    }

    @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b.a
    public final boolean b(@k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar, @k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar2) {
        return (aVar instanceof BannerItem) && (aVar2 instanceof BannerItem);
    }
}
