package com.avito.android.advert_stats.item;

import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatisticsIconProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/I;", "Lcom/avito/android/advert_stats/item/H;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I implements H {
    @Inject
    public I() {
    }

    @Override // com.avito.android.advert_stats.item.H
    public final int a() {
        return R.drawable.ic_contact;
    }

    @Override // com.avito.android.advert_stats.item.H
    public final int b() {
        return R.drawable.ic_heart;
    }

    @Override // com.avito.android.advert_stats.item.H
    public final int c() {
        return R.drawable.ic_views;
    }

    @Override // com.avito.android.advert_stats.item.H
    public final int d() {
        return R.drawable.ic_legend_predicts;
    }

    @Override // com.avito.android.advert_stats.item.H
    public final int e() {
        return R.drawable.ic_legend_vies;
    }
}
