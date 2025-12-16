package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor;

import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35787f0;
import com.avito.user_stats.model.extended_user_stats.Hint;
import com.avito.user_stats.model.extended_user_stats.HintItemLegend;
import com.avito.user_stats.model.extended_user_stats.HintLegendDetailsItem;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HintMetricChartDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/HintMetricChartDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HintMetricChartDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final a f317890j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public com.avito.android.util.text.a f317891h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f317892i0;

    /* compiled from: HintMetricChartDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/HintMetricChartDialogFragment$a;", "", "<init>", "()V", "", "TAG_HINT", "Ljava/lang/String;", "TAG_HINT_ARGS", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HintMetricChartDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/user_stats/model/extended_user_stats/Hint;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Hint> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Hint invoke() {
            Bundle bundleRequireArguments = HintMetricChartDialogFragment.this.requireArguments();
            return (Hint) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("HintArgsMetricChartDialogFragment", Hint.class) : bundleRequireArguments.getParcelable("HintArgsMetricChartDialogFragment"));
        }
    }

    public HintMetricChartDialogFragment() {
        super(0, 1, null);
        this.f317892i0 = C42727D.c(new b());
    }

    public final Hint f5() {
        return (Hint) this.f317892i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        List<HintLegendDetailsItem> listC;
        String colorKey;
        Integer numA;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.D(R.layout.user_stats_hint_metric_dialog, true);
        TextView textView = (TextView) dVar.findViewById(R.id.tv_hint_metric_name);
        TextView textView2 = (TextView) dVar.findViewById(R.id.tv_hint_metric_description);
        textView.setText(f5().getTitle());
        textView2.setText(f5().getDescription());
        textView.setVisibility(f5().getTitle() != null ? 0 : 8);
        TextView textView3 = (TextView) dVar.findViewById(R.id.tv_hint_chart);
        LinearLayout linearLayout = (LinearLayout) dVar.findViewById(R.id.ll_chart_hint);
        textView3.setVisibility(f5().getLegend() != null ? 0 : 8);
        linearLayout.setVisibility(f5().getLegend() != null ? 0 : 8);
        com.avito.android.util.text.a aVar = this.f317891h0;
        if (aVar == null) {
            aVar = null;
        }
        Context context = textView.getContext();
        HintItemLegend legend = f5().getLegend();
        textView3.setText(aVar.c(context, legend != null ? legend.getTitle() : null));
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        HintItemLegend legend2 = f5().getLegend();
        if (legend2 != null && (listC = legend2.c()) != null) {
            for (HintLegendDetailsItem hintLegendDetailsItem : listC) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.user_stats_hint_item, (ViewGroup) linearLayout, false);
                View viewFindViewById = viewInflate.findViewById(R.id.v_how_understand_description_services);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.tv_how_understand_description_services);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView4 = (TextView) viewFindViewById2;
                com.avito.android.util.text.a aVar2 = this.f317891h0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                textView4.setText(aVar2.c(viewInflate.getContext(), hintLegendDetailsItem.getTitle()));
                UniversalColor color = hintLegendDetailsItem.getColor();
                if (color != null && (colorKey = color.getColorKey()) != null && (numA = C35787f0.a(colorKey)) != null) {
                    viewFindViewById.setBackgroundTintList(ColorStateList.valueOf(numA.intValue()));
                }
                linearLayout.addView(viewInflate);
            }
        }
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 125);
        return dVar;
    }
}
