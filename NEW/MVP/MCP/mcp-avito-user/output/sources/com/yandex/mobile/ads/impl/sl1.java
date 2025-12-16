package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class sl1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f389982a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f389983b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f389984c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f389985d;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f389986c = new A(8);

        /* renamed from: a, reason: collision with root package name */
        private final b f389987a;

        /* renamed from: b, reason: collision with root package name */
        private final int f389988b;

        public /* synthetic */ a(b bVar, int i12, int i13) {
            this(bVar, i12);
        }

        private a(b bVar, int i12) {
            this.f389987a = bVar;
            this.f389988b = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.f389987a.f389990b, aVar2.f389987a.f389990b);
        }
    }

    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f389993a;

        /* renamed from: b, reason: collision with root package name */
        public final ql1 f389994b;

        public c(int i12, ql1 ql1Var) {
            this.f389993a = i12;
            this.f389994b = ql1Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f389993a, cVar.f389993a);
        }
    }

    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f389997c;

        /* renamed from: a, reason: collision with root package name */
        public long f389995a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f389996b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f389998d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f389999e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f390000f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f390001g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f390002h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f390003i = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: j, reason: collision with root package name */
        public float f390004j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f390005k = BeduinInputModel.MIN_TEXT_VERSION;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.yandex.mobile.ads.impl.vm.a a() {
            /*
                r13 = this;
                float r0 = r13.f390002h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 0
                r4 = 1056964608(0x3f000000, float:0.5)
                r5 = 5
                r6 = 4
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L11
                goto L1c
            L11:
                int r0 = r13.f389998d
                if (r0 == r6) goto L1b
                if (r0 == r5) goto L19
                r0 = r4
                goto L1c
            L19:
                r0 = r7
                goto L1c
            L1b:
                r0 = r3
            L1c:
                int r2 = r13.f390003i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r13.f389998d
                if (r2 == r11) goto L34
                if (r2 == r9) goto L32
                if (r2 == r6) goto L34
                if (r2 == r5) goto L32
                r2 = r11
                goto L35
            L32:
                r2 = r10
                goto L35
            L34:
                r2 = 0
            L35:
                com.yandex.mobile.ads.impl.vm$a r8 = new com.yandex.mobile.ads.impl.vm$a
                r8.<init>()
                int r12 = r13.f389998d
                if (r12 == r11) goto L55
                if (r12 == r10) goto L52
                if (r12 == r9) goto L4f
                if (r12 == r6) goto L55
                if (r12 == r5) goto L4f
                java.lang.String r5 = "Unknown textAlignment: "
                java.lang.String r6 = "WebvttCueParser"
                com.yandex.mobile.ads.impl.j90.a(r5, r12, r6)
                r5 = 0
                goto L57
            L4f:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L57
            L52:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L57
            L55:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            L57:
                com.yandex.mobile.ads.impl.vm$a r5 = r8.b(r5)
                float r6 = r13.f389999e
                int r8 = r13.f390000f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L6e
                if (r8 != 0) goto L6e
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 < 0) goto L74
                int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r3 <= 0) goto L6e
                goto L74
            L6e:
                if (r9 == 0) goto L72
                r1 = r6
                goto L75
            L72:
                if (r8 != 0) goto L75
            L74:
                r1 = r7
            L75:
                com.yandex.mobile.ads.impl.vm$a r1 = r5.a(r8, r1)
                int r3 = r13.f390001g
                com.yandex.mobile.ads.impl.vm$a r1 = r1.a(r3)
                com.yandex.mobile.ads.impl.vm$a r1 = r1.b(r0)
                com.yandex.mobile.ads.impl.vm$a r1 = r1.b(r2)
                float r3 = r13.f390004j
                if (r2 == 0) goto La6
                if (r2 == r11) goto L9a
                if (r2 != r10) goto L90
                goto La8
            L90:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L9a:
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                r4 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto La2
                float r0 = r0 * r4
                goto La8
            La2:
                float r7 = r7 - r0
                float r0 = r7 * r4
                goto La8
            La6:
                float r0 = r7 - r0
            La8:
                float r0 = java.lang.Math.min(r3, r0)
                com.yandex.mobile.ads.impl.vm$a r0 = r1.d(r0)
                int r1 = r13.f390005k
                com.yandex.mobile.ads.impl.vm$a r0 = r0.c(r1)
                java.lang.CharSequence r1 = r13.f389997c
                if (r1 == 0) goto Lbd
                r0.a(r1)
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sl1.d.a():com.yandex.mobile.ads.impl.vm$a");
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
        f389984c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.media3.extractor.text.webvtt.f.a(255, 255, 255, map2, "bg_white");
        androidx.media3.extractor.text.webvtt.f.a(0, 255, 0, map2, "bg_lime");
        androidx.media3.extractor.text.webvtt.f.a(0, 255, 255, map2, "bg_cyan");
        androidx.media3.extractor.text.webvtt.f.a(255, 0, 0, map2, "bg_red");
        androidx.media3.extractor.text.webvtt.f.a(255, 255, 0, map2, "bg_yellow");
        androidx.media3.extractor.text.webvtt.f.a(255, 0, 255, map2, "bg_magenta");
        androidx.media3.extractor.text.webvtt.f.a(0, 0, 255, map2, "bg_blue");
        androidx.media3.extractor.text.webvtt.f.a(0, 0, 0, map2, "bg_black");
        f389985d = Collections.unmodifiableMap(map2);
    }

    @j.P
    public static rl1 a(pr0 pr0Var, ArrayList arrayList) {
        String strJ = pr0Var.j();
        if (strJ == null) {
            return null;
        }
        Pattern pattern = f389982a;
        Matcher matcher = pattern.matcher(strJ);
        if (matcher.matches()) {
            return a(null, matcher, pr0Var, arrayList);
        }
        String strJ2 = pr0Var.j();
        if (strJ2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strJ2);
        if (matcher2.matches()) {
            return a(strJ.trim(), matcher2, pr0Var, arrayList);
        }
        return null;
    }

    private static void b(String str, d dVar) {
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
                    yk1.a("Invalid anchor value: ", strSubstring, "WebvttCueParser");
                    i12 = BeduinInputModel.MIN_TEXT_VERSION;
                    break;
            }
            dVar.f390001g = i12;
            str = str.substring(0, iIndexOf);
        }
        if (!str.endsWith("%")) {
            dVar.f389999e = Integer.parseInt(str);
            dVar.f390000f = 1;
            return;
        }
        int i13 = ul1.f390584a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        dVar.f389999e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        dVar.f390000f = 0;
    }

    private static void c(String str, d dVar) {
        String strSubstring;
        int i12 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "line-left":
                case "start":
                    i12 = 0;
                    break;
                case "center":
                case "middle":
                    i12 = 1;
                    break;
                case "line-right":
                case "end":
                    break;
                default:
                    yk1.a("Invalid anchor value: ", strSubstring, "WebvttCueParser");
                    i12 = BeduinInputModel.MIN_TEXT_VERSION;
                    break;
            }
            dVar.f390003i = i12;
            str = str.substring(0, iIndexOf);
        }
        int i13 = ul1.f390584a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        dVar.f390002h = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static vm.a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString a(@j.P java.lang.String r16, java.lang.String r17, java.util.List<com.yandex.mobile.ads.impl.ql1> r18) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sl1.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f389989a;

        /* renamed from: b, reason: collision with root package name */
        public final int f389990b;

        /* renamed from: c, reason: collision with root package name */
        public final String f389991c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f389992d;

        private b(String str, int i12, String str2, Set<String> set) {
            this.f389990b = i12;
            this.f389989a = str;
            this.f389991c = str2;
            this.f389992d = set;
        }

        public static b a(int i12, String str) {
            String str2;
            String strTrim = str.trim();
            db.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            int i13 = pc1.f388768a;
            String[] strArrSplit = strTrim.split("\\.", -1);
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i14 = 1; i14 < strArrSplit.length; i14++) {
                hashSet.add(strArrSplit[i14]);
            }
            return new b(str3, i12, str2, hashSet);
        }

        public static b a() {
            return new b("", 0, "", Collections.emptySet());
        }
    }

    @j.P
    private static rl1 a(@j.P String str, Matcher matcher, pr0 pr0Var, ArrayList arrayList) {
        d dVar = new d();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            dVar.f389995a = ul1.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            dVar.f389996b = ul1.a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            a(strGroup3, dVar);
            StringBuilder sb2 = new StringBuilder();
            String strJ = pr0Var.j();
            while (!TextUtils.isEmpty(strJ)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strJ.trim());
                strJ = pr0Var.j();
            }
            dVar.f389997c = a(str, sb2.toString(), arrayList);
            return new rl1(dVar.a().a(), dVar.f389995a, dVar.f389996b);
        } catch (NumberFormatException unused) {
            StringBuilder sbA = Cif.a("Skipping cue with bad header: ");
            sbA.append(matcher.group());
            ka0.d("WebvttCueParser", sbA.toString());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(String str, d dVar) {
        int i12;
        int i13;
        Matcher matcher = f389983b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    b(strGroup2, dVar);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i12 = 2;
                            break;
                        case "end":
                            i12 = 3;
                            break;
                        case "left":
                            i12 = 4;
                            break;
                        case "right":
                            i12 = 5;
                            break;
                        case "start":
                            i12 = 1;
                            break;
                        default:
                            ka0.d("WebvttCueParser", "Invalid alignment value: " + strGroup2);
                            i12 = 2;
                            break;
                    }
                    dVar.f389998d = i12;
                } else if ("position".equals(strGroup)) {
                    c(strGroup2, dVar);
                } else if ("size".equals(strGroup)) {
                    int i14 = ul1.f390584a;
                    if (strGroup2.endsWith("%")) {
                        dVar.f390004j = Float.parseFloat(strGroup2.substring(0, strGroup2.length() - 1)) / 100.0f;
                    } else {
                        throw new NumberFormatException("Percentages must end with %");
                    }
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i13 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i13 = 1;
                    } else {
                        ka0.d("WebvttCueParser", "Invalid 'vertical' value: " + strGroup2);
                        i13 = BeduinInputModel.MIN_TEXT_VERSION;
                    }
                    dVar.f390005k = i13;
                } else {
                    ka0.d("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                StringBuilder sbA = Cif.a("Skipping bad cue setting: ");
                sbA.append(matcher.group());
                ka0.d("WebvttCueParser", sbA.toString());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.text.SpannableStringBuilder r17, com.yandex.mobile.ads.impl.sl1.b r18, @j.P java.lang.String r19, java.util.List r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sl1.a(android.text.SpannableStringBuilder, com.yandex.mobile.ads.impl.sl1$b, java.lang.String, java.util.List, java.util.List):void");
    }
}
