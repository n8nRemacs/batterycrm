package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView;
import kotlin.Metadata;

/* compiled from: StrOrdersCalendarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/n;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f291188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarView f291189c;

    public n(StrOrdersCalendarView strOrdersCalendarView) {
        this.f291189c = strOrdersCalendarView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        StrOrdersCalendarView strOrdersCalendarView = this.f291189c;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            RecyclerView recyclerView2 = strOrdersCalendarView.f290544D;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            m mVar = strOrdersCalendarView.f290546F;
            if (mVar == null) {
                mVar = null;
            }
            recyclerView2.v0(mVar);
            RecyclerView recyclerView3 = strOrdersCalendarView.f290544D;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            StrOrdersCalendarView.c cVar = strOrdersCalendarView.f290550J;
            recyclerView3.u0(cVar);
            RecyclerView recyclerView4 = strOrdersCalendarView.f290544D;
            (recyclerView4 != null ? recyclerView4 : null).n(cVar);
            return;
        }
        this.f291188b = null;
        RecyclerView recyclerView5 = strOrdersCalendarView.f290544D;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.u0(strOrdersCalendarView.f290550J);
        RecyclerView recyclerView6 = strOrdersCalendarView.f290544D;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        m mVar2 = strOrdersCalendarView.f290546F;
        if (mVar2 == null) {
            mVar2 = null;
        }
        recyclerView6.v0(mVar2);
        RecyclerView recyclerView7 = strOrdersCalendarView.f290544D;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        m mVar3 = strOrdersCalendarView.f290546F;
        recyclerView7.o(mVar3 != null ? mVar3 : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        Integer num = this.f291188b;
        int iAbs = Math.abs((num != null ? num.intValue() : i12) - i12);
        StrOrdersCalendarView strOrdersCalendarView = this.f291189c;
        if (iAbs <= 500) {
            RecyclerView recyclerView2 = strOrdersCalendarView.f290544D;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.scrollBy(i12, 0);
        }
        this.f291188b = Integer.valueOf(i12);
        StrOrdersCalendarView.a(strOrdersCalendarView);
    }
}
