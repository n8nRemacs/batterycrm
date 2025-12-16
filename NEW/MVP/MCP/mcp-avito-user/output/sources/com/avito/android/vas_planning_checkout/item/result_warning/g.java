package com.avito.android.vas_planning_checkout.item.result_warning;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.vas_planning_checkout.item.result_warning.VasPlanningResultWarningItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningResultWarningItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/result_warning/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_planning_checkout/item/result_warning/f;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f323000b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f323001c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public w f323002d;

    public g(@k Banner banner) {
        super(banner);
        this.f323000b = banner;
        this.f323001c = LayoutInflater.from(banner.getContext());
    }

    @Override // com.avito.android.vas_planning_checkout.item.result_warning.f
    public final void PL(@k VasPlanningResultWarningItem vasPlanningResultWarningItem) {
        Banner banner = this.f323000b;
        Button button = (Button) banner.findViewById(R.id.balance_button);
        TextView textView = (TextView) banner.findViewById(R.id.title);
        LinearLayout linearLayout = (LinearLayout) banner.findViewById(R.id.balance_container);
        TextView textView2 = (TextView) banner.findViewById(R.id.attention);
        VasPlanningResultWarningItem.Action action = vasPlanningResultWarningItem.f322986c;
        D6.G(button, action != null);
        com.avito.android.lib.design.button.b.a(button, action != null ? action.f322990b : null, false);
        button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(25, this, vasPlanningResultWarningItem));
        I5.a(textView, vasPlanningResultWarningItem.f322989f, false);
        I5.a(textView2, vasPlanningResultWarningItem.f322987d, false);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        for (VasPlanningResultWarningItem.Balance balance : vasPlanningResultWarningItem.f322988e) {
            View viewInflate = this.f323001c.inflate(R.layout.vas_planning_result_balance_item, (ViewGroup) linearLayout, false);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.balance_label);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.balance_value);
            I5.a(textView3, balance.f322993c, false);
            I5.a(textView4, balance.f322992b, false);
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
        }
    }

    @Override // com.avito.android.vas_planning_checkout.item.result_warning.f
    public final void hT(@k w wVar) {
        this.f323002d = wVar;
    }
}
