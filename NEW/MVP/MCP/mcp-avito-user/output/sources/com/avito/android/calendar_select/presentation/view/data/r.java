package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.presentation.view.data.b;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MultipleDataSourceImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/r;", "Lcom/avito/android/calendar_select/presentation/view/data/m;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r extends m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f113482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f113483c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f113484d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f113485e;

    public r(@Y61.k f fVar, @Y61.k c cVar, @Y61.k j jVar, @Y61.k List list) {
        super(jVar);
        this.f113482b = fVar;
        this.f113483c = cVar;
        this.f113484d = new ArrayList(list);
        this.f113485e = CalendarSelectionType.f113308d;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    /* renamed from: b */
    public final ArrayList getF113501d() {
        return new ArrayList(b.a.a(this.f113483c, this.f113482b, null, this.f113484d, null, 10));
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    public final List<LocalDate> c() {
        return C42745f0.A0(this.f113484d);
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final CalendarSelectionType getF113500c() {
        return this.f113485e;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    public final void e() {
        ArrayList arrayList = this.f113484d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i((LocalDate) it.next());
        }
        arrayList.clear();
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    public final boolean f(@Y61.k LocalDate localDate) {
        Object next;
        Object next2;
        ArrayList arrayList = this.f113484d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LocalDate) next).isEqual(localDate)) {
                break;
            }
        }
        LocalDate localDate2 = (LocalDate) next;
        if (localDate2 != null) {
            arrayList.remove(localDate2);
            i(localDate2);
            return true;
        }
        arrayList.add(localDate);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((LocalDate) next2).isEqual(localDate)) {
                break;
            }
        }
        LocalDate localDate3 = (LocalDate) next2;
        if (localDate3 == null) {
            return true;
        }
        ArrayList arrayListH = h();
        int iG2 = g(localDate3);
        TV0.a aVar = (TV0.a) arrayListH.get(iG2);
        if (!(aVar instanceof com.avito.android.calendar_select.presentation.view.konveyor.items.day.a)) {
            return true;
        }
        arrayListH.set(iG2, m.a(this, (com.avito.android.calendar_select.presentation.view.konveyor.items.day.a) aVar, localDate3, null, 12));
        return true;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.m
    @Y61.k
    public final ArrayList h() {
        return getF113501d();
    }
}
