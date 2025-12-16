package com.avito.android.inline_filters.dialog.calendar;

import com.avito.android.inline_filters.calendar.FiltersCalendarPickerType;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171378b;

    /* compiled from: FiltersCalendarPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FiltersCalendarPickerType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FiltersCalendarPickerType filtersCalendarPickerType = FiltersCalendarPickerType.f171050b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public z(p pVar) {
        this.f171378b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = p.f171281s0;
        p pVar = this.f171378b;
        HN.h hVar = pVar.f9436R;
        DateRange dateRange = null;
        Date f7063g = hVar != null ? hVar.getF7063g() : null;
        int iOrdinal = pVar.f171288Y.f171045c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            HN.h hVar2 = pVar.f9436R;
            if (hVar2 != null) {
                dateRange = hVar2.getF7064h();
            }
        } else if (f7063g != null) {
            dateRange = new DateRange(f7063g, f7063g);
        }
        if (dateRange != null) {
            pVar.f171290a0.setValue(dateRange);
        } else if (f7063g != null) {
            pVar.f9433O.setValue(pVar.f171285V.getF171341c());
        } else {
            pVar.f171294e0.setValue(G0.f406611a);
        }
    }
}
