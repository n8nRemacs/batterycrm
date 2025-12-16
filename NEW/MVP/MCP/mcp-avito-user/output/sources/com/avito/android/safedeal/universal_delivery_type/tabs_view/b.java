package com.avito.android.safedeal.universal_delivery_type.tabs_view;

import Tn0.C15382a;
import Y61.k;
import Y61.l;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsTabsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/tabs_view/b;", "Lcom/avito/android/safedeal/universal_delivery_type/tabs_view/f;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Chips f256859a;

    public b(@k Chips chips) {
        this.f256859a = chips;
        chips.setKeepSelected(true);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void a(@l com.avito.android.offlinization.ui.a aVar) {
        this.f256859a.setChipsSelectedListener(new a(this, aVar));
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void b(int i12, @k List list) {
        Chips chips = this.f256859a;
        Integer num = (Integer) C42745f0.G(chips.n());
        if (num != null && num.intValue() == i12) {
            return;
        }
        List<UniversalDeliveryTypeContent.Tab> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (UniversalDeliveryTypeContent.Tab tab : list2) {
            arrayList.add(new C15382a(tab.getTitle(), tab.getIsEnabled()));
        }
        chips.setData(arrayList);
        chips.p(i12, false);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void c(int i12) {
        this.f256859a.p(i12, false);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void setVisible(boolean z12) {
        D6.G(this.f256859a, z12);
    }
}
