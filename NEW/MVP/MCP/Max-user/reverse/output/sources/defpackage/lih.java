package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class lih implements twg {
    public final n22 X;
    public final n22 Y;
    public final HashSet a;
    public final axg o;
    public final HashSet s0;
    public final HashMap t0;
    public final cod u0;
    public final cod v0;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final l52 Z = new l52(2, this);

    public lih(n22 n22Var, n22 n22Var2, HashSet hashSet, axg axgVar, u4e u4eVar) {
        this.X = n22Var;
        this.Y = n22Var2;
        this.o = axgVar;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            map.put(uwgVar, uwgVar.o(n22Var.n(), null, uwgVar.f(true, axgVar)));
        }
        this.t0 = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.s0 = hashSet2;
        this.u0 = new cod(n22Var, hashSet2);
        if (this.Y != null) {
            this.v0 = new cod(this.Y, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            uwg uwgVar2 = (uwg) it2.next();
            this.d.put(uwgVar2, Boolean.FALSE);
            this.c.put(uwgVar2, new kih(n22Var, this, u4eVar));
        }
    }

    public static void q(dsf dsfVar, zr4 zr4Var, hie hieVar) {
        dsfVar.e();
        try {
            jei.b();
            dsfVar.b();
            csf csfVar = dsfVar.l;
            Objects.requireNonNull(csfVar);
            csfVar.g(zr4Var, new zrf(csfVar, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            fie fieVar = hieVar.f;
            if (fieVar != null) {
                fieVar.a(hieVar);
            }
        }
    }

    public static zr4 r(uwg uwgVar) {
        List listB = uwgVar instanceof ee7 ? uwgVar.n.b() : Collections.unmodifiableList(uwgVar.n.g.a);
        z5j.f(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (zr4) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.twg
    public final void b(uwg uwgVar) {
        zr4 zr4VarR;
        jei.b();
        dsf dsfVar = (dsf) this.b.get(uwgVar);
        Objects.requireNonNull(dsfVar);
        if (s(uwgVar) && (zr4VarR = r(uwgVar)) != null) {
            q(dsfVar, zr4VarR, uwgVar.n);
        }
    }

    @Override // defpackage.twg
    public final void d(uwg uwgVar) {
        jei.b();
        if (s(uwgVar)) {
            return;
        }
        this.d.put(uwgVar, Boolean.TRUE);
        zr4 zr4VarR = r(uwgVar);
        if (zr4VarR != null) {
            dsf dsfVar = (dsf) this.b.get(uwgVar);
            Objects.requireNonNull(dsfVar);
            q(dsfVar, zr4VarR, uwgVar.n);
        }
    }

    @Override // defpackage.twg
    public final void h(uwg uwgVar) {
        jei.b();
        if (s(uwgVar)) {
            dsf dsfVar = (dsf) this.b.get(uwgVar);
            Objects.requireNonNull(dsfVar);
            zr4 zr4VarR = r(uwgVar);
            if (zr4VarR != null) {
                q(dsfVar, zr4VarR, uwgVar.n);
                return;
            }
            jei.b();
            dsfVar.b();
            dsfVar.l.a();
        }
    }

    @Override // defpackage.twg
    public final void o(uwg uwgVar) {
        jei.b();
        if (s(uwgVar)) {
            this.d.put(uwgVar, Boolean.FALSE);
            dsf dsfVar = (dsf) this.b.get(uwgVar);
            Objects.requireNonNull(dsfVar);
            jei.b();
            dsfVar.b();
            dsfVar.l.a();
        }
    }

    public final ua0 p(uwg uwgVar, cod codVar, n22 n22Var, dsf dsfVar, int i, boolean z) {
        boolean z2;
        Size sizeD;
        int iL = n22Var.n().l(i);
        Matrix matrix = dsfVar.b;
        RectF rectF = bhg.a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
        xwg xwgVar = (xwg) this.t0.get(uwgVar);
        Objects.requireNonNull(xwgVar);
        Rect rectA = dsfVar.d;
        dsfVar.b.getValues(new float[9]);
        int iH = bhg.h((int) Math.round(Math.atan2(r11[3], r11[0]) * 57.29577951308232d));
        codVar.getClass();
        if (bhg.b(iH)) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            sizeD = bhg.d(rectA);
            Iterator it = codVar.b(xwgVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size sizeD2 = bhg.d(cod.a((Size) it.next(), sizeD));
                if (!cod.c(sizeD2, sizeD)) {
                    sizeD = sizeD2;
                    break;
                }
            }
        } else {
            Size sizeD3 = bhg.d(rectA);
            List listB = codVar.b(xwgVar);
            Iterator it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeD = sizeD3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!cod.c(size, sizeD3)) {
                            sizeD = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalG = mt.a;
                    Size size3 = d4f.c;
                    if (!mt.a(sizeD3, rationalG, size3)) {
                        rationalG = mt.c;
                        if (!mt.a(sizeD3, rationalG, size3)) {
                            rationalG = cod.g(sizeD3);
                        }
                    }
                    if (!codVar.d(rationalG, size2) && !cod.c(size2, sizeD3)) {
                        sizeD = size2;
                        break;
                    }
                }
            }
            rectA = cod.a(sizeD3, sizeD);
        }
        Pair pair = new Pair(rectA, sizeD);
        Rect rect = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z2) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect, size4);
        Rect rect2 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int iL2 = this.X.n().l(((bf7) uwgVar.f).G(0));
        kih kihVar = (kih) this.c.get(uwgVar);
        Objects.requireNonNull(kihVar);
        kihVar.c.c = iL2;
        int iH2 = bhg.h((dsfVar.i + iL2) - iL);
        return new ua0(UUID.randomUUID(), uwgVar instanceof r8c ? 1 : uwgVar instanceof ee7 ? 4 : 2, uwgVar instanceof ee7 ? 256 : 34, rect2, bhg.f(size6, iH2), iH2, uwgVar.n(n22Var) ^ z3, false);
    }

    public final boolean s(uwg uwgVar) {
        Boolean bool = (Boolean) this.d.get(uwgVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void t(HashMap map) {
        HashMap map2 = this.b;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            uwg uwgVar = (uwg) entry.getKey();
            dsf dsfVar = (dsf) entry.getValue();
            uwgVar.C(dsfVar.d);
            uwgVar.A(dsfVar.b);
            uwgVar.g = uwgVar.y(dsfVar.g, null);
            uwgVar.r();
        }
    }
}
