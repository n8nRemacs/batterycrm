package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f356546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356547c;

    public o(MaterialCalendar materialCalendar, w wVar) {
        this.f356547c = materialCalendar;
        this.f356546b = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f356547c;
        int iK1 = ((LinearLayoutManager) materialCalendar.f356440o0.getLayoutManager()).K1() + 1;
        if (iK1 < materialCalendar.f356440o0.getAdapter().getItemCount()) {
            Calendar calendarC = E.c(this.f356546b.f356562c.f356407b.f356491b);
            calendarC.add(2, iK1);
            materialCalendar.c5(new Month(calendarC));
        }
    }
}
