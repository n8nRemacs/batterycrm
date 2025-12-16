package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.e;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: d, reason: collision with root package name */
    public final a f43206d;

    /* renamed from: a, reason: collision with root package name */
    public SolverVariable f43203a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f43204b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<SolverVariable> f43205c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f43207e = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        boolean a(SolverVariable solverVariable);

        void b(SolverVariable solverVariable, float f12);

        void c(float f12);

        void clear();

        void d();

        float e(int i12);

        SolverVariable f(int i12);

        float g(SolverVariable solverVariable);

        void h(SolverVariable solverVariable, float f12, boolean z12);

        float i(SolverVariable solverVariable, boolean z12);

        int j();

        float k(b bVar, boolean z12);
    }

    public b() {
    }

    @Override // androidx.constraintlayout.core.e.a
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(e eVar, int i12) {
        this.f43206d.b(eVar.j(i12), 1.0f);
        this.f43206d.b(eVar.j(i12), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i12) {
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 < 0) {
                i12 *= -1;
                z12 = true;
            }
            this.f43204b = i12;
        }
        if (z12) {
            this.f43206d.b(solverVariable, 1.0f);
            this.f43206d.b(solverVariable2, -1.0f);
            this.f43206d.b(solverVariable3, -1.0f);
        } else {
            this.f43206d.b(solverVariable, -1.0f);
            this.f43206d.b(solverVariable2, 1.0f);
            this.f43206d.b(solverVariable3, 1.0f);
        }
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i12) {
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 < 0) {
                i12 *= -1;
                z12 = true;
            }
            this.f43204b = i12;
        }
        if (z12) {
            this.f43206d.b(solverVariable, 1.0f);
            this.f43206d.b(solverVariable2, -1.0f);
            this.f43206d.b(solverVariable3, 1.0f);
        } else {
            this.f43206d.b(solverVariable, -1.0f);
            this.f43206d.b(solverVariable2, 1.0f);
            this.f43206d.b(solverVariable3, -1.0f);
        }
    }

    public boolean e() {
        return this.f43203a == null && this.f43204b == 0.0f && this.f43206d.j() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iJ2 = this.f43206d.j();
        SolverVariable solverVariable2 = null;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < iJ2; i12++) {
            float fE2 = this.f43206d.e(i12);
            if (fE2 < 0.0f) {
                SolverVariable solverVariableF = this.f43206d.f(i12);
                if ((zArr == null || !zArr[solverVariableF.f43176c]) && solverVariableF != solverVariable && (((type = solverVariableF.f43183j) == SolverVariable.Type.f43188c || type == SolverVariable.Type.f43189d) && fE2 < f12)) {
                    f12 = fE2;
                    solverVariable2 = solverVariableF;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f43203a;
        if (solverVariable2 != null) {
            this.f43206d.b(solverVariable2, -1.0f);
            this.f43203a.f43177d = -1;
            this.f43203a = null;
        }
        float fI2 = this.f43206d.i(solverVariable, true) * (-1.0f);
        this.f43203a = solverVariable;
        if (fI2 == 1.0f) {
            return;
        }
        this.f43204b /= fI2;
        this.f43206d.c(fI2);
    }

    public final void h(e eVar, SolverVariable solverVariable, boolean z12) {
        if (solverVariable == null || !solverVariable.f43180g) {
            return;
        }
        float fG2 = this.f43206d.g(solverVariable);
        this.f43204b = (solverVariable.f43179f * fG2) + this.f43204b;
        this.f43206d.i(solverVariable, z12);
        if (z12) {
            solverVariable.b(this);
        }
        if (this.f43206d.j() == 0) {
            this.f43207e = true;
            eVar.f43213a = true;
        }
    }

    public void i(e eVar, b bVar, boolean z12) {
        float fK2 = this.f43206d.k(bVar, z12);
        this.f43204b = (bVar.f43204b * fK2) + this.f43204b;
        if (z12) {
            bVar.f43203a.b(this);
        }
        if (this.f43203a == null || this.f43206d.j() != 0) {
            return;
        }
        this.f43207e = true;
        eVar.f43213a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f43203a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f43203a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.appcompat.app.r.q(r0, r1)
            float r1 = r10.f43204b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = androidx.compose.foundation.H.r(r0)
            float r1 = r10.f43204b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            androidx.constraintlayout.core.b$a r5 = r10.f43206d
            int r5 = r5.j()
        L3c:
            if (r4 >= r5) goto L9c
            androidx.constraintlayout.core.b$a r6 = r10.f43206d
            androidx.constraintlayout.core.SolverVariable r6 = r6.f(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            androidx.constraintlayout.core.b$a r7 = r10.f43206d
            float r7 = r7.e(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = androidx.appcompat.app.r.q(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = androidx.appcompat.app.r.q(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = androidx.appcompat.app.r.q(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = androidx.appcompat.app.r.q(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.appcompat.app.r.q(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.f43206d = new androidx.constraintlayout.core.a(this, cVar);
    }
}
