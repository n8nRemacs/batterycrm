package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.j;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HorizontalColumnView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/horizontal_chart/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/horizontal_chart/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318028b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f318029c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f318030d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f318031e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f318032f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f318033g;

    public g(@k View view) {
        super(view);
        this.f318028b = view;
        this.f318029c = LayoutInflater.from(view.getContext());
        this.f318030d = (TextView) view.findViewById(R.id.tv_contacts_title);
        this.f318031e = (TextView) view.findViewById(R.id.tv_contacts_title_count);
        this.f318032f = (TextView) view.findViewById(R.id.tv_contacts_percent);
        this.f318033g = (LinearLayout) view.findViewById(R.id.ll_contacts_bar);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.f
    public final void Js(@k HorizontalColumnItem horizontalColumnItem) {
        this.f318030d.setText(horizontalColumnItem.f318019c);
        this.f318031e.setText(horizontalColumnItem.f318021e);
        StringBuilder sb2 = new StringBuilder();
        int i12 = horizontalColumnItem.f318020d;
        sb2.append(i12);
        sb2.append('%');
        String string = sb2.toString();
        TextView textView = this.f318032f;
        textView.setText(string);
        textView.setVisibility(0);
        j.a(this.f318029c, this.f318033g, 100.0d, i12, horizontalColumnItem.f318022f);
        this.f318028b.setPadding(y6.b(16), y6.b(6), y6.b(16), y6.b(6));
    }
}
