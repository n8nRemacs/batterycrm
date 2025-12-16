package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class nn {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final a f388335a = new a();

    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(qc1.f389146d);
            return simpleDateFormat;
        }
    }

    @Y61.k
    public static final String a(@Y61.k Date date) {
        return f388335a.get().format(date);
    }
}
