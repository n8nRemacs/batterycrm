package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j.N;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class m extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f356542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f356543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356544d;

    public m(MaterialCalendar materialCalendar, w wVar, MaterialButton materialButton) {
        this.f356544d = materialCalendar;
        this.f356542b = wVar;
        this.f356543c = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @N RecyclerView recyclerView) {
        if (i12 == 0) {
            recyclerView.announceForAccessibility(this.f356543c.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@N RecyclerView recyclerView, int i12, int i13) {
        MaterialCalendar materialCalendar = this.f356544d;
        int iK1 = i12 < 0 ? ((LinearLayoutManager) materialCalendar.f356440o0.getLayoutManager()).K1() : ((LinearLayoutManager) materialCalendar.f356440o0.getLayoutManager()).M1();
        CalendarConstraints calendarConstraints = this.f356542b.f356562c;
        Calendar calendarC = E.c(calendarConstraints.f356407b.f356491b);
        calendarC.add(2, iK1);
        materialCalendar.f356436k0 = new Month(calendarC);
        Calendar calendarC2 = E.c(calendarConstraints.f356407b.f356491b);
        calendarC2.add(2, iK1);
        this.f356543c.setText(new Month(calendarC2).d());
    }
}
