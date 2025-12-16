package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.presentation.view.data.b;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SingleDateDataSourceImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/v;", "Lcom/avito/android/calendar_select/presentation/view/data/m;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v extends m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public LocalDate f113499b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f113500c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f113501d;

    public v(@Y61.k f fVar, @Y61.k c cVar, @Y61.k j jVar, @Y61.l LocalDate localDate) {
        super(jVar);
        this.f113499b = localDate;
        this.f113500c = CalendarSelectionType.f113306b;
        this.f113501d = new ArrayList(b.a.a(cVar, fVar, localDate, null, null, 12));
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ArrayList getF113501d() {
        return this.f113501d;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    public final List<LocalDate> c() {
        LocalDate localDate = this.f113499b;
        if (localDate == null) {
            return C42784z0.f406748b;
        }
        Object obj = Xl.b.f19053a;
        return Collections.singletonList(localDate);
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final CalendarSelectionType getF113500c() {
        return this.f113500c;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    public final void e() {
        LocalDate localDate = this.f113499b;
        if (localDate != null) {
            i(localDate);
        }
        this.f113499b = null;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    public final boolean f(@Y61.k LocalDate localDate) {
        LocalDate localDate2 = this.f113499b;
        if (localDate2 != null) {
            e();
            return true;
        }
        if (localDate2 != null) {
            i(localDate2);
        }
        ArrayList arrayListH = h();
        int iG2 = g(localDate);
        TV0.a aVar = (TV0.a) arrayListH.get(iG2);
        if (aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) {
            arrayListH.set(iG2, m.a(this, (com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) aVar, localDate, null, 12));
        }
        this.f113499b = localDate;
        return true;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    public final ArrayList h() {
        return this.f113501d;
    }
}
