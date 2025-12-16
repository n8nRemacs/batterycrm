package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.C22807v;
import com.google.android.material.R;
import j.P;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MonthAdapter.java */
/* loaded from: classes6.dex */
class u extends BaseAdapter {

    /* renamed from: h, reason: collision with root package name */
    public static final int f356552h = E.g(null).getMaximum(4);

    /* renamed from: i, reason: collision with root package name */
    public static final int f356553i = (E.g(null).getMaximum(7) + E.g(null).getMaximum(5)) - 1;

    /* renamed from: b, reason: collision with root package name */
    public final Month f356554b;

    /* renamed from: c, reason: collision with root package name */
    public final DateSelector<?> f356555c;

    /* renamed from: d, reason: collision with root package name */
    public Collection<Long> f356556d;

    /* renamed from: e, reason: collision with root package name */
    public C37054b f356557e;

    /* renamed from: f, reason: collision with root package name */
    public final CalendarConstraints f356558f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final DayViewDecorator f356559g;

    public u(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @P DayViewDecorator dayViewDecorator) {
        this.f356554b = month;
        this.f356555c = dateSelector;
        this.f356558f = calendarConstraints;
        this.f356559g = dayViewDecorator;
        this.f356556d = dateSelector.y1();
    }

    public final int a() {
        int firstDayOfWeek = this.f356558f.f356411f;
        Month month = this.f356554b;
        Calendar calendar = month.f356491b;
        int i12 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i13 = i12 - firstDayOfWeek;
        return i13 < 0 ? i13 + month.f356494e : i13;
    }

    @Override // android.widget.Adapter
    @P
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i12) {
        if (i12 < a() || i12 > d()) {
            return null;
        }
        int iA2 = (i12 - a()) + 1;
        Calendar calendarC = E.c(this.f356554b.f356491b);
        calendarC.set(5, iA2);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int d() {
        return (a() + this.f356554b.f356495f) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@P TextView textView, long j12, int i12) {
        boolean z12;
        boolean z13;
        C37053a c37053a;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z14 = false;
        boolean z15 = E.f().getTimeInMillis() == j12;
        DateSelector<?> dateSelector = this.f356555c;
        Iterator it = dateSelector.z5().iterator();
        while (true) {
            if (!it.hasNext()) {
                z12 = false;
                break;
            }
            F f12 = ((C22807v) it.next()).f44895a;
            if (f12 != 0 && ((Long) f12).longValue() == j12) {
                z12 = true;
                break;
            }
        }
        Iterator it2 = dateSelector.z5().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z13 = false;
                break;
            }
            S s5 = ((C22807v) it2.next()).f44896b;
            if (s5 != 0 && ((Long) s5).longValue() == j12) {
                z13 = true;
                break;
            }
        }
        Calendar calendarF = E.f();
        Calendar calendarG = E.g(null);
        calendarG.setTimeInMillis(j12);
        String str = calendarF.get(1) == calendarG.get(1) ? E.b("MMMEd", Locale.getDefault()).format(new Date(j12)) : E.b("yMMMEd", Locale.getDefault()).format(new Date(j12));
        if (z15) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z12) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z13) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f356558f.f356409d.U3(j12)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.y1().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (E.a(j12) == E.a(((Long) it3.next()).longValue())) {
                    z14 = true;
                    break;
                }
            }
            textView.setSelected(z14);
            c37053a = z14 ? this.f356557e.f356514b : E.f().getTimeInMillis() == j12 ? this.f356557e.f356515c : this.f356557e.f356513a;
        } else {
            textView.setEnabled(false);
            c37053a = this.f356557e.f356519g;
        }
        if (this.f356559g == null || i12 == -1) {
            c37053a.b(textView);
            return;
        }
        int i13 = this.f356554b.f356493d;
        c37053a.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j12) {
        Month monthC = Month.c(j12);
        Month month = this.f356554b;
        if (monthC.equals(month)) {
            Calendar calendarC = E.c(month.f356491b);
            calendarC.setTimeInMillis(j12);
            int i12 = calendarC.get(5);
            e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i12 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j12, i12);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f356553i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i12) {
        return i12 / this.f356554b.f356494e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // android.widget.Adapter
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, @j.P android.view.View r7, @j.N android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.b r1 = r5.f356557e
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.b r1 = new com.google.android.material.datepicker.b
            r1.<init>(r0)
            r5.f356557e = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L26
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5c
            com.google.android.material.datepicker.Month r8 = r5.f356554b
            int r2 = r8.f356495f
            if (r7 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5c:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L65:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6c
            goto L73
        L6c:
            long r1 = r6.longValue()
            r5.e(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
