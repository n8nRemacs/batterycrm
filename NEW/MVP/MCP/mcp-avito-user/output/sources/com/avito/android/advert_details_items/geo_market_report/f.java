package com.avito.android.advert_details_items.geo_market_report;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.GeoMarketReport;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsGeoMarketReportView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/geo_market_report/f;", "Lcom/avito/android/advert_details_items/geo_market_report/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84780b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f84781c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f84782d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final LinearLayout f84783e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final LinearLayout f84784f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f84785g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f84786h;

    public f(@k View view) {
        super(view);
        this.f84780b = view;
        this.f84781c = (TextView) view.findViewById(R.id.title);
        this.f84782d = (LinearLayout) view.findViewById(R.id.insights);
        this.f84783e = (LinearLayout) view.findViewById(R.id.insights_column_1);
        this.f84784f = (LinearLayout) view.findViewById(R.id.insights_column_2);
        this.f84785g = (LinearLayout) view.findViewById(R.id.item_geo_market_report);
        this.f84786h = (LinearLayout) view.findViewById(R.id.item_geo_market_report_buttons);
    }

    @Override // com.avito.android.advert_details_items.geo_market_report.e
    public final void V3(@l CharSequence charSequence) {
        I5.a(this.f84781c, charSequence, false);
    }

    @Override // com.avito.android.advert_details_items.geo_market_report.e
    public final void dX(@k List<g> list) throws Resources.NotFoundException {
        String style;
        LinearLayout linearLayout = this.f84785g;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), y6.b(14), linearLayout.getPaddingLeft(), y6.b(2));
        LinearLayout linearLayout2 = this.f84786h;
        linearLayout2.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout2.getContext());
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            g gVar = (g) obj;
            ButtonAction buttonAction = gVar.f84787a;
            int iB2 = i12 == list.size() + (-1) ? y6.b(0) : y6.b(6);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_geo_market_report_button, (ViewGroup) linearLayout2, false);
            Button button = (Button) viewInflate.findViewById(R.id.button);
            com.avito.android.lib.design.button.b.a(button, buttonAction != null ? buttonAction.getTitle() : null, false);
            button.setOnClickListener(gVar.f84788b);
            button.setAppearance(C35835l0.j((buttonAction == null || (style = buttonAction.getStyle()) == null) ? R.attr.buttonAccentLarge : com.avito.android.lib.util.f.d(style), this.f84780b.getContext()));
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = iB2;
            button.setLayoutParams(marginLayoutParams);
            linearLayout2.addView(viewInflate);
            i12 = i13;
        }
        linearLayout2.setPadding(0, y6.b(22), 0, 0);
    }

    @Override // com.avito.android.advert_details_items.geo_market_report.e
    public final void eb(@l List<GeoMarketReport.Insight> list) {
        Integer numM;
        boolean zA2 = O2.a(list);
        ViewGroup viewGroup = this.f84782d;
        if (zA2) {
            D6.H(viewGroup);
        } else {
            D6.w(viewGroup);
        }
        viewGroup.removeAllViews();
        LinearLayout linearLayout = this.f84783e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = this.f84784f;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        if (list == null) {
            return;
        }
        if (linearLayout != null) {
            viewGroup.addView(linearLayout);
        }
        if (linearLayout2 != null) {
            viewGroup.addView(linearLayout2);
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int size = list.size();
        if (linearLayout != null) {
            size = (int) Math.ceil(size / 2.0d);
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            GeoMarketReport.Insight insight = (GeoMarketReport.Insight) obj;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_geo_market_report_insight, viewGroup, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.icon);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.text);
            if (i12 == 0) {
                viewInflate.setPadding(0, y6.b(12), 0, 0);
            }
            String icon = insight.getIcon();
            if (icon != null && (numM = com.avito.android.lib.util.f.m(icon)) != null) {
                FV.a.a(FV.a.f4720a, textView, Integer.valueOf(numM.intValue()));
                D6.H(textView);
            }
            I5.a(textView2, insight.getText(), false);
            if (linearLayout == null) {
                viewGroup.addView(viewInflate);
            } else if (i12 < size) {
                linearLayout.addView(viewInflate);
            } else if (linearLayout2 != null) {
                linearLayout2.addView(viewInflate);
            }
            i12 = i13;
        }
    }
}
