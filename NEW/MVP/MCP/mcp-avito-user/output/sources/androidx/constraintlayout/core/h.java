package androidx.constraintlayout.core;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.core.b {

    /* renamed from: f, reason: collision with root package name */
    public SolverVariable[] f43230f;

    /* renamed from: g, reason: collision with root package name */
    public SolverVariable[] f43231g;

    /* renamed from: h, reason: collision with root package name */
    public int f43232h;

    /* renamed from: i, reason: collision with root package name */
    public b f43233i;

    /* compiled from: PriorityGoalRow.java */
    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f43176c - solverVariable2.f43176c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public SolverVariable f43234a;

        public b() {
        }

        public final String toString() {
            String strD = "[ ";
            if (this.f43234a != null) {
                for (int i12 = 0; i12 < 9; i12++) {
                    strD = G.d(this.f43234a.f43182i[i12], " ", H.r(strD));
                }
            }
            StringBuilder sbZ = r.z(strD, "] ");
            sbZ.append(this.f43234a);
            return sbZ.toString();
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public final SolverVariable a(boolean[] zArr) {
        int i12 = -1;
        for (int i13 = 0; i13 < this.f43232h; i13++) {
            SolverVariable[] solverVariableArr = this.f43230f;
            SolverVariable solverVariable = solverVariableArr[i13];
            if (!zArr[solverVariable.f43176c]) {
                b bVar = this.f43233i;
                bVar.f43234a = solverVariable;
                int i14 = 8;
                if (i12 == -1) {
                    while (i14 >= 0) {
                        float f12 = bVar.f43234a.f43182i[i14];
                        if (f12 <= 0.0f) {
                            if (f12 < 0.0f) {
                                i12 = i13;
                                break;
                            }
                            i14--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i12];
                    while (true) {
                        if (i14 >= 0) {
                            float f13 = solverVariable2.f43182i[i14];
                            float f14 = bVar.f43234a.f43182i[i14];
                            if (f14 == f13) {
                                i14--;
                            } else if (f14 < f13) {
                            }
                        }
                    }
                }
            }
        }
        if (i12 == -1) {
            return null;
        }
        return this.f43230f[i12];
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        return this.f43232h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(e eVar, androidx.constraintlayout.core.b bVar, boolean z12) {
        SolverVariable solverVariable = bVar.f43203a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f43206d;
        int iJ2 = aVar.j();
        for (int i12 = 0; i12 < iJ2; i12++) {
            SolverVariable solverVariableF = aVar.f(i12);
            float fE2 = aVar.e(i12);
            b bVar2 = this.f43233i;
            bVar2.f43234a = solverVariableF;
            boolean z13 = solverVariableF.f43175b;
            float[] fArr = solverVariable.f43182i;
            if (z13) {
                boolean z14 = true;
                for (int i13 = 0; i13 < 9; i13++) {
                    float[] fArr2 = bVar2.f43234a.f43182i;
                    float f12 = (fArr[i13] * fE2) + fArr2[i13];
                    fArr2[i13] = f12;
                    if (Math.abs(f12) < 1.0E-4f) {
                        bVar2.f43234a.f43182i[i13] = 0.0f;
                    } else {
                        z14 = false;
                    }
                }
                if (z14) {
                    h.this.k(bVar2.f43234a);
                }
            } else {
                for (int i14 = 0; i14 < 9; i14++) {
                    float f13 = fArr[i14];
                    if (f13 != 0.0f) {
                        float f14 = f13 * fE2;
                        if (Math.abs(f14) < 1.0E-4f) {
                            f14 = 0.0f;
                        }
                        bVar2.f43234a.f43182i[i14] = f14;
                    } else {
                        bVar2.f43234a.f43182i[i14] = 0.0f;
                    }
                }
                j(solverVariableF);
            }
            this.f43204b = (bVar.f43204b * fE2) + this.f43204b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i12;
        int i13 = this.f43232h + 1;
        SolverVariable[] solverVariableArr = this.f43230f;
        if (i13 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f43230f = solverVariableArr2;
            this.f43231g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f43230f;
        int i14 = this.f43232h;
        solverVariableArr3[i14] = solverVariable;
        int i15 = i14 + 1;
        this.f43232h = i15;
        if (i15 > 1 && solverVariableArr3[i14].f43176c > solverVariable.f43176c) {
            int i16 = 0;
            while (true) {
                i12 = this.f43232h;
                if (i16 >= i12) {
                    break;
                }
                this.f43231g[i16] = this.f43230f[i16];
                i16++;
            }
            Arrays.sort(this.f43231g, 0, i12, new a());
            for (int i17 = 0; i17 < this.f43232h; i17++) {
                this.f43230f[i17] = this.f43231g[i17];
            }
        }
        solverVariable.f43175b = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i12 = 0;
        while (i12 < this.f43232h) {
            if (this.f43230f[i12] == solverVariable) {
                while (true) {
                    int i13 = this.f43232h;
                    if (i12 >= i13 - 1) {
                        this.f43232h = i13 - 1;
                        solverVariable.f43175b = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f43230f;
                        int i14 = i12 + 1;
                        solverVariableArr[i12] = solverVariableArr[i14];
                        i12 = i14;
                    }
                }
            } else {
                i12++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        String strD = G.d(this.f43204b, ") : ", new StringBuilder(" goal -> ("));
        for (int i12 = 0; i12 < this.f43232h; i12++) {
            SolverVariable solverVariable = this.f43230f[i12];
            b bVar = this.f43233i;
            bVar.f43234a = solverVariable;
            strD = strD + bVar + " ";
        }
        return strD;
    }
}
