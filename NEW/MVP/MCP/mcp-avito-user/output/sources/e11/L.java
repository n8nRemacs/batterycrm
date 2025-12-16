package e11;

import android.text.TextUtils;
import android.util.Xml;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.framework.common.ContainerUtils;
import e11.D0;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes7.dex */
public class L<T extends D0> {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f394386l = {"video/mp4", "application/vnd.apple.mpegurl", "application/x-mpegurl"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f394387m = {"AdVerifications", "linkTxt"};

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39901r0 f394388a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39882k1 f394389b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ArrayList<X1> f394390c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ArrayList<C39865f> f394391d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final ArrayList<n2> f394392e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final ArrayList<X1> f394393f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final ArrayList<C39913v0<T>> f394394g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f394395h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public String f394396i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public C39882k1 f394397j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public C1 f394398k;

    public L(@j.N C39901r0 c39901r0, @j.N C39882k1 c39882k1) {
        this.f394388a = c39901r0;
        this.f394389b = c39882k1;
        this.f394398k = c39882k1.f394641J;
    }

    @j.N
    public static String a(@j.N String str) {
        return str.replaceAll("&amp;", ContainerUtils.FIELD_DELIMITER).replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    @j.k0
    public static float d(@j.N String str) {
        long j12;
        try {
            if (str.contains(".")) {
                int iIndexOf = str.indexOf(".");
                j12 = Long.parseLong(str.substring(iIndexOf + 1));
                if (j12 > 1000) {
                    return -1.0f;
                }
                str = str.substring(0, iIndexOf);
            } else {
                j12 = 0;
            }
            String[] strArrSplit = str.split(":", 3);
            long j13 = Integer.parseInt(strArrSplit[0]);
            long j14 = Integer.parseInt(strArrSplit[1]);
            long j15 = Integer.parseInt(strArrSplit[2]);
            if (j13 >= 24 || j14 >= 60 || j15 >= 60) {
                return -1.0f;
            }
            return ((j13 * 3600000) + ((j14 * 60000) + ((j15 * 1000) + j12))) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public static int i(@j.N XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th2) {
            th2.getMessage();
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
    }

    public static int j(@j.N XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th2) {
            th2.getMessage();
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
    }

    @j.N
    public static String k(@j.N XmlPullParser xmlPullParser) {
        int next;
        String text;
        try {
            next = xmlPullParser.next();
        } catch (Throwable th2) {
            th2.getMessage();
            next = BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (next == 4) {
            text = xmlPullParser.getText();
            j(xmlPullParser);
        } else {
            xmlPullParser.getName();
            text = "";
        }
        return text.trim();
    }

    public static void l(@j.N XmlPullParser xmlPullParser) {
        int next;
        if (i(xmlPullParser) != 2) {
            return;
        }
        int i12 = 1;
        while (i12 != 0) {
            try {
                next = xmlPullParser.next();
            } catch (Throwable th2) {
                th2.getMessage();
                next = BeduinInputModel.MIN_TEXT_VERSION;
            }
            if (next == 2) {
                i12++;
            } else if (next == 3) {
                i12--;
            }
        }
    }

    public final void b(float f12, @j.N String str, @j.P AbstractC39895p abstractC39895p) {
        C39865f c39865f = new C39865f("playheadReachedValue", str);
        c39865f.f394592d = -1.0f;
        c39865f.f394593e = -1.0f;
        if (abstractC39895p != null) {
            float f13 = abstractC39895p.f394724w;
            if (f13 > 0.0f) {
                c39865f.f394592d = (f12 / 100.0f) * f13;
                abstractC39895p.f394702a.b(c39865f);
                return;
            }
        }
        c39865f.f394593e = f12;
        this.f394391d.add(c39865f);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@j.N org.xmlpull.v1.XmlPullParser r7, @j.P e11.AbstractC39895p r8) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.L.c(org.xmlpull.v1.XmlPullParser, e11.p):void");
    }

    public final void e(@j.N XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (i(xmlPullParser) == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
                    String strK = null;
                    String strK2 = null;
                    while (j(xmlPullParser) == 2) {
                        if (i(xmlPullParser) == 2) {
                            String name = xmlPullParser.getName();
                            if ("JavaScriptResource".equals(name)) {
                                strK = k(xmlPullParser);
                            } else if ("VerificationParameters".equals(name)) {
                                strK2 = k(xmlPullParser);
                            } else {
                                l(xmlPullParser);
                            }
                        }
                    }
                    if (strK != null) {
                        if (this.f394398k == null) {
                            this.f394398k = new C1(null, null);
                        }
                        this.f394398k.f394295c.add((TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(strK2)) ? new U(strK, null, null) : new U(strK, attributeValue, strK2));
                    }
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void f(@j.N String str) {
        e2 e2Var;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            boolean z12 = false;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            C39882k1 c39882k1 = this.f394389b;
            ArrayList arrayList = c39882k1.f394648f != null ? new ArrayList(c39882k1.f394648f) : null;
            ArrayList<X1> arrayList2 = this.f394390c;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            ArrayList<n2> arrayList3 = c39882k1.f394649g;
            ArrayList<n2> arrayList4 = this.f394392e;
            if (arrayList3 != null) {
                arrayList4.addAll(arrayList3);
            }
            int i12 = i(xmlPullParserNewPullParser);
            while (true) {
                boolean z13 = true;
                if (i12 == 1 || i12 == Integer.MIN_VALUE) {
                    return;
                }
                int i13 = 2;
                if (i12 == 2 && "VAST".equalsIgnoreCase(xmlPullParserNewPullParser.getName())) {
                    while (j(xmlPullParserNewPullParser) == i13) {
                        if (i(xmlPullParserNewPullParser) == i13 && "Ad".equals(xmlPullParserNewPullParser.getName())) {
                            while (j(xmlPullParserNewPullParser) == i13) {
                                if (i(xmlPullParserNewPullParser) == i13) {
                                    String name = xmlPullParserNewPullParser.getName();
                                    boolean zEquals = "Wrapper".equals(name);
                                    ArrayList<C39865f> arrayList5 = this.f394391d;
                                    ArrayList<X1> arrayList6 = this.f394393f;
                                    e2 e2Var2 = c39882k1.f394647e;
                                    if (zEquals) {
                                        this.f394395h = z13;
                                        int i14 = c39882k1.f394654l;
                                        if (i14 < 5) {
                                            String strK = null;
                                            while (true) {
                                                e2Var = e2Var2;
                                                if (j(xmlPullParserNewPullParser) != 2) {
                                                    break;
                                                }
                                                if (i(xmlPullParserNewPullParser) == 2) {
                                                    String name2 = xmlPullParserNewPullParser.getName();
                                                    if ("Impression".equals(name2)) {
                                                        String strK2 = k(xmlPullParserNewPullParser);
                                                        if (!TextUtils.isEmpty(strK2)) {
                                                            arrayList2.add(new X1("playbackStarted", strK2));
                                                        }
                                                    } else if ("Creatives".equals(name2)) {
                                                        g(xmlPullParserNewPullParser);
                                                    } else if ("Extensions".equals(name2)) {
                                                        h(xmlPullParserNewPullParser);
                                                    } else if ("VASTAdTagURI".equals(name2)) {
                                                        strK = k(xmlPullParserNewPullParser);
                                                    } else if ("AdVerifications".equals(name2)) {
                                                        e(xmlPullParserNewPullParser);
                                                    } else {
                                                        l(xmlPullParserNewPullParser);
                                                    }
                                                }
                                                e2Var2 = e2Var;
                                            }
                                            if (strK != null) {
                                                String str2 = c39882k1.f394652j;
                                                C39882k1 c39882k12 = new C39882k1(strK, null);
                                                this.f394397j = c39882k12;
                                                c39882k12.f394654l = i14 + 1;
                                                c39882k12.f394648f = arrayList2;
                                                c39882k12.f394641J = this.f394398k;
                                                if (TextUtils.isEmpty(str2)) {
                                                    str2 = this.f394396i;
                                                }
                                                c39882k12.f394652j = str2;
                                                C39882k1 c39882k13 = this.f394397j;
                                                c39882k13.f394649g = arrayList4;
                                                c39882k13.f394666x = c39882k1.f394666x;
                                                c39882k13.f394667y = c39882k1.f394667y;
                                                c39882k13.f394668z = c39882k1.f394668z;
                                                c39882k13.f394632A = c39882k1.f394632A;
                                                c39882k13.f394633B = c39882k1.f394633B;
                                                c39882k13.f394634C = c39882k1.f394634C;
                                                c39882k13.f394635D = c39882k1.f394635D;
                                                c39882k13.f394665w = c39882k1.f394665w;
                                                c39882k13.f394636E = c39882k1.f394636E;
                                                c39882k13.f394642K = c39882k1.f394642K;
                                                c39882k13.f394653k = c39882k1.f394653k;
                                                e2 e2Var3 = c39882k13.f394647e;
                                                e2Var3.d(arrayList6);
                                                e2Var3.f394586b.addAll(arrayList5);
                                                e2Var3.c(e2Var, -1.0f);
                                                c39882k1.f394645c.add(this.f394397j);
                                            }
                                        } else {
                                            l(xmlPullParserNewPullParser);
                                        }
                                        z12 = false;
                                    } else {
                                        if ("InLine".equals(name)) {
                                            this.f394395h = false;
                                            while (j(xmlPullParserNewPullParser) == 2) {
                                                if (i(xmlPullParserNewPullParser) == 2) {
                                                    String name3 = xmlPullParserNewPullParser.getName();
                                                    if ("Impression".equals(name3)) {
                                                        String strK3 = k(xmlPullParserNewPullParser);
                                                        if (!TextUtils.isEmpty(strK3)) {
                                                            arrayList2.add(new X1("playbackStarted", strK3));
                                                        }
                                                    } else if ("Creatives".equals(name3)) {
                                                        g(xmlPullParserNewPullParser);
                                                    } else if ("Extensions".equals(name3)) {
                                                        h(xmlPullParserNewPullParser);
                                                    } else if ("AdVerifications".equals(name3)) {
                                                        e(xmlPullParserNewPullParser);
                                                    } else {
                                                        l(xmlPullParserNewPullParser);
                                                    }
                                                }
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                ArrayList<C39913v0<T>> arrayList7 = this.f394394g;
                                                if (i15 >= arrayList7.size()) {
                                                    break;
                                                }
                                                C39913v0<T> c39913v0 = arrayList7.get(i15);
                                                e2 e2Var4 = c39913v0.f394702a;
                                                e2Var4.c(e2Var2, c39913v0.f394724w);
                                                String str3 = c39882k1.f394652j;
                                                if (TextUtils.isEmpty(str3)) {
                                                    str3 = this.f394396i;
                                                }
                                                c39913v0.f394705d = str3;
                                                Iterator<C39865f> it = arrayList5.iterator();
                                                while (it.hasNext()) {
                                                    C39865f next = it.next();
                                                    b(next.f394593e, next.f394507b, c39913v0);
                                                }
                                                e2Var4.d(arrayList6);
                                                Iterator<n2> it2 = arrayList4.iterator();
                                                while (it2.hasNext()) {
                                                    c39913v0.f394854H.add(it2.next());
                                                }
                                                if (i15 == 0) {
                                                    e2Var4.d(arrayList2);
                                                }
                                                c39913v0.f394699E = this.f394398k;
                                                i15++;
                                            }
                                        } else {
                                            l(xmlPullParserNewPullParser);
                                        }
                                        z12 = false;
                                    }
                                    z13 = true;
                                    i13 = 2;
                                }
                            }
                        }
                    }
                }
                boolean z14 = z12;
                try {
                    i12 = xmlPullParserNewPullParser.next();
                } catch (Throwable th2) {
                    th2.getMessage();
                    i12 = BeduinInputModel.MIN_TEXT_VERSION;
                }
                z12 = z14;
            }
        } catch (Throwable th3) {
            th3.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f2 A[EDGE_INSN: B:354:0x01f2->B:126:0x01f2 BREAK  A[LOOP:7: B:105:0x01be->B:124:0x01eb], PHI: r22 r23
  0x01f2: PHI (r22v6 java.lang.String) = (r22v5 java.lang.String), (r22v8 java.lang.String), (r22v8 java.lang.String), (r22v8 java.lang.String) binds: [B:125:0x01ee, B:354:0x01f2, B:121:0x01e1, B:122:0x01e3] A[DONT_GENERATE, DONT_INLINE]
  0x01f2: PHI (r23v4 java.lang.String) = (r23v3 java.lang.String), (r23v6 java.lang.String), (r23v6 java.lang.String), (r23v6 java.lang.String) binds: [B:125:0x01ee, B:354:0x01f2, B:121:0x01e1, B:122:0x01e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@j.N org.xmlpull.v1.XmlPullParser r25) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.L.g(org.xmlpull.v1.XmlPullParser):void");
    }

    public final void h(@j.N XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (i(xmlPullParser) == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (attributeValue != null && Arrays.binarySearch(f394387m, attributeValue) >= 0) {
                        if ("linkTxt".equals(attributeValue)) {
                            this.f394396i = F.a(k(xmlPullParser));
                        } else {
                            while (j(xmlPullParser) == 2) {
                                if (i(xmlPullParser) == 2) {
                                    if ("AdVerifications".equals(xmlPullParser.getName())) {
                                        e(xmlPullParser);
                                    } else {
                                        l(xmlPullParser);
                                    }
                                }
                            }
                        }
                    }
                    l(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }
}
