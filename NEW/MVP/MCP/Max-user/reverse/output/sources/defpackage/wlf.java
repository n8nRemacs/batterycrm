package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class wlf extends uwg {
    public die A;
    public die B;
    public eie C;
    public final xlf p;
    public final lih q;
    public final mni r;
    public final mni s;
    public jdc t;
    public jdc u;
    public t86 v;
    public dsf w;
    public dsf x;
    public dsf y;
    public dsf z;

    public wlf(n22 n22Var, n22 n22Var2, mni mniVar, mni mniVar2, HashSet hashSet, axg axgVar) {
        super(K(hashSet));
        this.p = K(hashSet);
        this.r = mniVar;
        this.s = mniVar2;
        this.q = new lih(n22Var, n22Var2, hashSet, axgVar, new u4e(19, this));
    }

    public static ArrayList J(uwg uwgVar) {
        ArrayList arrayList = new ArrayList();
        if (!(uwgVar instanceof wlf)) {
            arrayList.add(uwgVar.f.w());
            return arrayList;
        }
        Iterator it = ((wlf) uwgVar).q.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((uwg) it.next()).f.w());
        }
        return arrayList;
    }

    public static xlf K(HashSet hashSet) {
        x8a x8aVarB = x8a.b();
        new nud(x8aVarB);
        x8aVarB.n(re7.x, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            if (uwgVar.f.i(xwg.p0)) {
                arrayList.add(uwgVar.f.w());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        x8aVarB.n(xlf.b, arrayList);
        x8aVarB.n(bf7.C, 2);
        return new xlf(fjb.a(x8aVarB));
    }

    public final void F() {
        eie eieVar = this.C;
        if (eieVar != null) {
            eieVar.b();
            this.C = null;
        }
        dsf dsfVar = this.w;
        if (dsfVar != null) {
            dsfVar.c();
            this.w = null;
        }
        dsf dsfVar2 = this.x;
        if (dsfVar2 != null) {
            dsfVar2.c();
            this.x = null;
        }
        dsf dsfVar3 = this.y;
        if (dsfVar3 != null) {
            dsfVar3.c();
            this.y = null;
        }
        dsf dsfVar4 = this.z;
        if (dsfVar4 != null) {
            dsfVar4.c();
            this.z = null;
        }
        jdc jdcVar = this.u;
        if (jdcVar != null) {
            jdcVar.C();
            this.u = null;
        }
        t86 t86Var = this.v;
        if (t86Var != null) {
            ((gsf) t86Var.a).release();
            jei.d(new qj4(14, t86Var));
            this.v = null;
        }
        jdc jdcVar2 = this.t;
        if (jdcVar2 != null) {
            jdcVar2.C();
            this.t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List G(String str, String str2, xwg xwgVar, ob0 ob0Var, ob0 ob0Var2) {
        jdc jdcVar;
        jei.b();
        lih lihVar = this.q;
        if (ob0Var2 == null) {
            H(str, str2, xwgVar, ob0Var, null);
            n22 n22VarC = c();
            Objects.requireNonNull(n22VarC);
            j5h j5hVar = this.m;
            if (j5hVar == null || j5hVar.b != 1) {
                jdcVar = new jdc(n22VarC, new yp4(ob0Var.b));
            } else {
                jdcVar = new jdc(n22VarC, new jkc(j5hVar));
                this.t = jdcVar;
            }
            this.u = jdcVar;
            boolean z = this.i != null;
            dsf dsfVar = this.y;
            int iK = k();
            lihVar.getClass();
            HashMap map = new HashMap();
            Iterator it = lihVar.a.iterator();
            while (it.hasNext()) {
                uwg uwgVar = (uwg) it.next();
                cod codVar = lihVar.u0;
                n22 n22Var = lihVar.X;
                lih lihVar2 = lihVar;
                boolean z2 = z;
                map.put(uwgVar, lihVar2.p(uwgVar, codVar, n22Var, dsfVar, iK, z2));
                z = z2;
                lihVar = lihVar2;
            }
            lih lihVar3 = lihVar;
            k65 k65VarE = this.u.E(new tb0(this.y, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((uwg) entry.getKey(), (dsf) k65VarE.get(entry.getValue()));
            }
            lihVar3.t(map2);
            Object[] objArr = {this.A.h()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        H(str, str2, xwgVar, ob0Var, ob0Var2);
        Matrix matrix = this.j;
        n22 n22VarI = i();
        Objects.requireNonNull(n22VarI);
        boolean zL = n22VarI.l();
        Size size = ob0Var2.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        n22 n22VarI2 = i();
        Objects.requireNonNull(n22VarI2);
        int iH = h(n22VarI2, false);
        n22 n22VarI3 = i();
        Objects.requireNonNull(n22VarI3);
        dsf dsfVar2 = new dsf(3, 34, ob0Var2, matrix, zL, rect, iH, -1, n(n22VarI3));
        this.x = dsfVar2;
        n22 n22VarI4 = i();
        Objects.requireNonNull(n22VarI4);
        this.z = L(dsfVar2, n22VarI4);
        die dieVarI = I(this.x, xwgVar, ob0Var2);
        this.B = dieVarI;
        eie eieVar = this.C;
        if (eieVar != null) {
            eieVar.b();
        }
        eie eieVar2 = new eie(new vlf(this, str, str2, xwgVar, ob0Var, ob0Var2));
        this.C = eieVar2;
        dieVarI.f = eieVar2;
        n22 n22VarC2 = c();
        n22 n22VarI5 = i();
        i65 i65Var = new i65(ob0Var.b, this.r, this.s);
        t86 t86Var = new t86();
        t86Var.b = n22VarC2;
        t86Var.c = n22VarI5;
        t86Var.a = i65Var;
        this.v = t86Var;
        boolean z3 = this.i != null;
        dsf dsfVar3 = this.y;
        dsf dsfVar4 = this.z;
        int iK2 = k();
        lihVar.getClass();
        HashMap map3 = new HashMap();
        Iterator it2 = lihVar.a.iterator();
        while (it2.hasNext()) {
            uwg uwgVar2 = (uwg) it2.next();
            ua0 ua0VarP = lihVar.p(uwgVar2, lihVar.u0, lihVar.X, dsfVar3, iK2, z3);
            dsf dsfVar5 = dsfVar3;
            cod codVar2 = lihVar.v0;
            n22 n22Var2 = lihVar.Y;
            Objects.requireNonNull(n22Var2);
            dsf dsfVar6 = dsfVar4;
            map3.put(uwgVar2, new v90(ua0VarP, lihVar.p(uwgVar2, codVar2, n22Var2, dsfVar6, iK2, z3)));
            dsfVar4 = dsfVar6;
            dsfVar3 = dsfVar5;
        }
        t86 t86Var2 = this.v;
        w90 w90Var = new w90(this.y, this.z, new ArrayList(map3.values()));
        t86Var2.getClass();
        gsf gsfVar = (gsf) t86Var2.a;
        jei.b();
        t86Var2.e = w90Var;
        t86Var2.d = new k65();
        w90 w90Var2 = (w90) t86Var2.e;
        dsf dsfVar7 = w90Var2.a;
        dsf dsfVar8 = w90Var2.b;
        Iterator it3 = w90Var2.c.iterator();
        while (it3.hasNext()) {
            v90 v90Var = (v90) it3.next();
            k65 k65Var = (k65) t86Var2.d;
            ua0 ua0Var = v90Var.a;
            Rect rect2 = ua0Var.d;
            int i = ua0Var.f;
            boolean z4 = ua0Var.g;
            Matrix matrix2 = new Matrix();
            Size sizeF = bhg.f(bhg.d(rect2), i);
            Iterator it4 = it3;
            Size size2 = ua0Var.e;
            HashMap map4 = map3;
            z5j.b(bhg.c(sizeF, false, size2));
            Rect rectG = bhg.g(size2);
            xa6 xa6VarA = dsfVar7.g.a();
            xa6VarA.a = size2;
            k65Var.put(v90Var, new dsf(ua0Var.b, ua0Var.c, xa6VarA.b(), matrix2, false, rectG, dsfVar7.i - i, -1, dsfVar7.e != z4));
            it3 = it4;
            map3 = map4;
        }
        HashMap map5 = map3;
        try {
            gsfVar.f(dsfVar7.d((n22) t86Var2.b, true));
        } catch (ProcessingException e) {
            gri.c("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            gsfVar.f(dsfVar8.d((n22) t86Var2.c, false));
        } catch (ProcessingException e2) {
            gri.c("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        n22 n22Var3 = (n22) t86Var2.b;
        n22 n22Var4 = (n22) t86Var2.c;
        for (Map.Entry entry2 : ((k65) t86Var2.d).entrySet()) {
            t86 t86Var3 = t86Var2;
            dsf dsfVar9 = dsfVar7;
            dsf dsfVar10 = dsfVar8;
            t86Var3.c(n22Var3, n22Var4, dsfVar9, dsfVar10, entry2);
            dsf dsfVar11 = (dsf) entry2.getValue();
            n22 n22Var5 = n22Var4;
            n22 n22Var6 = n22Var3;
            j65 j65Var = new j65(t86Var3, n22Var6, n22Var5, dsfVar9, dsfVar10, entry2, 0);
            n22Var3 = n22Var6;
            n22Var4 = n22Var5;
            dsfVar11.a(j65Var);
            t86Var2 = t86Var3;
            dsfVar7 = dsfVar9;
            dsfVar8 = dsfVar10;
        }
        k65 k65Var2 = (k65) t86Var2.d;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((uwg) entry3.getKey(), (dsf) k65Var2.get(entry3.getValue()));
        }
        lihVar.t(map6);
        Object[] objArr2 = {this.A.h(), this.B.h()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj2 = objArr2[i2];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void H(String str, String str2, xwg xwgVar, ob0 ob0Var, ob0 ob0Var2) {
        Matrix matrix = this.j;
        n22 n22VarC = c();
        Objects.requireNonNull(n22VarC);
        boolean zL = n22VarC.l();
        Size size = ob0Var.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        n22 n22VarC2 = c();
        Objects.requireNonNull(n22VarC2);
        int iH = h(n22VarC2, false);
        n22 n22VarC3 = c();
        Objects.requireNonNull(n22VarC3);
        dsf dsfVar = new dsf(3, 34, ob0Var, matrix, zL, rect, iH, -1, n(n22VarC3));
        this.w = dsfVar;
        n22 n22VarC4 = c();
        Objects.requireNonNull(n22VarC4);
        this.y = L(dsfVar, n22VarC4);
        die dieVarI = I(this.w, xwgVar, ob0Var);
        this.A = dieVarI;
        eie eieVar = this.C;
        if (eieVar != null) {
            eieVar.b();
        }
        eie eieVar2 = new eie(new vlf(this, str, str2, xwgVar, ob0Var, ob0Var2));
        this.C = eieVar2;
        dieVarI.f = eieVar2;
    }

    public final die I(dsf dsfVar, xwg xwgVar, ob0 ob0Var) {
        die dieVarI = die.i(xwgVar, ob0Var.a);
        w30 w30Var = (w30) dieVarI.b;
        lih lihVar = this.q;
        Iterator it = lihVar.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((hie) ((uwg) it.next()).f.f(xwg.h0)).g.c;
            List list = hie.i;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            w30Var.c = i;
        }
        Size size = ob0Var.a;
        Iterator it2 = lihVar.a.iterator();
        while (it2.hasNext()) {
            hie hieVarH = die.i(((uwg) it2.next()).f, size).h();
            h52 h52Var = hieVarH.g;
            w30Var.a(h52Var.e);
            List<k02> list2 = hieVarH.e;
            ArrayList arrayList = (ArrayList) dieVarI.e;
            for (k02 k02Var : list2) {
                w30Var.b(k02Var);
                if (!arrayList.contains(k02Var)) {
                    arrayList.add(k02Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : hieVarH.d) {
                ArrayList arrayList2 = (ArrayList) dieVarI.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : hieVarH.c) {
                ArrayList arrayList3 = (ArrayList) dieVarI.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            w30Var.c(h52Var.b);
        }
        dsfVar.getClass();
        jei.b();
        dsfVar.b();
        z5j.f("Consumer can only be linked once.", !dsfVar.j);
        dsfVar.j = true;
        dieVarI.g(dsfVar.l, ob0Var.b, -1);
        w30Var.b(lihVar.Z);
        ao3 ao3Var = ob0Var.d;
        if (ao3Var != null) {
            w30Var.c(ao3Var);
        }
        return dieVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dsf L(defpackage.dsf r13, defpackage.n22 r14) {
        /*
            r12 = this;
            j5h r0 = r12.m
            if (r0 != 0) goto L5
            goto L10
        L5:
            int r1 = r0.c
            r2 = 2
            if (r1 != r2) goto Lb
            goto L10
        Lb:
            int r1 = r0.b
            r2 = 1
            if (r1 != r2) goto L11
        L10:
            return r13
        L11:
            jdc r1 = new jdc
            jkc r3 = new jkc
            r3.<init>(r0)
            r1.<init>(r14, r3)
            r12.t = r1
            j5h r14 = r12.m
            r14.getClass()
            int r14 = r14.c
            r0 = 0
            if (r14 != r2) goto L34
            n22 r14 = r12.c()
            r14.getClass()
            int r14 = r12.h(r14, r0)
            r9 = r14
            goto L35
        L34:
            r9 = r0
        L35:
            j5h r14 = r12.m
            r14.getClass()
            int r14 = r14.c
            if (r14 != r2) goto L48
            ob0 r14 = r13.g
            android.util.Size r14 = r14.a
            android.graphics.Rect r14 = defpackage.bhg.g(r14)
        L46:
            r7 = r14
            goto L4b
        L48:
            android.graphics.Rect r14 = r13.d
            goto L46
        L4b:
            int r5 = r13.f
            int r6 = r13.a
            android.util.Size r14 = defpackage.bhg.d(r7)
            android.util.Size r8 = defpackage.bhg.f(r14, r9)
            j5h r14 = r12.m
            r14.getClass()
            int r14 = r14.c
            if (r14 != r2) goto L79
            n22 r14 = r12.c()
            r14.getClass()
            l22 r1 = r14.n()
            int r1 = r1.h()
            if (r1 != 0) goto L79
            boolean r14 = r14.l()
            if (r14 == 0) goto L79
            r10 = r2
            goto L7a
        L79:
            r10 = r0
        L7a:
            ua0 r3 = new ua0
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r11 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List r14 = java.util.Collections.singletonList(r3)
            tb0 r0 = new tb0
            r0.<init>(r13, r14)
            jdc r13 = r12.t
            k65 r13 = r13.E(r0)
            java.lang.Object r13 = r13.get(r3)
            dsf r13 = (defpackage.dsf) r13
            java.util.Objects.requireNonNull(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlf.L(dsf, n22):dsf");
    }

    @Override // defpackage.uwg
    public final xwg f(boolean z, axg axgVar) {
        xlf xlfVar = this.p;
        ao3 ao3VarA = axgVar.a(xlfVar.w(), 1);
        if (z) {
            ao3VarA = ao3.s(ao3VarA, xlfVar.a);
        }
        if (ao3VarA == null) {
            return null;
        }
        return ((nud) l(ao3VarA)).q();
    }

    @Override // defpackage.uwg
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.uwg
    public final wwg l(ao3 ao3Var) {
        return new nud(x8a.k(ao3Var));
    }

    @Override // defpackage.uwg
    public final void s() {
        lih lihVar = this.q;
        Iterator it = lihVar.a.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            kih kihVar = (kih) lihVar.c.get(uwgVar);
            Objects.requireNonNull(kihVar);
            uwgVar.a(kihVar, null, null, uwgVar.f(true, lihVar.o));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    @Override // defpackage.uwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xwg u(defpackage.l22 r14, defpackage.wwg r15) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlf.u(l22, wwg):xwg");
    }

    @Override // defpackage.uwg
    public final void v() {
        Iterator it = this.q.a.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            uwgVar.v();
            uwgVar.t();
        }
    }

    @Override // defpackage.uwg
    public final void w() {
        Iterator it = this.q.a.iterator();
        while (it.hasNext()) {
            ((uwg) it.next()).w();
        }
    }

    @Override // defpackage.uwg
    public final ob0 x(ao3 ao3Var) {
        this.A.f(ao3Var);
        Object[] objArr = {this.A.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        xa6 xa6VarA = this.g.a();
        xa6VarA.d = ao3Var;
        return xa6VarA.b();
    }

    @Override // defpackage.uwg
    public final ob0 y(ob0 ob0Var, ob0 ob0Var2) {
        E(G(e(), i() == null ? null : i().n().d(), this.f, ob0Var, ob0Var2));
        p();
        return ob0Var;
    }

    @Override // defpackage.uwg
    public final void z() {
        F();
        lih lihVar = this.q;
        Iterator it = lihVar.a.iterator();
        while (it.hasNext()) {
            uwg uwgVar = (uwg) it.next();
            kih kihVar = (kih) lihVar.c.get(uwgVar);
            Objects.requireNonNull(kihVar);
            uwgVar.D(kihVar);
        }
    }
}
