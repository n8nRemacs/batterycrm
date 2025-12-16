package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dt {
    public static final oub t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public final aub i;
    public final String j;
    public final pub k;
    public pub l;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int m = 0;
    public final StringBuilder n = new StringBuilder();
    public boolean o = false;
    public String p = "";
    public final StringBuilder q = new StringBuilder();
    public final ArrayList r = new ArrayList();
    public final ao6 s = new ao6(64);

    static {
        oub oubVar = new oub();
        oubVar.S0 = "<ignored>";
        oubVar.U0 = "NA";
        t = oubVar;
        u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        v = Pattern.compile("[- ]");
        w = Pattern.compile("\u2008");
    }

    public dt(aub aubVar, String str) {
        this.i = aubVar;
        this.j = str;
        pub pubVarH = aubVar.h(aubVar.l(aubVar.e(str)));
        pubVarH = pubVarH == null ? t : pubVarH;
        this.l = pubVarH;
        this.k = pubVarH;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String string = sb.toString();
        for (nub nubVar : (this.g && this.p.length() == 0 && this.l.h1.size() > 0) ? this.l.h1 : this.l.g1) {
            if (this.p.length() > 0) {
                String str = nubVar.o;
                if ((str.length() == 0 || aub.x.matcher(str).matches()) && !nubVar.X && !nubVar.Y) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String str2 = nubVar.o;
                if (str2.length() == 0 || aub.x.matcher(str2).matches() || nubVar.X) {
                }
            }
            if (u.matcher(nubVar.b).matches()) {
                this.r.add(nubVar);
            }
        }
        k(string);
        String strE = e();
        return strE.length() > 0 ? strE : j() ? g() : this.c.toString();
    }

    public final boolean c() {
        StringBuilder sb;
        aub aubVar;
        int iC;
        StringBuilder sb2 = this.q;
        if (sb2.length() == 0 || (iC = (aubVar = this.i).c(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String strL = aubVar.l(iC);
        if ("001".equals(strL)) {
            this.l = aubVar.g(iC);
        } else if (!strL.equals(this.j)) {
            pub pubVarH = aubVar.h(aubVar.l(aubVar.e(strL)));
            if (pubVarH == null) {
                pubVarH = t;
            }
            this.l = pubVarH;
        }
        String string = Integer.toString(iC);
        StringBuilder sb3 = this.n;
        sb3.append(string);
        sb3.append(' ');
        this.p = "";
        return true;
    }

    public final boolean d() {
        Pattern patternK = this.s.k("\\+|" + this.l.U0);
        StringBuilder sb = this.d;
        Matcher matcher = patternK.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int iEnd = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            nub nubVar = (nub) it.next();
            Matcher matcher = this.s.k(nubVar.a).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(nubVar.o).find();
                String strA = a(matcher.replaceAll(nubVar.b));
                if (aub.t(strA, aub.i).contentEquals(this.d)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final void f() {
        this.c.setLength(0);
        this.d.setLength(0);
        this.a.setLength(0);
        this.m = 0;
        this.b = "";
        this.n.setLength(0);
        this.p = "";
        this.q.setLength(0);
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.r.clear();
        this.o = false;
        if (this.l.equals(this.k)) {
            return;
        }
        aub aubVar = this.i;
        pub pubVarH = aubVar.h(aubVar.l(aubVar.e(this.j)));
        if (pubVarH == null) {
            pubVarH = t;
        }
        this.l = pubVarH;
    }

    public final String g() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String strI = "";
        for (int i = 0; i < length; i++) {
            strI = i(sb.charAt(i));
        }
        return this.e ? a(strI) : this.c.toString();
    }

    public final String h(char c) {
        StringBuilder sb = this.c;
        sb.append(c);
        boolean zIsDigit = Character.isDigit(c);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (!zIsDigit && (sb.length() != 1 || !aub.l.matcher(Character.toString(c)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.e;
        StringBuilder sb4 = this.n;
        if (!z) {
            if (this.f) {
                return sb.toString();
            }
            if (!d()) {
                if (this.p.length() > 0) {
                    sb3.insert(0, this.p);
                    sb4.setLength(sb4.lastIndexOf(this.p));
                }
                if (!this.p.equals(l())) {
                    sb4.append(' ');
                    this.e = true;
                    this.h = false;
                    this.r.clear();
                    this.m = 0;
                    this.a.setLength(0);
                    this.b = "";
                    return b();
                }
            } else if (c()) {
                this.e = true;
                this.h = false;
                this.r.clear();
                this.m = 0;
                this.a.setLength(0);
                this.b = "";
                return b();
            }
            return sb.toString();
        }
        int length = sb2.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.p = l();
                return b();
            }
            this.h = true;
        }
        if (this.h) {
            if (c()) {
                this.h = false;
            }
            return ((Object) sb4) + sb3.toString();
        }
        if (this.r.size() <= 0) {
            return b();
        }
        String strI = i(c);
        String strE = e();
        if (strE.length() > 0) {
            return strE;
        }
        k(sb3.toString());
        return j() ? g() : this.e ? a(strI) : sb.toString();
    }

    public final String i(char c) {
        Pattern pattern = w;
        StringBuilder sb = this.a;
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.m)) {
            if (this.r.size() == 1) {
                this.e = false;
            }
            this.b = "";
            return this.c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.m = iStart;
        return sb.substring(0, iStart + 1);
    }

    public final boolean j() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            nub nubVar = (nub) it.next();
            String str = nubVar.a;
            if (this.b.equals(str)) {
                return false;
            }
            String str2 = nubVar.a;
            StringBuilder sb = this.a;
            sb.setLength(0);
            String str3 = nubVar.b;
            Matcher matcher = this.s.k(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.q.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.b = str;
                this.o = v.matcher(nubVar.o).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void k(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            nub nubVar = (nub) it.next();
            if (nubVar.c.size() != 0) {
                if (!this.s.k((String) nubVar.c.get(Math.min(length, nubVar.c.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l() {
        /*
            r7 = this;
            pub r0 = r7.l
            int r0 = r0.T0
            java.lang.StringBuilder r1 = r7.n
            r2 = 0
            java.lang.StringBuilder r3 = r7.q
            r4 = 1
            if (r0 != r4) goto L2d
            char r0 = r3.charAt(r2)
            r5 = 49
            if (r0 != r5) goto L2d
            char r0 = r3.charAt(r4)
            r6 = 48
            if (r0 == r6) goto L2d
            char r0 = r3.charAt(r4)
            if (r0 == r5) goto L2d
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r7.g = r4
            goto L5a
        L2d:
            pub r0 = r7.l
            boolean r5 = r0.b1
            if (r5 == 0) goto L59
            ao6 r5 = r7.s
            java.lang.String r0 = r0.c1
            java.util.regex.Pattern r0 = r5.k(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.lookingAt()
            if (r5 == 0) goto L59
            int r5 = r0.end()
            if (r5 <= 0) goto L59
            r7.g = r4
            int r4 = r0.end()
            java.lang.String r0 = r3.substring(r2, r4)
            r1.append(r0)
            goto L5a
        L59:
            r4 = r2
        L5a:
            java.lang.String r0 = r3.substring(r2, r4)
            r3.delete(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.l():java.lang.String");
    }
}
