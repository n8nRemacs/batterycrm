package com.avito.android.vas_planning_calendar.data;

import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.vas_planning_calendar.model.DateRange;
import fM0.C40316a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarDataSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/data/f;", "Lcom/avito/android/vas_planning_calendar/data/e;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C40316a f322610a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f322611b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f322612c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f322613d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Date f322614e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public DateRange f322615f;

    /* compiled from: PlanCalendarDataSource.kt */
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

    public f(@Y61.k C40316a c40316a, @Y61.k d dVar, @Y61.k CalendarSelectionType calendarSelectionType, @Y61.l Date date, @Y61.l DateRange dateRange) {
        this.f322610a = c40316a;
        this.f322611b = dVar;
        this.f322612c = calendarSelectionType;
        com.jakewharton.rxrelay3.b bVar = new com.jakewharton.rxrelay3.b();
        this.f322613d = bVar;
        this.f322614e = date;
        this.f322615f = dateRange;
        bVar.accept(e());
    }

    @Override // com.avito.android.vas_planning_calendar.data.e
    public final boolean a(@Y61.k Date date) {
        int iOrdinal = this.f322612c.ordinal();
        com.jakewharton.rxrelay3.b bVar = this.f322613d;
        if (iOrdinal == 0) {
            this.f322615f = null;
            this.f322614e = date;
            bVar.accept(e());
        } else if (iOrdinal == 1) {
            Date date2 = this.f322614e;
            if (date2 == null) {
                this.f322614e = date;
                bVar.accept(e());
                return true;
            }
            if (date2.compareTo(date) > 0) {
                this.f322615f = null;
                this.f322614e = date;
                bVar.accept(e());
                return true;
            }
            if (this.f322615f != null) {
                this.f322615f = null;
                this.f322614e = date;
                bVar.accept(e());
                return true;
            }
            Date date3 = this.f322614e;
            if (date3 == null) {
                return false;
            }
            this.f322615f = new DateRange(date3, date);
            bVar.accept(e());
            return true;
        }
        return true;
    }

    @Override // com.avito.android.vas_planning_calendar.data.e
    public final void b() {
        this.f322614e = null;
        this.f322615f = null;
        this.f322613d.accept(e());
    }

    @Override // com.avito.android.vas_planning_calendar.data.e
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Date getF322614e() {
        return this.f322614e;
    }

    @Override // com.avito.android.vas_planning_calendar.data.e
    public final com.jakewharton.rxrelay3.d d() {
        return this.f322613d;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<TV0.a> e() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_planning_calendar.data.f.e():java.util.List");
    }
}
