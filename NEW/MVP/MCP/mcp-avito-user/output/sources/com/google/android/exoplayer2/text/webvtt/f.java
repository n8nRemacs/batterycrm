package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.util.F;
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
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f347102a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f347103b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f347104c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f347105d;

    /* compiled from: WebvttCueParser.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final g f347106c = new g(0);

        /* renamed from: a, reason: collision with root package name */
        public final c f347107a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347108b;

        public b(c cVar, int i12, a aVar) {
            this.f347107a = cVar;
            this.f347108b = i12;
        }
    }

    /* compiled from: WebvttCueParser.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f347109a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347110b;

        /* renamed from: c, reason: collision with root package name */
        public final String f347111c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f347112d;

        public c(String str, int i12, String str2, Set<String> set) {
            this.f347110b = i12;
            this.f347109a = str;
            this.f347111c = str2;
            this.f347112d = set;
        }
    }

    /* compiled from: WebvttCueParser.java */
    public static final class d implements Comparable<d> {

        /* renamed from: b, reason: collision with root package name */
        public final int f347113b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.text.webvtt.d f347114c;

        public d(int i12, com.google.android.exoplayer2.text.webvtt.d dVar) {
            this.f347113b = i12;
            this.f347114c = dVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return Integer.compare(this.f347113b, dVar.f347113b);
        }
    }

    /* compiled from: WebvttCueParser.java */
    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f347117c;

        /* renamed from: a, reason: collision with root package name */
        public long f347115a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f347116b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f347118d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f347119e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f347120f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f347121g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f347122h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f347123i = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: j, reason: collision with root package name */
        public float f347124j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f347125k = BeduinInputModel.MIN_TEXT_VERSION;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.android.exoplayer2.text.a.c a() {
            /*
                r13 = this;
                float r0 = r13.f347122h
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
                int r0 = r13.f347118d
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
                int r2 = r13.f347123i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r13.f347118d
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
                com.google.android.exoplayer2.text.a$c r8 = new com.google.android.exoplayer2.text.a$c
                r8.<init>()
                int r12 = r13.f347118d
                if (r12 == r11) goto L4e
                if (r12 == r10) goto L4b
                if (r12 == r9) goto L48
                if (r12 == r7) goto L4e
                if (r12 == r6) goto L48
                r6 = 0
                goto L50
            L48:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L50
            L4b:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L50
            L4e:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            L50:
                r8.f346736c = r6
                float r6 = r13.f347119e
                int r7 = r13.f347120f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L66
                if (r7 != 0) goto L66
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 < 0) goto L64
                int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r3 <= 0) goto L66
            L64:
                r1 = r5
                goto L6d
            L66:
                if (r9 == 0) goto L6a
                r1 = r6
                goto L6d
            L6a:
                if (r7 != 0) goto L6d
                goto L64
            L6d:
                r8.f346738e = r1
                r8.f346739f = r7
                int r1 = r13.f347121g
                r8.f346740g = r1
                r8.f346741h = r0
                r8.f346742i = r2
                float r1 = r13.f347124j
                if (r2 == 0) goto L98
                if (r2 == r11) goto L8c
                if (r2 != r10) goto L82
                goto L9a
            L82:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L8c:
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto L94
                float r0 = r0 * r3
                goto L9a
            L94:
                float r5 = r5 - r0
                float r0 = r5 * r3
                goto L9a
            L98:
                float r0 = r5 - r0
            L9a:
                float r0 = java.lang.Math.min(r1, r0)
                r8.f346745l = r0
                int r0 = r13.f347125k
                r8.f346749p = r0
                java.lang.CharSequence r0 = r13.f347117c
                if (r0 == 0) goto Laa
                r8.f346734a = r0
            Laa:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.f.e.a():com.google.android.exoplayer2.text.a$c");
        }
    }

    static {
        HashMap map = new HashMap();
        androidx.media3.extractor.text.webvtt.f.a(255, 255, 255, map, "white");
        androidx.media3.extractor.text.webvtt.f.a(0, 255, 0, map, "lime");
        androidx.media3.extractor.text.webvtt.f.a(0, 255, 255, map, "cyan");
        androidx.media3.extractor.text.webvtt.f.a(255, 0, 0, map, "red");
        androidx.media3.extractor.text.webvtt.f.a(255, 255, 0, map, "yellow");
        androidx.media3.extractor.text.webvtt.f.a(255, 0, 255, map, "magenta");
        androidx.media3.extractor.text.webvtt.f.a(0, 0, 255, map, "blue");
        androidx.media3.extractor.text.webvtt.f.a(0, 0, 0, map, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        f347104c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.media3.extractor.text.webvtt.f.a(255, 255, 255, map2, "bg_white");
        androidx.media3.extractor.text.webvtt.f.a(0, 255, 0, map2, "bg_lime");
        androidx.media3.extractor.text.webvtt.f.a(0, 255, 255, map2, "bg_cyan");
        androidx.media3.extractor.text.webvtt.f.a(255, 0, 0, map2, "bg_red");
        androidx.media3.extractor.text.webvtt.f.a(255, 255, 0, map2, "bg_yellow");
        androidx.media3.extractor.text.webvtt.f.a(255, 0, 255, map2, "bg_magenta");
        androidx.media3.extractor.text.webvtt.f.a(0, 0, 255, map2, "bg_blue");
        androidx.media3.extractor.text.webvtt.f.a(0, 0, 0, map2, "bg_black");
        f347105d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(@j.P java.lang.String r18, com.google.android.exoplayer2.text.webvtt.f.c r19, java.util.List<com.google.android.exoplayer2.text.webvtt.f.b> r20, android.text.SpannableStringBuilder r21, java.util.List<com.google.android.exoplayer2.text.webvtt.d> r22) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.f.a(java.lang.String, com.google.android.exoplayer2.text.webvtt.f$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r8, @j.P java.lang.String r9, com.google.android.exoplayer2.text.webvtt.f.c r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            com.google.android.exoplayer2.text.webvtt.d r3 = (com.google.android.exoplayer2.text.webvtt.d) r3
            java.lang.String r4 = r10.f347109a
            java.lang.String r5 = r3.f347082a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f347083b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set<java.lang.String> r5 = r3.f347084c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f347085d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.f347082a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = com.google.android.exoplayer2.text.webvtt.d.a(r1, r6, r5, r9)
            java.lang.String r6 = r3.f347083b
            r7 = 2
            int r4 = com.google.android.exoplayer2.text.webvtt.d.a(r5, r7, r6, r4)
            java.lang.String r5 = r3.f347085d
            java.lang.String r6 = r10.f347111c
            r7 = 4
            int r4 = com.google.android.exoplayer2.text.webvtt.d.a(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set<java.lang.String> r5 = r3.f347084c
            java.util.Set<java.lang.String> r6 = r10.f347112d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set<java.lang.String> r5 = r3.f347084c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            com.google.android.exoplayer2.text.webvtt.f$d r5 = new com.google.android.exoplayer2.text.webvtt.f$d
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.f.b(java.util.List, java.lang.String, com.google.android.exoplayer2.text.webvtt.f$c):java.util.ArrayList");
    }

    public static int c(List<com.google.android.exoplayer2.text.webvtt.d> list, @P String str, c cVar) {
        ArrayList arrayListB = b(list, str, cVar);
        for (int i12 = 0; i12 < arrayListB.size(); i12++) {
            int i13 = ((d) arrayListB.get(i12)).f347114c.f347097p;
            if (i13 != -1) {
                return i13;
            }
        }
        return -1;
    }

    @P
    public static com.google.android.exoplayer2.text.webvtt.e d(@P String str, Matcher matcher, F f12, ArrayList arrayList) {
        e eVar = new e();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            eVar.f347115a = i.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            eVar.f347116b = i.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, eVar);
            StringBuilder sb2 = new StringBuilder();
            String strE = f12.e();
            while (!TextUtils.isEmpty(strE)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strE.trim());
                strE = f12.e();
            }
            eVar.f347117c = f(str, sb2.toString(), arrayList);
            return new com.google.android.exoplayer2.text.webvtt.e(eVar.a().a(), eVar.f347115a, eVar.f347116b);
        } catch (NumberFormatException unused) {
            matcher.group();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r17, com.google.android.exoplayer2.text.webvtt.f.e r18) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.f.e(java.lang.String, com.google.android.exoplayer2.text.webvtt.f$e):void");
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
    public static android.text.SpannedString f(@j.P java.lang.String r16, java.lang.String r17, java.util.List<com.google.android.exoplayer2.text.webvtt.d> r18) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.f.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }
}
