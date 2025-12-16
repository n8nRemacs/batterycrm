package com.avito.android.imv_chart;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsChartRangeView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_chart/l;", "Lcom/avito/android/imv_chart/k;", "_avito_imv-chart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f170270a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f170271b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f170272c;

    public l(@Y61.k View view) {
        this.f170270a = view;
        View viewFindViewById = view.findViewById(R.id.range_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170271b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.range_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170272c = (TextView) viewFindViewById2;
    }
}
