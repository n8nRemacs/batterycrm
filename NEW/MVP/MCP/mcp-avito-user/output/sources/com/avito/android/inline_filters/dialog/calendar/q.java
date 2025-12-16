package com.avito.android.inline_filters.dialog.calendar;

import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "checkInPosition", "Lkotlin/G0;", "accept", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171312b;

    public q(p pVar) {
        this.f171312b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() >= 0) {
            int iIntValue = num.intValue();
            int i12 = p.f171281s0;
            p pVar = this.f171312b;
            if (iIntValue >= pVar.f9435Q.size()) {
                return;
            }
            int iIntValue2 = num.intValue();
            int size = pVar.f9435Q.size() - 1;
            com.avito.android.util.architecture_components.D<Integer> d12 = pVar.f171293d0;
            if (iIntValue2 <= size) {
                d12.setValue(num);
            } else {
                d12.setValue(Integer.valueOf(pVar.f9435Q.size() - 1));
            }
        }
    }
}
