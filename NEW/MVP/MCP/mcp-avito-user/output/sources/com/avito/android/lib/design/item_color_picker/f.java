package com.avito.android.lib.design.item_color_picker;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ItemColorPicker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class f extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        RecyclerView.Adapter adapter = ((ItemColorPicker) this.receiver).f179439r.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return G0.f406611a;
    }
}
