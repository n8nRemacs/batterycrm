package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import com.google.common.primitives.l;
import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaStyle.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f346963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346964b;

    /* renamed from: c, reason: collision with root package name */
    @P
    @InterfaceC42156l
    public final Integer f346965c;

    /* renamed from: d, reason: collision with root package name */
    @P
    @InterfaceC42156l
    public final Integer f346966d;

    /* renamed from: e, reason: collision with root package name */
    public final float f346967e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f346968f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f346969g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f346970h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f346971i;

    /* renamed from: j, reason: collision with root package name */
    public final int f346972j;

    /* compiled from: SsaStyle.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f346973a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346974b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346975c;

        /* renamed from: d, reason: collision with root package name */
        public final int f346976d;

        /* renamed from: e, reason: collision with root package name */
        public final int f346977e;

        /* renamed from: f, reason: collision with root package name */
        public final int f346978f;

        /* renamed from: g, reason: collision with root package name */
        public final int f346979g;

        /* renamed from: h, reason: collision with root package name */
        public final int f346980h;

        /* renamed from: i, reason: collision with root package name */
        public final int f346981i;

        /* renamed from: j, reason: collision with root package name */
        public final int f346982j;

        /* renamed from: k, reason: collision with root package name */
        public final int f346983k;

        public a(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24) {
            this.f346973a = i12;
            this.f346974b = i13;
            this.f346975c = i14;
            this.f346976d = i15;
            this.f346977e = i16;
            this.f346978f = i17;
            this.f346979g = i18;
            this.f346980h = i19;
            this.f346981i = i22;
            this.f346982j = i23;
            this.f346983k = i24;
        }
    }

    /* compiled from: SsaStyle.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f346984a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b, reason: collision with root package name */
        public static final Pattern f346985b;

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f346986c;

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f346987d;

        static {
            int i12 = U.f348106a;
            Locale locale = Locale.US;
            f346985b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f346986c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f346987d = Pattern.compile("\\\\an(\\d+)");
        }

        @P
        public static PointF a(String str) throws NumberFormatException {
            String strGroup;
            String strGroup2;
            Matcher matcher = f346985b.matcher(str);
            Matcher matcher2 = f346986c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                strGroup2 = matcher.group(1);
                strGroup = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                String strGroup3 = matcher2.group(1);
                strGroup = matcher2.group(2);
                strGroup2 = strGroup3;
            }
            strGroup2.getClass();
            float f12 = Float.parseFloat(strGroup2.trim());
            strGroup.getClass();
            return new PointF(f12, Float.parseFloat(strGroup.trim()));
        }
    }

    /* compiled from: SsaStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.text.ssa.c$c, reason: collision with other inner class name */
    public @interface InterfaceC10604c {
    }

    /* compiled from: SsaStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public c(String str, int i12, @P @InterfaceC42156l Integer num, @P @InterfaceC42156l Integer num2, float f12, boolean z12, boolean z13, boolean z14, boolean z15, int i13) {
        this.f346963a = str;
        this.f346964b = i12;
        this.f346965c = num;
        this.f346966d = num2;
        this.f346967e = f12;
        this.f346968f = z12;
        this.f346969g = z13;
        this.f346970h = z14;
        this.f346971i = z15;
        this.f346972j = i13;
    }

    public static boolean a(String str) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(str);
            return i12 == 1 || i12 == -1;
        } catch (NumberFormatException e12) {
            C36605v.a("Failed to parse boolean value: '" + str + "'", e12);
            return false;
        }
    }

    @P
    @InterfaceC42156l
    public static Integer b(String str) {
        try {
            long j12 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C36585a.b(j12 <= 4294967295L);
            return Integer.valueOf(Color.argb(l.b(((j12 >> 24) & 255) ^ 255), l.b(j12 & 255), l.b((j12 >> 8) & 255), l.b((j12 >> 16) & 255)));
        } catch (IllegalArgumentException e12) {
            C36605v.a("Failed to parse color expression: '" + str + "'", e12);
            return null;
        }
    }
}
