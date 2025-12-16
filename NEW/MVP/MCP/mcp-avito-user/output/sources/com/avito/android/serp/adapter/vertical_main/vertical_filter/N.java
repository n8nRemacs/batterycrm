package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerticalSearchFilterResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/N;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/M;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f273421a;

    @Inject
    public N(@Y61.k Resources resources) {
        this.f273421a = resources;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.M
    public final int a() throws Resources.NotFoundException {
        return (int) ((b() * (r0.getInteger(R.integer.all_filters_item_offset) + r0.getInteger(R.integer.all_filters_item_width))) / (r0.getDisplayMetrics().widthPixels / this.f273421a.getDisplayMetrics().density));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.M
    public final int b() {
        return this.f273421a.getInteger(R.integer.vertical_search_filter_columns);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.M
    public final int c() {
        return this.f273421a.getInteger(R.integer.vertical_search_filter_columns) / 2;
    }
}
