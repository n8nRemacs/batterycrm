package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes6.dex */
class v implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f356560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f356561c;

    public v(w wVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f356561c = wVar;
        this.f356560b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i12, long j12) {
        MaterialCalendarGridView materialCalendarGridView = this.f356560b;
        u uVarA = materialCalendarGridView.a();
        if (i12 < uVarA.a() || i12 > uVarA.d()) {
            return;
        }
        MaterialCalendar.c cVar = this.f356561c.f356565f;
        long jLongValue = materialCalendarGridView.a().getItem(i12).longValue();
        MaterialCalendar materialCalendar = MaterialCalendar.this;
        if (materialCalendar.f356434i0.f356409d.U3(jLongValue)) {
            materialCalendar.f356433h0.M4(jLongValue);
            Iterator it = materialCalendar.f356498f0.iterator();
            while (it.hasNext()) {
                ((x) it.next()).b(materialCalendar.f356433h0.E4());
            }
            materialCalendar.f356440o0.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = materialCalendar.f356439n0;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
