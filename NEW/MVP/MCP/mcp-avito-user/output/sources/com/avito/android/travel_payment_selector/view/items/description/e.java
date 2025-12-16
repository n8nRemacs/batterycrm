package com.avito.android.travel_payment_selector.view.items.description;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get.AttributedTextWithIcon;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import lF0.InterfaceC43628a;

/* compiled from: DescriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/items/description/e;", "LTV0/d;", "Lcom/avito/android/travel_payment_selector/view/items/description/i;", "Lcom/avito/android/travel_payment_selector/view/items/description/c;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<i, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC43628a, G0> f302745b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC43628a, G0> lVar) {
        this.f302745b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        final i iVar = (i) eVar;
        c cVar = (c) aVar;
        d dVar = new d(this, cVar);
        DescriptionParameterItem descriptionParameterItem = iVar.f302751b;
        j.c(descriptionParameterItem.getRightTextView(), cVar.f302739d, null);
        j.c(descriptionParameterItem.getLeftTextView(), cVar.f302738c, null);
        final String str = cVar.f302740e;
        if (str != null) {
            descriptionParameterItem.setLeftTextIconDrawable(C35835l0.h(R.attr.ic_help20, descriptionParameterItem.getContext()));
            descriptionParameterItem.setLeftTextIconClickListener(new View.OnClickListener() { // from class: com.avito.android.travel_payment_selector.view.items.description.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i.f302750e;
                    i iVar2 = iVar;
                    DescriptionParameterItem descriptionParameterItem2 = iVar2.f302751b;
                    com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(descriptionParameterItem2.getContext(), 0, 0, 6, null);
                    r.a aVar2 = new r.a(new i.a(new b.a()));
                    aVar2.j(y6.b(-4));
                    aVar2.m(y6.b(18));
                    kVar.f181224j = aVar2;
                    p.a(kVar, new h(str));
                    int i14 = kVar.f181229o;
                    kVar.f181228n = -1;
                    kVar.f181229o = i14;
                    iVar2.f302753d = kVar.f(descriptionParameterItem2.getIcon());
                }
            });
        }
        List<kF0.b> list = cVar.f302742g;
        if (list.isEmpty()) {
            return;
        }
        descriptionParameterItem.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(1, dVar));
        Context context = descriptionParameterItem.getContext();
        boolean z12 = cVar.f302741f;
        descriptionParameterItem.setLeftTextIconDrawable(C35835l0.h(z12 ? R.attr.ic_arrowExpandLess16 : R.attr.ic_arrowExpandMore16, context));
        int i13 = !z12 ? 0 : 8;
        LinearLayout linearLayout = iVar.f302752c;
        linearLayout.setVisibility(i13);
        linearLayout.removeAllViews();
        if (z12) {
            return;
        }
        for (kF0.b bVar : list) {
            DescriptionParameterItem descriptionParameterItem2 = new DescriptionParameterItem(linearLayout.getContext(), null, 0, 0, 14, null);
            j.a(descriptionParameterItem2.getLeftTextView(), bVar.getLeftPart().getText(), null);
            com.avito.android.lib.design.text_view.a rightTextView = descriptionParameterItem2.getRightTextView();
            AttributedTextWithIcon rightPart = bVar.getRightPart();
            j.a(rightTextView, rightPart != null ? rightPart.getText() : null, null);
            linearLayout.addView(descriptionParameterItem2);
        }
    }
}
