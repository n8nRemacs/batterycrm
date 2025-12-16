package com.avito.android.vas_planning_calendar;

import java.util.Date;
import kotlin.Metadata;

/* compiled from: PlanCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "date", "Lkotlin/G0;", "accept", "(Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f322567b;

    public K(M m12) {
        this.f322567b = m12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Date date = (Date) obj;
        M m12 = this.f322567b;
        com.avito.android.vas_planning_calendar.data.e eVar = m12.f322591e0;
        if (eVar == null) {
            eVar = null;
        }
        if (eVar.a(date)) {
            m12.f322576P.setValue(Boolean.TRUE);
        }
    }
}
