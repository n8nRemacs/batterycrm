package com.fasterxml.jackson.databind.util;

import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: BeanUtil.java */
/* renamed from: com.fasterxml.jackson.databind.util.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36498d {
    public static String a(com.fasterxml.jackson.databind.h hVar) {
        String str;
        String str2;
        String name = hVar.f341930b.getName();
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!name.startsWith("org.joda.time.")) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return str + " type " + g.t(hVar) + " not supported by default: add Module \"" + str2 + "\" to enable handling";
    }

    public static Object b(com.fasterxml.jackson.databind.h hVar) {
        Class<?> cls = hVar.f341930b;
        Class<?> clsB = g.B(cls);
        if (clsB == null) {
            if (hVar.B() || hVar.f()) {
                return JsonInclude.Include.f340956d;
            }
            if (cls == String.class) {
                return "";
            }
            if (hVar.I(Date.class)) {
                return new Date(0L);
            }
            if (!hVar.I(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (clsB == Integer.TYPE) {
            return 0;
        }
        if (clsB == Long.TYPE) {
            return 0L;
        }
        if (clsB == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (clsB == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (clsB == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (clsB == Byte.TYPE) {
            return (byte) 0;
        }
        if (clsB == Short.TYPE) {
            return (short) 0;
        }
        if (clsB == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException(C0.f(clsB, new StringBuilder("Class "), " is not a primitive type"));
    }
}
