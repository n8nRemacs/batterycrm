package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class s1h extends uwg {
    public static final q1h D = new q1h();
    public r1h A;
    public eie B;
    public final euc C;
    public zr4 p;
    public dsf q;
    public nb0 r;
    public die s;
    public wu1 t;
    public msf u;
    public int v;
    public jdc w;
    public Rect x;
    public int y;
    public boolean z;

    public s1h(t1h t1hVar) {
        super(t1hVar);
        this.r = nb0.d;
        this.s = new die();
        this.t = null;
        this.v = 3;
        this.z = false;
        this.C = new euc(2, this);
    }

    public static void F(HashSet hashSet, int i, int i2, Size size, f3h f3hVar) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) f3hVar.T(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            gri.j("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) f3hVar.Q(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            gri.j("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    public static int G(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static f3h O(dn6 dn6Var, gc0 gc0Var, sa0 sa0Var, Size size, u75 u75Var, Range range) {
        dc0 dc0VarB = e2h.b(sa0Var, u75Var, gc0Var);
        fc0 fc0Var = sa0Var.a;
        String str = dc0VarB.a;
        z90 z90Var = dc0VarB.c;
        f9g f9gVar = f9g.a;
        f3h f3hVar = (f3h) dn6Var.apply((bc0) (z90Var != null ? new qs3(str, f9gVar, fc0Var, size, z90Var, u75Var, range) : new e3h(str, f9gVar, fc0Var, size, u75Var, range)).get());
        Size size2 = null;
        if (f3hVar == null) {
            gri.i("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        if (gc0Var != null) {
            z90 z90Var2 = gc0Var.f;
            size2 = new Size(z90Var2.e, z90Var2.f);
        }
        return h3h.a(f3hVar, size2);
    }

    @Override // defpackage.uwg
    public final void C(Rect rect) {
        this.i = rect;
        P();
    }

    public final void H(die dieVar, nb0 nb0Var, ob0 ob0Var) {
        zr4 zr4Var;
        boolean z = nb0Var.a == -1;
        boolean z2 = nb0Var.b == 1;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        ((LinkedHashSet) dieVar.a).clear();
        ((HashSet) ((w30) dieVar.b).e).clear();
        u75 u75Var = ob0Var.b;
        if (!z && (zr4Var = this.p) != null) {
            if (z2) {
                dieVar.g(zr4Var, u75Var, -1);
            } else {
                w86 w86VarA = kb0.a(zr4Var);
                if (u75Var == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                w86VarA.e = u75Var;
                ((LinkedHashSet) dieVar.a).add(w86VarA.b());
            }
        }
        wu1 wu1Var = this.t;
        if (wu1Var != null && wu1Var.cancel(false)) {
            gri.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        wu1 wu1VarA = ixi.a(new ehg(this, 11, dieVar));
        this.t = wu1VarA;
        wsf.b(wu1VarA, new vd(this, wu1VarA, z2, 12), ayi.d());
    }

    public final void I() {
        jei.b();
        eie eieVar = this.B;
        if (eieVar != null) {
            eieVar.b();
            this.B = null;
        }
        zr4 zr4Var = this.p;
        if (zr4Var != null) {
            zr4Var.a();
            this.p = null;
        }
        jdc jdcVar = this.w;
        if (jdcVar != null) {
            jdcVar.C();
            this.w = null;
        }
        dsf dsfVar = this.q;
        if (dsfVar != null) {
            dsfVar.c();
            this.q = null;
        }
        this.x = null;
        this.u = null;
        this.r = nb0.d;
        this.y = 0;
        this.z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final die J(t1h t1hVar, ob0 ob0Var) throws ExecutionException, InterruptedException {
        Object obj;
        m1h m1hVar;
        f3h f3hVar;
        Rect rectG;
        Size size;
        jdc jdcVar;
        jei.b();
        n22 n22VarC = c();
        n22VarC.getClass();
        Size size2 = ob0Var.a;
        m1h m1hVar2 = new m1h(0, this);
        Range range = ob0Var.c;
        if (Objects.equals(range, ob0.f)) {
            range = q1h.b;
        }
        Range range2 = range;
        ha8 ha8VarP = L().a().p();
        if (ha8VarP.isDone()) {
            try {
                obj = ha8VarP.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            obj = null;
        }
        sa0 sa0Var = (sa0) obj;
        Objects.requireNonNull(sa0Var);
        j1h j1hVarG = L().g(n22VarC.n());
        u75 u75Var = ob0Var.b;
        gc0 gc0VarA = j1hVarG.a(size2, u75Var);
        dn6 dn6Var = (dn6) t1hVar.f(t1h.c);
        Objects.requireNonNull(dn6Var);
        f3h f3hVarO = O(dn6Var, gc0VarA, sa0Var, size2, u75Var, range2);
        this.y = K(n22VarC);
        Rect rect = this.i;
        int i = 0;
        if (rect == null) {
            rect = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        if (f3hVarO == null || f3hVarO.b(rect.width(), rect.height())) {
            m1hVar = m1hVar2;
            f3hVar = f3hVarO;
        } else {
            gri.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", bhg.e(rect), Integer.valueOf(f3hVarO.H()), Integer.valueOf(f3hVarO.U()), f3hVarO.V(), f3hVarO.Y()));
            f3h xufVar = (!(f3hVarO.V().contains((Range) Integer.valueOf(rect.width())) && f3hVarO.Y().contains((Range) Integer.valueOf(rect.height()))) && f3hVarO.L() && f3hVarO.Y().contains((Range) Integer.valueOf(rect.width())) && f3hVarO.V().contains((Range) Integer.valueOf(rect.height()))) ? new xuf(f3hVarO) : f3hVarO;
            int iH = xufVar.H();
            int iU = xufVar.U();
            Range rangeV = xufVar.V();
            Range rangeY = xufVar.Y();
            f3hVar = f3hVarO;
            int iG = G(true, rect.width(), iH, rangeV);
            m1hVar = m1hVar2;
            int iG2 = G(false, rect.width(), iH, rangeV);
            int iG3 = G(true, rect.height(), iU, rangeY);
            int iG4 = G(false, rect.height(), iU, rangeY);
            HashSet hashSet = new HashSet();
            F(hashSet, iG, iG3, size2, xufVar);
            F(hashSet, iG, iG4, size2, xufVar);
            F(hashSet, iG2, iG3, size2, xufVar);
            F(hashSet, iG2, iG4, size2, xufVar);
            if (hashSet.isEmpty()) {
                gri.i("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                gri.a("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new dj3(13, rect));
                gri.a("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    gri.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    z5j.f(null, width % 2 == 0 && height % 2 == 0 && width <= size2.getWidth() && height <= size2.getHeight());
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        int iMax = Math.max(0, rect.centerX() - (width / 2));
                        rect2.left = iMax;
                        int i2 = iMax + width;
                        rect2.right = i2;
                        if (i2 > size2.getWidth()) {
                            int width2 = size2.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != rect.height()) {
                        i = 0;
                        int iMax2 = Math.max(0, rect.centerY() - (height / 2));
                        rect2.top = iMax2;
                        int i3 = iMax2 + height;
                        rect2.bottom = i3;
                        if (i3 > size2.getHeight()) {
                            int height2 = size2.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    } else {
                        i = 0;
                    }
                    gri.a("VideoCapture", "Adjust cropRect from " + bhg.e(rect) + " to " + bhg.e(rect2));
                    rect = rect2;
                }
            }
            i = 0;
        }
        int i4 = this.y;
        vb0 vb0Var = this.r.c;
        if (vb0Var != null) {
            vb0Var.getClass();
            rectG = bhg.g(bhg.f(bhg.d(vb0Var.a), i4));
        } else {
            rectG = rect;
        }
        this.x = rectG;
        if (this.r.c == null || rectG.equals(rect)) {
            size = size2;
        } else {
            float fHeight = rectG.height() / rect.height();
            size = new Size((int) Math.ceil(size2.getWidth() * fHeight), (int) Math.ceil(size2.getHeight() * fHeight));
        }
        if (this.r.c != null) {
            this.z = true;
        }
        Rect rect3 = this.x;
        int i5 = this.y;
        boolean zM = M(n22VarC, t1hVar, rect3, size2);
        if (((SizeCannotEncodeVideoQuirk) pv4.a.e(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zM) {
                i5 = i;
            }
            Size sizeF = bhg.f(bhg.d(rect3), i5);
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeF)) {
                int iU2 = f3hVar != null ? f3hVar.U() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == sizeF.getHeight()) {
                    rect4.left += iU2;
                    rect4.right -= iU2;
                } else {
                    rect4.top += iU2;
                    rect4.bottom -= iU2;
                }
                rect3 = rect4;
            }
        }
        this.x = rect3;
        if (M(n22VarC, t1hVar, rect3, size2)) {
            gri.a("VideoCapture", "Surface processing is enabled.");
            n22 n22VarC2 = c();
            Objects.requireNonNull(n22VarC2);
            j5h j5hVar = this.m;
            jdcVar = new jdc(n22VarC2, j5hVar != null ? new jkc(j5hVar) : new yp4(u75Var));
        } else {
            jdcVar = null;
        }
        this.w = jdcVar;
        f9g f9gVarI = (jdcVar == null && n22VarC.l()) ? f9g.a : n22VarC.n().i();
        gri.a("VideoCapture", "camera timebase = " + n22VarC.n().i() + ", processing timebase = " + f9gVarI);
        xa6 xa6VarA = ob0Var.a();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        xa6VarA.a = size;
        if (range2 == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        xa6VarA.c = range2;
        ob0 ob0VarB = xa6VarA.b();
        z5j.f(null, this.q == null ? 1 : i);
        dsf dsfVar = new dsf(2, 34, ob0VarB, this.j, n22VarC.l(), this.x, this.y, b(), (n22VarC.l() && n(n22VarC)) ? 1 : i);
        this.q = dsfVar;
        dsfVar.a(m1hVar);
        if (this.w != null) {
            dsf dsfVar2 = this.q;
            int i6 = dsfVar2.f;
            int i7 = dsfVar2.a;
            Rect rect5 = dsfVar2.d;
            ua0 ua0Var = new ua0(UUID.randomUUID(), i6, i7, rect5, bhg.f(bhg.d(rect5), dsfVar2.i), dsfVar2.i, dsfVar2.e, false);
            dsf dsfVar3 = (dsf) this.w.E(new tb0(this.q, Collections.singletonList(ua0Var))).get(ua0Var);
            Objects.requireNonNull(dsfVar3);
            dsfVar3.a(new ev1(this, dsfVar3, n22VarC, t1hVar, f9gVarI, 5));
            this.u = dsfVar3.d(n22VarC, true);
            dsf dsfVar4 = this.q;
            dsfVar4.getClass();
            jei.b();
            dsfVar4.b();
            z5j.f("Consumer can only be linked once.", !dsfVar4.j);
            dsfVar4.j = true;
            csf csfVar = dsfVar4.l;
            this.p = csfVar;
            wsf.g(csfVar.e).d(new aee(this, 29, csfVar), ayi.d());
        } else {
            msf msfVarD = this.q.d(n22VarC, true);
            this.u = msfVarD;
            this.p = msfVarD.l;
        }
        uah uahVar = (uah) t1hVar.f(t1h.b);
        Objects.requireNonNull(uahVar);
        uahVar.f(this.u, f9gVarI);
        P();
        this.p.j = MediaCodec.class;
        die dieVarI = die.i(t1hVar, ob0Var.a);
        Range range3 = ob0Var.c;
        w30 w30Var = (w30) dieVarI.b;
        w30Var.getClass();
        ((x8a) w30Var.f).n(h52.k, range3);
        int iX = t1hVar.x();
        if (iX != 0) {
            w30 w30Var2 = (w30) dieVarI.b;
            w30Var2.getClass();
            if (iX != 0) {
                ((x8a) w30Var2.f).n(xwg.r0, Integer.valueOf(iX));
            }
        }
        eie eieVar = this.B;
        if (eieVar != null) {
            eieVar.b();
        }
        eie eieVar2 = new eie(new xc7(5, this));
        this.B = eieVar2;
        dieVarI.f = eieVar2;
        ao3 ao3Var = ob0Var.d;
        if (ao3Var != null) {
            ((w30) dieVarI.b).c(ao3Var);
        }
        return dieVarI;
    }

    public final int K(n22 n22Var) {
        boolean zN = n(n22Var);
        int iH = h(n22Var, zN);
        vb0 vb0Var = this.r.c;
        if (vb0Var == null) {
            return iH;
        }
        Objects.requireNonNull(vb0Var);
        int i = vb0Var.b;
        if (zN != vb0Var.f) {
            i = -i;
        }
        return bhg.h(iH - i);
    }

    public final uah L() {
        uah uahVar = (uah) ((t1h) this.f).f(t1h.b);
        Objects.requireNonNull(uahVar);
        return uahVar;
    }

    public final boolean M(n22 n22Var, t1h t1hVar, Rect rect, Size size) {
        if (this.m != null) {
            return true;
        }
        if (n22Var.l()) {
            Boolean bool = (Boolean) t1hVar.d(t1h.d, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        if (!(n22Var.l() && (SurfaceProcessingQuirk.d(pv4.a) || SurfaceProcessingQuirk.d(n22Var.n().o()))) && size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return (n22Var.l() && n(n22Var)) || this.r.c != null;
        }
        return true;
    }

    public final void N() {
        if (c() == null) {
            return;
        }
        I();
        t1h t1hVar = (t1h) this.f;
        ob0 ob0Var = this.g;
        ob0Var.getClass();
        die dieVarJ = J(t1hVar, ob0Var);
        this.s = dieVarJ;
        H(dieVarJ, this.r, this.g);
        Object[] objArr = {this.s.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
    }

    public final void P() {
        n22 n22VarC = c();
        dsf dsfVar = this.q;
        if (n22VarC == null || dsfVar == null) {
            return;
        }
        int iK = K(n22VarC);
        this.y = iK;
        jei.d(new vu0(dsfVar, iK, b(), 5));
    }

    @Override // defpackage.uwg
    public final xwg f(boolean z, axg axgVar) {
        D.getClass();
        t1h t1hVar = q1h.a;
        ao3 ao3VarA = axgVar.a(t1hVar.w(), 1);
        if (z) {
            ao3VarA = ao3.s(ao3VarA, t1hVar);
        }
        if (ao3VarA == null) {
            return null;
        }
        return new t1h(fjb.a(((ad7) l(ao3VarA)).b));
    }

    @Override // defpackage.uwg
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // defpackage.uwg
    public final wwg l(ao3 ao3Var) {
        return new ad7(x8a.k(ao3Var), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    @Override // defpackage.uwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xwg u(defpackage.l22 r22, defpackage.wwg r23) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1h.u(l22, wwg):xwg");
    }

    @Override // defpackage.uwg
    public final void v() throws ExecutionException, InterruptedException {
        gri.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + e());
        ob0 ob0Var = this.g;
        if (ob0Var == null || this.u != null) {
            return;
        }
        wqa wqaVarD = L().d();
        Object obj = nb0.d;
        ha8 ha8VarP = wqaVarD.p();
        if (ha8VarP.isDone()) {
            try {
                obj = ha8VarP.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.r = (nb0) obj;
        die dieVarJ = J((t1h) this.f, ob0Var);
        this.s = dieVarJ;
        H(dieVarJ, this.r, ob0Var);
        Object[] objArr = {this.s.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        E(Collections.unmodifiableList(arrayList));
        p();
        L().d().f(ayi.d(), this.C);
        r1h r1hVar = this.A;
        if (r1hVar != null) {
            r1hVar.b();
        }
        s12 s12VarD = d();
        r1h r1hVar2 = new r1h();
        r1hVar2.b = false;
        r1hVar2.a = s12VarD;
        this.A = r1hVar2;
        L().e().f(ayi.d(), this.A);
        if (2 != this.v) {
            this.v = 2;
            L().c(2);
        }
    }

    @Override // defpackage.uwg
    public final void w() {
        gri.a("VideoCapture", "VideoCapture#onStateDetached");
        z5j.f("VideoCapture can only be detached on the main thread.", jei.c());
        if (this.A != null) {
            L().e().r(this.A);
            this.A.b();
            this.A = null;
        }
        if (3 != this.v) {
            this.v = 3;
            L().c(3);
        }
        L().d().r(this.C);
        wu1 wu1Var = this.t;
        if (wu1Var != null && wu1Var.cancel(false)) {
            gri.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        I();
    }

    @Override // defpackage.uwg
    public final ob0 x(ao3 ao3Var) {
        this.s.f(ao3Var);
        Object[] objArr = {this.s.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        ob0 ob0Var = this.g;
        Objects.requireNonNull(ob0Var);
        xa6 xa6VarA = ob0Var.a();
        xa6VarA.d = ao3Var;
        return xa6VarA.b();
    }

    @Override // defpackage.uwg
    public final ob0 y(ob0 ob0Var, ob0 ob0Var2) {
        gri.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + ob0Var);
        List list = (List) ((t1h) this.f).d(bf7.I, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(ob0Var.a)) {
            gri.i("VideoCapture", "suggested resolution " + ob0Var.a + " is not in custom ordered resolutions " + arrayList);
        }
        return ob0Var;
    }
}
