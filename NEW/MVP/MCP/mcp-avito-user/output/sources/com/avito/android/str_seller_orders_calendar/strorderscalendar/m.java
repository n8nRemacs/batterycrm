package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import Uz0.b;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.ranges.s;

/* compiled from: StrOrdersCalendarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/m;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f290972b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Integer f290973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarView f290974d;

    public m(StrOrdersCalendarView strOrdersCalendarView) {
        this.f290974d = strOrdersCalendarView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        StrOrdersCalendarView strOrdersCalendarView = this.f290974d;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            RecyclerView recyclerView2 = strOrdersCalendarView.f290543C;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            l lVar = strOrdersCalendarView.f290548H;
            if (lVar == null) {
                lVar = null;
            }
            recyclerView2.v0(lVar);
            RecyclerView recyclerView3 = strOrdersCalendarView.f290545E;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            n nVar = strOrdersCalendarView.f290547G;
            if (nVar == null) {
                nVar = null;
            }
            recyclerView3.v0(nVar);
            RecyclerView recyclerView4 = strOrdersCalendarView.f290543C;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            StrOrdersCalendarView.c cVar = strOrdersCalendarView.f290550J;
            recyclerView4.u0(cVar);
            RecyclerView recyclerView5 = strOrdersCalendarView.f290543C;
            if (recyclerView5 == null) {
                recyclerView5 = null;
            }
            recyclerView5.n(cVar);
            RecyclerView recyclerView6 = strOrdersCalendarView.f290545E;
            if (recyclerView6 == null) {
                recyclerView6 = null;
            }
            recyclerView6.u0(cVar);
            RecyclerView recyclerView7 = strOrdersCalendarView.f290545E;
            (recyclerView7 != null ? recyclerView7 : null).n(cVar);
            return;
        }
        this.f290972b = null;
        this.f290973c = null;
        RecyclerView recyclerView8 = strOrdersCalendarView.f290545E;
        if (recyclerView8 == null) {
            recyclerView8 = null;
        }
        StrOrdersCalendarView.c cVar2 = strOrdersCalendarView.f290550J;
        recyclerView8.u0(cVar2);
        RecyclerView recyclerView9 = strOrdersCalendarView.f290543C;
        if (recyclerView9 == null) {
            recyclerView9 = null;
        }
        recyclerView9.u0(cVar2);
        RecyclerView recyclerView10 = strOrdersCalendarView.f290545E;
        if (recyclerView10 == null) {
            recyclerView10 = null;
        }
        n nVar2 = strOrdersCalendarView.f290547G;
        if (nVar2 == null) {
            nVar2 = null;
        }
        recyclerView10.v0(nVar2);
        RecyclerView recyclerView11 = strOrdersCalendarView.f290545E;
        if (recyclerView11 == null) {
            recyclerView11 = null;
        }
        n nVar3 = strOrdersCalendarView.f290547G;
        if (nVar3 == null) {
            nVar3 = null;
        }
        recyclerView11.o(nVar3);
        RecyclerView recyclerView12 = strOrdersCalendarView.f290543C;
        if (recyclerView12 == null) {
            recyclerView12 = null;
        }
        l lVar2 = strOrdersCalendarView.f290548H;
        if (lVar2 == null) {
            lVar2 = null;
        }
        recyclerView12.v0(lVar2);
        RecyclerView recyclerView13 = strOrdersCalendarView.f290543C;
        if (recyclerView13 == null) {
            recyclerView13 = null;
        }
        l lVar3 = strOrdersCalendarView.f290548H;
        if (lVar3 == null) {
            lVar3 = null;
        }
        recyclerView13.o(lVar3);
        int i13 = strOrdersCalendarView.f290555O;
        Y41.l<Uz0.b, G0> lVar4 = strOrdersCalendarView.f290557a;
        int i14 = strOrdersCalendarView.f290551K;
        int i15 = strOrdersCalendarView.f290552L;
        if (i13 != i14 && i13 != i15) {
            if (i13 >= strOrdersCalendarView.f290553M) {
                strOrdersCalendarView.b(false);
            } else {
                strOrdersCalendarView.b(true);
                ((StrOrdersCalendarFragment.d) lVar4).invoke(b.g.f16824a);
            }
        }
        RecyclerView recyclerView14 = strOrdersCalendarView.f290543C;
        if ((recyclerView14 != null ? recyclerView14 : null).getWidth() == i15) {
            ((StrOrdersCalendarFragment.d) lVar4).invoke(b.g.f16824a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        Integer num = this.f290972b;
        int iAbs = Math.abs((num != null ? num.intValue() : i12) - i12);
        StrOrdersCalendarView strOrdersCalendarView = this.f290974d;
        if (iAbs <= 500) {
            RecyclerView recyclerView2 = strOrdersCalendarView.f290545E;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.scrollBy(i12, 0);
        }
        Integer num2 = this.f290973c;
        if (Math.abs((num2 != null ? num2.intValue() : i13) - i13) <= 500) {
            RecyclerView recyclerView3 = strOrdersCalendarView.f290543C;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.scrollBy(0, i13);
        }
        this.f290972b = Integer.valueOf(i12);
        this.f290973c = Integer.valueOf(i13);
        if (i12 != 0) {
            StrOrdersCalendarView.a(strOrdersCalendarView);
        }
        if (i12 > 0 || strOrdersCalendarView.f290555O > strOrdersCalendarView.f290552L) {
            strOrdersCalendarView.f290555O = s.g(strOrdersCalendarView.f290555O - i12, strOrdersCalendarView.f290552L, strOrdersCalendarView.f290551K);
            RecyclerView recyclerView4 = strOrdersCalendarView.f290543C;
            RecyclerView recyclerView5 = recyclerView4 != null ? recyclerView4 : null;
            ViewGroup.LayoutParams layoutParams = (recyclerView4 != null ? recyclerView4 : null).getLayoutParams();
            layoutParams.width = strOrdersCalendarView.f290555O;
            recyclerView5.setLayoutParams(layoutParams);
            FrameLayout frameLayout = strOrdersCalendarView.f290567k;
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.width = strOrdersCalendarView.f290555O;
            frameLayout.setLayoutParams(layoutParams2);
            strOrdersCalendarView.f290558b.K5(Float.valueOf((strOrdersCalendarView.f290555O - strOrdersCalendarView.f290552L) / strOrdersCalendarView.f290554N));
        }
    }
}
