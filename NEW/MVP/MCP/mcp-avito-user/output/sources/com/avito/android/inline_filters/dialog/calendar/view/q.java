package com.avito.android.inline_filters.dialog.calendar.view;

import com.avito.android.lib.design.chips.state.ItemChipable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FiltersCalendarPickerView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class q extends N implements Y41.p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l41.g<Integer> f171351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l41.g<Integer> gVar) {
        super(2);
        this.f171351l = gVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        bool.booleanValue();
        ItemChipable itemChipable = hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null;
        if (itemChipable != null) {
            this.f171351l.accept(Integer.valueOf(itemChipable.f178762b));
        }
        return G0.f406611a;
    }
}
