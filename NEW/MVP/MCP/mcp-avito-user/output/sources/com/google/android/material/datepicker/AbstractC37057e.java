package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import j.N;
import j.P;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: DateFormatTextWatcher.java */
/* renamed from: com.google.android.material.datepicker.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37057e extends com.google.android.material.internal.F {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final TextInputLayout f356525b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDateFormat f356526c;

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f356527d;

    /* renamed from: e, reason: collision with root package name */
    public final String f356528e;

    /* renamed from: f, reason: collision with root package name */
    public final RunnableC37055c f356529f;

    /* renamed from: g, reason: collision with root package name */
    public RunnableC37056d f356530g;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.material.datepicker.c] */
    public AbstractC37057e(final String str, SimpleDateFormat simpleDateFormat, @N TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f356526c = simpleDateFormat;
        this.f356525b = textInputLayout;
        this.f356527d = calendarConstraints;
        this.f356528e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f356529f = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC37057e abstractC37057e = this.f356521b;
                TextInputLayout textInputLayout2 = abstractC37057e.f356525b;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), abstractC37057e.f356526c.format(new Date(E.f().getTimeInMillis())).replace(' ', (char) 160)));
                abstractC37057e.a();
            }
        };
    }

    public abstract void b(@P Long l12);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.material.datepicker.d, java.lang.Runnable] */
    @Override // com.google.android.material.internal.F, android.text.TextWatcher
    public final void onTextChanged(@N CharSequence charSequence, int i12, int i13, int i14) throws ParseException {
        CalendarConstraints calendarConstraints = this.f356527d;
        TextInputLayout textInputLayout = this.f356525b;
        RunnableC37055c runnableC37055c = this.f356529f;
        textInputLayout.removeCallbacks(runnableC37055c);
        textInputLayout.removeCallbacks(this.f356530g);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.f356526c.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.f356409d.U3(time)) {
                Calendar calendarC = E.c(calendarConstraints.f356407b.f356491b);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f356408c;
                    int i15 = month.f356495f;
                    Calendar calendarC2 = E.c(month.f356491b);
                    calendarC2.set(5, i15);
                    if (time <= calendarC2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r92 = new Runnable() { // from class: com.google.android.material.datepicker.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC37057e abstractC37057e = this.f356523b;
                    abstractC37057e.f356525b.setError(String.format(abstractC37057e.f356528e, C37058f.b(time).replace(' ', (char) 160)));
                    abstractC37057e.a();
                }
            };
            this.f356530g = r92;
            textInputLayout.postDelayed(r92, 1000L);
        } catch (ParseException unused) {
            textInputLayout.postDelayed(runnableC37055c, 1000L);
        }
    }

    public void a() {
    }
}
