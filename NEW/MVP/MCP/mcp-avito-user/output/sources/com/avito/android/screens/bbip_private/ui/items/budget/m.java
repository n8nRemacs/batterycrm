package com.avito.android.screens.bbip_private.ui.items.budget;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BbipPrivateBudgetItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip_private/ui/items/budget/j;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f260694r = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f260695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f260696c;

    /* renamed from: d, reason: collision with root package name */
    public final SelectorCardGroup f260697d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f260698e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f260699f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f260700g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public q f260701h;

    /* renamed from: i, reason: collision with root package name */
    public final int f260702i;

    /* renamed from: j, reason: collision with root package name */
    public final int f260703j;

    /* renamed from: k, reason: collision with root package name */
    public final int f260704k;

    /* renamed from: l, reason: collision with root package name */
    public final int f260705l;

    /* renamed from: m, reason: collision with root package name */
    public final int f260706m;

    /* renamed from: n, reason: collision with root package name */
    public final int f260707n;

    /* renamed from: o, reason: collision with root package name */
    public final int f260708o;

    /* renamed from: p, reason: collision with root package name */
    public final int f260709p;

    /* renamed from: q, reason: collision with root package name */
    public final int f260710q;

    public m(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f260695b = aVar;
        this.f260696c = (TextView) view.findViewById(R.id.bbip_private_budget_title);
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.bbip_private_budget_selector_card);
        selectorCardGroup.setContentBinderFactory(new b());
        this.f260697d = selectorCardGroup;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bbip_private_budget_custom);
        this.f260698e = linearLayout;
        this.f260699f = (TextView) linearLayout.findViewById(R.id.bbip_private_budget_custom_icon);
        this.f260700g = (TextView) linearLayout.findViewById(R.id.bbip_private_budget_custom_title);
        this.f260702i = y6.b(16);
        this.f260703j = y6.b(12);
        this.f260704k = y6.b(22);
        this.f260705l = y6.b(20);
        this.f260706m = y6.b(48);
        this.f260707n = y6.b(144);
        this.f260708o = y6.b(176);
        this.f260709p = y6.b(-4);
        this.f260710q = y6.b(8);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void Bd() {
        D6.k(this.f260697d);
        D6.k(this.f260698e);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void Pl(@Y61.k ArrayList arrayList, @Y61.l BbipPrivateBudgetItem.Budget budget, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        SelectorCardGroup selectorCardGroup = this.f260697d;
        selectorCardGroup.setSelectedListener(null);
        selectorCardGroup.setReselectedListener(null);
        selectorCardGroup.setData(arrayList);
        if (budget != null) {
            selectorCardGroup.d(budget, true);
            SelectorCardGroup.c(selectorCardGroup, budget);
        }
        selectorCardGroup.setSelectedListener(new k(lVar));
        selectorCardGroup.setReselectedListener(new l(lVar2));
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void Rc() {
        D6.w(this.f260698e);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void e9() {
        D6.h(this.f260697d);
        D6.h(this.f260698e);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void jd(boolean z12) {
        int i12 = this.f260703j;
        int i13 = z12 ? this.f260710q : i12;
        SelectorCardGroup selectorCardGroup = this.f260697d;
        selectorCardGroup.setChildSpacing(i13);
        D6.c(selectorCardGroup, null, Integer.valueOf(z12 ? this.f260709p : this.f260702i), null, null, 13);
        if (z12) {
            i12 = this.f260704k;
        }
        D6.c(this.f260698e, null, Integer.valueOf(i12), null, null, 13);
        D6.c(this.f260699f, null, Integer.valueOf(z12 ? this.f260706m : this.f260705l), null, null, 13);
        LinearLayout linearLayout = this.f260698e;
        linearLayout.getLayoutParams().height = z12 ? this.f260708o : this.f260707n;
        linearLayout.requestLayout();
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void setTitle(@Y61.k String str) {
        this.f260696c.setText(str);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void u7(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f260699f;
        com.avito.android.util.text.a aVar2 = this.f260695b;
        com.avito.android.util.text.j.c(textView, attributedText, aVar2);
        com.avito.android.util.text.j.c(this.f260700g, attributedText2, aVar2);
        com.avito.android.saved_searches.presentation.items.switcher.l lVar = new com.avito.android.saved_searches.presentation.items.switcher.l(4, aVar);
        LinearLayout linearLayout = this.f260698e;
        linearLayout.setOnClickListener(lVar);
        D6.H(linearLayout);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.budget.j
    public final void ve(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, int i12, @Y61.k ArrayList arrayList, @Y61.k Y41.l lVar) {
        q qVar = this.f260701h;
        if (qVar != null) {
            qVar.dismiss();
        }
        q qVar2 = new q(this.itemView.getContext(), str, str2, str3, i12, lVar);
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((n) it.next()).f260715e) {
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
            arrayList2.add(n.a((n) obj, i14 == iIntValue));
            i14 = i15;
        }
        qVar2.f260722H.setValue(arrayList2);
        qVar2.V(iIntValue);
        com.avito.android.lib.util.g.a(qVar2);
        this.f260701h = qVar2;
    }
}
