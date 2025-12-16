package com.avito.android.position_in_search.stats.screen.position_in_search;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PositionInSearchIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/i;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/h;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f221455a;

    @Inject
    public i(@Y61.k Context context) {
        this.f221455a = context;
    }

    @Override // com.avito.android.position_in_search.stats.screen.position_in_search.h
    @Y61.k
    public final Intent a(long j12, @Y61.k String str) {
        return new Intent(this.f221455a, (Class<?>) PositionInSearchActivity.class).putExtra("position_in_search_item_id", j12).putExtra("position_in_search_period", str);
    }
}
