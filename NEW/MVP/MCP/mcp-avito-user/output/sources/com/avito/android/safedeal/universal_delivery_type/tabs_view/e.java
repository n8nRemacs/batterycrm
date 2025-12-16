package com.avito.android.safedeal.universal_delivery_type.tabs_view;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControlTabsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/tabs_view/e;", "Lcom/avito/android/safedeal/universal_delivery_type/tabs_view/f;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SegmentedControl f256861a;

    public e(@k SegmentedControl segmentedControl) {
        this.f256861a = segmentedControl;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void a(@l com.avito.android.offlinization.ui.a aVar) {
        this.f256861a.setOnSegmentClickListener(new d(aVar));
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void b(int i12, @k List list) {
        List<UniversalDeliveryTypeContent.Tab> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (UniversalDeliveryTypeContent.Tab tab : list2) {
            arrayList.add(new SegmentedControl.c(tab.getIsEnabled(), tab.getTitle()));
        }
        this.f256861a.r(i12, arrayList);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void c(int i12) {
        SegmentedControl.t(this.f256861a, i12, false, 2);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.tabs_view.f
    public final void setVisible(boolean z12) {
        D6.G(this.f256861a, z12);
    }
}
