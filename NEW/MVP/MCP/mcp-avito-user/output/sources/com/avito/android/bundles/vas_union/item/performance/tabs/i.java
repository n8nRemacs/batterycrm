package com.avito.android.bundles.vas_union.item.performance.tabs;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PerformanceTabsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/tabs/i;", "Lcom/avito/android/bundles/vas_union/item/performance/tabs/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h, SegmentedControl.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SegmentedControl f108634b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super com.avito.android.bundles.vas_union.item.tabs.a, G0> f108635c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f108636d;

    public i(@k View view) {
        super(view);
        SegmentedControl segmentedControl = (SegmentedControl) view;
        this.f108634b = segmentedControl;
        segmentedControl.setOnSegmentClickListener(this);
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.tabs.h
    public final void P0(int i12, @k List list) {
        this.f108636d = (ArrayList) list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.android.bundles.vas_union.item.tabs.a) it.next()).f108664a);
        }
        this.f108634b.q(i12, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void kJ(int i12, @k CharSequence charSequence) {
        SegmentedControl.t(this.f108634b, i12, false, 6);
        Y41.l<? super com.avito.android.bundles.vas_union.item.tabs.a, G0> lVar = this.f108635c;
        if (lVar != null) {
            ArrayList arrayList = this.f108636d;
            if (arrayList == null) {
                arrayList = null;
            }
            ((e) lVar).invoke(arrayList.get(i12));
        }
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.tabs.h
    public final void ua(@k Y41.l<? super com.avito.android.bundles.vas_union.item.tabs.a, G0> lVar) {
        this.f108635c = lVar;
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void KT(int i12, @k CharSequence charSequence) {
    }
}
