package com.avito.android.mortgage.root.list.items.bank_tabs;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.mortgage.root.list.items.bank_tabs.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BankTabsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/bank_tabs/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f202426b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public p<? super c.b, ? super Boolean, G0> f202427c;

    /* compiled from: BankTabsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/root/list/items/bank_tabs/h$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {
        public a() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
            p<? super c.b, ? super Boolean, G0> pVar = h.this.f202427c;
            if (pVar != null) {
                ((d) pVar).invoke((c.b) hVar, Boolean.FALSE);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            p<? super c.b, ? super Boolean, G0> pVar = h.this.f202427c;
            if (pVar != null) {
                ((d) pVar).invoke((c.b) hVar, Boolean.TRUE);
            }
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.banks_tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById;
        this.f202426b = chips;
        chips.setChipsSelectedListener(new a());
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_tabs.g
    public final void HR(@k c cVar) {
        Context context = this.itemView.getContext();
        List<c.a> list = cVar.f202410c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (c.a aVar : list) {
            arrayList.add(new c.b(aVar.f202413a.invoke(context), aVar.f202414b, aVar.f202415c, context, false, aVar.f202416d, 16, null));
        }
        this.f202426b.setData(arrayList);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_tabs.g
    public final void Qa(int i12) {
        Chips chips = this.f202426b;
        if (i12 < 0) {
            chips.j();
            return;
        }
        Integer num = (Integer) C42745f0.G(chips.n());
        if (num != null && i12 == num.intValue()) {
            return;
        }
        chips.p(i12, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_tabs.g
    public final void u00(@k p<? super c.b, ? super Boolean, G0> pVar) {
        this.f202427c = pVar;
    }
}
