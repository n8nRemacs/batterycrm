package defpackage;

import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class pb2 implements Comparable {
    public final qy2 A0;
    public final long X;
    public volatile String Z;
    public final long a;
    public final rf2 b;
    public final eh9 c;
    public final eh9 d;
    public final eh9 o;
    public volatile CharSequence s0;
    public volatile CharSequence t0;
    public volatile CharSequence u0;
    public volatile CharSequence w0;
    public volatile x8d x0;
    public volatile String y0;
    public final w0b z0;
    public final ArrayList Y = new ArrayList();
    public final AtomicReference v0 = new AtomicReference(null);
    public kmb B0 = null;

    public pb2(w0b w0bVar, qy2 qy2Var, long j, long j2, rf2 rf2Var, eh9 eh9Var, eh9 eh9Var2, eh9 eh9Var3) {
        this.z0 = w0bVar;
        this.A0 = qy2Var;
        this.a = j;
        this.X = j2;
        this.b = rf2Var;
        this.c = eh9Var;
        this.d = eh9Var2;
        this.o = eh9Var3;
    }

    public final boolean A() {
        return i0() || ppi.d(g(this.X), 1);
    }

    public final boolean B() {
        return i0() || ppi.d(g(this.X), 256);
    }

    public final boolean C() {
        if (!G() || M()) {
            return false;
        }
        ff2 ff2Var = this.b.H;
        if (ff2Var == null || !ff2Var.i) {
            return ppi.d(g(this.X), 128);
        }
        return true;
    }

    public final boolean D() {
        if (!y()) {
            return false;
        }
        rf2 rf2Var = this.b;
        boolean zF = rf2Var.f();
        eh9 eh9Var = this.d;
        if (zF && rf2Var.g0 != 0 && eh9Var == null) {
            return true;
        }
        if (eh9Var != null) {
            return eh9Var.a.x(this.X);
        }
        return false;
    }

    public final boolean E() {
        eh9 eh9Var;
        sk9 sk9Var;
        eh9 eh9Var2;
        ku3 ku3Var;
        if (D()) {
            return true;
        }
        if (!y() || (eh9Var = this.d) == null) {
            return false;
        }
        long j = eh9Var.a.o;
        long j2 = this.X;
        return (j == j2 || (sk9Var = eh9Var.c) == null || (eh9Var2 = sk9Var.c) == null || (ku3Var = eh9Var2.b) == null || ku3Var.p() != j2) ? false : true;
    }

    public final boolean F() {
        rf2 rf2Var = this.b;
        return rf2Var != null && rf2Var.c == of2.a;
    }

    public final boolean G() {
        return F() && j0();
    }

    public final boolean H(long j) {
        return this.b.R.containsKey(Long.valueOf(j));
    }

    public final boolean I() {
        lf2 lf2Var;
        rf2 rf2Var = this.b;
        return (rf2Var == null || (lf2Var = rf2Var.K) == null || !lf2Var.c) ? false : true;
    }

    public final boolean J() {
        boolean z;
        synchronized (this.Y) {
            try {
                z = false;
                if (Q() && !this.Y.isEmpty() && ((ku3) this.Y.get(0)).u()) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final boolean K() {
        ku3 ku3VarN = n();
        return Q() && ku3VarN != null && ku3VarN.v();
    }

    public final boolean L() {
        return K() && this.b.J.j(128);
    }

    public final boolean M() {
        return this.b.b == pf2.c;
    }

    public final boolean N() {
        return this.b.b == pf2.b;
    }

    public final boolean O() {
        return t() != null && t().f == 2;
    }

    public final boolean P() {
        return this.b.c == of2.X;
    }

    public final boolean Q() {
        return this.b.b == pf2.a;
    }

    public final boolean R() {
        return this.b.a().e != 0;
    }

    public final boolean S(pb3 pb3Var, sxg sxgVar) {
        if (Z(pb3Var)) {
            return true;
        }
        return (Q() ? sxgVar.m() : sxgVar.k()) == 1;
    }

    public final boolean T() {
        ff2 ff2Var;
        boolean zG = G();
        rf2 rf2Var = this.b;
        return ((zG && !M()) ? (!i0() && ((ff2Var = rf2Var.H) == null || ff2Var.f)) ? ppi.d(g(this.X), 64) : true : false) && rf2Var.c() > 0;
    }

    public final boolean U() {
        return this.b.b == pf2.d;
    }

    public final boolean V() {
        rf2 rf2Var = this.b;
        return rf2Var != null && rf2Var.c == of2.Y;
    }

    public final boolean W() {
        return N() && f0() && F() && !j0();
    }

    public final boolean X() {
        return !Q() && this.b.c == of2.b;
    }

    public final boolean Y() {
        boolean zU;
        if (this.b.J.j(64)) {
            return false;
        }
        if (!Q()) {
            return M() ? B() : F() && j0();
        }
        if (K()) {
            zU = l0();
        } else {
            ku3 ku3VarN = n();
            if (ku3VarN == null) {
                return false;
            }
            zU = ku3VarN.u();
        }
        return !zU;
    }

    public final boolean Z(pb3 pb3Var) {
        rf2 rf2Var = this.b;
        return rf2Var.a().a == -1 || rf2Var.a().a > ((w4e) pb3Var).j();
    }

    public final boolean a() {
        ff2 ff2Var;
        if (O() || Q() || !G()) {
            return false;
        }
        rf2 rf2Var = this.b;
        if (rf2Var.J.j(2)) {
            return false;
        }
        if (i0()) {
            return true;
        }
        boolean zW = w();
        if (M() || (ff2Var = rf2Var.H) == null || ff2Var.b) {
            return zW;
        }
        return true;
    }

    public final boolean a0() {
        if (K()) {
            return l0() || this.c == null || this.b.a == 0;
        }
        return false;
    }

    public final boolean b0() {
        return this.b.H.c;
    }

    public final boolean c() {
        return M() && f0() && !h0();
    }

    public final boolean c0(rt5 rt5Var) {
        gu5 gu5Var = (gu5) rt5Var;
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f116officialbotnamingenabled, false)) {
            ku3 ku3VarN = n();
            if (K() && ((b0() || (ku3VarN != null && ku3VarN.x())) && !k0())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return pmi.a(((pb2) obj).q(), q());
    }

    public final boolean d() {
        if (!i0()) {
            return false;
        }
        if (!M()) {
            rf2 rf2Var = this.b;
            if (l8g.c(rf2Var.I) && rf2Var.c() <= 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean d0(long j) {
        return j == this.b.d && F();
    }

    public final Long e(long j) {
        if (F() && H(j)) {
            return Long.valueOf(((ze2) this.b.R.get(Long.valueOf(j))).c);
        }
        return null;
    }

    public final boolean e0() {
        return this.b.o0 == 2;
    }

    public final boolean f0() {
        return this.b.o0 == 1;
    }

    public final int g(long j) {
        if (!F()) {
            return 0;
        }
        rf2 rf2Var = this.b;
        long j2 = rf2Var.d;
        us usVar = rf2Var.R;
        if (j == j2) {
            return 4095;
        }
        if (usVar.containsKey(Long.valueOf(j))) {
            return ((ze2) usVar.get(Long.valueOf(j))).b;
        }
        return 0;
    }

    public final boolean g0() {
        return F() && H(this.X);
    }

    public final long h() {
        rf2 rf2Var = this.b;
        if (rf2Var.e(this.X)) {
            return 0L;
        }
        ku3 ku3VarN = n();
        return ku3VarN != null ? ku3VarN.p() : rf2Var.a;
    }

    public final boolean h0() {
        return g0() || this.b.e.containsKey(Long.valueOf(this.X));
    }

    public final String i(il0 il0Var, hl0 hl0Var) {
        rf2 rf2Var = this.b;
        w0b w0bVar = this.z0;
        if (w0bVar != null) {
            String str = rf2Var.e(((l4e) w0bVar.a.getValue()).a()) ? (String) w0bVar.b.getValue() : null;
            if (str != null) {
                return str;
            }
        }
        ku3 ku3VarN = n();
        if (ku3VarN == null) {
            return rf2Var.b(il0Var, hl0Var);
        }
        Uri uriG = tfi.g(xui.a(ku3VarN.a.b.c, il0Var, hl0Var));
        if (uriG == null) {
            return null;
        }
        return uriG.toString();
    }

    public final boolean i0() {
        return this.X == this.b.d && F();
    }

    public final List j() {
        String strB;
        rf2 rf2Var = this.b;
        w0b w0bVar = this.z0;
        if (w0bVar != null) {
            List list = rf2Var.e(((l4e) w0bVar.a.getValue()).a()) ? (List) w0bVar.c.getValue() : null;
            if (list != null) {
                return list;
            }
        }
        ku3 ku3VarN = n();
        if (ku3VarN != null) {
            return ku3VarN.t();
        }
        String str = rf2Var.h;
        kmb kmbVar = this.B0;
        if (kmbVar == null || !wyi.b(kmbVar.a, str)) {
            o98 o98VarD = ve3.d();
            Iterator it = new wp8(1, ll0.a).iterator();
            while (true) {
                ListIterator listIterator = ((eqd) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                il0 il0Var = (il0) listIterator.previous();
                if (il0Var.compareTo(il0.b) >= 0 && il0Var.compareTo(il0.d) <= 0 && (strB = rf2Var.b(il0Var, hl0.a)) != null) {
                    o98VarD.add(strB);
                }
            }
            o98 o98VarA = ve3.a(o98VarD);
            this.B0 = new kmb(str, o98VarA.isEmpty() ? null : o98VarA);
        }
        return (List) this.B0.b;
    }

    public final boolean j0() {
        return this.b.e.containsKey(Long.valueOf(this.X)) || I();
    }

    public final long k(long j, rs4 rs4Var) {
        jf2 jf2VarF = p4j.f(j, this.b.n.d(rs4Var));
        if (jf2VarF == null) {
            return 0L;
        }
        long j2 = jf2VarF.a;
        long j3 = jf2VarF.b;
        if (j2 == j3) {
            return 0L;
        }
        return j3;
    }

    public final boolean k0() {
        boolean z = this.b.H.h;
        if (z) {
            return true;
        }
        ku3 ku3VarN = n();
        return ku3VarN != null ? ku3VarN.A() : z;
    }

    public final ArrayList l() {
        ArrayList arrayList;
        synchronized (this.Y) {
            arrayList = new ArrayList(this.Y);
        }
        return arrayList;
    }

    public final boolean l0() {
        return this.b.b0.b;
    }

    public final String m() {
        if (Q() && n() != null) {
            return n().a.b.o;
        }
        if (N() || M()) {
            return this.b.E;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079 A[ADDED_TO_REGION, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m0() {
        /*
            r11 = this;
            r0 = 0
            rf2 r1 = r11.b
            if (r1 == 0) goto L7a
            of2 r2 = r1.c
            java.util.Map r3 = r1.e
            pf2 r4 = r1.b
            pf2 r5 = defpackage.pf2.c
            of2 r6 = defpackage.of2.X
            of2 r7 = defpackage.of2.a
            r8 = 1
            long r9 = r11.X
            if (r4 != r5) goto L36
            if (r2 != r7) goto L19
            return r8
        L19:
            if (r2 != r6) goto L35
            if (r2 != r7) goto L2a
            us r1 = r1.R
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L2a
            goto L79
        L2a:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L7a
            goto L79
        L35:
            return r0
        L36:
            boolean r4 = r1.d()
            if (r4 == 0) goto L40
            if (r2 != r7) goto L40
            r4 = r8
            goto L41
        L40:
            r4 = r0
        L41:
            boolean r5 = r1.d()
            if (r5 != 0) goto L66
            if (r2 != r6) goto L66
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            boolean r3 = r3.containsKey(r5)
            if (r3 != 0) goto L5b
            lf2 r3 = r1.K
            if (r3 == 0) goto L66
            boolean r3 = r3.c
            if (r3 == 0) goto L66
        L5b:
            long r5 = r1.d
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 != 0) goto L64
            if (r2 != r7) goto L64
            goto L66
        L64:
            r3 = r8
            goto L67
        L66:
            r3 = r0
        L67:
            if (r4 != 0) goto L79
            if (r2 != r7) goto L6c
            return r8
        L6c:
            boolean r1 = r1.d()
            if (r1 != 0) goto L77
            of2 r1 = defpackage.of2.b
            if (r2 != r1) goto L77
            goto L79
        L77:
            if (r3 == 0) goto L7a
        L79:
            return r8
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.m0():boolean");
    }

    public final ku3 n() {
        synchronized (this.Y) {
            try {
                if (!Q() || this.Y.isEmpty()) {
                    return null;
                }
                return (ku3) this.Y.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n0() {
        eh9 eh9Var = this.c;
        return eh9Var != null && eh9Var.a.D() && eh9Var.a.k().a == c10.d && eh9Var.a.k().b == this.X;
    }

    public final long o() {
        eh9 eh9Var = this.c;
        if (eh9Var != null) {
            return eh9Var.a.p();
        }
        return 0L;
    }

    public final void o0() {
        String string;
        eh9 eh9Var;
        CharSequence charSequenceA;
        if (this.u0 != null) {
            return;
        }
        qy2 qy2Var = this.A0;
        qy2Var.getClass();
        eh9 eh9Var2 = this.c;
        CharSequence charSequenceF = null;
        if (eh9Var2 != null) {
            ku3 ku3Var = eh9Var2.b;
            si9 si9Var = eh9Var2.a;
            f7b f7bVar = (f7b) qy2Var.b.get();
            if (si9Var.D() && si9Var.k().a == c10.Z) {
                string = si9Var.k().j;
            } else if (si9Var.D() && si9Var.k().a == c10.t0 && (eh9Var = eh9Var2.d) != null) {
                ij2 ij2Var = eh9Var.Z;
                ij2Var.getClass();
                eh9 eh9Var3 = this.o;
                if (eh9Var3 != null) {
                    charSequenceF = ij2.f(ij2Var, this, eh9Var3, 1);
                }
            } else {
                d7c d7cVar = eh9Var2.o;
                d7cVar.f = this;
                f7b f7bVar2 = d7cVar.a;
                d7cVar.j(this, f7bVar2.g(), f7bVar2.f());
                CharSequence charSequence = d7cVar.g;
                if (charSequence != null) {
                    string = charSequence.toString();
                    Pattern pattern = m6g.a;
                    if (string.length() > 200) {
                        String strSubstring = string.substring(0, 200);
                        if (Character.isHighSurrogate(strSubstring.charAt(strSubstring.length() - 1)) && strSubstring.length() > 1) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        string = az1.i(strSubstring, "…");
                    }
                }
            }
            f7bVar.getClass();
            CharSequence charSequenceK = f7bVar.k(ssi.p(f7bVar.j.b(vw4.b(18), string)), si9Var.N0, vw4.b(18));
            yid yidVar = fe.a;
            if (charSequenceK != null && charSequenceK.length() != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z = false;
                for (int i = 0; i < charSequenceK.length(); i++) {
                    char cCharAt = charSequenceK.charAt(i);
                    boolean z2 = cCharAt == '\n' || cCharAt == '\r';
                    boolean zC = ozi.c(cCharAt);
                    if (z2 || zC) {
                        if (!z && i > 0 && i < charSequenceK.length() - 1) {
                            spannableStringBuilder.append(' ');
                        }
                        z = true;
                    } else {
                        spannableStringBuilder.append(cCharAt);
                        z = false;
                    }
                }
                if (charSequenceK instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequenceK;
                    int length = 0;
                    for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                        int spanStart = spanned.getSpanStart(obj);
                        int spanEnd = spanned.getSpanEnd(obj);
                        int spanFlags = spanned.getSpanFlags(obj);
                        String strB = fe.b.b(fe.a.b(spanned.subSequence(spanStart, spanEnd).toString(), " "), " ");
                        int iD = vmf.D(spannableStringBuilder, strB, length, false, 4);
                        if (iD >= 0) {
                            length = strB.length() + iD;
                            spannableStringBuilder.setSpan(obj, iD, length, spanFlags);
                        }
                    }
                    charSequenceK = SpannableString.valueOf(spannableStringBuilder);
                } else {
                    charSequenceK = SpannableString.valueOf(spannableStringBuilder);
                }
            }
            charSequenceF = charSequenceK;
            if (si9Var.D() && !l8g.c(charSequenceF) && ku3Var != null) {
                String string2 = charSequenceF.toString();
                d10 d10VarK = si9Var.k();
                f7bVar.getClass();
                switch (d10VarK.a.ordinal()) {
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        charSequenceA = l6g.a(string2, ku3Var, f7bVar, true);
                        charSequenceF = charSequenceA;
                        break;
                    case 2:
                    case 3:
                        charSequenceA = l6g.b(string2, d10VarK, ku3Var, f7bVar, (qv3) f7bVar.d.getValue(), true);
                        charSequenceF = charSequenceA;
                        break;
                    case 7:
                    default:
                        charSequenceF = string2;
                        break;
                }
            }
        }
        this.u0 = charSequenceF;
        p3b p3bVar = this.b.c0;
        if (p3bVar == null || !l8g.d(p3bVar.c())) {
            return;
        }
        qy2 qy2Var2 = this.A0;
        String strC = this.b.c0.c();
        qy2Var2.getClass();
        new ArrayList();
        vj vjVar = wh.c;
        if (vjVar == null) {
            return;
        }
        ((age) qy2Var2.e.get()).getClass();
        Set set = Collections.EMPTY_SET;
        if (rqi.b(5)) {
            Iterator it = vjVar.a(((f7b) qy2Var2.b.get()).j.e(strC)).iterator();
            if (it.hasNext()) {
                throw ctd.h(it);
            }
        }
    }

    public final long p() {
        boolean zM = M();
        eh9 eh9Var = this.c;
        if (zM && P()) {
            if (eh9Var != null) {
                return eh9Var.a.c;
            }
            return 0L;
        }
        rf2 rf2Var = this.b;
        Map map = rf2Var.e;
        long j = this.X;
        Long l = (Long) map.get(Long.valueOf(j));
        if (l != null && l.longValue() != 0) {
            return l.longValue();
        }
        if (eh9Var == null) {
            return 0L;
        }
        if (!j0() || eh9Var.a.o == j || ((M() && !h0()) || I())) {
            return eh9Var.a.c;
        }
        long j2 = eh9Var.a.c;
        long j3 = rf2Var.P;
        return j2 <= j3 ? j2 - 1 : j3;
    }

    public final void p0() {
        if (this.t0 != null) {
            return;
        }
        if (this.b.e(this.X)) {
            this.t0 = s();
            return;
        }
        qy2 qy2Var = this.A0;
        String strS = s();
        kz4 kz4Var = qy2Var.b;
        f7b f7bVar = (f7b) kz4Var.get();
        f7b f7bVar2 = (f7b) kz4Var.get();
        f7bVar2.getClass();
        this.t0 = f7bVar.j.b((int) (vw4.e(f7bVar2.i.c.g.getFloat("app.extra.text.size.sp", 0.0f)) + kti.d(TypedValue.applyDimension(2, 16, vw4.d().getDisplayMetrics()))), strS);
    }

    public final long q() {
        return o1j.a(o(), this.b);
    }

    public final void q0() {
        if (this.w0 != null) {
            return;
        }
        w0b w0bVar = this.z0;
        if (w0bVar != null) {
            if (this.b.e(((l4e) w0bVar.a.getValue()).a())) {
                this.w0 = "";
                return;
            }
        }
        ku3 ku3VarN = n();
        if (ku3VarN != null) {
            this.w0 = ku3VarN.o();
            return;
        }
        qy2 qy2Var = this.A0;
        String strS = s();
        kz4 kz4Var = qy2Var.b;
        f7b f7bVar = (f7b) kz4Var.get();
        Pattern pattern = r5b.a;
        this.w0 = f7bVar.j.e(r5b.a(strS, (f7b) kz4Var.get()));
    }

    public final CharSequence r(boolean z) {
        if (this.s0 == null || z) {
            this.s0 = this.A0.a(this);
        }
        return this.s0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            r8 = this;
            qy2 r0 = r8.A0
            long r1 = r8.X
            kz4 r3 = r0.b
            kz4 r0 = r0.h
            java.lang.Object r0 = r0.get()
            l4e r0 = (defpackage.l4e) r0
            long r4 = r0.a()
            rf2 r0 = r8.b
            boolean r4 = r0.e(r4)
            if (r4 == 0) goto L2a
            java.lang.Object r0 = r3.get()
            f7b r0 = (defpackage.f7b) r0
            android.content.Context r0 = r0.a
            int r1 = defpackage.c5d.saved_messages
            java.lang.String r0 = r0.getString(r1)
            goto Lc1
        L2a:
            boolean r4 = r8.Q()
            r5 = 0
            if (r4 == 0) goto L3e
            ku3 r0 = r8.n()
            if (r0 == 0) goto L3b
            java.lang.String r5 = r0.e()
        L3b:
            r0 = r5
            goto Lb1
        L3e:
            java.lang.String r4 = r0.g
            boolean r4 = defpackage.l8g.c(r4)
            if (r4 != 0) goto L49
            java.lang.String r0 = r0.g
            goto Lb1
        L49:
            java.util.ArrayList r0 = r8.l()
            boolean r4 = r8.M()
            if (r4 != 0) goto La9
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto La9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r0.next()
            ku3 r5 = (defpackage.ku3) r5
            boolean r6 = r5.B()
            if (r6 != 0) goto L62
            long r6 = r5.p()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto L62
            java.lang.String r5 = r5.e()
            java.lang.String r5 = r5.trim()
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            goto L62
        L8d:
            int r0 = r4.length()
            if (r0 <= 0) goto La0
            int r0 = r4.length()
            int r0 = r0 + (-2)
            int r1 = r4.length()
            r4.delete(r0, r1)
        La0:
            java.lang.String r0 = r4.toString()
            java.lang.String r0 = r0.trim()
            goto Lb1
        La9:
            boolean r0 = r8.M()
            if (r0 == 0) goto L3b
            java.lang.String r0 = ""
        Lb1:
            if (r0 != 0) goto Lc1
            java.lang.Object r0 = r3.get()
            f7b r0 = (defpackage.f7b) r0
            android.content.Context r0 = r0.a
            int r1 = defpackage.c5d.tt_chat_participants_empty__title
            java.lang.String r0 = r0.getString(r1)
        Lc1:
            r8.Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.r0():void");
    }

    public final String s() {
        if (this.Z == null) {
            r0();
        }
        return this.Z;
    }

    public final boolean s0() {
        return this.b.b0.a || K();
    }

    public final qf2 t() {
        rf2 rf2Var = this.b;
        if (rf2Var == null) {
            return null;
        }
        return rf2Var.T;
    }

    public final void t0(qv3 qv3Var) {
        qv3Var.b();
        synchronized (this.Y) {
            try {
                this.Y.clear();
                Iterator it = this.b.e.keySet().iterator();
                while (it.hasNext()) {
                    ku3 ku3VarI = qv3Var.i(((Long) it.next()).longValue(), true);
                    long jP = ku3VarI.p();
                    long j = this.X;
                    if (jP != j || this.b.e(j)) {
                        this.Y.add(ku3VarI);
                    }
                }
                r0();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.t0 = null;
        this.u0 = null;
        this.w0 = null;
        this.v0.set(null);
    }

    public final String toString() {
        return "Chat{id=" + this.a + ",data=" + this.b + '}';
    }

    public final boolean u() {
        if (G()) {
            return i0() || ppi.d(g(this.X), 4);
        }
        return false;
    }

    public final boolean v() {
        ff2 ff2Var;
        if (O()) {
            return false;
        }
        rf2 rf2Var = this.b;
        if (rf2Var.J.j(1) || !G()) {
            return false;
        }
        if (!i0()) {
            boolean zD = ppi.d(g(this.X), 2);
            if (M() || (ff2Var = rf2Var.H) == null || ff2Var.d) {
                return zD;
            }
        }
        return true;
    }

    public final boolean w() {
        if (G()) {
            return i0() || ppi.d(g(this.X), 8);
        }
        return false;
    }

    public final boolean x() {
        return this.b.J.j(4096);
    }

    public final boolean y() {
        boolean zF = this.b.f();
        eh9 eh9Var = this.d;
        if (zF && eh9Var == null) {
            return true;
        }
        return (eh9Var == null || eh9Var.a.t0 == jm9.DELETED || p() >= eh9Var.a.c) ? false : true;
    }

    public final boolean z() {
        ff2 ff2Var;
        if (Q() || U()) {
            return false;
        }
        rf2 rf2Var = this.b;
        if (rf2Var.J.j(16) || !G() || rf2Var.J.j(16)) {
            return false;
        }
        if (i0()) {
            return true;
        }
        boolean zD = ppi.d(g(this.X), 16);
        if (M() || (ff2Var = rf2Var.H) == null || !ff2Var.e) {
            return zD;
        }
        return true;
    }
}
