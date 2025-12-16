package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import j.N;
import j.P;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes6.dex */
class w extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @N
    public final CalendarConstraints f356562c;

    /* renamed from: d, reason: collision with root package name */
    public final DateSelector<?> f356563d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final DayViewDecorator f356564e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCalendar.c f356565f;

    /* renamed from: g, reason: collision with root package name */
    public final int f356566g;

    /* compiled from: MonthsPagerAdapter.java */
    public static class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f356567b;

        /* renamed from: c, reason: collision with root package name */
        public final MaterialCalendarGridView f356568c;

        public a(@N LinearLayout linearLayout, boolean z12) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f356567b = textView;
            C22823h0.D(textView, true);
            this.f356568c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z12) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public w(@N ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, @N CalendarConstraints calendarConstraints, @P DayViewDecorator dayViewDecorator, MaterialCalendar.c cVar) {
        Month month = calendarConstraints.f356407b;
        Month month2 = calendarConstraints.f356410e;
        if (month.compareTo(month2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.compareTo(calendarConstraints.f356408c) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f356566g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * u.f356552h) + (MaterialDatePicker.d5(android.R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f356562c = calendarConstraints;
        this.f356563d = dateSelector;
        this.f356564e = dayViewDecorator;
        this.f356565f = cVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f356562c.f356413h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        Calendar calendarC = E.c(this.f356562c.f356407b.f356491b);
        calendarC.add(2, i12);
        return new Month(calendarC).f356491b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@N RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        CalendarConstraints calendarConstraints = this.f356562c;
        Calendar calendarC = E.c(calendarConstraints.f356407b.f356491b);
        calendarC.add(2, i12);
        Month month = new Month(calendarC);
        aVar.f356567b.setText(month.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f356568c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f356554b)) {
            u uVar = new u(month, this.f356563d, calendarConstraints, this.f356564e);
            materialCalendarGridView.setNumColumns(month.f356494e);
            materialCalendarGridView.setAdapter((ListAdapter) uVar);
        } else {
            materialCalendarGridView.invalidate();
            u uVarA = materialCalendarGridView.a();
            Iterator<Long> it = uVarA.f356556d.iterator();
            while (it.hasNext()) {
                uVarA.f(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = uVarA.f356555c;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.y1().iterator();
                while (it2.hasNext()) {
                    uVarA.f(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                uVarA.f356556d = dateSelector.y1();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new v(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    public final RecyclerView.C onCreateViewHolder(@N ViewGroup viewGroup, int i12) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.d5(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f356566g));
        return new a(linearLayout, true);
    }
}
