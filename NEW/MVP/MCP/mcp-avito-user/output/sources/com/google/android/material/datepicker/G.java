package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import j.N;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes6.dex */
class G extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCalendar<?> f356430c;

    /* compiled from: YearGridAdapter.java */
    public static class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f356431b;

        public a(TextView textView) {
            super(textView);
            this.f356431b = textView;
        }
    }

    public G(MaterialCalendar<?> materialCalendar) {
        this.f356430c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f356430c.f356434i0.f356412g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@N RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        MaterialCalendar<?> materialCalendar = this.f356430c;
        int i13 = materialCalendar.f356434i0.f356407b.f356493d + i12;
        aVar.f356431b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i13)));
        TextView textView = aVar.f356431b;
        Context context = textView.getContext();
        textView.setContentDescription(E.f().get(1) == i13 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i13)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i13)));
        C37054b c37054b = materialCalendar.f356438m0;
        Calendar calendarF = E.f();
        C37053a c37053a = calendarF.get(1) == i13 ? c37054b.f356518f : c37054b.f356516d;
        Iterator it = materialCalendar.f356433h0.y1().iterator();
        while (it.hasNext()) {
            calendarF.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarF.get(1) == i13) {
                c37053a = c37054b.f356517e;
            }
        }
        c37053a.b(textView);
        textView.setOnClickListener(new F(this, i13));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    public final RecyclerView.C onCreateViewHolder(@N ViewGroup viewGroup, int i12) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
