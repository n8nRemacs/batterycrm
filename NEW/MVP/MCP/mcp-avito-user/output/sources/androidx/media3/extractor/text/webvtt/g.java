package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.util.J;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.common.base.C37262f;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttCueParser.java */
@J
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f51465a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f51466b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f51467c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f51468d;

    /* compiled from: WebvttCueParser.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final h f51469c = new h(0);

        /* renamed from: a, reason: collision with root package name */
        public final c f51470a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51471b;

        public b(c cVar, int i12, a aVar) {
            this.f51470a = cVar;
            this.f51471b = i12;
        }
    }

    /* compiled from: WebvttCueParser.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f51472a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51473b;

        /* renamed from: c, reason: collision with root package name */
        public final String f51474c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f51475d;

        public c(String str, int i12, String str2, Set<String> set) {
            this.f51473b = i12;
            this.f51472a = str;
            this.f51474c = str2;
            this.f51475d = set;
        }
    }

    /* compiled from: WebvttCueParser.java */
    public static final class d implements Comparable<d> {

        /* renamed from: b, reason: collision with root package name */
        public final int f51476b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.extractor.text.webvtt.d f51477c;

        public d(int i12, androidx.media3.extractor.text.webvtt.d dVar) {
            this.f51476b = i12;
            this.f51477c = dVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return Integer.compare(this.f51476b, dVar.f51476b);
        }
    }

    /* compiled from: WebvttCueParser.java */
    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f51480c;

        /* renamed from: a, reason: collision with root package name */
        public long f51478a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f51479b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f51481d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f51482e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f51483f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f51484g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f51485h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f51486i = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: j, reason: collision with root package name */
        public float f51487j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f51488k = BeduinInputModel.MIN_TEXT_VERSION;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.media3.common.text.a.c a() {
            /*
                r13 = this;
                float r0 = r13.f51485h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 0
                r4 = 1056964608(0x3f000000, float:0.5)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 5
                r7 = 4
                if (r2 == 0) goto L11
                goto L1c
            L11:
                int r0 = r13.f51481d
                if (r0 == r7) goto L1b
                if (r0 == r6) goto L19
                r0 = r4
                goto L1c
            L19:
                r0 = r5
                goto L1c
            L1b:
                r0 = r3
            L1c:
                int r2 = r13.f51486i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r13.f51481d
                if (r2 == r11) goto L34
                if (r2 == r9) goto L32
                if (r2 == r7) goto L34
                if (r2 == r6) goto L32
                r2 = r11
                goto L35
            L32:
                r2 = r10
                goto L35
            L34:
                r2 = 0
            L35:
                androidx.media3.common.text.a$c r8 = new androidx.media3.common.text.a$c
                r8.<init>()
                int r12 = r13.f51481d
                if (r12 == r11) goto L51
                if (r12 == r10) goto L4e
                if (r12 == r9) goto L4b
                if (r12 == r7) goto L51
                if (r12 == r6) goto L4b
                androidx.media3.common.util.s.g()
                r6 = 0
                goto L53
            L4b:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L53
            L4e:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L53
            L51:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            L53:
                r8.f47841c = r6
                float r6 = r13.f51482e
                int r7 = r13.f51483f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L69
                if (r7 != 0) goto L69
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 < 0) goto L67
                int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r3 <= 0) goto L69
            L67:
                r1 = r5
                goto L70
            L69:
                if (r9 == 0) goto L6d
                r1 = r6
                goto L70
            L6d:
                if (r7 != 0) goto L70
                goto L67
            L70:
                r8.f47843e = r1
                r8.f47844f = r7
                int r1 = r13.f51484g
                r8.f47845g = r1
                r8.f47846h = r0
                r8.f47847i = r2
                float r1 = r13.f51487j
                if (r2 == 0) goto L9b
                if (r2 == r11) goto L8f
                if (r2 != r10) goto L85
                goto L9d
            L85:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L8f:
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto L97
                float r0 = r0 * r3
                goto L9d
            L97:
                float r5 = r5 - r0
                float r0 = r5 * r3
                goto L9d
            L9b:
                float r0 = r5 - r0
            L9d:
                float r0 = java.lang.Math.min(r1, r0)
                r8.f47850l = r0
                int r0 = r13.f51488k
                r8.f47854p = r0
                java.lang.CharSequence r0 = r13.f51480c
                if (r0 == 0) goto Lad
                r8.f47839a = r0
            Lad:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.g.e.a():androidx.media3.common.text.a$c");
        }
    }

    static {
        HashMap map = new HashMap();
        f.a(255, 255, 255, map, "white");
        f.a(0, 255, 0, map, "lime");
        f.a(0, 255, 255, map, "cyan");
        f.a(255, 0, 0, map, "red");
        f.a(255, 255, 0, map, "yellow");
        f.a(255, 0, 255, map, "magenta");
        f.a(0, 0, 255, map, "blue");
        f.a(0, 0, 0, map, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        f51467c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        f.a(255, 255, 255, map2, "bg_white");
        f.a(0, 255, 0, map2, "bg_lime");
        f.a(0, 255, 255, map2, "bg_cyan");
        f.a(255, 0, 0, map2, "bg_red");
        f.a(255, 255, 0, map2, "bg_yellow");
        f.a(255, 0, 255, map2, "bg_magenta");
        f.a(0, 0, 255, map2, "bg_blue");
        f.a(0, 0, 0, map2, "bg_black");
        f51468d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(@j.P java.lang.String r17, androidx.media3.extractor.text.webvtt.g.c r18, java.util.List<androidx.media3.extractor.text.webvtt.g.b> r19, android.text.SpannableStringBuilder r20, java.util.List<androidx.media3.extractor.text.webvtt.d> r21) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.g.a(java.lang.String, androidx.media3.extractor.text.webvtt.g$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r8, @j.P java.lang.String r9, androidx.media3.extractor.text.webvtt.g.c r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            androidx.media3.extractor.text.webvtt.d r3 = (androidx.media3.extractor.text.webvtt.d) r3
            java.lang.String r4 = r10.f51472a
            java.lang.String r5 = r3.f51445a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f51446b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set<java.lang.String> r5 = r3.f51447c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f51448d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.f51445a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = androidx.media3.extractor.text.webvtt.d.a(r1, r6, r5, r9)
            java.lang.String r6 = r3.f51446b
            r7 = 2
            int r4 = androidx.media3.extractor.text.webvtt.d.a(r5, r7, r6, r4)
            java.lang.String r5 = r3.f51448d
            java.lang.String r6 = r10.f51474c
            r7 = 4
            int r4 = androidx.media3.extractor.text.webvtt.d.a(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set<java.lang.String> r5 = r3.f51447c
            java.util.Set<java.lang.String> r6 = r10.f51475d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set<java.lang.String> r5 = r3.f51447c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            androidx.media3.extractor.text.webvtt.g$d r5 = new androidx.media3.extractor.text.webvtt.g$d
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.g.b(java.util.List, java.lang.String, androidx.media3.extractor.text.webvtt.g$c):java.util.ArrayList");
    }

    public static void c(List list, @P String str, c cVar) {
        ArrayList arrayListB = b(list, str, cVar);
        for (int i12 = 0; i12 < arrayListB.size() && ((d) arrayListB.get(i12)).f51477c.f51460p == -1; i12++) {
        }
    }

    @P
    public static androidx.media3.extractor.text.webvtt.e d(@P String str, Matcher matcher, z zVar, ArrayList arrayList) {
        e eVar = new e();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            eVar.f51478a = j.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            eVar.f51479b = j.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, eVar);
            StringBuilder sb2 = new StringBuilder();
            zVar.getClass();
            String strH = zVar.h(C37262f.f359034c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strH.trim());
                strH = zVar.h(C37262f.f359034c);
            }
            eVar.f51480c = f(str, sb2.toString(), arrayList);
            return new androidx.media3.extractor.text.webvtt.e(eVar.a().a(), eVar.f51478a, eVar.f51479b);
        } catch (NumberFormatException unused) {
            matcher.group();
            s.g();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, androidx.media3.extractor.text.webvtt.g.e r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.g.e(java.lang.String, androidx.media3.extractor.text.webvtt.g$e):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(@j.P java.lang.String r16, java.lang.String r17, java.util.List<androidx.media3.extractor.text.webvtt.d> r18) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.g.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, e eVar) {
        String strSubstring;
        int i12 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i12 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i12 = 0;
                    break;
                default:
                    "Invalid anchor value: ".concat(strSubstring);
                    s.g();
                    i12 = BeduinInputModel.MIN_TEXT_VERSION;
                    break;
            }
            eVar.f51484g = i12;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f51482e = j.a(str);
            eVar.f51483f = 0;
        } else {
            eVar.f51482e = Integer.parseInt(str);
            eVar.f51483f = 1;
        }
    }
}
