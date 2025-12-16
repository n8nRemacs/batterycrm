package com.avito.android.publish.slots.card_select.item;

import Y61.l;
import Ze0.C19548b;
import Ze0.InterfaceC19549c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CardSelectSlotItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/card_select/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19549c f243155b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f243156c;

    /* renamed from: d, reason: collision with root package name */
    public final int f243157d;

    public j(@Y61.k View view, @Y61.k InterfaceC19549c interfaceC19549c) {
        super(view);
        this.f243155b = interfaceC19549c;
        View viewFindViewById = view.findViewById(R.id.cards_select_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f243156c = (LinearLayout) viewFindViewById;
        this.f243157d = view.getContext().getResources().getDimensionPixelOffset(R.dimen.card_select_bottom_margin);
    }

    @Override // com.avito.android.publish.slots.card_select.item.i
    public final void xC(@Y61.k List<CardSelect> list, @l UniversalColor universalColor, @l UniversalColor universalColor2, @Y61.k Y41.l<? super CardSelect, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        LinearLayout linearLayout = this.f243156c;
        linearLayout.removeAllViews();
        List<CardSelect> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C19548b((CardSelect) it.next(), universalColor, universalColor2, lVar, lVar2));
        }
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            View viewA = this.f243155b.a(layoutInflaterFrom, linearLayout, (C19548b) next);
            if (i12 < list.size() - 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewA.getLayoutParams();
                marginLayoutParams.bottomMargin = this.f243157d;
                viewA.setLayoutParams(marginLayoutParams);
            }
            linearLayout.addView(viewA);
            i12 = i13;
        }
    }
}
