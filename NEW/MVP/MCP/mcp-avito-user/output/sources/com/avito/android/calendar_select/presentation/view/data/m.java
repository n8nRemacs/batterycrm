package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarSelectDataSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/m;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f113480a;

    public m(@Y61.k j jVar) {
        this.f113480a = jVar;
    }

    public static com.avito.android.calendar_select.presentation.view.konveyor.items.day.a a(m mVar, com.avito.android.calendar_select.presentation.view.konveyor.items.day.a aVar, LocalDate localDate, DateRange dateRange, int i12) {
        if ((i12 & 2) != 0) {
            localDate = null;
        }
        if ((i12 & 8) != 0) {
            dateRange = null;
        }
        return new com.avito.android.calendar_select.presentation.view.konveyor.items.day.a(aVar.f113512b, aVar.f113513c, mVar.f113480a.a(aVar.f113515e, localDate, null, dateRange), aVar.f113515e);
    }

    @Y61.k
    public abstract ArrayList b();

    @Y61.k
    public abstract List<LocalDate> c();

    @Y61.k
    public abstract CalendarSelectionType d();

    public abstract void e();

    public abstract boolean f(@Y61.k LocalDate localDate);

    public final int g(@Y61.k LocalDate localDate) {
        Iterator it = b().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            TV0.a aVar = (TV0.a) it.next();
            if ((aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) && L.f(((com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) aVar).f113515e, localDate)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Y61.k
    public abstract ArrayList h();

    public final void i(@Y61.k LocalDate localDate) {
        ArrayList arrayListH = h();
        int iG2 = g(localDate);
        TV0.a aVar = (TV0.a) arrayListH.get(iG2);
        if (aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) {
            arrayListH.set(iG2, a(this, (com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) aVar, null, null, 12));
        }
    }
}
