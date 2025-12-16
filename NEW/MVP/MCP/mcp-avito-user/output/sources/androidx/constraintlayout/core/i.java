package androidx.constraintlayout.core;

import androidx.appcompat.app.r;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class i implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public int f43236a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f43237b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f43238c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f43239d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f43240e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f43241f;

    /* renamed from: g, reason: collision with root package name */
    public int f43242g;

    /* renamed from: h, reason: collision with root package name */
    public int f43243h;

    @Override // androidx.constraintlayout.core.b.a
    public final boolean a(SolverVariable solverVariable) {
        m(solverVariable);
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void b(SolverVariable solverVariable, float f12) {
        if (f12 > -0.001f && f12 < 0.001f) {
            i(solverVariable, true);
            return;
        }
        int i12 = 0;
        if (this.f43242g == 0) {
            l(0, solverVariable, f12);
            throw null;
        }
        m(solverVariable);
        int i13 = this.f43242g + 1;
        int i14 = this.f43236a;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            this.f43238c = Arrays.copyOf(this.f43238c, i15);
            this.f43239d = Arrays.copyOf(this.f43239d, i15);
            this.f43240e = Arrays.copyOf(this.f43240e, i15);
            this.f43241f = Arrays.copyOf(this.f43241f, i15);
            this.f43237b = Arrays.copyOf(this.f43237b, i15);
            for (int i16 = this.f43236a; i16 < i15; i16++) {
                this.f43238c[i16] = -1;
                this.f43237b[i16] = -1;
            }
            this.f43236a = i15;
        }
        int i17 = this.f43242g;
        int i18 = this.f43243h;
        int i19 = -1;
        for (int i22 = 0; i22 < i17; i22++) {
            int i23 = this.f43238c[i18];
            int i24 = solverVariable.f43176c;
            if (i23 == i24) {
                this.f43239d[i18] = f12;
                return;
            }
            if (i23 < i24) {
                i19 = i18;
            }
            i18 = this.f43241f[i18];
            if (i18 == -1) {
                break;
            }
        }
        while (true) {
            if (i12 >= this.f43236a) {
                i12 = -1;
                break;
            } else if (this.f43238c[i12] == -1) {
                break;
            } else {
                i12++;
            }
        }
        l(i12, solverVariable, f12);
        if (i19 != -1) {
            this.f43240e[i12] = i19;
            int[] iArr = this.f43241f;
            iArr[i12] = iArr[i19];
            iArr[i19] = i12;
        } else {
            this.f43240e[i12] = -1;
            if (this.f43242g > 0) {
                this.f43241f[i12] = this.f43243h;
                this.f43243h = i12;
            } else {
                this.f43241f[i12] = -1;
            }
        }
        int i25 = this.f43241f[i12];
        if (i25 == -1) {
            throw null;
        }
        this.f43240e[i25] = i12;
        throw null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void c(float f12) {
        int i12 = this.f43242g;
        int i13 = this.f43243h;
        for (int i14 = 0; i14 < i12; i14++) {
            float[] fArr = this.f43239d;
            fArr[i13] = fArr[i13] / f12;
            i13 = this.f43241f[i13];
            if (i13 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i12 = this.f43242g;
        for (int i13 = 0; i13 < i12; i13++) {
            if (f(i13) != null) {
                throw null;
            }
        }
        for (int i14 = 0; i14 < this.f43236a; i14++) {
            this.f43238c[i14] = -1;
            this.f43237b[i14] = -1;
        }
        this.f43242g = 0;
        this.f43243h = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void d() {
        int i12 = this.f43242g;
        int i13 = this.f43243h;
        for (int i14 = 0; i14 < i12; i14++) {
            float[] fArr = this.f43239d;
            fArr[i13] = fArr[i13] * (-1.0f);
            i13 = this.f43241f[i13];
            if (i13 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float e(int i12) {
        int i13 = this.f43242g;
        int i14 = this.f43243h;
        for (int i15 = 0; i15 < i13; i15++) {
            if (i15 == i12) {
                return this.f43239d[i14];
            }
            i14 = this.f43241f[i14];
            if (i14 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final SolverVariable f(int i12) {
        int i13 = this.f43242g;
        if (i13 == 0) {
            return null;
        }
        int i14 = this.f43243h;
        for (int i15 = 0; i15 < i13; i15++) {
            if (i15 == i12 && i14 != -1) {
                throw null;
            }
            i14 = this.f43241f[i14];
            if (i14 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float g(SolverVariable solverVariable) {
        m(solverVariable);
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void h(SolverVariable solverVariable, float f12, boolean z12) {
        if (f12 <= -0.001f || f12 >= 0.001f) {
            m(solverVariable);
            b(solverVariable, f12);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable, boolean z12) {
        m(solverVariable);
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final int j() {
        return this.f43242g;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float k(b bVar, boolean z12) {
        g(bVar.f43203a);
        i(bVar.f43203a, z12);
        i iVar = (i) bVar.f43206d;
        int i12 = iVar.f43242g;
        int i13 = 0;
        while (i12 > 0) {
            if (iVar.f43238c[i13] != -1) {
                float f12 = iVar.f43239d[i13];
                throw null;
            }
            i13++;
        }
        return 0.0f;
    }

    public final void l(int i12, SolverVariable solverVariable, float f12) {
        this.f43238c[i12] = solverVariable.f43176c;
        this.f43239d[i12] = f12;
        this.f43240e[i12] = -1;
        this.f43241f[i12] = -1;
        throw null;
    }

    public final int m(SolverVariable solverVariable) {
        if (this.f43242g == 0 || solverVariable == null) {
            return -1;
        }
        throw null;
    }

    public final String toString() {
        String str = hashCode() + " { ";
        int i12 = this.f43242g;
        for (int i13 = 0; i13 < i12; i13++) {
            SolverVariable solverVariableF = f(i13);
            if (solverVariableF != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(solverVariableF);
                sb2.append(" = ");
                sb2.append(e(i13));
                sb2.append(" ");
                m(solverVariableF);
                int i14 = this.f43240e[-1];
                throw null;
            }
        }
        return r.q(str, " }");
    }
}
