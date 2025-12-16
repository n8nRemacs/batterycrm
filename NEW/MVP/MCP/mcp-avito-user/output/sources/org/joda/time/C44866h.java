package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DateTimeUtils.java */
/* renamed from: org.joda.time.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44866h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f420908a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f420909b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<Map<String, AbstractC44868j>> f420910c = new AtomicReference<>();

    /* compiled from: DateTimeUtils.java */
    /* renamed from: org.joda.time.h$a */
    public static class a implements b {
    }

    /* compiled from: DateTimeUtils.java */
    /* renamed from: org.joda.time.h$b */
    public interface b {
    }

    /* compiled from: DateTimeUtils.java */
    /* renamed from: org.joda.time.h$c */
    public static class c implements b {
    }

    /* compiled from: DateTimeUtils.java */
    /* renamed from: org.joda.time.h$d */
    public static class d implements b {
    }

    public static final long a() {
        ((d) f420909b).getClass();
        return System.currentTimeMillis();
    }

    public static final DateFormatSymbols b(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static void c(String str, String str2, LinkedHashMap linkedHashMap) {
        try {
            linkedHashMap.put(str, AbstractC44868j.c(str2));
        } catch (RuntimeException unused) {
        }
    }
}
