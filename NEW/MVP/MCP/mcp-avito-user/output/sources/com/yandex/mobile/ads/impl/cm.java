package com.yandex.mobile.ads.impl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.C43066x;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes8.dex */
public final class cm {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f384330j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f384331k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f384332l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f384333m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f384334n = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f384335a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f384336b;

    /* renamed from: c, reason: collision with root package name */
    private final long f384337c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final String f384338d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final String f384339e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f384340f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f384341g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f384342h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f384343i;

    public /* synthetic */ cm(String str, String str2, long j12, String str3, String str4, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        this(str, str2, j12, str3, str4, z12, z13, z14, z15);
    }

    @X41.i
    @Y61.k
    public final String e() {
        return this.f384335a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof cm) {
            cm cmVar = (cm) obj;
            if (kotlin.jvm.internal.L.f(cmVar.f384335a, this.f384335a) && kotlin.jvm.internal.L.f(cmVar.f384336b, this.f384336b) && cmVar.f384337c == this.f384337c && kotlin.jvm.internal.L.f(cmVar.f384338d, this.f384338d) && kotlin.jvm.internal.L.f(cmVar.f384339e, this.f384339e) && cmVar.f384340f == this.f384340f && cmVar.f384341g == this.f384341g && cmVar.f384342h == this.f384342h && cmVar.f384343i == this.f384343i) {
                return true;
            }
        }
        return false;
    }

    @X41.i
    @Y61.k
    public final String f() {
        return this.f384336b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.f384343i) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(v2.a(this.f384339e, v2.a(this.f384338d, androidx.appcompat.app.r.g(v2.a(this.f384336b, v2.a(this.f384335a, 527, 31), 31), 31, this.f384337c), 31), 31), 31, this.f384340f), 31, this.f384341g), 31, this.f384342h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f384335a);
        sb2.append('=');
        sb2.append(this.f384336b);
        if (this.f384342h) {
            if (this.f384337c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(nn.a(new Date(this.f384337c)));
            }
        }
        if (!this.f384343i) {
            sb2.append("; domain=");
            sb2.append(this.f384338d);
        }
        sb2.append("; path=");
        sb2.append(this.f384339e);
        if (this.f384340f) {
            sb2.append("; secure");
        }
        if (this.f384341g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    private cm(String str, String str2, long j12, String str3, String str4, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f384335a = str;
        this.f384336b = str2;
        this.f384337c = j12;
        this.f384338d = str3;
        this.f384339e = str4;
        this.f384340f = z12;
        this.f384341g = z13;
        this.f384342h = z14;
        this.f384343i = z15;
    }

    public static final class a {
        private static long a(int i12, String str) throws NumberFormatException {
            int iA2 = a(0, i12, str, false);
            Matcher matcher = cm.f384333m.matcher(str);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int I12 = -1;
            int i16 = -1;
            int i17 = -1;
            while (iA2 < i12) {
                int iA3 = a(iA2 + 1, i12, str, true);
                matcher.region(iA2, iA3);
                if (i14 == -1 && matcher.usePattern(cm.f384333m).matches()) {
                    i14 = Integer.parseInt(matcher.group(1));
                    i16 = Integer.parseInt(matcher.group(2));
                    i17 = Integer.parseInt(matcher.group(3));
                } else if (i15 == -1 && matcher.usePattern(cm.f384332l).matches()) {
                    i15 = Integer.parseInt(matcher.group(1));
                } else if (I12 == -1 && matcher.usePattern(cm.f384331k).matches()) {
                    I12 = C43066x.I(cm.f384331k.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i13 == -1 && matcher.usePattern(cm.f384330j).matches()) {
                    i13 = Integer.parseInt(matcher.group(1));
                }
                iA2 = a(iA3 + 1, i12, str, false);
            }
            if (70 <= i13 && i13 < 100) {
                i13 += 1900;
            }
            if (i13 >= 0 && i13 < 70) {
                i13 += 2000;
            }
            if (i13 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (I12 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i15 || i15 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i17 < 0 || i17 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(qc1.f389146d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i13);
            gregorianCalendar.set(2, I12 - 1);
            gregorianCalendar.set(5, i15);
            gregorianCalendar.set(11, i14);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private static int a(int i12, int i13, String str, boolean z12) {
            while (i12 < i13) {
                char cCharAt = str.charAt(i12);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z12)) {
                    return i12;
                }
                i12++;
            }
            return i13;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x01bf  */
        @X41.n
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.util.List a(@Y61.k com.yandex.mobile.ads.impl.s10 r36, @Y61.k com.yandex.mobile.ads.impl.gz r37) {
            /*
                Method dump skipped, instructions count: 474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cm.a.a(com.yandex.mobile.ads.impl.s10, com.yandex.mobile.ads.impl.gz):java.util.List");
        }
    }
}
