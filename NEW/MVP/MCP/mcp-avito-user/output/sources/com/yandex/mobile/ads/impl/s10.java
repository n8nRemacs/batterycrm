package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.facebook.imageutils.JfifUtil;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;
import okio.C44802l;

/* loaded from: classes8.dex */
public final class s10 {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private static final char[] f389744j;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f389745a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f389746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final String f389747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final String f389748d;

    /* renamed from: e, reason: collision with root package name */
    private final int f389749e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private final List<String> f389750f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private final String f389751g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final String f389752h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f389753i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private String f389754a;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        private String f389757d;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        private final ArrayList f389759f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        private ArrayList f389760g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        private String f389761h;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private String f389755b = "";

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private String f389756c = "";

        /* renamed from: e, reason: collision with root package name */
        private int f389758e = -1;

        /* renamed from: com.yandex.mobile.ads.impl.s10$a$a, reason: collision with other inner class name */
        public static final class C10986a {
            public /* synthetic */ C10986a(int i12) {
                this();
            }

            public static final int a(String str, int i12, int i13) throws NumberFormatException {
                int i14;
                try {
                    i14 = Integer.parseInt(b.a(str, i12, i13, "", false, false, false, false, 248));
                } catch (NumberFormatException unused) {
                }
                if (1 > i14 || i14 >= 65536) {
                    return -1;
                }
                return i14;
            }

            public static final int b(String str, int i12, int i13) {
                while (i12 < i13) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == '[') {
                        do {
                            i12++;
                            if (i12 < i13) {
                            }
                        } while (str.charAt(i12) != ']');
                    } else if (cCharAt == ':') {
                        return i12;
                    }
                    i12++;
                }
                return i13;
            }

            public static final int c(String str, int i12, int i13) {
                if (i13 - i12 >= 2) {
                    char cCharAt = str.charAt(i12);
                    if ((kotlin.jvm.internal.L.g(cCharAt, 97) >= 0 && kotlin.jvm.internal.L.g(cCharAt, 122) <= 0) || (kotlin.jvm.internal.L.g(cCharAt, 65) >= 0 && kotlin.jvm.internal.L.g(cCharAt, 90) <= 0)) {
                        while (true) {
                            i12++;
                            if (i12 >= i13) {
                                break;
                            }
                            char cCharAt2 = str.charAt(i12);
                            if ('a' > cCharAt2 || cCharAt2 >= '{') {
                                if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                    if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                        if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                            if (cCharAt2 == ':') {
                                                return i12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            public static final int d(String str, int i12, int i13) {
                int i14 = 0;
                while (i12 < i13) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i14++;
                    i12++;
                }
                return i14;
            }

            private C10986a() {
            }
        }

        static {
            new C10986a(0);
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f389759f = arrayList;
            arrayList.add("");
        }

        @Y61.k
        public final a a(int i12) {
            if (1 > i12 || i12 >= 65536) {
                throw new IllegalArgumentException(ba.a("unexpected port: ", i12).toString());
            }
            this.f389758e = i12;
            return this;
        }

        public final void b(int i12) {
            this.f389758e = i12;
        }

        @Y61.k
        public final a c(@Y61.k String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f389754a = "http";
            } else {
                if (!str.equalsIgnoreCase(Constants.SCHEME)) {
                    throw new IllegalArgumentException(up1.a("unexpected scheme: ", str));
                }
                this.f389754a = Constants.SCHEME;
            }
            return this;
        }

        public final void d(@Y61.l String str) {
            this.f389761h = str;
        }

        public final void e(@Y61.k String str) {
            this.f389756c = str;
        }

        public final void f(@Y61.k String str) {
            this.f389755b = str;
        }

        public final void g(@Y61.l String str) {
            this.f389757d = str;
        }

        public final void h(@Y61.l String str) {
            this.f389754a = str;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f389754a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f389755b.length() > 0 || this.f389756c.length() > 0) {
                sb2.append(this.f389755b);
                if (this.f389756c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f389756c);
                }
                sb2.append('@');
            }
            String str2 = this.f389757d;
            if (str2 != null) {
                if (C43066x.r(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.f389757d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f389757d);
                }
            }
            int iA2 = this.f389758e;
            if (iA2 != -1 || this.f389754a != null) {
                if (iA2 == -1) {
                    iA2 = b.a(this.f389754a);
                }
                String str3 = this.f389754a;
                if (str3 == null || iA2 != b.a(str3)) {
                    sb2.append(':');
                    sb2.append(iA2);
                }
            }
            b.a(this.f389759f, sb2);
            if (this.f389760g != null) {
                sb2.append('?');
                b.a((List) this.f389760g, sb2);
            }
            if (this.f389761h != null) {
                sb2.append('#');
                sb2.append(this.f389761h);
            }
            return sb2.toString();
        }

        @Y61.k
        public final ArrayList b() {
            return this.f389759f;
        }

        @Y61.k
        public final a d() {
            String str = this.f389757d;
            this.f389757d = str != null ? androidx.compose.foundation.H.k("[\"<>^`{|}]", str, "") : null;
            int size = this.f389759f.size();
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList = this.f389759f;
                arrayList.set(i12, b.a((String) arrayList.get(i12), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 227));
            }
            ArrayList arrayList2 = this.f389760g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    String str2 = (String) arrayList2.get(i13);
                    arrayList2.set(i13, str2 != null ? b.a(str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 195) : null);
                }
            }
            String str3 = this.f389761h;
            this.f389761h = str3 != null ? b.a(str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 163) : null;
            return this;
        }

        @Y61.k
        public final a e() {
            this.f389755b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        @Y61.k
        public final a b(@Y61.k String str) {
            String strA = wz.a(b.a(str, 0, 0, false, 7));
            if (strA != null) {
                this.f389757d = strA;
                return this;
            }
            throw new IllegalArgumentException(up1.a("unexpected host: ", str));
        }

        @Y61.k
        public final void a(@Y61.l String str) {
            String strA;
            this.f389760g = (str == null || (strA = b.a(str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, 211)) == null) ? null : b.d(strA);
        }

        @Y61.k
        public final s10 a() {
            ArrayList arrayList;
            String str = this.f389754a;
            if (str != null) {
                String strA = b.a(this.f389755b, 0, 0, false, 7);
                String strA2 = b.a(this.f389756c, 0, 0, false, 7);
                String str2 = this.f389757d;
                if (str2 != null) {
                    int iA2 = this.f389758e;
                    if (iA2 == -1) {
                        iA2 = b.a(this.f389754a);
                    }
                    int i12 = iA2;
                    ArrayList arrayList2 = this.f389759f;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.a((String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.f389760g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(C42745f0.q(arrayList4, 10));
                        for (String str3 : arrayList4) {
                            arrayList.add(str3 != null ? b.a(str3, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f389761h;
                    return new s10(str, strA, strA2, str2, i12, arrayList3, arrayList, str4 != null ? b.a(str4, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @Y61.k
        public final a c() {
            this.f389756c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        @Y61.k
        public final a a(@Y61.l s10 s10Var, @Y61.k String str) throws NumberFormatException {
            int iA2;
            int i12;
            char c12;
            int iA3 = qc1.a(0, str.length(), str);
            int iB2 = qc1.b(iA3, str.length(), str);
            int iC2 = C10986a.c(str, iA3, iB2);
            char c13 = 65535;
            if (iC2 != -1) {
                if (C43066x.g0(iA3, str, "https:", true)) {
                    this.f389754a = Constants.SCHEME;
                    iA3 += 6;
                } else if (C43066x.g0(iA3, str, "http:", true)) {
                    this.f389754a = "http";
                    iA3 += 5;
                } else {
                    StringBuilder sbA = Cif.a("Expected URL scheme 'http' or 'https' but was '");
                    sbA.append(str.substring(0, iC2));
                    sbA.append('\'');
                    throw new IllegalArgumentException(sbA.toString());
                }
            } else if (s10Var != null) {
                this.f389754a = s10Var.l();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iD2 = C10986a.d(str, iA3, iB2);
            char c14 = '?';
            char c15 = '\\';
            char c16 = '/';
            char c17 = '#';
            if (iD2 < 2 && s10Var != null && kotlin.jvm.internal.L.f(s10Var.l(), this.f389754a)) {
                this.f389755b = s10Var.f();
                this.f389756c = s10Var.b();
                this.f389757d = s10Var.g();
                this.f389758e = s10Var.i();
                this.f389759f.clear();
                this.f389759f.addAll(s10Var.d());
                if (iA3 == iB2 || str.charAt(iA3) == '#') {
                    a(s10Var.e());
                }
            } else {
                int i13 = iA3 + iD2;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iA2 = qc1.a(i13, iB2, str, "@/\\?#");
                    char cCharAt = iA2 != iB2 ? str.charAt(iA2) : c13;
                    if (cCharAt == c13 || cCharAt == c17 || cCharAt == c16 || cCharAt == c15 || cCharAt == c14) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z12) {
                            int iA4 = qc1.a(str, ':', i13, iA2);
                            i12 = iA2;
                            String strA = b.a(str, i13, iA4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z13) {
                                strA = androidx.camera.camera2.internal.G.g(new StringBuilder(), this.f389755b, "%40", strA);
                            }
                            this.f389755b = strA;
                            if (iA4 != i12) {
                                this.f389756c = b.a(str, iA4 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z12 = true;
                            }
                            z13 = true;
                        } else {
                            i12 = iA2;
                            this.f389756c += "%40" + b.a(str, i13, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        }
                        i13 = i12 + 1;
                        c17 = '#';
                        c16 = '/';
                        c15 = '\\';
                        c13 = 65535;
                        c14 = '?';
                    }
                }
                int iB3 = C10986a.b(str, i13, iA2);
                int i14 = iB3 + 1;
                if (i14 < iA2) {
                    this.f389757d = wz.a(b.a(str, i13, iB3, false, 4));
                    int iA5 = C10986a.a(str, i14, iA2);
                    this.f389758e = iA5;
                    if (iA5 == -1) {
                        StringBuilder sbA2 = Cif.a("Invalid URL port: \"");
                        sbA2.append(str.substring(i14, iA2));
                        sbA2.append('\"');
                        throw new IllegalArgumentException(sbA2.toString().toString());
                    }
                } else {
                    this.f389757d = wz.a(b.a(str, i13, iB3, false, 4));
                    this.f389758e = b.a(this.f389754a);
                }
                if (this.f389757d == null) {
                    StringBuilder sbA3 = Cif.a("Invalid URL host: \"");
                    sbA3.append(str.substring(i13, iB3));
                    sbA3.append('\"');
                    throw new IllegalArgumentException(sbA3.toString().toString());
                }
                iA3 = iA2;
            }
            int iA6 = qc1.a(iA3, iB2, str, "?#");
            if (iA3 != iA6) {
                char cCharAt2 = str.charAt(iA3);
                if (cCharAt2 != '/' && cCharAt2 != '\\') {
                    ArrayList arrayList = this.f389759f;
                    arrayList.set(arrayList.size() - 1, "");
                } else {
                    this.f389759f.clear();
                    this.f389759f.add("");
                    iA3++;
                }
                int i15 = iA3;
                while (i15 < iA6) {
                    int iA7 = qc1.a(i15, iA6, str, "/\\");
                    boolean z14 = iA7 < iA6;
                    String strA2 = b.a(str, i15, iA7, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 240);
                    if (!kotlin.jvm.internal.L.f(strA2, ".") && !C43066x.C(strA2, "%2e", true)) {
                        if (!kotlin.jvm.internal.L.f(strA2, "..") && !C43066x.C(strA2, "%2e.", true) && !C43066x.C(strA2, ".%2e", true) && !C43066x.C(strA2, "%2e%2e", true)) {
                            if (((CharSequence) androidx.appcompat.app.r.j(1, this.f389759f)).length() == 0) {
                                ArrayList arrayList2 = this.f389759f;
                                arrayList2.set(arrayList2.size() - 1, strA2);
                            } else {
                                this.f389759f.add(strA2);
                            }
                            if (z14) {
                                this.f389759f.add("");
                            }
                        } else if (((String) C22026a.b(1, this.f389759f)).length() == 0 && !this.f389759f.isEmpty()) {
                            ArrayList arrayList3 = this.f389759f;
                            arrayList3.set(arrayList3.size() - 1, "");
                        } else {
                            this.f389759f.add("");
                        }
                    }
                    i15 = z14 ? iA7 + 1 : iA7;
                }
            }
            if (iA6 >= iB2 || str.charAt(iA6) != '?') {
                c12 = '#';
            } else {
                c12 = '#';
                int iA8 = qc1.a(str, '#', iA6, iB2);
                this.f389760g = b.d(b.a(str, iA6 + 1, iA8, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, JfifUtil.MARKER_RST0));
                iA6 = iA8;
            }
            if (iA6 < iB2 && str.charAt(iA6) == c12) {
                this.f389761h = b.a(str, iA6 + 1, iB2, "", true, false, false, true, 176);
            }
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(int i12) {
            this();
        }

        public static void a(@Y61.k ArrayList arrayList, @Y61.k StringBuilder sb2) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i12));
            }
        }

        @X41.n
        @X41.i
        @Y61.k
        public static s10 b(@Y61.k String str) {
            return new a().a(null, str).a();
        }

        @X41.n
        @Y61.l
        @X41.i
        public static s10 c(@Y61.k String str) {
            try {
                return b(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Y61.k
        public static ArrayList d(@Y61.k String str) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            while (i12 <= str.length()) {
                int iH2 = C43066x.H('&', i12, 4, str);
                if (iH2 == -1) {
                    iH2 = str.length();
                }
                int iH3 = C43066x.H('=', i12, 4, str);
                if (iH3 == -1 || iH3 > iH2) {
                    arrayList.add(str.substring(i12, iH2));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i12, iH3));
                    arrayList.add(str.substring(iH3 + 1, iH2));
                }
                i12 = iH2 + 1;
            }
            return arrayList;
        }

        private b() {
        }

        public static void a(@Y61.k List list, @Y61.k StringBuilder sb2) {
            kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, list.size()), 2);
            int i12 = jVarP.f406905b;
            int i13 = jVarP.f406906c;
            int i14 = jVarP.f406907d;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i12);
                String str2 = (String) list.get(i12 + 1);
                if (i12 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i12 == i13) {
                    return;
                } else {
                    i12 += i14;
                }
            }
        }

        public static String a(String str, int i12, int i13, boolean z12, int i14) {
            int i15;
            if ((i14 & 1) != 0) {
                i12 = 0;
            }
            if ((i14 & 2) != 0) {
                i13 = str.length();
            }
            if ((i14 & 4) != 0) {
                z12 = false;
            }
            int iCharCount = i12;
            while (iCharCount < i13) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z12)) {
                    C44802l c44802l = new C44802l();
                    c44802l.N(i12, iCharCount, str);
                    while (iCharCount < i13) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i15 = iCharCount + 2) < i13) {
                            int iA2 = qc1.a(str.charAt(iCharCount + 1));
                            int iA3 = qc1.a(str.charAt(i15));
                            if (iA2 != -1 && iA3 != -1) {
                                c44802l.D((iA2 << 4) + iA3);
                                iCharCount = Character.charCount(iCodePointAt) + i15;
                            } else {
                                c44802l.P(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        } else if (iCodePointAt == 43 && z12) {
                            c44802l.D(32);
                            iCharCount++;
                        } else {
                            c44802l.P(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return c44802l.u();
                }
                iCharCount++;
            }
            return str.substring(i12, i13);
        }

        @X41.n
        public static int a(@Y61.k String str) {
            if (str.equals("http")) {
                return 80;
            }
            return str.equals(Constants.SCHEME) ? 443 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0118 A[LOOP:2: B:97:0x0112->B:99:0x0118, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String a(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.s10.b.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
        }
    }

    static {
        new b(0);
        f389744j = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public s10(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, int i12, @Y61.k ArrayList arrayList, @Y61.l ArrayList arrayList2, @Y61.l String str5, @Y61.k String str6) {
        this.f389745a = str;
        this.f389746b = str2;
        this.f389747c = str3;
        this.f389748d = str4;
        this.f389749e = i12;
        this.f389750f = arrayList2;
        this.f389751g = str5;
        this.f389752h = str6;
        this.f389753i = str.equals(Constants.SCHEME);
    }

    @X41.n
    @Y61.l
    @X41.i
    public static final s10 a(@Y61.k String str) {
        return b.c(str);
    }

    @Y61.l
    public final s10 b(@Y61.k String str) {
        a aVarA;
        try {
            aVarA = new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            aVarA = null;
        }
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }

    @X41.i
    @Y61.k
    public final String c() {
        int iH2 = C43066x.H('/', this.f389745a.length() + 3, 4, this.f389752h);
        String str = this.f389752h;
        return this.f389752h.substring(iH2, qc1.a(iH2, str.length(), str, "?#"));
    }

    @X41.i
    @Y61.k
    public final ArrayList d() {
        int iH2 = C43066x.H('/', this.f389745a.length() + 3, 4, this.f389752h);
        String str = this.f389752h;
        int iA2 = qc1.a(iH2, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iH2 < iA2) {
            int i12 = iH2 + 1;
            int iA3 = qc1.a(this.f389752h, '/', i12, iA2);
            arrayList.add(this.f389752h.substring(i12, iA3));
            iH2 = iA3;
        }
        return arrayList;
    }

    @Y61.l
    @X41.i
    public final String e() {
        if (this.f389750f == null) {
            return null;
        }
        int iH2 = C43066x.H('?', 0, 6, this.f389752h) + 1;
        String str = this.f389752h;
        return this.f389752h.substring(iH2, qc1.a(str, '#', iH2, str.length()));
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof s10) && kotlin.jvm.internal.L.f(((s10) obj).f389752h, this.f389752h);
    }

    @X41.i
    @Y61.k
    public final String f() {
        if (this.f389746b.length() == 0) {
            return "";
        }
        int length = this.f389745a.length() + 3;
        String str = this.f389752h;
        return this.f389752h.substring(length, qc1.a(length, str.length(), str, ":@"));
    }

    @X41.i
    @Y61.k
    public final String g() {
        return this.f389748d;
    }

    public final boolean h() {
        return this.f389753i;
    }

    public final int hashCode() {
        return this.f389752h.hashCode();
    }

    @X41.i
    public final int i() {
        return this.f389749e;
    }

    @Y61.l
    @X41.i
    public final String j() {
        if (this.f389750f == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        b.a(this.f389750f, sb2);
        return sb2.toString();
    }

    @Y61.k
    public final String k() {
        a aVarA;
        try {
            aVarA = new a().a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVarA = null;
        }
        return aVarA.e().c().a().f389752h;
    }

    @X41.i
    @Y61.k
    public final String l() {
        return this.f389745a;
    }

    @X41.i
    @Y61.k
    public final URI m() {
        a aVar = new a();
        aVar.h(this.f389745a);
        aVar.f(f());
        aVar.e(b());
        aVar.g(this.f389748d);
        aVar.b(this.f389749e != b.a(this.f389745a) ? this.f389749e : -1);
        aVar.b().clear();
        aVar.b().addAll(d());
        aVar.a(e());
        aVar.d(this.f389751g == null ? null : this.f389752h.substring(C43066x.H('#', 0, 6, this.f389752h) + 1));
        String string = aVar.d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e12) {
            try {
                return URI.create(new C43059p("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f(string, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e12);
            }
        }
    }

    @X41.i
    @Y61.k
    public final URL n() {
        try {
            return new URL(this.f389752h);
        } catch (MalformedURLException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Y61.k
    public final String toString() {
        return this.f389752h;
    }

    @X41.i
    @Y61.k
    public final String b() {
        if (this.f389747c.length() == 0) {
            return "";
        }
        return this.f389752h.substring(C43066x.H(':', this.f389745a.length() + 3, 4, this.f389752h) + 1, C43066x.H('@', 0, 6, this.f389752h));
    }
}
