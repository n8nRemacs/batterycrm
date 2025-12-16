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
final /* synthetic */ class e extends H implements p<Boolean, Integer, G0> {
    @Override // Y41.p
    public final G0 invoke(Boolean bool, Integer num) {
        ItemColorPicker.b bVar;
        bool.getClass();
        int iIntValue = num.intValue();
        ItemColorPicker itemColorPicker = (ItemColorPicker) this.receiver;
        RecyclerView.Adapter adapter = itemColorPicker.f179439r.getAdapter();
        b bVar2 = adapter instanceof b ? (b) adapter : null;
        if (bVar2 != null && (bVar = itemColorPicker.itemColorSelectConditionListener) != null) {
            bVar.a();
        }
        return G0.f406611a;
    }
}
