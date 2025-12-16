package org.commonmark.internal;

import Q61.A;
import Q61.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: InlineParserImpl.java */
/* loaded from: classes7.dex */
public class n implements org.commonmark.parser.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f420310i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f420311j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f420312k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f420313l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f420314m = Pattern.compile("`+");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f420315n = Pattern.compile("^`+");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f420316o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f420317p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f420318q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f420319r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f420320s = Pattern.compile("\\s+");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f420321t = Pattern.compile(" *$");

    /* renamed from: a, reason: collision with root package name */
    public final BitSet f420322a;

    /* renamed from: b, reason: collision with root package name */
    public final BitSet f420323b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f420324c;

    /* renamed from: d, reason: collision with root package name */
    public final m f420325d;

    /* renamed from: e, reason: collision with root package name */
    public String f420326e;

    /* renamed from: f, reason: collision with root package name */
    public int f420327f;

    /* renamed from: g, reason: collision with root package name */
    public f f420328g;

    /* renamed from: h, reason: collision with root package name */
    public e f420329h;

    /* compiled from: InlineParserImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f420330a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f420331b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f420332c;

        public a(int i12, boolean z12, boolean z13) {
            this.f420330a = i12;
            this.f420332c = z12;
            this.f420331b = z13;
        }
    }

    public n(m mVar) {
        ArrayList arrayList = mVar.f420308a;
        HashMap map = new HashMap();
        c(map, Arrays.asList(new N61.a(), new N61.c()));
        c(map, arrayList);
        this.f420324c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f420323b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f420322a = bitSet2;
        this.f420325d = mVar;
    }

    public static void b(char c12, S61.a aVar, HashMap map) {
        if (((S61.a) map.put(Character.valueOf(c12), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c12 + "'");
    }

    public static void c(HashMap map, List list) {
        s sVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S61.a aVar = (S61.a) it.next();
            char c12 = aVar.c();
            char cA2 = aVar.a();
            if (c12 == cA2) {
                S61.a aVar2 = (S61.a) map.get(Character.valueOf(c12));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    b(c12, aVar, map);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(c12);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    map.put(Character.valueOf(c12), sVar);
                }
            } else {
                b(c12, aVar, map);
                b(cA2, aVar, map);
            }
        }
    }

    public static void e(A a12, A a13, int i12) {
        if (a12 == null || a13 == null || a12 == a13) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i12);
        sb2.append(a12.f13480f);
        v vVar = a12.f13504e;
        v vVar2 = a13.f13504e;
        while (vVar != vVar2) {
            sb2.append(((A) vVar).f13480f);
            v vVar3 = vVar.f13504e;
            vVar.f();
            vVar = vVar3;
        }
        a12.f13480f = sb2.toString();
    }

    public static void f(v vVar, v vVar2) {
        A a12 = null;
        A a13 = null;
        int length = 0;
        while (vVar != null) {
            if (vVar instanceof A) {
                a13 = (A) vVar;
                if (a12 == null) {
                    a12 = a13;
                }
                length = a13.f13480f.length() + length;
            } else {
                e(a12, a13, length);
                a12 = null;
                a13 = null;
                length = 0;
            }
            if (vVar == vVar2) {
                break;
            } else {
                vVar = vVar.f13504e;
            }
        }
        e(a12, a13, length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01eb A[PHI: r5
  0x01eb: PHI (r5v35 char) = (r5v34 char), (r5v36 char), (r5v37 char) binds: [B:112:0x01e0, B:114:0x01e4, B:117:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04f5 A[LOOP:0: B:3:0x0014->B:266:0x04f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    /* JADX WARN: Type inference failed for: r3v12, types: [Q61.y] */
    /* JADX WARN: Type inference failed for: r3v13, types: [Q61.l] */
    /* JADX WARN: Type inference failed for: r3v59, types: [Q61.l] */
    /* JADX WARN: Type inference failed for: r3v6, types: [Q61.y] */
    /* JADX WARN: Type inference failed for: r4v15, types: [Q61.r, Q61.v] */
    /* JADX WARN: Type inference failed for: r4v16, types: [Q61.o] */
    /* JADX WARN: Type inference failed for: r4v18, types: [Q61.r, Q61.v] */
    /* JADX WARN: Type inference failed for: r5v15, types: [Q61.e] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r6v17, types: [Q61.r] */
    /* JADX WARN: Type inference failed for: r6v19, types: [Q61.p, Q61.v] */
    /* JADX WARN: Type inference failed for: r6v30, types: [org.commonmark.internal.n$a] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // org.commonmark.parser.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(Q61.v r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.n.a(Q61.v, java.lang.String):void");
    }

    public final String d(Pattern pattern) {
        if (this.f420327f >= this.f420326e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f420326e);
        matcher.region(this.f420327f, this.f420326e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f420327f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f420327f < this.f420326e.length()) {
            return this.f420326e.charAt(this.f420327f);
        }
        return (char) 0;
    }

    public final void h(f fVar) {
        boolean z12;
        v vVar;
        HashMap map = new HashMap();
        f fVar2 = this.f420328g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f420273e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            HashMap map2 = this.f420324c;
            char c12 = fVar2.f420270b;
            S61.a aVar = (S61.a) map2.get(Character.valueOf(c12));
            if (!fVar2.f420272d || aVar == null) {
                fVar2 = fVar2.f420274f;
            } else {
                char c13 = aVar.c();
                f fVar4 = fVar2.f420273e;
                int iD2 = 0;
                boolean z13 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != map.get(Character.valueOf(c12))) {
                    if (fVar4.f420271c && fVar4.f420270b == c13) {
                        iD2 = aVar.d(fVar4, fVar2);
                        z13 = true;
                        if (iD2 > 0) {
                            z12 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f420273e;
                }
                z12 = z13;
                z13 = false;
                if (z13) {
                    A a12 = fVar4.f420269a;
                    fVar4.f420275g -= iD2;
                    fVar2.f420275g -= iD2;
                    a12.f13480f = androidx.compose.ui.graphics.colorspace.e.h(iD2, 0, a12.f13480f);
                    A a13 = fVar2.f420269a;
                    a13.f13480f = androidx.compose.ui.graphics.colorspace.e.h(iD2, 0, a13.f13480f);
                    f fVar5 = fVar2.f420273e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        f fVar6 = fVar5.f420273e;
                        i(fVar5);
                        fVar5 = fVar6;
                    }
                    if (a12 != a13 && (vVar = a12.f13504e) != a13) {
                        f(vVar, a13.f13503d);
                    }
                    aVar.e(a12, a13, iD2);
                    if (fVar4.f420275g == 0) {
                        fVar4.f420269a.f();
                        i(fVar4);
                    }
                    if (fVar2.f420275g == 0) {
                        f fVar7 = fVar2.f420274f;
                        a13.f();
                        i(fVar2);
                        fVar2 = fVar7;
                    }
                } else {
                    if (!z12) {
                        map.put(Character.valueOf(c12), fVar2.f420273e);
                        if (!fVar2.f420271c) {
                            i(fVar2);
                        }
                    }
                    fVar2 = fVar2.f420274f;
                }
            }
        }
        while (true) {
            f fVar8 = this.f420328g;
            if (fVar8 == null || fVar8 == fVar) {
                return;
            } else {
                i(fVar8);
            }
        }
    }

    public final void i(f fVar) {
        f fVar2 = fVar.f420273e;
        if (fVar2 != null) {
            fVar2.f420274f = fVar.f420274f;
        }
        f fVar3 = fVar.f420274f;
        if (fVar3 == null) {
            this.f420328g = fVar2;
        } else {
            fVar3.f420273e = fVar2;
        }
    }
}
