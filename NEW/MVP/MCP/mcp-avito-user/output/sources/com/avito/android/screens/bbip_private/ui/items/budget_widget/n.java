package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BbipPrivateBudgetWidgetItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/k;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f260798o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f260799b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f260800c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f260801d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f260802e;

    /* renamed from: f, reason: collision with root package name */
    public final SelectorCardGroup f260803f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f260804g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f260805h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f260806i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public r f260807j;

    /* renamed from: k, reason: collision with root package name */
    public final int f260808k;

    /* renamed from: l, reason: collision with root package name */
    public final int f260809l;

    /* renamed from: m, reason: collision with root package name */
    public final int f260810m;

    /* renamed from: n, reason: collision with root package name */
    public final int f260811n;

    public n(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f260799b = aVar;
        this.f260800c = (LinearLayout) view.findViewById(R.id.bbip_private_budget_container_title);
        this.f260801d = (TextView) view.findViewById(R.id.bbip_private_budget_title);
        this.f260802e = (TextView) view.findViewById(R.id.bbip_private_budget_title_icon);
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.bbip_private_budget_selector_card);
        selectorCardGroup.setContentBinderFactory(new b());
        this.f260803f = selectorCardGroup;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bbip_private_budget_custom);
        this.f260804g = linearLayout;
        this.f260805h = (TextView) linearLayout.findViewById(R.id.bbip_private_budget_custom_icon);
        this.f260806i = (TextView) linearLayout.findViewById(R.id.bbip_private_budget_custom_title);
        this.f260808k = y6.b(12);
        this.f260809l = y6.b(22);
        this.f260810m = y6.b(10);
        this.f260811n = y6.b(8);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void Bd() {
        D6.k(this.f260803f);
        D6.k(this.f260804g);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void Rc() {
        D6.w(this.f260804g);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void Sz(@Y61.k ArrayList arrayList, @Y61.l BbipPrivateBudgetWidgetItem.Budget budget, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        SelectorCardGroup selectorCardGroup = this.f260803f;
        selectorCardGroup.setSelectedListener(null);
        selectorCardGroup.setReselectedListener(null);
        selectorCardGroup.setData(arrayList);
        if (budget != null) {
            selectorCardGroup.d(budget, true);
            SelectorCardGroup.c(selectorCardGroup, budget);
        }
        selectorCardGroup.setSelectedListener(new l(lVar));
        selectorCardGroup.setReselectedListener(new m(lVar2));
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void e9() {
        D6.h(this.f260803f);
        D6.h(this.f260804g);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void jZ(int i12, @Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) {
        r rVar = this.f260807j;
        if (rVar != null) {
            rVar.dismiss();
        }
        r rVar2 = new r(this.itemView.getContext(), str, str2, i12, lVar);
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((o) it.next()).f260817f) {
                break;
            } else {
                i13++;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(o.a((o) obj, i14 == iIntValue));
            i14 = i15;
        }
        rVar2.f260825I.setValue(arrayList2);
        rVar2.V(iIntValue);
        com.avito.android.lib.util.g.a(rVar2);
        this.f260807j = rVar2;
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void jd(boolean z12) {
        int i12 = this.f260808k;
        int i13 = z12 ? this.f260811n : i12;
        SelectorCardGroup selectorCardGroup = this.f260803f;
        selectorCardGroup.setChildSpacing(i13);
        D6.c(selectorCardGroup, null, Integer.valueOf(z12 ? this.f260810m : i12), null, null, 13);
        if (z12) {
            i12 = this.f260809l;
        }
        D6.c(this.f260804g, null, Integer.valueOf(i12), null, null, 13);
        this.f260804g.requestLayout();
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void mk(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        this.f260801d.setText(str);
        FV.a.f4720a.getClass();
        FV.a.c(this.f260802e, R.attr.textIconQuestionFilled);
        this.f260800c.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(6, aVar));
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget_widget.k
    public final void u7(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f260805h;
        com.avito.android.util.text.a aVar2 = this.f260799b;
        com.avito.android.util.text.j.c(textView, attributedText, aVar2);
        com.avito.android.util.text.j.c(this.f260806i, attributedText2, aVar2);
        com.avito.android.saved_searches.presentation.items.switcher.l lVar = new com.avito.android.saved_searches.presentation.items.switcher.l(5, aVar);
        LinearLayout linearLayout = this.f260804g;
        linearLayout.setOnClickListener(lVar);
        D6.H(linearLayout);
    }
}
