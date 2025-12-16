package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.g;
import androidx.constraintlayout.core.h.b;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f43211p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f43212q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final h f43215c;

    /* renamed from: f, reason: collision with root package name */
    public androidx.constraintlayout.core.b[] f43218f;

    /* renamed from: l, reason: collision with root package name */
    public final c f43224l;

    /* renamed from: o, reason: collision with root package name */
    public androidx.constraintlayout.core.b f43227o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f43213a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f43214b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f43216d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f43217e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43219g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f43220h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f43221i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f43222j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f43223k = 32;

    /* renamed from: m, reason: collision with root package name */
    public SolverVariable[] f43225m = new SolverVariable[f43212q];

    /* renamed from: n, reason: collision with root package name */
    public int f43226n = 0;

    /* compiled from: LinearSystem.java */
    public interface a {
        SolverVariable a(boolean[] zArr);
    }

    /* compiled from: LinearSystem.java */
    public class b extends androidx.constraintlayout.core.b {
    }

    public e() {
        this.f43218f = null;
        this.f43218f = new androidx.constraintlayout.core.b[32];
        s();
        c cVar = new c();
        this.f43224l = cVar;
        h hVar = new h(cVar);
        hVar.f43230f = new SolverVariable[128];
        hVar.f43231g = new SolverVariable[128];
        hVar.f43232h = 0;
        hVar.f43233i = hVar.new b();
        this.f43215c = hVar;
        this.f43227o = new androidx.constraintlayout.core.b(cVar);
    }

    public static int n(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f43392i;
        if (solverVariable != null) {
            return (int) (solverVariable.f43179f + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final SolverVariable a(SolverVariable.Type type) {
        g.b bVar = this.f43224l.f43209b;
        int i12 = bVar.f43229b;
        SolverVariable solverVariable = null;
        if (i12 > 0) {
            int i13 = i12 - 1;
            ?? r32 = bVar.f43228a;
            ?? r42 = r32[i13];
            r32[i13] = 0;
            bVar.f43229b = i13;
            solverVariable = r42;
        }
        SolverVariable solverVariable2 = solverVariable;
        if (solverVariable2 == null) {
            solverVariable2 = new SolverVariable(type);
            solverVariable2.f43183j = type;
        } else {
            solverVariable2.c();
            solverVariable2.f43183j = type;
        }
        int i14 = this.f43226n;
        int i15 = f43212q;
        if (i14 >= i15) {
            int i16 = i15 * 2;
            f43212q = i16;
            this.f43225m = (SolverVariable[]) Arrays.copyOf(this.f43225m, i16);
        }
        SolverVariable[] solverVariableArr = this.f43225m;
        int i17 = this.f43226n;
        this.f43226n = i17 + 1;
        solverVariableArr[i17] = solverVariable2;
        return solverVariable2;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i12, float f12, SolverVariable solverVariable3, SolverVariable solverVariable4, int i13, int i14) {
        androidx.constraintlayout.core.b bVarL = l();
        if (solverVariable2 == solverVariable3) {
            bVarL.f43206d.b(solverVariable, 1.0f);
            bVarL.f43206d.b(solverVariable4, 1.0f);
            bVarL.f43206d.b(solverVariable2, -2.0f);
        } else if (f12 == 0.5f) {
            bVarL.f43206d.b(solverVariable, 1.0f);
            bVarL.f43206d.b(solverVariable2, -1.0f);
            bVarL.f43206d.b(solverVariable3, -1.0f);
            bVarL.f43206d.b(solverVariable4, 1.0f);
            if (i12 > 0 || i13 > 0) {
                bVarL.f43204b = (-i12) + i13;
            }
        } else if (f12 <= 0.0f) {
            bVarL.f43206d.b(solverVariable, -1.0f);
            bVarL.f43206d.b(solverVariable2, 1.0f);
            bVarL.f43204b = i12;
        } else if (f12 >= 1.0f) {
            bVarL.f43206d.b(solverVariable4, -1.0f);
            bVarL.f43206d.b(solverVariable3, 1.0f);
            bVarL.f43204b = -i13;
        } else {
            float f13 = 1.0f - f12;
            bVarL.f43206d.b(solverVariable, f13 * 1.0f);
            bVarL.f43206d.b(solverVariable2, f13 * (-1.0f));
            bVarL.f43206d.b(solverVariable3, (-1.0f) * f12);
            bVarL.f43206d.b(solverVariable4, 1.0f * f12);
            if (i12 > 0 || i13 > 0) {
                bVarL.f43204b = (i13 * f12) + ((-i12) * f13);
            }
        }
        if (i14 != 8) {
            bVarL.b(this, i14);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.constraintlayout.core.b r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.e.c(androidx.constraintlayout.core.b):void");
    }

    public final void d(SolverVariable solverVariable, int i12) {
        int i13 = solverVariable.f43177d;
        if (i13 == -1) {
            solverVariable.d(this, i12);
            for (int i14 = 0; i14 < this.f43214b + 1; i14++) {
                SolverVariable solverVariable2 = this.f43224l.f43210c[i14];
            }
            return;
        }
        if (i13 == -1) {
            androidx.constraintlayout.core.b bVarL = l();
            bVarL.f43203a = solverVariable;
            float f12 = i12;
            solverVariable.f43179f = f12;
            bVarL.f43204b = f12;
            bVarL.f43207e = true;
            c(bVarL);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.f43218f[i13];
        if (bVar.f43207e) {
            bVar.f43204b = i12;
            return;
        }
        if (bVar.f43206d.j() == 0) {
            bVar.f43207e = true;
            bVar.f43204b = i12;
            return;
        }
        androidx.constraintlayout.core.b bVarL2 = l();
        if (i12 < 0) {
            bVarL2.f43204b = i12 * (-1);
            bVarL2.f43206d.b(solverVariable, 1.0f);
        } else {
            bVarL2.f43204b = i12;
            bVarL2.f43206d.b(solverVariable, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i12, int i13) {
        if (i13 == 8 && solverVariable2.f43180g && solverVariable.f43177d == -1) {
            solverVariable.d(this, solverVariable2.f43179f + i12);
            return;
        }
        androidx.constraintlayout.core.b bVarL = l();
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 < 0) {
                i12 *= -1;
                z12 = true;
            }
            bVarL.f43204b = i12;
        }
        if (z12) {
            bVarL.f43206d.b(solverVariable, 1.0f);
            bVarL.f43206d.b(solverVariable2, -1.0f);
        } else {
            bVarL.f43206d.b(solverVariable, -1.0f);
            bVarL.f43206d.b(solverVariable2, 1.0f);
        }
        if (i13 != 8) {
            bVarL.b(this, i13);
        }
        c(bVarL);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i12, int i13) {
        androidx.constraintlayout.core.b bVarL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.f43178e = 0;
        bVarL.c(solverVariable, solverVariable2, solverVariableM, i12);
        if (i13 != 8) {
            bVarL.f43206d.b(j(i13), (int) (bVarL.f43206d.g(solverVariableM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i12, int i13) {
        androidx.constraintlayout.core.b bVarL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.f43178e = 0;
        bVarL.d(solverVariable, solverVariable2, solverVariableM, i12);
        if (i13 != 8) {
            bVarL.f43206d.b(j(i13), (int) (bVarL.f43206d.g(solverVariableM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(androidx.constraintlayout.core.b bVar) {
        int i12;
        if (bVar.f43207e) {
            bVar.f43203a.d(this, bVar.f43204b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f43218f;
            int i13 = this.f43222j;
            bVarArr[i13] = bVar;
            SolverVariable solverVariable = bVar.f43203a;
            solverVariable.f43177d = i13;
            this.f43222j = i13 + 1;
            solverVariable.e(this, bVar);
        }
        if (this.f43213a) {
            int i14 = 0;
            while (i14 < this.f43222j) {
                if (this.f43218f[i14] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f43218f[i14];
                if (bVar2 != null && bVar2.f43207e) {
                    bVar2.f43203a.d(this, bVar2.f43204b);
                    this.f43224l.f43208a.a(bVar2);
                    this.f43218f[i14] = null;
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (true) {
                        i12 = this.f43222j;
                        if (i15 >= i12) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f43218f;
                        int i17 = i15 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i15];
                        bVarArr2[i17] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f43203a;
                        if (solverVariable2.f43177d == i15) {
                            solverVariable2.f43177d = i17;
                        }
                        i16 = i15;
                        i15++;
                    }
                    if (i16 < i12) {
                        this.f43218f[i16] = null;
                    }
                    this.f43222j = i12 - 1;
                    i14--;
                }
                i14++;
            }
            this.f43213a = false;
        }
    }

    public final void i() {
        for (int i12 = 0; i12 < this.f43222j; i12++) {
            androidx.constraintlayout.core.b bVar = this.f43218f[i12];
            bVar.f43203a.f43179f = bVar.f43204b;
        }
    }

    public final SolverVariable j(int i12) {
        if (this.f43221i + 1 >= this.f43217e) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.f43189d);
        int i13 = this.f43214b + 1;
        this.f43214b = i13;
        this.f43221i++;
        solverVariableA.f43176c = i13;
        solverVariableA.f43178e = i12;
        this.f43224l.f43210c[i13] = solverVariableA;
        h hVar = this.f43215c;
        hVar.f43233i.f43234a = solverVariableA;
        float[] fArr = solverVariableA.f43182i;
        Arrays.fill(fArr, 0.0f);
        fArr[solverVariableA.f43178e] = 1.0f;
        hVar.j(solverVariableA);
        return solverVariableA;
    }

    public final SolverVariable k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f43221i + 1 >= this.f43217e) {
            o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f43392i;
            if (solverVariable == null) {
                constraintAnchor.k();
                solverVariable = constraintAnchor.f43392i;
            }
            int i12 = solverVariable.f43176c;
            c cVar = this.f43224l;
            if (i12 == -1 || i12 > this.f43214b || cVar.f43210c[i12] == null) {
                if (i12 != -1) {
                    solverVariable.c();
                }
                int i13 = this.f43214b + 1;
                this.f43214b = i13;
                this.f43221i++;
                solverVariable.f43176c = i13;
                solverVariable.f43183j = SolverVariable.Type.f43187b;
                cVar.f43210c[i13] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final androidx.constraintlayout.core.b l() {
        Object obj;
        c cVar = this.f43224l;
        g.b bVar = cVar.f43208a;
        int i12 = bVar.f43229b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            Object[] objArr = bVar.f43228a;
            obj = objArr[i13];
            objArr[i13] = null;
            bVar.f43229b = i13;
        } else {
            obj = null;
        }
        androidx.constraintlayout.core.b bVar2 = (androidx.constraintlayout.core.b) obj;
        if (bVar2 == null) {
            return new androidx.constraintlayout.core.b(cVar);
        }
        bVar2.f43203a = null;
        bVar2.f43206d.clear();
        bVar2.f43204b = 0.0f;
        bVar2.f43207e = false;
        return bVar2;
    }

    public final SolverVariable m() {
        if (this.f43221i + 1 >= this.f43217e) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.f43188c);
        int i12 = this.f43214b + 1;
        this.f43214b = i12;
        this.f43221i++;
        solverVariableA.f43176c = i12;
        this.f43224l.f43210c[i12] = solverVariableA;
        return solverVariableA;
    }

    public final void o() {
        int i12 = this.f43216d * 2;
        this.f43216d = i12;
        this.f43218f = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f43218f, i12);
        c cVar = this.f43224l;
        cVar.f43210c = (SolverVariable[]) Arrays.copyOf(cVar.f43210c, this.f43216d);
        int i13 = this.f43216d;
        this.f43220h = new boolean[i13];
        this.f43217e = i13;
        this.f43223k = i13;
    }

    public final void p() {
        h hVar = this.f43215c;
        if (hVar.e()) {
            i();
            return;
        }
        if (!this.f43219g) {
            q(hVar);
            return;
        }
        for (int i12 = 0; i12 < this.f43222j; i12++) {
            if (!this.f43218f[i12].f43207e) {
                q(hVar);
                return;
            }
        }
        i();
    }

    public final void q(h hVar) {
        int i12 = 0;
        while (true) {
            if (i12 >= this.f43222j) {
                break;
            }
            androidx.constraintlayout.core.b bVar = this.f43218f[i12];
            SolverVariable.Type type = bVar.f43203a.f43183j;
            SolverVariable.Type type2 = SolverVariable.Type.f43187b;
            if (type != type2) {
                float f12 = 0.0f;
                if (bVar.f43204b < 0.0f) {
                    boolean z12 = false;
                    int i13 = 0;
                    while (!z12) {
                        i13++;
                        float f13 = Float.MAX_VALUE;
                        int i14 = 0;
                        int i15 = -1;
                        int i16 = -1;
                        int i17 = 0;
                        while (i14 < this.f43222j) {
                            androidx.constraintlayout.core.b bVar2 = this.f43218f[i14];
                            if (bVar2.f43203a.f43183j != type2 && !bVar2.f43207e && bVar2.f43204b < f12) {
                                int iJ2 = bVar2.f43206d.j();
                                int i18 = 0;
                                while (i18 < iJ2) {
                                    SolverVariable solverVariableF = bVar2.f43206d.f(i18);
                                    float fG2 = bVar2.f43206d.g(solverVariableF);
                                    if (fG2 > f12) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f14 = solverVariableF.f43181h[i19] / fG2;
                                            if ((f14 < f13 && i19 == i17) || i19 > i17) {
                                                i17 = i19;
                                                i16 = solverVariableF.f43176c;
                                                i15 = i14;
                                                f13 = f14;
                                            }
                                        }
                                    }
                                    i18++;
                                    f12 = 0.0f;
                                }
                            }
                            i14++;
                            f12 = 0.0f;
                        }
                        if (i15 != -1) {
                            androidx.constraintlayout.core.b bVar3 = this.f43218f[i15];
                            bVar3.f43203a.f43177d = -1;
                            bVar3.g(this.f43224l.f43210c[i16]);
                            SolverVariable solverVariable = bVar3.f43203a;
                            solverVariable.f43177d = i15;
                            solverVariable.e(this, bVar3);
                        } else {
                            z12 = true;
                        }
                        if (i13 > this.f43221i / 2) {
                            z12 = true;
                        }
                        f12 = 0.0f;
                    }
                }
            }
            i12++;
        }
        r(hVar);
        i();
    }

    public final void r(androidx.constraintlayout.core.b bVar) {
        for (int i12 = 0; i12 < this.f43221i; i12++) {
            this.f43220h[i12] = false;
        }
        boolean z12 = false;
        int i13 = 0;
        while (!z12) {
            i13++;
            if (i13 >= this.f43221i * 2) {
                return;
            }
            SolverVariable solverVariable = bVar.f43203a;
            if (solverVariable != null) {
                this.f43220h[solverVariable.f43176c] = true;
            }
            SolverVariable solverVariableA = bVar.a(this.f43220h);
            if (solverVariableA != null) {
                boolean[] zArr = this.f43220h;
                int i14 = solverVariableA.f43176c;
                if (zArr[i14]) {
                    return;
                } else {
                    zArr[i14] = true;
                }
            }
            if (solverVariableA != null) {
                float f12 = Float.MAX_VALUE;
                int i15 = -1;
                for (int i16 = 0; i16 < this.f43222j; i16++) {
                    androidx.constraintlayout.core.b bVar2 = this.f43218f[i16];
                    if (bVar2.f43203a.f43183j != SolverVariable.Type.f43187b && !bVar2.f43207e && bVar2.f43206d.a(solverVariableA)) {
                        float fG2 = bVar2.f43206d.g(solverVariableA);
                        if (fG2 < 0.0f) {
                            float f13 = (-bVar2.f43204b) / fG2;
                            if (f13 < f12) {
                                i15 = i16;
                                f12 = f13;
                            }
                        }
                    }
                }
                if (i15 > -1) {
                    androidx.constraintlayout.core.b bVar3 = this.f43218f[i15];
                    bVar3.f43203a.f43177d = -1;
                    bVar3.g(solverVariableA);
                    SolverVariable solverVariable2 = bVar3.f43203a;
                    solverVariable2.f43177d = i15;
                    solverVariable2.e(this, bVar3);
                }
            } else {
                z12 = true;
            }
        }
    }

    public final void s() {
        for (int i12 = 0; i12 < this.f43222j; i12++) {
            androidx.constraintlayout.core.b bVar = this.f43218f[i12];
            if (bVar != null) {
                this.f43224l.f43208a.a(bVar);
            }
            this.f43218f[i12] = null;
        }
    }

    public final void t() {
        c cVar;
        int i12 = 0;
        while (true) {
            cVar = this.f43224l;
            SolverVariable[] solverVariableArr = cVar.f43210c;
            if (i12 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i12];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i12++;
        }
        g.b bVar = cVar.f43209b;
        SolverVariable[] solverVariableArr2 = this.f43225m;
        int length = this.f43226n;
        bVar.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i13 = 0; i13 < length; i13++) {
            SolverVariable solverVariable2 = solverVariableArr2[i13];
            int i14 = bVar.f43229b;
            Object[] objArr = bVar.f43228a;
            if (i14 < objArr.length) {
                objArr[i14] = solverVariable2;
                bVar.f43229b = i14 + 1;
            }
        }
        this.f43226n = 0;
        Arrays.fill(cVar.f43210c, (Object) null);
        this.f43214b = 0;
        h hVar = this.f43215c;
        hVar.f43232h = 0;
        hVar.f43204b = 0.0f;
        this.f43221i = 1;
        for (int i15 = 0; i15 < this.f43222j; i15++) {
            androidx.constraintlayout.core.b bVar2 = this.f43218f[i15];
        }
        s();
        this.f43222j = 0;
        this.f43227o = new androidx.constraintlayout.core.b(cVar);
    }
}
