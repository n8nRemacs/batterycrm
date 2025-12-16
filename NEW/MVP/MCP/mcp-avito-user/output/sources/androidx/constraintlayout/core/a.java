package androidx.constraintlayout.core;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final b f43194b;

    /* renamed from: c, reason: collision with root package name */
    public final c f43195c;

    /* renamed from: a, reason: collision with root package name */
    public int f43193a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f43196d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f43197e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f43198f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f43199g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f43200h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f43201i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43202j = false;

    public a(b bVar, c cVar) {
        this.f43194b = bVar;
        this.f43195c = cVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final boolean a(SolverVariable solverVariable) {
        int i12 = this.f43200h;
        if (i12 == -1) {
            return false;
        }
        for (int i13 = 0; i12 != -1 && i13 < this.f43193a; i13++) {
            if (this.f43197e[i12] == solverVariable.f43176c) {
                return true;
            }
            i12 = this.f43198f[i12];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void b(SolverVariable solverVariable, float f12) {
        if (f12 == 0.0f) {
            i(solverVariable, true);
            return;
        }
        int i12 = this.f43200h;
        b bVar = this.f43194b;
        if (i12 == -1) {
            this.f43200h = 0;
            this.f43199g[0] = f12;
            this.f43197e[0] = solverVariable.f43176c;
            this.f43198f[0] = -1;
            solverVariable.f43186m++;
            solverVariable.a(bVar);
            this.f43193a++;
            if (this.f43202j) {
                return;
            }
            int i13 = this.f43201i + 1;
            this.f43201i = i13;
            int[] iArr = this.f43197e;
            if (i13 >= iArr.length) {
                this.f43202j = true;
                this.f43201i = iArr.length - 1;
                return;
            }
            return;
        }
        int i14 = -1;
        for (int i15 = 0; i12 != -1 && i15 < this.f43193a; i15++) {
            int i16 = this.f43197e[i12];
            int i17 = solverVariable.f43176c;
            if (i16 == i17) {
                this.f43199g[i12] = f12;
                return;
            }
            if (i16 < i17) {
                i14 = i12;
            }
            i12 = this.f43198f[i12];
        }
        int length = this.f43201i;
        int i18 = length + 1;
        if (this.f43202j) {
            int[] iArr2 = this.f43197e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i18;
        }
        int[] iArr3 = this.f43197e;
        if (length >= iArr3.length && this.f43193a < iArr3.length) {
            int i19 = 0;
            while (true) {
                int[] iArr4 = this.f43197e;
                if (i19 >= iArr4.length) {
                    break;
                }
                if (iArr4[i19] == -1) {
                    length = i19;
                    break;
                }
                i19++;
            }
        }
        int[] iArr5 = this.f43197e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i22 = this.f43196d * 2;
            this.f43196d = i22;
            this.f43202j = false;
            this.f43201i = length - 1;
            this.f43199g = Arrays.copyOf(this.f43199g, i22);
            this.f43197e = Arrays.copyOf(this.f43197e, this.f43196d);
            this.f43198f = Arrays.copyOf(this.f43198f, this.f43196d);
        }
        this.f43197e[length] = solverVariable.f43176c;
        this.f43199g[length] = f12;
        if (i14 != -1) {
            int[] iArr6 = this.f43198f;
            iArr6[length] = iArr6[i14];
            iArr6[i14] = length;
        } else {
            this.f43198f[length] = this.f43200h;
            this.f43200h = length;
        }
        solverVariable.f43186m++;
        solverVariable.a(bVar);
        int i23 = this.f43193a + 1;
        this.f43193a = i23;
        if (!this.f43202j) {
            this.f43201i++;
        }
        int[] iArr7 = this.f43197e;
        if (i23 >= iArr7.length) {
            this.f43202j = true;
        }
        if (this.f43201i >= iArr7.length) {
            this.f43202j = true;
            this.f43201i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void c(float f12) {
        int i12 = this.f43200h;
        for (int i13 = 0; i12 != -1 && i13 < this.f43193a; i13++) {
            float[] fArr = this.f43199g;
            fArr[i12] = fArr[i12] / f12;
            i12 = this.f43198f[i12];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i12 = this.f43200h;
        for (int i13 = 0; i12 != -1 && i13 < this.f43193a; i13++) {
            SolverVariable solverVariable = this.f43195c.f43210c[this.f43197e[i12]];
            if (solverVariable != null) {
                solverVariable.b(this.f43194b);
            }
            i12 = this.f43198f[i12];
        }
        this.f43200h = -1;
        this.f43201i = -1;
        this.f43202j = false;
        this.f43193a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void d() {
        int i12 = this.f43200h;
        for (int i13 = 0; i12 != -1 && i13 < this.f43193a; i13++) {
            float[] fArr = this.f43199g;
            fArr[i12] = fArr[i12] * (-1.0f);
            i12 = this.f43198f[i12];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float e(int i12) {
        int i13 = this.f43200h;
        for (int i14 = 0; i13 != -1 && i14 < this.f43193a; i14++) {
            if (i14 == i12) {
                return this.f43199g[i13];
            }
            i13 = this.f43198f[i13];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final SolverVariable f(int i12) {
        int i13 = this.f43200h;
        for (int i14 = 0; i13 != -1 && i14 < this.f43193a; i14++) {
            if (i14 == i12) {
                return this.f43195c.f43210c[this.f43197e[i13]];
            }
            i13 = this.f43198f[i13];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float g(SolverVariable solverVariable) {
        int i12 = this.f43200h;
        for (int i13 = 0; i12 != -1 && i13 < this.f43193a; i13++) {
            if (this.f43197e[i12] == solverVariable.f43176c) {
                return this.f43199g[i12];
            }
            i12 = this.f43198f[i12];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void h(SolverVariable solverVariable, float f12, boolean z12) {
        if (f12 <= -0.001f || f12 >= 0.001f) {
            int i12 = this.f43200h;
            b bVar = this.f43194b;
            if (i12 == -1) {
                this.f43200h = 0;
                this.f43199g[0] = f12;
                this.f43197e[0] = solverVariable.f43176c;
                this.f43198f[0] = -1;
                solverVariable.f43186m++;
                solverVariable.a(bVar);
                this.f43193a++;
                if (this.f43202j) {
                    return;
                }
                int i13 = this.f43201i + 1;
                this.f43201i = i13;
                int[] iArr = this.f43197e;
                if (i13 >= iArr.length) {
                    this.f43202j = true;
                    this.f43201i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i14 = -1;
            for (int i15 = 0; i12 != -1 && i15 < this.f43193a; i15++) {
                int i16 = this.f43197e[i12];
                int i17 = solverVariable.f43176c;
                if (i16 == i17) {
                    float[] fArr = this.f43199g;
                    float f13 = fArr[i12] + f12;
                    if (f13 > -0.001f && f13 < 0.001f) {
                        f13 = 0.0f;
                    }
                    fArr[i12] = f13;
                    if (f13 == 0.0f) {
                        if (i12 == this.f43200h) {
                            this.f43200h = this.f43198f[i12];
                        } else {
                            int[] iArr2 = this.f43198f;
                            iArr2[i14] = iArr2[i12];
                        }
                        if (z12) {
                            solverVariable.b(bVar);
                        }
                        if (this.f43202j) {
                            this.f43201i = i12;
                        }
                        solverVariable.f43186m--;
                        this.f43193a--;
                        return;
                    }
                    return;
                }
                if (i16 < i17) {
                    i14 = i12;
                }
                i12 = this.f43198f[i12];
            }
            int length = this.f43201i;
            int i18 = length + 1;
            if (this.f43202j) {
                int[] iArr3 = this.f43197e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i18;
            }
            int[] iArr4 = this.f43197e;
            if (length >= iArr4.length && this.f43193a < iArr4.length) {
                int i19 = 0;
                while (true) {
                    int[] iArr5 = this.f43197e;
                    if (i19 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i19] == -1) {
                        length = i19;
                        break;
                    }
                    i19++;
                }
            }
            int[] iArr6 = this.f43197e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i22 = this.f43196d * 2;
                this.f43196d = i22;
                this.f43202j = false;
                this.f43201i = length - 1;
                this.f43199g = Arrays.copyOf(this.f43199g, i22);
                this.f43197e = Arrays.copyOf(this.f43197e, this.f43196d);
                this.f43198f = Arrays.copyOf(this.f43198f, this.f43196d);
            }
            this.f43197e[length] = solverVariable.f43176c;
            this.f43199g[length] = f12;
            if (i14 != -1) {
                int[] iArr7 = this.f43198f;
                iArr7[length] = iArr7[i14];
                iArr7[i14] = length;
            } else {
                this.f43198f[length] = this.f43200h;
                this.f43200h = length;
            }
            solverVariable.f43186m++;
            solverVariable.a(bVar);
            this.f43193a++;
            if (!this.f43202j) {
                this.f43201i++;
            }
            int i23 = this.f43201i;
            int[] iArr8 = this.f43197e;
            if (i23 >= iArr8.length) {
                this.f43202j = true;
                this.f43201i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable, boolean z12) {
        int i12 = this.f43200h;
        if (i12 == -1) {
            return 0.0f;
        }
        int i13 = 0;
        int i14 = -1;
        while (i12 != -1 && i13 < this.f43193a) {
            if (this.f43197e[i12] == solverVariable.f43176c) {
                if (i12 == this.f43200h) {
                    this.f43200h = this.f43198f[i12];
                } else {
                    int[] iArr = this.f43198f;
                    iArr[i14] = iArr[i12];
                }
                if (z12) {
                    solverVariable.b(this.f43194b);
                }
                solverVariable.f43186m--;
                this.f43193a--;
                this.f43197e[i12] = -1;
                if (this.f43202j) {
                    this.f43201i = i12;
                }
                return this.f43199g[i12];
            }
            i13++;
            i14 = i12;
            i12 = this.f43198f[i12];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final int j() {
        return this.f43193a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float k(b bVar, boolean z12) {
        float fG2 = g(bVar.f43203a);
        i(bVar.f43203a, z12);
        b.a aVar = bVar.f43206d;
        int iJ2 = aVar.j();
        for (int i12 = 0; i12 < iJ2; i12++) {
            SolverVariable solverVariableF = aVar.f(i12);
            h(solverVariableF, aVar.g(solverVariableF) * fG2, z12);
        }
        return fG2;
    }

    public final String toString() {
        int i12 = this.f43200h;
        String string = "";
        for (int i13 = 0; i12 != -1 && i13 < this.f43193a; i13++) {
            StringBuilder sbR = H.r(G.d(this.f43199g[i12], " : ", H.r(r.q(string, " -> "))));
            sbR.append(this.f43195c.f43210c[this.f43197e[i12]]);
            string = sbR.toString();
            i12 = this.f43198f[i12];
        }
        return string;
    }
}
