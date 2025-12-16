package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.android.lib.design.accordion.a;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: MetricHintView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/hint/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/hint/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318016b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f318017c;

    public g(@k View view) {
        super(view);
        this.f318016b = view;
        this.f318017c = (FrameLayout) view.findViewById(R.id.fl_dynamic_hint);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.f
    public final void IQ(@k MetricHintItemData metricHintItemData) {
        Context context = this.f318016b.getContext();
        Accordion accordion = new Accordion(context, null, 0, 0, 14, null);
        a.C5252a c5252a = com.avito.android.lib.design.accordion.a.f178201p;
        int iJ2 = C35835l0.j(R.attr.accordionH40, context);
        c5252a.getClass();
        accordion.setStyle(a.C5252a.b(iJ2, context));
        TextView textView = new TextView(context);
        textView.setText(metricHintItemData.f318010d);
        textView.setTextAppearance(C35835l0.j(R.attr.textM20, context));
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        accordion.setState(new QU.d(metricHintItemData.f318009c, null, false, false, false, textView, metricHintItemData.f318010d, null, false, null, 926, null));
        FrameLayout frameLayout = this.f318017c;
        frameLayout.removeAllViews();
        frameLayout.addView(accordion, new ViewGroup.MarginLayoutParams(-1, -2));
    }
}
