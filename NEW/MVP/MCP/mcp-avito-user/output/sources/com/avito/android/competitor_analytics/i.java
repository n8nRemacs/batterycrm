package com.avito.android.competitor_analytics;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/i;", "Lcom/avito/android/competitor_analytics/h;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f124388a;

    @Inject
    public i(@Y61.k Context context) {
        this.f124388a = context;
    }

    @Override // com.avito.android.competitor_analytics.h
    @Y61.k
    public final Intent a(long j12) {
        return new Intent(this.f124388a, (Class<?>) CompetitorAnalyticsActivity.class).putExtra("ca_item_id", j12);
    }
}
