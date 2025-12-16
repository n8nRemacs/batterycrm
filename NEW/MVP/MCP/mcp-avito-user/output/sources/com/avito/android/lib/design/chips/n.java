package com.avito.android.lib.design.chips;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class n extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        RecyclerView.Adapter adapter = ((Chips) this.receiver).f178693s.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return G0.f406611a;
    }
}
