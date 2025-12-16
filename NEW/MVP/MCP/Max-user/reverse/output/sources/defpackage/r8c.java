package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r8c extends uwg {
    public static final p8c x = new p8c();
    public static final a07 y = ayi.d();
    public q8c p;
    public Executor q;
    public die r;
    public zr4 s;
    public dsf t;
    public msf u;
    public jdc v;
    public eie w;

    @Override // defpackage.uwg
    public final void C(Rect rect) {
        this.i = rect;
        n22 n22VarC = c();
        dsf dsfVar = this.t;
        if (n22VarC == null || dsfVar == null) {
            return;
        }
        jei.d(new vu0(dsfVar, h(n22VarC, n(n22VarC)), b(), 5));
    }

    public final void F() {
        eie eieVar = this.w;
        if (eieVar != null) {
            eieVar.b();
            this.w = null;
        }
        zr4 zr4Var = this.s;
        if (zr4Var != null) {
            zr4Var.a();
            this.s = null;
        }
        jdc jdcVar = this.v;
        if (jdcVar != null) {
            jdcVar.C();
            this.v = null;
        }
        dsf dsfVar = this.t;
        if (dsfVar != null) {
            dsfVar.c();
            this.t = null;
        }
        this.u = null;
    }

    public final void G(q8c q8cVar) {
        jei.b();
        if (q8cVar == null) {
            this.p = null;
            this.c = 2;
            r();
            return;
        }
        this.p = q8cVar;
        this.q = y;
        ob0 ob0Var = this.g;
        if ((ob0Var != null ? ob0Var.a : null) != null) {
            H((s8c) this.f, ob0Var);
            q();
        }
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(s8c s8cVar, ob0 ob0Var) {
        jei.b();
        n22 n22VarC = c();
        Objects.requireNonNull(n22VarC);
        F();
        z5j.f(null, this.t == null);
        Matrix matrix = this.j;
        boolean zL = n22VarC.l();
        Size size = ob0Var.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        dsf dsfVar = new dsf(1, 34, ob0Var, matrix, zL, rect, h(n22VarC, n(n22VarC)), b(), n22VarC.l() && n(n22VarC));
        this.t = dsfVar;
        j5h j5hVar = this.m;
        if (j5hVar != null) {
            this.v = new jdc(n22VarC, new jkc(j5hVar));
            this.t.a(new awa(12, this));
            dsf dsfVar2 = this.t;
            int i = dsfVar2.f;
            int i2 = dsfVar2.a;
            Rect rect2 = dsfVar2.d;
            ua0 ua0Var = new ua0(UUID.randomUUID(), i, i2, rect2, bhg.f(bhg.d(rect2), dsfVar2.i), dsfVar2.i, dsfVar2.e, false);
            dsf dsfVar3 = (dsf) this.v.E(new tb0(this.t, Collections.singletonList(ua0Var))).get(ua0Var);
            Objects.requireNonNull(dsfVar3);
            dsfVar3.a(new d8c(this, 1, n22VarC));
            this.u = dsfVar3.d(n22VarC, true);
            dsf dsfVar4 = this.t;
            dsfVar4.getClass();
            jei.b();
            dsfVar4.b();
            z5j.f("Consumer can only be linked once.", !dsfVar4.j);
            dsfVar4.j = true;
            this.s = dsfVar4.l;
        } else {
            dsfVar.a(new awa(12, this));
            msf msfVarD = this.t.d(n22VarC, true);
            this.u = msfVarD;
            this.s = msfVarD.l;
        }
        if (this.p != null) {
            n22 n22VarC2 = c();
            dsf dsfVar5 = this.t;
            if (n22VarC2 != null && dsfVar5 != null) {
                jei.d(new vu0(dsfVar5, h(n22VarC2, n(n22VarC2)), b(), 5));
            }
            q8c q8cVar = this.p;
            q8cVar.getClass();
            msf msfVar = this.u;
            msfVar.getClass();
            this.q.execute(new d8c(q8cVar, 2, msfVar));
        }
        die dieVarI = die.i(s8cVar, ob0Var.a);
        w30 w30Var = (w30) dieVarI.b;
        Range range = ob0Var.c;
        w30Var.getClass();
        ((x8a) w30Var.f).n(h52.k, range);
        int iB = s8cVar.B();
        if (iB != 0) {
            w30Var.getClass();
            if (iB != 0) {
                ((x8a) w30Var.f).n(xwg.q0, Integer.valueOf(iB));
            }
        }
        ao3 ao3Var = ob0Var.d;
        if (ao3Var != null) {
            w30Var.c(ao3Var);
        }
        if (this.p != null) {
            dieVarI.g(this.s, ob0Var.b, ((Integer) ((bf7) this.f).d(bf7.C, -1)).intValue());
        }
        eie eieVar = this.w;
        if (eieVar != null) {
            eieVar.b();
        }
        eie eieVar2 = new eie(new xc7(3, this));
        this.w = eieVar2;
        dieVarI.f = eieVar2;
        this.r = dieVarI;
        Object[] objArr = {dieVarI.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.uwg
    public final xwg f(boolean z, axg axgVar) {
        x.getClass();
        s8c s8cVar = p8c.a;
        ao3 ao3VarA = axgVar.a(s8cVar.w(), 1);
        if (z) {
            ao3VarA = ao3.s(ao3VarA, s8cVar);
        }
        if (ao3VarA == null) {
            return null;
        }
        return new s8c(fjb.a(((ad7) l(ao3VarA)).b));
    }

    @Override // defpackage.uwg
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.uwg
    public final wwg l(ao3 ao3Var) {
        return new ad7(x8a.k(ao3Var), 2);
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    @Override // defpackage.uwg
    public final xwg u(l22 l22Var, wwg wwgVar) {
        ((x8a) wwgVar.o()).n(re7.x, 34);
        return wwgVar.q();
    }

    @Override // defpackage.uwg
    public final ob0 x(ao3 ao3Var) {
        this.r.f(ao3Var);
        Object[] objArr = {this.r.h()};
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
        H((s8c) this.f, ob0Var);
        return ob0Var;
    }

    @Override // defpackage.uwg
    public final void z() {
        F();
    }
}
