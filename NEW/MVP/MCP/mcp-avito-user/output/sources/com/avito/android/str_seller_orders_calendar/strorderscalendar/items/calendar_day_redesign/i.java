package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import Uz0.b;
import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CalendarDayRedesignPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f290878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CalendarDayRedesignItem f290879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, CalendarDayRedesignItem calendarDayRedesignItem) {
        super(0);
        this.f290878l = gVar;
        this.f290879m = calendarDayRedesignItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l<Uz0.b, G0> lVar = this.f290878l.f290871b;
        CalendarDayRedesignItem calendarDayRedesignItem = this.f290879m;
        lVar.invoke(new b.d(calendarDayRedesignItem.f290819c, calendarDayRedesignItem.f290818b));
        return G0.f406611a;
    }
}
