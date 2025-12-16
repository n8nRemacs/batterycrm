package com.avito.android.imv_chart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C22763c;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ImvCarsChartItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_chart/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/imv_chart/h;", "_avito_imv-chart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HorizontalScrollView f170267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f170268c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c f170269d;

    public i(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.chart_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.HorizontalScrollView");
        }
        this.f170267b = (HorizontalScrollView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ranges_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f170268c = (ViewGroup) viewFindViewById2;
        this.f170269d = new c();
    }

    @Override // com.avito.android.imv_chart.h
    public final void Vu(@Y61.k ArrayList arrayList) {
        ViewGroup viewGroup = this.f170268c;
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        int iB2 = y6.b(8);
        int i12 = -1;
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ImvCarsChartRange imvCarsChartRange = (ImvCarsChartRange) obj;
            if (imvCarsChartRange.f170258f) {
                i12 = i13;
            }
            int i15 = i13 < arrayList.size() - 1 ? iB2 : 0;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.car_market_price_chart_range_view, viewGroup, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
            marginLayoutParams.setMarginEnd(i15);
            viewInflate.setLayoutParams(marginLayoutParams);
            l lVar = new l(viewInflate);
            TextView textView = lVar.f170271b;
            textView.setText(imvCarsChartRange.f170254b);
            TextView textView2 = lVar.f170272c;
            I5.a(textView2, imvCarsChartRange.f170255c, false);
            Context context = this.itemView.getContext();
            C48063a c48063a = C48063a.f437606a;
            int iA2 = c48063a.a(context, imvCarsChartRange.f170256d);
            textView.setTextColor(iA2);
            textView2.setTextColor(iA2);
            viewInflate.getBackground().setColorFilter(C22763c.a(c48063a.a(this.itemView.getContext(), imvCarsChartRange.f170257e), BlendModeCompat.f44706c));
            viewGroup.addView(viewInflate);
            i13 = i14;
        }
        c cVar = this.f170269d;
        cVar.getClass();
        View childAt = viewGroup.getChildAt(i12);
        if (childAt == null) {
            return;
        }
        childAt.addOnLayoutChangeListener(new b(childAt, cVar, this.f170267b, childAt));
    }

    @Override // com.avito.android.imv_chart.h
    public final void rQ(@Y61.l Integer num) {
        if (num != null) {
            HorizontalScrollView horizontalScrollView = this.f170267b;
            int dimension = (int) horizontalScrollView.getContext().getResources().getDimension(num.intValue());
            horizontalScrollView.setPadding(dimension, horizontalScrollView.getPaddingTop(), dimension, horizontalScrollView.getPaddingBottom());
        }
    }
}
