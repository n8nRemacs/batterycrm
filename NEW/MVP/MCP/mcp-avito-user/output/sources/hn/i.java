package HN;

import com.avito.android.inline_filters.calendar.FiltersCalendarPickerType;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerDataSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHN/i;", "LHN/h;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f7057a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MN.b f7058b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f7059c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CalendarPickerConstraints f7060d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerType f7061e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f7062f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Date f7063g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public DateRange f7064h;

    /* compiled from: FiltersCalendarPickerDataSource.kt */
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

    public i(@Y61.k n nVar, @Y61.k MN.b bVar, @Y61.k f fVar, @Y61.l SelectedDateRange selectedDateRange, @Y61.l CalendarPickerConstraints calendarPickerConstraints, @Y61.k FiltersCalendarPickerType filtersCalendarPickerType) {
        this.f7057a = nVar;
        this.f7058b = bVar;
        this.f7059c = fVar;
        this.f7060d = calendarPickerConstraints;
        this.f7061e = filtersCalendarPickerType;
        com.jakewharton.rxrelay3.b bVar2 = new com.jakewharton.rxrelay3.b();
        this.f7062f = bVar2;
        DateRange dateRange = null;
        this.f7063g = selectedDateRange != null ? selectedDateRange.f171063b : null;
        Date date = selectedDateRange != null ? selectedDateRange.f171063b : null;
        Date date2 = selectedDateRange != null ? selectedDateRange.f171064c : null;
        if (date != null && date2 != null) {
            dateRange = new DateRange(date, date2);
        }
        this.f7064h = dateRange;
        bVar2.accept(g());
    }

    @Override // HN.h
    public final boolean a(@Y61.k Date date) {
        int iOrdinal = this.f7061e.ordinal();
        if (iOrdinal == 0) {
            this.f7063g = null;
            this.f7064h = null;
            return f(date);
        }
        boolean z12 = true;
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Date date2 = this.f7063g;
        if (date2 == null) {
            return f(date);
        }
        if (date2.compareTo(date) > 0) {
            this.f7063g = null;
            this.f7064h = null;
            return f(date);
        }
        if (this.f7064h != null) {
            this.f7063g = null;
            this.f7064h = null;
            return f(date);
        }
        Date date3 = this.f7063g;
        if (date3 != null && this.f7057a.c(date, date3)) {
            this.f7064h = new DateRange(date3, date);
            this.f7062f.accept(g());
        } else {
            z12 = false;
        }
        return z12;
    }

    @Override // HN.h
    public final void b() {
        this.f7063g = null;
        this.f7064h = null;
        this.f7062f.accept(g());
    }

    @Override // HN.h
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Date getF7063g() {
        return this.f7063g;
    }

    @Override // HN.h
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DateRange getF7064h() {
        return this.f7064h;
    }

    @Override // HN.h
    public final int e(@Y61.k Date date) {
        int i12 = 0;
        for (TV0.a aVar : g()) {
            if ((aVar instanceof com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a) && L.f(((com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.a) aVar).f171220e, date)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public final boolean f(Date date) {
        if (!this.f7057a.a(date)) {
            return false;
        }
        this.f7063g = date;
        this.f7062f.accept(g());
        return true;
    }

    public final List<TV0.a> g() {
        int iOrdinal = this.f7061e.ordinal();
        MN.b bVar = this.f7058b;
        f fVar = this.f7059c;
        CalendarPickerConstraints calendarPickerConstraints = this.f7060d;
        if (iOrdinal == 0) {
            return fVar.a(bVar, this.f7063g, null, calendarPickerConstraints);
        }
        if (iOrdinal == 1) {
            return fVar.a(bVar, this.f7063g, this.f7064h, calendarPickerConstraints);
        }
        throw new NoWhenBranchMatchedException();
    }
}
