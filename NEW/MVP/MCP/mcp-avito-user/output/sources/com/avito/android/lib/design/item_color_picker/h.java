package com.avito.android.lib.design.item_color_picker;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemColorPicker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "spaceAvailable", "", "position", "Lkotlin/G0;", "invoke", "(ZI)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements p<Boolean, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ItemColorPicker f179477l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ItemColorPicker itemColorPicker) {
        super(2);
        this.f179477l = itemColorPicker;
    }

    @Override // Y41.p
    public final G0 invoke(Boolean bool, Integer num) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        int iIntValue = num.intValue();
        p<? super Boolean, ? super Integer, G0> pVar = this.f179477l.f179442u;
        if (pVar != null) {
            pVar.invoke(bool2, Integer.valueOf(iIntValue));
        }
        return G0.f406611a;
    }
}
