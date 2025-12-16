package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import j.N;
import j.P;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* renamed from: com.google.android.material.datepicker.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37059g extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Calendar f356531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f356533d;

    public C37059g() {
        Calendar calendarG = E.g(null);
        this.f356531b = calendarG;
        this.f356532c = calendarG.getMaximum(7);
        this.f356533d = calendarG.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f356532c;
    }

    @Override // android.widget.Adapter
    @P
    public final Object getItem(int i12) {
        int i13 = this.f356532c;
        if (i12 >= i13) {
            return null;
        }
        int i14 = i12 + this.f356533d;
        if (i14 > i13) {
            i14 -= i13;
        }
        return Integer.valueOf(i14);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i12) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    @P
    public final View getView(int i12, @P View view, @N ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i13 = i12 + this.f356533d;
        int i14 = this.f356532c;
        if (i13 > i14) {
            i13 -= i14;
        }
        Calendar calendar = this.f356531b;
        calendar.set(7, i13);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C37059g(int i12) {
        Calendar calendarG = E.g(null);
        this.f356531b = calendarG;
        this.f356532c = calendarG.getMaximum(7);
        this.f356533d = i12;
    }
}
