package com.avito.android.vas_planning_calendar;

import com.avito.android.planning.CalendarSelectionType;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlanCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f322563b;

    /* compiled from: PlanCalendarViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarSelectionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarSelectionType calendarSelectionType = CalendarSelectionType.f220022b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public G(M m12) {
        this.f322563b = m12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        M m12 = this.f322563b;
        int iOrdinal = m12.f322573M.ordinal();
        com.avito.android.vas_planning_calendar.data.a aVar = m12.f322571K;
        com.avito.android.util.architecture_components.D<String> d12 = m12.f322588b0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            Object obj2 = m12.f322591e0;
            (obj2 != null ? obj2 : null).getClass();
            d12.setValue(aVar.getF322618b());
            return;
        }
        com.avito.android.vas_planning_calendar.data.e eVar = m12.f322591e0;
        if (eVar == null) {
            eVar = null;
        }
        Date f322614e = eVar.getF322614e();
        if (f322614e != null) {
            m12.f322574N.setValue(f322614e);
            obj = G0.f406611a;
        }
        if (obj == null) {
            d12.setValue(aVar.getF322618b());
        }
    }
}
