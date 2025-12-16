package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PeriodItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, SegmentedControl.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SegmentedControl f221048b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f221049c;

    public g(@k View view) {
        super(view);
        SegmentedControl segmentedControl = (SegmentedControl) view;
        this.f221048b = segmentedControl;
        segmentedControl.setOnSegmentClickListener(this);
    }

    public final void B80(int i12) {
        a.c cVar;
        a aVar;
        a aVar2 = this.f221049c;
        if (aVar2 == null || (cVar = (a.c) C42745f0.K(i12, aVar2.f221034c)) == null || (aVar = this.f221049c) == null) {
            return;
        }
        aVar.f221036e.invoke(cVar.f221042a);
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void KT(int i12, @k CharSequence charSequence) {
        B80(i12);
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void kJ(int i12, @k CharSequence charSequence) {
        B80(i12);
    }
}
