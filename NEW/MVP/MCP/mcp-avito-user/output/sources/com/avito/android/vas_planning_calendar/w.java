package com.avito.android.vas_planning_calendar;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: PlanCalendarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/w;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f322733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f322734f;

    public w(com.avito.konveyor.adapter.a aVar, x xVar) {
        this.f322733e = aVar;
        this.f322734f = xVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f322733e.b(i12);
        x xVar = this.f322734f;
        com.avito.konveyor.a aVar = xVar.f322741g;
        if (aVar == null) {
            aVar = null;
        }
        if (iB2 == aVar.Y(com.avito.android.vas_planning_calendar.view.konveyor.items.month.b.class)) {
            return 7;
        }
        com.avito.konveyor.a aVar2 = xVar.f322741g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (iB2 != aVar2.Y(com.avito.android.vas_planning_calendar.view.konveyor.items.day.b.class)) {
            com.avito.konveyor.a aVar3 = xVar.f322741g;
            if (iB2 != (aVar3 != null ? aVar3 : null).Y(com.avito.android.vas_planning_calendar.view.konveyor.items.empty.b.class)) {
                throw new UnsupportedOperationException("Unknown view type");
            }
        }
        return 1;
    }
}
