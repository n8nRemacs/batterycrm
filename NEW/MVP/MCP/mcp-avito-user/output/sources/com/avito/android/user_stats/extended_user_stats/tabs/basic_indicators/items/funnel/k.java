package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: FunnelItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/k;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f317482c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f317483b;

    public k(@Y61.k View view) {
        super(view);
        this.f317483b = view;
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.i
    public final void EJ(@Y61.k e eVar, @Y61.k com.jakewharton.rxrelay3.c<DeepLink> cVar, @Y61.k com.jakewharton.rxrelay3.c<DeepLink> cVar2) {
        View view = this.f317483b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        ((TextView) view.findViewById(R.id.tv_funnel_title)).setText(eVar.f317475d);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_funnel_item);
        linearLayout.removeAllViews();
        for (d dVar : eVar.f317474c) {
            int i12 = 0;
            ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflaterFrom.inflate(R.layout.funnel_item, (ViewGroup) null, false);
            ((TextView) constraintLayout.findViewById(R.id.tv_user_stats_funnel_title)).setText(dVar.f317467a);
            ((TextView) constraintLayout.findViewById(R.id.tv_user_stats_funnel_count)).setText(dVar.f317468b);
            a aVar = dVar.f317471e;
            if (aVar != null) {
                LinearLayout linearLayout2 = (LinearLayout) constraintLayout.findViewById(R.id.ll_user_stats_funnel_percent);
                ((TextView) constraintLayout.findViewById(R.id.tv_user_stats_funnel_percent)).setText(aVar.f317459a);
                linearLayout2.setVisibility(0);
                linearLayout2.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(19, cVar, aVar));
            }
            TextView textView = (TextView) constraintLayout.findViewById(R.id.tv_user_stats_increment_description);
            textView.setText(dVar.f317469c);
            l lVar = dVar.f317470d;
            if (lVar != null) {
                LinearLayout linearLayout3 = (LinearLayout) constraintLayout.findViewById(R.id.ll_user_stats_funnel_increment);
                TextView textView2 = (TextView) constraintLayout.findViewById(R.id.tv_user_stats_increment_count);
                linearLayout3.setVisibility(0);
                textView2.setText(lVar.f317484a);
                textView.setText(lVar.f317485b);
                DeepLink deepLink = lVar.f317487d;
                if (deepLink != null) {
                    linearLayout3.setOnClickListener(new j(cVar2, deepLink));
                }
                UniversalColor universalColor = lVar.f317486c;
                if (universalColor != null) {
                    textView2.setTextColor(C48063a.f437606a.a(view.getContext(), universalColor));
                }
            }
            ImageButton imageButton = (ImageButton) constraintLayout.findViewById(R.id.ic_user_stats_funnel_help);
            DeepLink deepLink2 = dVar.f317472f;
            if (deepLink2 == null) {
                i12 = 8;
            }
            imageButton.setVisibility(i12);
            imageButton.setOnClickListener(new j(deepLink2, cVar2));
            linearLayout.addView(constraintLayout);
        }
    }
}
