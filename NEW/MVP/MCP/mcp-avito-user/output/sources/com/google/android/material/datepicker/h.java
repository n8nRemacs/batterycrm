package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f356534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356535c;

    public h(MaterialCalendar materialCalendar, w wVar) {
        this.f356535c = materialCalendar;
        this.f356534b = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f356535c;
        int iM1 = ((LinearLayoutManager) materialCalendar.f356440o0.getLayoutManager()).M1() - 1;
        if (iM1 >= 0) {
            Calendar calendarC = E.c(this.f356534b.f356562c.f356407b.f356491b);
            calendarC.add(2, iM1);
            materialCalendar.c5(new Month(calendarC));
        }
    }
}
