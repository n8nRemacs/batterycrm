package com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view.ImvLineChart;
import com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view.LineChartPoint;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsLineChartItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/d;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f170166b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170167c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImvLineChart f170168d;

    public d(@k View view) {
        super(view);
        this.f170166b = view;
        View viewFindViewById = view.findViewById(R.id.imv_cars_line_chart_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170167c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.imv_cars_line_chart);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view.ImvLineChart");
        }
        this.f170168d = (ImvLineChart) viewFindViewById2;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.c
    public final void DK(@l String str, @k List<LineChartPoint> list) {
        I5.a(this.f170167c, str, false);
        this.f170168d.setPoints(list);
    }
}
