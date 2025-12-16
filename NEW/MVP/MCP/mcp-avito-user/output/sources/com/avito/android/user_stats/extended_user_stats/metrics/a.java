package com.avito.android.user_stats.extended_user_stats.metrics;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.job.cv_info_actualization.ui.items.radio.g;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.lib.design.accordion.a;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.user_stats.extended_user_stats.metrics.item.DataMetrics;
import com.avito.android.user_stats.extended_user_stats.metrics.item.MetricDialogData;
import com.avito.android.user_stats.extended_user_stats.metrics.item.MetricSuggest;
import com.avito.android.user_stats.extended_user_stats.metrics.item.StatMetric;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MetricsBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/a;", "", "<init>", "()V", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C9847a f317273i = new C9847a(null);

    /* renamed from: a, reason: collision with root package name */
    public DataMetrics f317274a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.l<? super f, G0> f317275b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f317276c;

    /* renamed from: d, reason: collision with root package name */
    public com.avito.android.lib.design.bottom_sheet.d f317277d;

    /* renamed from: e, reason: collision with root package name */
    public Chips f317278e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f317279f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f317280g;

    /* renamed from: h, reason: collision with root package name */
    public com.avito.android.util.text.a f317281h;

    /* compiled from: MetricsBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/a$a;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_stats.extended_user_stats.metrics.a$a, reason: collision with other inner class name */
    public static final class C9847a {
        public /* synthetic */ C9847a(C42822w c42822w) {
            this();
        }

        public C9847a() {
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @k
    public final com.avito.android.lib.design.bottom_sheet.d a(@k DataMetrics dataMetrics, @k Context context, @k com.avito.android.util.text.a aVar) {
        this.f317274a = dataMetrics;
        this.f317281h = aVar;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.user_stats_metrics_dialog, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.chips_metrics);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f317278e = (Chips) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.ll_metric_dialog);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f317279f = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_metric_empty);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f317280g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.input_metric_search);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        input.setClearButtonListener(new c(this));
        n.c(input, new d(this));
        Chips chips = this.f317278e;
        if (chips == null) {
            chips = null;
        }
        chips.setSelectStrategy(SelectStrategy.f178716b);
        chips.setChipsSelectedListener(new b(this));
        c(b(null), dataMetrics.f317288c);
        dVar.K(true);
        dVar.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, context.getString(R.string.user_stats_indicators_title), true, true, 2);
        this.f317277d = dVar;
        return dVar;
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        DataMetrics dataMetrics = this.f317274a;
        if (dataMetrics == null) {
            dataMetrics = null;
        }
        for (MetricSuggest metricSuggest : dataMetrics.f317287b) {
            if (str == null || C43066x.K(str)) {
                arrayList.add(new PJ0.a(metricSuggest.f317294b, metricSuggest.f317295c));
            }
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList, List list) {
        Chips chips = this.f317278e;
        if (chips == null) {
            chips = null;
        }
        chips.setData(arrayList);
        List list2 = list;
        int i12 = 8;
        if (list2 == null || list2.isEmpty()) {
            TextView textView = this.f317280g;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(0);
            LinearLayout linearLayout = this.f317279f;
            (linearLayout != null ? linearLayout : null).setVisibility(8);
            return;
        }
        TextView textView2 = this.f317280g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setVisibility(8);
        LinearLayout linearLayout2 = this.f317279f;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        LinearLayout linearLayout3 = this.f317279f;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        Context context = linearLayout3.getContext();
        LinearLayout linearLayout4 = this.f317279f;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        linearLayout4.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MetricDialogData metricDialogData = (MetricDialogData) it.next();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.user_stats_metric_group_item, (ViewGroup) null, false);
            View viewFindViewById = viewInflate.findViewById(R.id.ll_metric_group);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            LinearLayout linearLayout5 = (LinearLayout) viewFindViewById;
            for (StatMetric statMetric : metricDialogData.f317292e) {
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.user_stats_metric_child_item, (ViewGroup) null, false);
                View viewFindViewById2 = viewInflate2.findViewById(R.id.tv_metric_group);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView3 = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewInflate2.findViewById(R.id.cl_metric_group);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById3;
                View viewFindViewById4 = viewInflate2.findViewById(R.id.iv_metric_group);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById4;
                textView3.setText(statMetric.f317298d);
                Boolean bool = statMetric.f317297c;
                imageView.setVisibility(bool != null ? bool.booleanValue() : false ? 0 : i12);
                if (L.f(statMetric.f317296b, Boolean.TRUE)) {
                    constraintLayout.setOnClickListener(new g(this, statMetric, this.f317276c.length() == 0 ? "tab select" : "search string", 21));
                    constraintLayout.setBackground(C35835l0.h(android.R.attr.selectableItemBackground, context));
                    textView3.setTextColor(C35835l0.d(R.attr.black, context));
                } else {
                    constraintLayout.setBackground(null);
                    textView3.setTextColor(C35835l0.d(R.attr.gray28, context));
                }
                linearLayout5.addView(viewInflate2);
                i12 = 8;
            }
            Accordion accordion = new Accordion(context, null, 0, 0, 14, null);
            a.C5252a c5252a = com.avito.android.lib.design.accordion.a.f178201p;
            int iJ2 = C35835l0.j(R.attr.accordionH50, context);
            c5252a.getClass();
            accordion.setStyle(a.C5252a.b(iJ2, context));
            com.avito.android.util.text.a aVar = this.f317281h;
            if (aVar == null) {
                aVar = null;
            }
            accordion.setState(new QU.d(String.valueOf(aVar.c(context, metricDialogData.f317293f)), null, false, metricDialogData.f317290c, false, viewInflate, null, null, false, null, 726, null));
            LinearLayout linearLayout6 = this.f317279f;
            if (linearLayout6 == null) {
                linearLayout6 = null;
            }
            linearLayout6.addView(accordion, new ViewGroup.MarginLayoutParams(-1, -2));
            i12 = 8;
        }
    }

    public a() {
        this.f317276c = "";
    }
}
