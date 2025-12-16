package com.avito.android.vas_planning_calendar;

import com.avito.android.util.P2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlanCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/vas_planning_calendar/model/CalendarBookingRestriction;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f322561b;

    public E(M m12) {
        this.f322561b = m12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        M m12 = this.f322561b;
        if (z12) {
            m12.f322591e0 = m12.f322572L.a((List) ((P2.b) p22).f318720a);
            m12.f322587a0.setValue(null);
            m12.f322586Z.setValue(null);
            com.avito.android.vas_planning_calendar.data.e eVar = m12.f322591e0;
            if (eVar == null) {
                eVar = null;
            }
            com.jakewharton.rxrelay3.d dVarD = eVar.d();
            B b12 = new B(m12);
            D d12 = new D(m12);
            dVarD.getClass();
            m12.f322578R.b(dVarD.v0(b12, d12, io.reactivex.rxjava3.internal.functions.a.f401993c));
            com.avito.android.vas_planning_calendar.data.e eVar2 = m12.f322591e0;
            (eVar2 != null ? eVar2 : null).getClass();
            return;
        }
        if (p22 instanceof P2.c) {
            m12.f322584X.setValue(null);
            m12.f322585Y.setValue(null);
            m12.f322587a0.setValue(null);
            m12.f322586Z.setValue(G0.f406611a);
            return;
        }
        if (p22 instanceof P2.a) {
            C c12 = new C(m12, 1);
            m12.f322584X.setValue(null);
            m12.f322585Y.setValue(null);
            m12.f322587a0.setValue(c12);
            m12.f322586Z.setValue(null);
        }
    }
}
