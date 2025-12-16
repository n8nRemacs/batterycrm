package com.google.android.material.datepicker;

import androidx.core.util.C22807v;
import j.P;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* renamed from: com.google.android.material.datepicker.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37058f {
    public static C22807v<String, String> a(@P Long l12, @P Long l13) {
        C22807v<String, String> c22807v;
        if (l12 == null && l13 == null) {
            return new C22807v<>(null, null);
        }
        if (l12 == null) {
            c22807v = new C22807v<>(null, b(l13.longValue()));
        } else {
            if (l13 != null) {
                Calendar calendarF = E.f();
                Calendar calendarG = E.g(null);
                calendarG.setTimeInMillis(l12.longValue());
                Calendar calendarG2 = E.g(null);
                calendarG2.setTimeInMillis(l13.longValue());
                return calendarG.get(1) == calendarG2.get(1) ? calendarG.get(1) == calendarF.get(1) ? new C22807v<>(c(l12.longValue(), Locale.getDefault()), c(l13.longValue(), Locale.getDefault())) : new C22807v<>(c(l12.longValue(), Locale.getDefault()), d(l13.longValue(), Locale.getDefault())) : new C22807v<>(d(l12.longValue(), Locale.getDefault()), d(l13.longValue(), Locale.getDefault()));
            }
            c22807v = new C22807v<>(b(l12.longValue()), null);
        }
        return c22807v;
    }

    public static String b(long j12) {
        Calendar calendarF = E.f();
        Calendar calendarG = E.g(null);
        calendarG.setTimeInMillis(j12);
        return calendarF.get(1) == calendarG.get(1) ? c(j12, Locale.getDefault()) : d(j12, Locale.getDefault());
    }

    public static String c(long j12, Locale locale) {
        return E.b("MMMd", locale).format(new Date(j12));
    }

    public static String d(long j12, Locale locale) {
        return E.b("yMMMd", locale).format(new Date(j12));
    }
}
