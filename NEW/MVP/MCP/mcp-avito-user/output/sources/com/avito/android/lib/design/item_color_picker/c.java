package com.avito.android.lib.design.item_color_picker;

import Y41.p;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.item_color_picker.ItemColorPicker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ItemColorPicker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class c extends H implements p<Integer, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        ItemColorPicker.c cVar;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        ItemColorPicker itemColorPicker = (ItemColorPicker) this.receiver;
        RecyclerView.Adapter adapter = itemColorPicker.f179439r.getAdapter();
        b bVar = adapter instanceof b ? (b) adapter : null;
        if (bVar != null) {
            bVar.notifyItemChanged(iIntValue);
            if (zBooleanValue && (cVar = itemColorPicker.itemColorSelectedListener) != null) {
                cVar.a((a) bVar.f179476f.get(iIntValue));
            }
        }
        return G0.f406611a;
    }
}
