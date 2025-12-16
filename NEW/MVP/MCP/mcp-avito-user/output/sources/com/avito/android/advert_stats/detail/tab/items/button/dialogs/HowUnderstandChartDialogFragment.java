package com.avito.android.advert_stats.detail.tab.items.button.dialogs;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_stats.detail.tab.StatsDialogType;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HowUnderstandChartDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/dialogs/HowUnderstandChartDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HowUnderstandChartDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f86255h0 = new a(null);

    /* compiled from: HowUnderstandChartDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/dialogs/HowUnderstandChartDialogFragment$a;", "", "<init>", "()V", "", "KEY_DIALOG_TYPE", "Ljava/lang/String;", "TAG", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public HowUnderstandChartDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        String string = null;
        d dVar = new d(requireContext(), 0, 2, null);
        dVar.D(R.layout.bottom_sheet_how_understand, true);
        ((Button) dVar.findViewById(R.id.btn_how_understand_close)).setOnClickListener(new S7.a(dVar, 21));
        Bundle arguments = getArguments();
        StatsDialogType.HowUnderstandChartType howUnderstandChartType = arguments != null ? (StatsDialogType.HowUnderstandChartType) arguments.getParcelable("KEY_DIALOG_TYPE") : null;
        StatsDialogType.HowUnderstandChartType.Impressions impressions = StatsDialogType.HowUnderstandChartType.Impressions.f86195c;
        String string2 = L.f(howUnderstandChartType, impressions) ? dVar.getContext().getString(R.string.stats_how_understand_chart_base_impressions) : L.f(howUnderstandChartType, StatsDialogType.HowUnderstandChartType.Views.f86196c) ? dVar.getContext().getString(R.string.stats_how_understand_chart_base_views) : L.f(howUnderstandChartType, StatsDialogType.HowUnderstandChartType.AvgViewsCost.f86194c) ? dVar.getContext().getString(R.string.stats_how_understand_chart_base_avg_views_cost) : null;
        if (string2 != null) {
            ((TextView) dVar.findViewById(R.id.tv_how_understand_description)).setText(Html.fromHtml(string2, 63));
        }
        if (L.f(howUnderstandChartType, impressions)) {
            string = dVar.getContext().getString(R.string.stats_how_understand_chart_impressions_promo_services);
        } else if (L.f(howUnderstandChartType, StatsDialogType.HowUnderstandChartType.Views.f86196c)) {
            string = dVar.getContext().getString(R.string.stats_how_understand_chart_views_promo_services);
        } else if (L.f(howUnderstandChartType, StatsDialogType.HowUnderstandChartType.AvgViewsCost.f86194c)) {
            string = dVar.getContext().getString(R.string.stats_how_understand_chart_avg_views_cost_promo_services);
        }
        if (string != null) {
            ((TextView) dVar.findViewById(R.id.tv_how_understand_description_services)).setText(Html.fromHtml(string, 63));
        }
        j.c(dVar, requireContext().getString(R.string.stats_how_understand_chart_title), false, 0, 0, 0, 124);
        return dVar;
    }
}
