package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarView f290590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290591d;

    public /* synthetic */ d(StrOrdersCalendarView strOrdersCalendarView, int i12, int i13) {
        this.f290589b = i13;
        this.f290590c = strOrdersCalendarView;
        this.f290591d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f290591d;
        StrOrdersCalendarView strOrdersCalendarView = this.f290590c;
        switch (this.f290589b) {
            case 0:
                kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                RecyclerView recyclerView = strOrdersCalendarView.f290544D;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.A0(i12);
                strOrdersCalendarView.f290582z.b2(i12, 0);
                RecyclerView recyclerView2 = strOrdersCalendarView.f290543C;
                (recyclerView2 != null ? recyclerView2 : null).post(new com.avito.android.publish.screen.objects.view.actions.h(strOrdersCalendarView, 23));
                break;
            default:
                StrOrdersCalendarView$datesLayoutManager$1 strOrdersCalendarView$datesLayoutManager$1 = strOrdersCalendarView.f290582z;
                int iK1 = strOrdersCalendarView$datesLayoutManager$1.K1();
                strOrdersCalendarView$datesLayoutManager$1.b2(iK1, 0);
                DynamicScrollGridLayoutManager dynamicScrollGridLayoutManager = strOrdersCalendarView.f290541A;
                dynamicScrollGridLayoutManager.l1((dynamicScrollGridLayoutManager.D1() * i12) + iK1);
                break;
        }
    }
}
