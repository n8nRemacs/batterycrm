package com.avito.android.advert_stats;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertStatsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/m;", "Lcom/avito/android/advert_stats/l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f86829a;

    @Inject
    public m(@Y61.k Application application) {
        this.f86829a = application;
    }

    @Override // com.avito.android.advert_stats.l
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l String str2, boolean z12) {
        return new Intent(this.f86829a, (Class<?>) AdvertStatsActivity.class).putExtra("item_id", str).putExtra("item_slug", str2).putExtra("open_extended_statistics", z12);
    }
}
