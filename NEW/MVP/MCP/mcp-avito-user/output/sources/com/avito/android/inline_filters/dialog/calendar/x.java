package com.avito.android.inline_filters.dialog.calendar;

import com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState;
import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedId", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171376b;

    public x(p pVar) {
        this.f171376b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        p pVar = this.f171376b;
        FlexDatesState value = pVar.f9429K.getValue();
        if (value != null) {
            FlexDatesState flexDatesStateA = pVar.f171283T.a(value, iIntValue);
            pVar.f171305p0.accept(Boolean.valueOf(flexDatesStateA.f171273d != flexDatesStateA.f171272c));
            pVar.f9429K.setValue(flexDatesStateA);
        }
    }
}
