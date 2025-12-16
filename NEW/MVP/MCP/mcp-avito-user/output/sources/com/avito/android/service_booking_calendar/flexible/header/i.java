package com.avito.android.service_booking_calendar.flexible.header;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MonthScrollSnapHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/i;", "Landroidx/recyclerview/widget/P;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends P {

    /* renamed from: d, reason: collision with root package name */
    @l
    public I f275926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f275927e;

    /* renamed from: f, reason: collision with root package name */
    public final int f275928f;

    public i(@k com.avito.konveyor.a aVar) {
        this.f275927e = aVar.Y(com.avito.android.service_booking_calendar.flexible.header.recycler.month.c.class);
        this.f275928f = aVar.Y(com.avito.android.service_booking_calendar.flexible.header.recycler.month.a.class);
    }

    @Override // androidx.recyclerview.widget.P
    @k
    public final int[] c(@k RecyclerView.m mVar, @k View view) {
        I iC2 = this.f275926d;
        if (iC2 == null) {
            iC2 = I.c(mVar);
            this.f275926d = iC2;
        }
        return new int[]{0, iC2.g(view) - iC2.m()};
    }

    @Override // androidx.recyclerview.widget.P
    @l
    public final View f(@k RecyclerView.m mVar) {
        int iE02 = mVar.e0();
        I iC2 = this.f275926d;
        if (iC2 == null) {
            iC2 = I.c(mVar);
            this.f275926d = iC2;
        }
        int iM2 = iC2.m();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < iE02; i13++) {
            View viewD0 = mVar.d0(i13);
            if (viewD0 != null && (RecyclerView.m.p0(viewD0) == this.f275927e || RecyclerView.m.p0(viewD0) == this.f275928f)) {
                I iC3 = this.f275926d;
                if (iC3 == null) {
                    iC3 = I.c(mVar);
                    this.f275926d = iC3;
                }
                int iAbs = Math.abs(iC3.g(viewD0) - iM2);
                if (iAbs < i12) {
                    view = viewD0;
                    i12 = iAbs;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.P
    public final int g(@k RecyclerView.m mVar, int i12, int i13) {
        if (mVar.o0() == 0) {
            return -1;
        }
        I iC2 = this.f275926d;
        if (iC2 == null) {
            iC2 = I.c(mVar);
            this.f275926d = iC2;
        }
        int iE02 = mVar.e0();
        boolean z12 = false;
        View view = null;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i16 = 0; i16 < iE02; i16++) {
            View viewD0 = mVar.d0(i16);
            if (viewD0 != null && (RecyclerView.m.p0(viewD0) == this.f275927e || RecyclerView.m.p0(viewD0) == this.f275928f)) {
                int iG2 = iC2.g(viewD0) - iC2.m();
                if (i15 + 1 <= iG2 && iG2 < 1) {
                    view2 = viewD0;
                    i15 = iG2;
                }
                if (iG2 >= 0 && iG2 < i14) {
                    view = viewD0;
                    i14 = iG2;
                }
            }
        }
        if (!mVar.I() ? i13 > 0 : i12 > 0) {
            z12 = true;
        }
        if (z12 && view != null) {
            return RecyclerView.m.t0(view);
        }
        if (!z12 && view2 != null) {
            return RecyclerView.m.t0(view2);
        }
        if (z12) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        return RecyclerView.m.t0(view);
    }
}
