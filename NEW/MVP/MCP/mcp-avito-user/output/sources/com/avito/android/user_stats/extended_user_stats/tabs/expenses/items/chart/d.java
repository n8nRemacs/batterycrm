package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart;

import Y41.l;
import Y61.k;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ChartExpensesItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/d;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f317705g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317706b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f317707c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f317708d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f317709e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f317710f;

    /* compiled from: ChartExpensesItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TypeDetail.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TypeDetail typeDetail = TypeDetail.f317695b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TypeDetail typeDetail2 = TypeDetail.f317695b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TypeDetail typeDetail3 = TypeDetail.f317695b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public d(@k View view) {
        super(view);
        this.f317706b = view;
        this.f317707c = (TextView) view.findViewById(R.id.tv_chart_max);
        this.f317708d = (LinearLayout) view.findViewById(R.id.ll_chart);
        this.f317709e = (LinearLayout) view.findViewById(R.id.ll_legend);
        this.f317710f = LayoutInflater.from(view.getContext());
    }

    public static float[] B80(float f12, TypeDetail typeDetail) {
        int iOrdinal = typeDetail.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return new float[]{f12, f12, f12, f12, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (iOrdinal == 2) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f12, f12};
        }
        if (iOrdinal == 3) {
            return new float[]{f12, f12, f12, f12, f12, f12, f12, f12};
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.c
    public final void AU(@k ChartExpensesItem chartExpensesItem, @k l<? super RJ0.a, G0> lVar) {
        String str = chartExpensesItem.f317681f;
        int i12 = 0;
        int i13 = str.length() > 0 ? 0 : 8;
        TextView textView = this.f317707c;
        textView.setVisibility(i13);
        textView.setText(str);
        LinearLayout linearLayout = this.f317708d;
        linearLayout.removeAllViews();
        Iterator<T> it = chartExpensesItem.f317679d.iterator();
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            int i15 = -1;
            LayoutInflater layoutInflater = this.f317710f;
            if (!zHasNext) {
                LinearLayout linearLayout2 = this.f317709e;
                linearLayout2.removeAllViews();
                for (Legend legend : chartExpensesItem.f317680e) {
                    View viewInflate = layoutInflater.inflate(R.layout.legend_expenses_column_item, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = 1.0f;
                    viewInflate.setLayoutParams(layoutParams);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_legend_expenses_chart);
                    TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_legend_year_expenses_chart);
                    textView2.setText(legend.f317690b);
                    String str2 = legend.f317694f;
                    textView3.setText(str2);
                    textView3.setVisibility(str2 != null ? 0 : 8);
                    textView2.setTextColor(C35835l0.d(legend.f317692d ? R.attr.warmGray24 : R.attr.black, textView2.getContext()));
                    linearLayout2.addView(viewInflate);
                }
                return;
            }
            Object next = it.next();
            int i16 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            Column column = (Column) next;
            View viewInflate2 = layoutInflater.inflate(R.layout.chart_expenses_column_item, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i12, -1);
            layoutParams2.weight = 1.0f;
            viewInflate2.setLayoutParams(layoutParams2);
            LinearLayout linearLayout3 = (LinearLayout) viewInflate2.findViewById(R.id.ll_chart_column);
            viewInflate2.findViewById(R.id.v_chart_column).setVisibility(column.f317683b ? i12 : 8);
            List<Detail> list = column.f317686e;
            boolean zIsEmpty = list.isEmpty();
            View view = this.f317706b;
            if (zIsEmpty) {
                View view2 = new View(view.getContext());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i12);
                layoutParams3.weight = 0.99f;
                view2.setLayoutParams(layoutParams3);
                linearLayout3.addView(view2);
                View view3 = new View(view.getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, i12);
                layoutParams4.weight = 0.01f;
                view3.setLayoutParams(layoutParams4);
                float fI2 = D6.i(3, view.getContext());
                GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(i12);
                gradientDrawableE.setCornerRadii(B80(fI2, TypeDetail.f317698e));
                gradientDrawableE.setColor(C35835l0.d(R.attr.warmGray24, view.getContext()));
                view3.setBackground(gradientDrawableE);
                linearLayout3.addView(view3);
            } else {
                for (Detail detail : list) {
                    View view4 = new View(view.getContext());
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i15, i12);
                    layoutParams5.weight = detail.f317687b;
                    view4.setLayoutParams(layoutParams5);
                    float fI3 = D6.i(chartExpensesItem.f317678c, view.getContext());
                    GradientDrawable gradientDrawableE2 = com.avito.android.advert.item.delivery_suggests.l.e(i12);
                    gradientDrawableE2.setCornerRadii(B80(fI3, detail.f317688c));
                    UniversalColor universalColor = detail.f317689d;
                    gradientDrawableE2.setColor(universalColor != null ? C48063a.f437606a.a(view.getContext(), universalColor) : view.getContext().getColor(R.color.transparent));
                    view4.setBackground(gradientDrawableE2);
                    linearLayout3.addView(view4);
                    i12 = 0;
                    i15 = -1;
                }
            }
            if (column.f317684c) {
                viewInflate2.setOnClickListener(new C(lVar, i14, column, 20));
            }
            linearLayout.addView(viewInflate2);
            i14 = i16;
            i12 = 0;
        }
    }
}
