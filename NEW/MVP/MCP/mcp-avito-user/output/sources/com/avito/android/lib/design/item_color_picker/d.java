package com.avito.android.lib.design.item_color_picker;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ItemColorPicker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class d extends H implements l<Integer, Boolean> {
    @Override // Y41.l
    public final Boolean invoke(Integer num) {
        Boolean boolInvoke = ((ItemColorPicker) this.receiver).selectCondition.invoke(Integer.valueOf(num.intValue()));
        boolInvoke.booleanValue();
        return boolInvoke;
    }
}
