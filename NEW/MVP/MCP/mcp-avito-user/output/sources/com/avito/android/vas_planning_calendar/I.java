package com.avito.android.vas_planning_calendar;

import kotlin.Metadata;

/* compiled from: PlanCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class I<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f322565b;

    public I(M m12) {
        this.f322565b = m12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        M m12 = this.f322565b;
        com.avito.android.vas_planning_calendar.data.e eVar = m12.f322591e0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.b();
        m12.f322576P.setValue(Boolean.FALSE);
    }
}
