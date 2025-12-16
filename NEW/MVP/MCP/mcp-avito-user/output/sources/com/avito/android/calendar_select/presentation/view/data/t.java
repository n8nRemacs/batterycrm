package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.presentation.view.data.b;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: RangeDataSourceImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/t;", "Lcom/avito/android/calendar_select/presentation/view/data/m;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t extends m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f113489b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f113490c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final j f113491d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f113492e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public LocalDate f113493f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public DateRange f113494g;

    public t(@Y61.k f fVar, @Y61.k c cVar, @Y61.k j jVar, @Y61.k CalendarSelectionType calendarSelectionType, @Y61.k List list) {
        super(jVar);
        this.f113489b = fVar;
        this.f113490c = cVar;
        this.f113491d = jVar;
        this.f113492e = calendarSelectionType;
        this.f113494g = list.size() == 2 ? new DateRange((LocalDate) list.get(0), (LocalDate) list.get(1)) : null;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    /* renamed from: b */
    public final ArrayList getF113501d() {
        return new ArrayList(b.a.a(this.f113490c, this.f113489b, this.f113493f, null, this.f113494g, 4));
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    public final List<LocalDate> c() {
        DateRange dateRange = this.f113494g;
        LocalDate localDate = dateRange != null ? dateRange.f113540b : null;
        LocalDate localDate2 = dateRange != null ? dateRange.f113541c : null;
        if (localDate != null && localDate2 != null) {
            return C42745f0.U(localDate, localDate2);
        }
        LocalDate localDate3 = this.f113493f;
        if (localDate3 == null) {
            return C42784z0.f406748b;
        }
        Object obj = Xl.b.f19053a;
        return Collections.singletonList(localDate3);
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final CalendarSelectionType getF113500c() {
        return this.f113492e;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    public final void e() {
        DateRange dateRange = this.f113494g;
        if (dateRange != null) {
            j(dateRange, false);
        }
        this.f113494g = null;
        LocalDate localDate = this.f113493f;
        if (localDate != null) {
            i(localDate);
        }
        this.f113493f = null;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    public final boolean f(@Y61.k LocalDate localDate) {
        LocalDate localDate2 = this.f113493f;
        DateRange dateRange = this.f113494g;
        if (localDate2 == null) {
            k(localDate);
            return true;
        }
        if (localDate2.compareTo((ChronoLocalDate) localDate) > 0) {
            k(localDate);
            return true;
        }
        if (dateRange != null) {
            k(localDate);
            return true;
        }
        if (localDate2.equals(localDate)) {
            return false;
        }
        LocalDate localDate3 = this.f113493f;
        if (localDate3 != null) {
            i(localDate3);
        }
        this.f113493f = null;
        DateRange dateRange2 = new DateRange(localDate2, localDate);
        j(dateRange2, true);
        this.f113494g = dateRange2;
        return true;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    public final ArrayList h() {
        return getF113501d();
    }

    public final void j(DateRange dateRange, boolean z12) {
        for (int iG2 = g(dateRange.f113540b); iG2 < getF113501d().size(); iG2++) {
            TV0.a aVar = (TV0.a) getF113501d().get(iG2);
            boolean z13 = aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.day.a;
            LocalDate localDate = dateRange.f113541c;
            if (z13) {
                com.avito.android.calendar_select.presentation.view.konveyor.items.day.a aVar2 = (com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) aVar;
                if (aVar2.f113515e.compareTo((ChronoLocalDate) localDate) > 0) {
                    return;
                } else {
                    getF113501d().set(iG2, m.a(this, aVar2, null, z12 ? dateRange : null, 6));
                }
            } else if (aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.empty.a) {
                com.avito.android.calendar_select.presentation.view.konveyor.items.empty.a aVar3 = (com.avito.android.calendar_select.presentation.view.konveyor.items.empty.a) aVar;
                if (aVar3.f113527c.compareTo((ChronoLocalDate) localDate) > 0) {
                    return;
                }
                ArrayList arrayListB = getF113501d();
                DateRange dateRange2 = z12 ? dateRange : null;
                j jVar = this.f113491d;
                LocalDate localDate2 = aVar3.f113527c;
                arrayListB.set(iG2, new com.avito.android.calendar_select.presentation.view.konveyor.items.empty.a(aVar3.f113526b, localDate2, jVar.b(localDate2, dateRange2)));
            } else {
                continue;
            }
        }
    }

    public final void k(LocalDate localDate) {
        DateRange dateRange = this.f113494g;
        if (dateRange != null) {
            j(dateRange, false);
        }
        this.f113494g = null;
        LocalDate localDate2 = this.f113493f;
        if (localDate2 != null) {
            i(localDate2);
        }
        ArrayList arrayListH = h();
        int iG2 = g(localDate);
        TV0.a aVar = (TV0.a) arrayListH.get(iG2);
        if (aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) {
            arrayListH.set(iG2, m.a(this, (com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) aVar, localDate, null, 12));
        }
        this.f113493f = localDate;
    }
}
