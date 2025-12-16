package com.yandex.metrica.billing_interface;

import j.N;
import j.P;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f377610c = Pattern.compile("P(\\d+)(\\S+)");

    /* renamed from: a, reason: collision with root package name */
    public final int f377611a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final a f377612b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f377613b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f377614c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f377615d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f377616e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f377617f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f377618g;

        static {
            a aVar = new a("TIME_UNIT_UNKNOWN", 0);
            f377613b = aVar;
            a aVar2 = new a("DAY", 1);
            f377614c = aVar2;
            a aVar3 = new a("WEEK", 2);
            f377615d = aVar3;
            a aVar4 = new a("MONTH", 3);
            f377616e = aVar4;
            a aVar5 = new a("YEAR", 4);
            f377617f = aVar5;
            f377618g = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f377618g.clone();
        }
    }

    public c(int i12, @N a aVar) {
        this.f377611a = i12;
        this.f377612b = aVar;
    }

    @P
    public static c a(@N String str) {
        Matcher matcher = f377610c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i12 = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            return new c(i12, cCharAt != 'D' ? cCharAt != 'M' ? cCharAt != 'W' ? cCharAt != 'Y' ? a.f377613b : a.f377617f : a.f377615d : a.f377616e : a.f377614c);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f377611a == cVar.f377611a && this.f377612b == cVar.f377612b;
    }

    public final int hashCode() {
        return this.f377612b.hashCode() + (this.f377611a * 31);
    }

    @N
    public final String toString() {
        return "Period{number=" + this.f377611a + "timeUnit=" + this.f377612b + "}";
    }
}
