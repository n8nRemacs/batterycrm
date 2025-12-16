package com.avito.android.travel_guest_profile.items.statistics_item;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatisticsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/statistics_item/d;", "LTV0/d;", "Lcom/avito/android/travel_guest_profile/items/statistics_item/f;", "Lcom/avito/android/travel_guest_profile/items/statistics_item/a;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        j.a(fVar.f302141b, aVar2.f302134b, null);
        LinearLayout linearLayout = fVar.f302142c;
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = fVar.f302143d;
        linearLayout2.removeAllViews();
        List<PE0.j> list = aVar2.f302135c;
        if (list.isEmpty()) {
            D6.w(linearLayout);
            D6.w(linearLayout2);
            return;
        }
        D6.H(linearLayout);
        D6.H(linearLayout2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        for (PE0.j jVar : list) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.travel_guest_profile_statistics_stripe, (ViewGroup) linearLayout, false);
            Integer numA = com.avito.android.lib.util.e.a(jVar.f12911b);
            if (numA != null) {
                viewInflate.setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(numA.intValue(), viewInflate.getContext())));
            }
            int i13 = viewInflate.getLayoutParams().width;
            int i14 = viewInflate.getLayoutParams().height;
            int i15 = jVar.f12912c;
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(i13, i14, i15));
            linearLayout.addView(viewInflate);
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.travel_guest_profile_statistics_group_info, (ViewGroup) linearLayout2, false);
            Integer numA2 = com.avito.android.lib.util.e.a(jVar.f12911b);
            if (numA2 != null) {
                viewInflate2.findViewById(R.id.color_preview).setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(numA2.intValue(), viewInflate2.getContext())));
            }
            ((DescriptionParameterItem) viewInflate2.findViewById(R.id.dotted_text_parameter_item)).setState(new com.avito.android.lib.design.description_list.parameter_line.item.a(null, jVar.f12910a, String.valueOf(i15), 1, null));
            linearLayout2.addView(viewInflate2);
        }
    }
}
