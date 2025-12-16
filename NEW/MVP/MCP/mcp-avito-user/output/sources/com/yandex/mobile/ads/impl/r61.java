package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import j.InterfaceC42156l;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class r61 {

    /* renamed from: a, reason: collision with root package name */
    public final String f389396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f389397b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    @InterfaceC42156l
    public final Integer f389398c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    @InterfaceC42156l
    public final Integer f389399d;

    /* renamed from: e, reason: collision with root package name */
    public final float f389400e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f389401f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f389402g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f389403h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f389404i;

    /* renamed from: j, reason: collision with root package name */
    public final int f389405j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f389406a;

        /* renamed from: b, reason: collision with root package name */
        public final int f389407b;

        /* renamed from: c, reason: collision with root package name */
        public final int f389408c;

        /* renamed from: d, reason: collision with root package name */
        public final int f389409d;

        /* renamed from: e, reason: collision with root package name */
        public final int f389410e;

        /* renamed from: f, reason: collision with root package name */
        public final int f389411f;

        /* renamed from: g, reason: collision with root package name */
        public final int f389412g;

        /* renamed from: h, reason: collision with root package name */
        public final int f389413h;

        /* renamed from: i, reason: collision with root package name */
        public final int f389414i;

        /* renamed from: j, reason: collision with root package name */
        public final int f389415j;

        /* renamed from: k, reason: collision with root package name */
        public final int f389416k;

        private a(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24) {
            this.f389406a = i12;
            this.f389407b = i13;
            this.f389408c = i14;
            this.f389409d = i15;
            this.f389410e = i16;
            this.f389411f = i17;
            this.f389412g = i18;
            this.f389413h = i19;
            this.f389414i = i22;
            this.f389415j = i23;
            this.f389416k = i24;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
        @j.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.yandex.mobile.ads.impl.r61.a a(java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.r61.a.a(java.lang.String):com.yandex.mobile.ads.impl.r61$a");
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f389417c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f389418d;

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f389419e;

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f389420f;

        /* renamed from: a, reason: collision with root package name */
        public final int f389421a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final PointF f389422b;

        static {
            int i12 = pc1.f388768a;
            Locale locale = Locale.US;
            f389418d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f389419e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f389420f = Pattern.compile("\\\\an(\\d+)");
        }

        private b(int i12, @j.P PointF pointF) {
            this.f389421a = i12;
            this.f389422b = pointF;
        }

        public static b a(String str) {
            int iA2;
            Matcher matcher = f389417c.matcher(str);
            PointF pointF = null;
            int i12 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                try {
                    PointF pointFB = b(strGroup);
                    if (pointFB != null) {
                        pointF = pointFB;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f389420f.matcher(strGroup);
                    if (matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        iA2 = r61.a(strGroup2);
                    } else {
                        iA2 = -1;
                    }
                    if (iA2 != -1) {
                        i12 = iA2;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i12, pointF);
        }

        @j.P
        private static PointF b(String str) throws NumberFormatException {
            String strGroup;
            String strGroup2;
            Matcher matcher = f389418d.matcher(str);
            Matcher matcher2 = f389419e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    ka0.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            strGroup.getClass();
            float f12 = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f12, Float.parseFloat(strGroup2.trim()));
        }

        public static String c(String str) {
            return f389417c.matcher(str).replaceAll("");
        }
    }

    private r61(String str, int i12, @j.P @InterfaceC42156l Integer num, @j.P @InterfaceC42156l Integer num2, float f12, boolean z12, boolean z13, boolean z14, boolean z15, int i13) {
        this.f389396a = str;
        this.f389397b = i12;
        this.f389398c = num;
        this.f389399d = num2;
        this.f389400e = f12;
        this.f389401f = z12;
        this.f389402g = z13;
        this.f389403h = z14;
        this.f389404i = z15;
        this.f389405j = i13;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0062. Please report as an issue. */
    @j.P
    public static r61 a(String str, a aVar) throws NumberFormatException {
        int i12;
        float f12;
        int i13;
        db.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i14 = aVar.f389416k;
        if (length != i14) {
            int length2 = strArrSplit.length;
            int i15 = pc1.f388768a;
            Locale locale = Locale.US;
            StringBuilder sbY = androidx.appcompat.app.r.y(i14, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
            sbY.append(str);
            sbY.append("'");
            ka0.d("SsaStyle", sbY.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f389406a].trim();
            int i16 = aVar.f389407b;
            if (i16 != -1) {
                String strTrim2 = strArrSplit[i16].trim();
                try {
                    i12 = Integer.parseInt(strTrim2.trim());
                } catch (NumberFormatException unused) {
                }
                switch (i12) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        ka0.d("SsaStyle", "Ignoring unknown alignment: " + strTrim2);
                        i12 = -1;
                        break;
                }
            } else {
                i12 = -1;
            }
            int i17 = aVar.f389408c;
            Integer numC = i17 != -1 ? c(strArrSplit[i17].trim()) : null;
            int i18 = aVar.f389409d;
            Integer numC2 = i18 != -1 ? c(strArrSplit[i18].trim()) : null;
            int i19 = aVar.f389410e;
            if (i19 != -1) {
                String strTrim3 = strArrSplit[i19].trim();
                try {
                    f12 = Float.parseFloat(strTrim3);
                } catch (NumberFormatException e12) {
                    ka0.b("SsaStyle", "Failed to parse font size: '" + strTrim3 + "'", e12);
                }
            } else {
                f12 = -3.4028235E38f;
            }
            float f13 = f12;
            int i22 = aVar.f389411f;
            boolean z12 = i22 != -1 && b(strArrSplit[i22].trim());
            int i23 = aVar.f389412g;
            boolean z13 = i23 != -1 && b(strArrSplit[i23].trim());
            int i24 = aVar.f389413h;
            boolean z14 = i24 != -1 && b(strArrSplit[i24].trim());
            int i25 = aVar.f389414i;
            boolean z15 = i25 != -1 && b(strArrSplit[i25].trim());
            int i26 = aVar.f389415j;
            if (i26 != -1) {
                String strTrim4 = strArrSplit[i26].trim();
                try {
                    int i27 = Integer.parseInt(strTrim4.trim());
                    if (i27 == 1 || i27 == 3) {
                        i13 = i27;
                    }
                } catch (NumberFormatException unused2) {
                }
                ka0.d("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim4);
                i13 = -1;
            } else {
                i13 = -1;
            }
            return new r61(strTrim, i12, numC, numC2, f13, z12, z13, z14, z15, i13);
        } catch (RuntimeException e13) {
            ka0.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e13);
            return null;
        }
    }

    private static boolean b(String str) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(str);
            return i12 == 1 || i12 == -1;
        } catch (NumberFormatException e12) {
            ka0.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e12);
            return false;
        }
    }

    @j.P
    @InterfaceC42156l
    public static Integer c(String str) {
        try {
            long j12 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            db.a(j12 <= 4294967295L);
            return Integer.valueOf(Color.argb(c80.a(((j12 >> 24) & 255) ^ 255), c80.a(j12 & 255), c80.a((j12 >> 8) & 255), c80.a((j12 >> 16) & 255)));
        } catch (IllegalArgumentException e12) {
            ka0.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e12);
            return null;
        }
    }

    public static int a(String str) throws NumberFormatException {
        int i12;
        try {
            i12 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i12;
            default:
                yk1.a("Ignoring unknown alignment: ", str, "SsaStyle");
                return -1;
        }
    }
}
