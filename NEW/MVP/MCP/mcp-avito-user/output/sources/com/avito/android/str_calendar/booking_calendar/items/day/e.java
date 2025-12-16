package com.avito.android.str_calendar.booking_calendar.items.day;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import py0.InterfaceC47164a;

/* compiled from: StrBookingCalendarDayItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/items/day/e;", "LTV0/d;", "Lcom/avito/android/str_calendar/booking_calendar/items/day/g;", "Lcom/avito/android/str_calendar/booking_calendar/items/day/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC47164a, G0> f286325b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC47164a, G0> lVar) {
        this.f286325b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setText(aVar2.f286314c);
        gVar.c8(aVar2.f286317f);
        gVar.e70(aVar2.f286315d);
        if (aVar2.f286316e) {
            gVar.a(new d(this, aVar2));
        } else {
            gVar.V2();
        }
    }
}
