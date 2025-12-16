package com.avito.android.advert_core.pp_recall_promo;

import Ca1.ViewOnClickListenerC13236c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsPpRecallPromoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f83983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<AdvertDetailsPpRecallPromoItem.SelectItem> f83984m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f83985n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.avito.android.lib.design.bottom_sheet.d dVar, List<AdvertDetailsPpRecallPromoItem.SelectItem> list, n nVar) {
        super(1);
        this.f83983l = dVar;
        this.f83984m = list;
        this.f83985n = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        LinearLayout linearLayout = (LinearLayout) view2;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f83983l;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(dVar.getContext());
        for (AdvertDetailsPpRecallPromoItem.SelectItem selectItem : this.f83984m) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_reason_item_layout, (ViewGroup) linearLayout, false);
            Integer numM = com.avito.android.lib.util.f.m(selectItem.f83941b);
            TextView textView = viewInflate instanceof TextView ? (TextView) viewInflate : null;
            if (textView != null) {
                textView.setText(selectItem.f83942c);
                textView.setTextAppearance(C35835l0.j(R.attr.textM20, textView.getContext()));
                if (numM != null) {
                    FV.a aVar = FV.a.f4720a;
                    int iIntValue = numM.intValue();
                    int iB2 = y6.b(13);
                    aVar.getClass();
                    FV.a.j(textView, iIntValue, iB2);
                }
                textView.setOnClickListener(new ViewOnClickListenerC13236c(dVar, selectItem, this.f83985n, 12));
            }
            LinearLayout linearLayout2 = view2 instanceof LinearLayout ? linearLayout : null;
            if (linearLayout2 != null) {
                linearLayout2.addView(viewInflate);
            }
        }
        return G0.f406611a;
    }
}
