package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n32 implements h02 {
    public final xod A0;
    public final yod B0;
    public final yod C0;
    public final mni D0;
    public final mni E0;
    public final ArrayList X;
    public final ArrayList Y;
    public final ggg Z;
    public final n22 a;
    public final n22 b;
    public final s7c c;
    public final axg d;
    public final p90 o;
    public chh s0;
    public List t0;
    public final l12 u0;
    public final Object v0;
    public boolean w0;
    public ao3 x0;
    public uwg y0;
    public wlf z0;

    public n32(n22 n22Var, n22 n22Var2, yod yodVar, yod yodVar2, ggg gggVar, s7c s7cVar, g02 g02Var) {
        mni mniVar = mni.v0;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.t0 = Collections.EMPTY_LIST;
        this.v0 = new Object();
        this.w0 = true;
        this.x0 = null;
        this.a = n22Var;
        this.b = n22Var2;
        this.D0 = mniVar;
        this.E0 = mniVar;
        this.Z = gggVar;
        this.c = s7cVar;
        this.d = g02Var;
        l12 l12Var = yodVar.c;
        this.u0 = l12Var;
        l12Var.y();
        this.A0 = new xod(n22Var.f());
        this.B0 = yodVar;
        this.C0 = yodVar2;
        this.o = s(yodVar, yodVar2);
    }

    public static Matrix o(Rect rect, Size size) {
        z5j.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static p90 s(yod yodVar, yod yodVar2) {
        StringBuilder sb = new StringBuilder();
        sb.append(yodVar.a.d());
        sb.append(yodVar2 == null ? "" : yodVar2.a.d());
        return new p90(sb.toString(), yodVar.c.a);
    }

    public static HashMap t(ArrayList arrayList, axg axgVar, axg axgVar2) {
        xwg xwgVarF;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            if (uwgVar instanceof wlf) {
                wlf wlfVar = (wlf) uwgVar;
                xwg xwgVarF2 = new ad7(2).b().f(false, axgVar);
                if (xwgVarF2 == null) {
                    xwgVarF = null;
                } else {
                    x8a x8aVarK = x8a.k(xwgVarF2);
                    x8aVarK.a.remove(a2g.f0);
                    xwgVarF = ((nud) wlfVar.l(x8aVarK)).q();
                }
            } else {
                xwgVarF = uwgVar.f(false, axgVar);
            }
            xwg xwgVarF3 = uwgVar.f(true, axgVar2);
            m32 m32Var = new m32();
            m32Var.a = xwgVarF;
            m32Var.b = xwgVarF3;
            map.put(uwgVar, m32Var);
        }
        return map;
    }

    public static boolean x(ob0 ob0Var, hie hieVar) {
        ao3 ao3Var = ob0Var.d;
        fjb fjbVar = hieVar.g.b;
        if (ao3Var.e().size() != hieVar.g.b.e().size()) {
            return true;
        }
        for (s90 s90Var : ao3Var.e()) {
            if (!fjbVar.a.containsKey(s90Var) || !Objects.equals(fjbVar.f(s90Var), ao3Var.f(s90Var))) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList z(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            uwgVar.getClass();
            uwgVar.m = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                j5h j5hVar = (j5h) it2.next();
                if (uwgVar.m(j5hVar.a)) {
                    z5j.f(uwgVar + " already has effect" + uwgVar.m, uwgVar.m == null);
                    z5j.b(uwgVar.m(j5hVar.a));
                    uwgVar.m = j5hVar;
                    arrayList2.remove(j5hVar);
                }
            }
        }
        return arrayList2;
    }

    public final void A(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        int i2;
        HashMap map;
        ob0 ob0Var;
        ao3 ao3Var;
        boolean z2;
        synchronized (this.v0) {
            try {
                w();
                synchronized (this.v0) {
                    try {
                        i = 0;
                        if (!this.t0.isEmpty()) {
                            Iterator it = linkedHashSet.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                uwg uwgVar = (uwg) it.next();
                                if (uwgVar instanceof ee7) {
                                    xwg xwgVar = uwgVar.f;
                                    s90 s90Var = fe7.X;
                                    if (xwgVar.i(s90Var)) {
                                        Integer num = (Integer) xwgVar.f(s90Var);
                                        num.getClass();
                                        if (num.intValue() == 1) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (z2) {
                                throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                            }
                        }
                    } finally {
                    }
                }
                if (!z) {
                    w();
                }
                wlf wlfVarQ = q(linkedHashSet, z);
                uwg uwgVarH = h(linkedHashSet, wlfVarQ);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (uwgVarH != null) {
                    arrayList.add(uwgVarH);
                }
                if (wlfVarQ != null) {
                    arrayList.add(wlfVarQ);
                    arrayList.removeAll(wlfVarQ.q.a);
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.Y);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.Y);
                ArrayList arrayList4 = new ArrayList(this.Y);
                arrayList4.removeAll(arrayList);
                HashMap mapT = t(arrayList2, (axg) this.u0.d(j12.h, axg.a), this.d);
                Map mapP = Collections.EMPTY_MAP;
                try {
                    synchronized (this.v0) {
                        try {
                            i2 = this.Z.b == 2 ? 1 : 0;
                        } finally {
                        }
                    }
                    HashMap mapP2 = p(i2, this.a.n(), arrayList2, arrayList3, mapT);
                    if (this.b != null) {
                        synchronized (this.v0) {
                            try {
                                if (this.Z.b == 2) {
                                    i = 1;
                                }
                            } finally {
                            }
                        }
                        n22 n22Var = this.b;
                        Objects.requireNonNull(n22Var);
                        int i3 = i;
                        map = mapP2;
                        mapP = p(i3, n22Var.n(), arrayList2, arrayList3, mapT);
                    } else {
                        map = mapP2;
                    }
                    B(map, arrayList);
                    ArrayList arrayListZ = z(arrayList, this.t0);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListZ2 = z(arrayList5, arrayListZ);
                    if (arrayListZ2.size() > 0) {
                        gri.i("CameraUseCaseAdapter", "Unused effects: " + arrayListZ2);
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((uwg) it2.next()).D(this.a);
                    }
                    this.a.j(arrayList4);
                    if (this.b != null) {
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            uwg uwgVar2 = (uwg) it3.next();
                            n22 n22Var2 = this.b;
                            Objects.requireNonNull(n22Var2);
                            uwgVar2.D(n22Var2);
                        }
                        n22 n22Var3 = this.b;
                        Objects.requireNonNull(n22Var3);
                        n22Var3.j(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            uwg uwgVar3 = (uwg) it4.next();
                            if (map.containsKey(uwgVar3) && (ao3Var = (ob0Var = (ob0) map.get(uwgVar3)).d) != null && x(ob0Var, uwgVar3.n)) {
                                uwgVar3.g = uwgVar3.x(ao3Var);
                                if (this.w0) {
                                    this.a.h(uwgVar3);
                                    n22 n22Var4 = this.b;
                                    if (n22Var4 != null) {
                                        n22Var4.h(uwgVar3);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        uwg uwgVar4 = (uwg) it5.next();
                        m32 m32Var = (m32) mapT.get(uwgVar4);
                        Objects.requireNonNull(m32Var);
                        n22 n22Var5 = this.b;
                        if (n22Var5 != null) {
                            uwgVar4.a(this.a, n22Var5, m32Var.a, m32Var.b);
                            ob0 ob0Var2 = (ob0) map.get(uwgVar4);
                            ob0Var2.getClass();
                            uwgVar4.g = uwgVar4.y(ob0Var2, (ob0) mapP.get(uwgVar4));
                        } else {
                            uwgVar4.a(this.a, null, m32Var.a, m32Var.b);
                            ob0 ob0Var3 = (ob0) map.get(uwgVar4);
                            ob0Var3.getClass();
                            uwgVar4.g = uwgVar4.y(ob0Var3, null);
                        }
                    }
                    if (this.w0) {
                        this.a.k(arrayList2);
                        n22 n22Var6 = this.b;
                        if (n22Var6 != null) {
                            n22Var6.k(arrayList2);
                        }
                    }
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        ((uwg) it6.next()).r();
                    }
                    this.X.clear();
                    this.X.addAll(linkedHashSet);
                    this.Y.clear();
                    this.Y.addAll(arrayList);
                    this.y0 = uwgVarH;
                    this.z0 = wlfVarQ;
                } catch (IllegalArgumentException e) {
                    if (!z) {
                        w();
                        if (this.Z.b != 2) {
                            A(linkedHashSet, true);
                            return;
                        }
                    }
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(HashMap map, ArrayList arrayList) {
        HashMap map2;
        synchronized (this.v0) {
            try {
                if (this.s0 == null || arrayList.isEmpty()) {
                    map2 = map;
                } else {
                    boolean z = this.a.n().h() == 0;
                    Rect rectE = this.a.f().e();
                    Rational rational = this.s0.b;
                    int iL = this.a.n().l(this.s0.c);
                    chh chhVar = this.s0;
                    map2 = map;
                    HashMap mapA = pqi.a(rectE, z, rational, iL, chhVar.a, chhVar.d, map2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        uwg uwgVar = (uwg) it.next();
                        Rect rect = (Rect) mapA.get(uwgVar);
                        rect.getClass();
                        uwgVar.C(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    uwg uwgVar2 = (uwg) it2.next();
                    Rect rectE2 = this.a.f().e();
                    ob0 ob0Var = (ob0) map2.get(uwgVar2);
                    ob0Var.getClass();
                    uwgVar2.A(o(rectE2, ob0Var.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.h02
    public final l22 a() {
        return this.B0;
    }

    public final void b(List list) {
        synchronized (this.v0) {
            try {
                this.a.c(this.u0);
                n22 n22Var = this.b;
                if (n22Var != null) {
                    n22Var.c(this.u0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
                linkedHashSet.addAll(list);
                try {
                    A(linkedHashSet, this.b != null);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.v0) {
            try {
                if (!this.w0) {
                    if (!this.Y.isEmpty()) {
                        this.a.c(this.u0);
                        n22 n22Var = this.b;
                        if (n22Var != null) {
                            n22Var.c(this.u0);
                        }
                    }
                    this.a.k(this.Y);
                    n22 n22Var2 = this.b;
                    if (n22Var2 != null) {
                        n22Var2.k(this.Y);
                    }
                    synchronized (this.v0) {
                        try {
                            if (this.x0 != null) {
                                this.a.f().c(this.x0);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.Y.iterator();
                    while (it.hasNext()) {
                        ((uwg) it.next()).r();
                    }
                    this.w0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uwg h(java.util.LinkedHashSet r8, defpackage.wlf r9) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n32.h(java.util.LinkedHashSet, wlf):uwg");
    }

    public final HashMap p(int i, l22 l22Var, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        s7c s7cVar;
        Rect rectE;
        boolean z;
        ArrayList arrayList3 = new ArrayList();
        String strD = l22Var.d();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            s7cVar = this.c;
            if (!zHasNext) {
                break;
            }
            uwg uwgVar = (uwg) it.next();
            int inputFormat = uwgVar.f.getInputFormat();
            ob0 ob0Var = uwgVar.g;
            Size size = ob0Var != null ? ob0Var.a : null;
            trf trfVar = (trf) ((HashMap) s7cVar.a).get(strD);
            qb0 qb0VarB = trfVar != null ? qb0.b(i, inputFormat, size, trfVar.i(inputFormat)) : null;
            int inputFormat2 = uwgVar.f.getInputFormat();
            ob0 ob0Var2 = uwgVar.g;
            Size size2 = ob0Var2 != null ? ob0Var2.a : null;
            ob0Var2.getClass();
            d90 d90Var = new d90(qb0VarB, inputFormat2, size2, ob0Var2.b, wlf.J(uwgVar), uwgVar.g.d, (Range) uwgVar.f.d(xwg.m0, null));
            arrayList3.add(d90Var);
            map3.put(d90Var, uwgVar);
            map2.put(uwgVar, uwgVar.g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectE = this.a.f().e();
            } catch (NullPointerException unused) {
                rectE = null;
            }
            f9h f9hVar = new f9h(l22Var, rectE != null ? bhg.d(rectE) : null);
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                uwg uwgVar2 = (uwg) it2.next();
                m32 m32Var = (m32) map.get(uwgVar2);
                xwg xwgVarO = uwgVar2.o(l22Var, m32Var.a, m32Var.b);
                map4.put(xwgVarO, uwgVar2);
                map5.put(xwgVarO, f9hVar.e(xwgVarO));
                xwg xwgVar = uwgVar2.f;
                if (xwgVar instanceof s8c) {
                    z2 = ((s8c) xwgVar).B() == 2;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                }
                uwg uwgVar3 = (uwg) it3.next();
                if (uwgVar3 != null) {
                    if (uwgVar3.f.i(xwg.p0)) {
                        if (uwgVar3.f.w() == zwg.d) {
                            z = true;
                            break;
                        }
                    } else {
                        Log.e("CameraUseCaseAdapter", uwgVar3 + " UseCase does not have capture type.");
                    }
                }
            }
            s7cVar.getClass();
            z5j.a("No new use cases to be bound.", !map5.isEmpty());
            trf trfVar2 = (trf) ((HashMap) s7cVar.a).get(strD);
            if (trfVar2 == null) {
                throw new IllegalArgumentException(wy1.h("No such camera id in supported combination list: ", strD));
            }
            Pair pairG = trfVar2.g(i, arrayList3, map5, z2, z);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((uwg) entry.getValue(), (ob0) ((Map) pairG.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairG.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((uwg) map3.get(entry2.getKey()), (ob0) entry2.getValue());
                }
            }
        }
        return map2;
    }

    public final wlf q(LinkedHashSet linkedHashSet, boolean z) {
        synchronized (this.v0) {
            try {
                HashSet hashSetU = u(linkedHashSet, z);
                if (hashSetU.size() < 2) {
                    w();
                    return null;
                }
                wlf wlfVar = this.z0;
                if (wlfVar != null && wlfVar.q.a.equals(hashSetU)) {
                    wlf wlfVar2 = this.z0;
                    Objects.requireNonNull(wlfVar2);
                    return wlfVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = hashSetU.iterator();
                while (it.hasNext()) {
                    uwg uwgVar = (uwg) it.next();
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        if (uwgVar.m(i2)) {
                            if (hashSet.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new wlf(this.a, this.b, this.D0, this.E0, hashSetU, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.v0) {
            try {
                if (this.w0) {
                    this.a.j(new ArrayList(this.Y));
                    n22 n22Var = this.b;
                    if (n22Var != null) {
                        n22Var.j(new ArrayList(this.Y));
                    }
                    synchronized (this.v0) {
                        s12 s12VarF = this.a.f();
                        this.x0 = s12VarF.m();
                        s12VarF.n();
                    }
                    this.w0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet u(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.v0) {
            try {
                Iterator it = this.t0.iterator();
                j5h j5hVar = null;
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    j5h j5hVar2 = (j5h) it.next();
                    int i2 = 0;
                    for (int i3 = j5hVar2.a; i3 != 0; i3 >>= 1) {
                        i2 += i3 & 1;
                    }
                    if (i2 > 1) {
                        z5j.f("Can only have one sharing effect.", j5hVar == null);
                        j5hVar = j5hVar2;
                    }
                }
                if (j5hVar != null) {
                    i = j5hVar.a;
                }
                if (z) {
                    i = 3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            uwg uwgVar = (uwg) it2.next();
            z5j.a("Only support one level of sharing for now.", !(uwgVar instanceof wlf));
            if (uwgVar.m(i)) {
                hashSet.add(uwgVar);
            }
        }
        return hashSet;
    }

    public final List v() {
        ArrayList arrayList;
        synchronized (this.v0) {
            arrayList = new ArrayList(this.X);
        }
        return arrayList;
    }

    public final void w() {
        synchronized (this.v0) {
            this.u0.y();
        }
    }

    public final void y(ArrayList arrayList) {
        synchronized (this.v0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
            linkedHashSet.removeAll(arrayList);
            A(linkedHashSet, this.b != null);
        }
    }
}
