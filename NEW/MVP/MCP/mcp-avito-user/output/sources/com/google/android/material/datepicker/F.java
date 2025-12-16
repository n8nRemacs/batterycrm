package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes6.dex */
class F implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f356428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f356429c;

    public F(G g12, int i12) {
        this.f356429c = g12;
        this.f356428b = i12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        G g12 = this.f356429c;
        Month monthB = Month.b(this.f356428b, g12.f356430c.f356436k0.f356492c);
        CalendarConstraints calendarConstraints = g12.f356430c.f356434i0;
        Month month = calendarConstraints.f356407b;
        if (monthB.compareTo(month) < 0) {
            monthB = month;
        } else {
            Month month2 = calendarConstraints.f356408c;
            if (monthB.compareTo(month2) > 0) {
                monthB = month2;
            }
        }
        g12.f356430c.c5(monthB);
        g12.f356430c.d5(MaterialCalendar.d.f356448b);
    }
}
