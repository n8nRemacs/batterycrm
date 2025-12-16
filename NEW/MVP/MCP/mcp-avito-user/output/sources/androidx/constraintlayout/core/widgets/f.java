package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class f extends ConstraintWidget {

    /* renamed from: u0, reason: collision with root package name */
    public float f43640u0 = -1.0f;

    /* renamed from: v0, reason: collision with root package name */
    public int f43641v0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    public int f43642w0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public ConstraintAnchor f43643x0 = this.f43413K;

    /* renamed from: y0, reason: collision with root package name */
    public int f43644y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f43645z0;

    /* compiled from: Guideline.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43646a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f43646a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43646a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43646a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43646a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43646a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43646a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43646a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43646a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43646a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.f43421S.clear();
        this.f43421S.add(this.f43643x0);
        int length = this.f43420R.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f43420R[i12] = this.f43643x0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean E() {
        return this.f43645z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.f43645z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void U(androidx.constraintlayout.core.e eVar, boolean z12) {
        if (this.f43424V == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f43643x0;
        eVar.getClass();
        int iN2 = androidx.constraintlayout.core.e.n(constraintAnchor);
        if (this.f43644y0 == 1) {
            this.f43430a0 = iN2;
            this.f43432b0 = 0;
            P(this.f43424V.o());
            S(0);
            return;
        }
        this.f43430a0 = 0;
        this.f43432b0 = iN2;
        S(this.f43424V.u());
        P(0);
    }

    public final void V(int i12) {
        this.f43643x0.l(i12);
        this.f43645z0 = true;
    }

    public final void W(int i12) {
        if (this.f43644y0 == i12) {
            return;
        }
        this.f43644y0 = i12;
        ArrayList<ConstraintAnchor> arrayList = this.f43421S;
        arrayList.clear();
        if (this.f43644y0 == 1) {
            this.f43643x0 = this.f43412J;
        } else {
            this.f43643x0 = this.f43413K;
        }
        arrayList.add(this.f43643x0);
        ConstraintAnchor[] constraintAnchorArr = this.f43420R;
        int length = constraintAnchorArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            constraintAnchorArr[i13] = this.f43643x0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.e eVar, boolean z12) {
        d dVar = (d) this.f43424V;
        if (dVar == null) {
            return;
        }
        Object objM = dVar.m(ConstraintAnchor.Type.f43393b);
        Object objM2 = dVar.m(ConstraintAnchor.Type.f43395d);
        ConstraintWidget constraintWidget = this.f43424V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43476c;
        boolean z13 = constraintWidget != null && constraintWidget.f43423U[0] == dimensionBehaviour;
        if (this.f43644y0 == 0) {
            objM = dVar.m(ConstraintAnchor.Type.f43394c);
            objM2 = dVar.m(ConstraintAnchor.Type.f43396e);
            ConstraintWidget constraintWidget2 = this.f43424V;
            z13 = constraintWidget2 != null && constraintWidget2.f43423U[1] == dimensionBehaviour;
        }
        if (this.f43645z0) {
            ConstraintAnchor constraintAnchor = this.f43643x0;
            if (constraintAnchor.f43386c) {
                SolverVariable solverVariableK = eVar.k(constraintAnchor);
                eVar.d(solverVariableK, this.f43643x0.d());
                if (this.f43641v0 != -1) {
                    if (z13) {
                        eVar.f(eVar.k(objM2), solverVariableK, 0, 5);
                    }
                } else if (this.f43642w0 != -1 && z13) {
                    SolverVariable solverVariableK2 = eVar.k(objM2);
                    eVar.f(solverVariableK, eVar.k(objM), 0, 5);
                    eVar.f(solverVariableK2, solverVariableK, 0, 5);
                }
                this.f43645z0 = false;
                return;
            }
        }
        if (this.f43641v0 != -1) {
            SolverVariable solverVariableK3 = eVar.k(this.f43643x0);
            eVar.e(solverVariableK3, eVar.k(objM), this.f43641v0, 8);
            if (z13) {
                eVar.f(eVar.k(objM2), solverVariableK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f43642w0 != -1) {
            SolverVariable solverVariableK4 = eVar.k(this.f43643x0);
            SolverVariable solverVariableK5 = eVar.k(objM2);
            eVar.e(solverVariableK4, solverVariableK5, -this.f43642w0, 8);
            if (z13) {
                eVar.f(solverVariableK4, eVar.k(objM), 0, 5);
                eVar.f(solverVariableK5, solverVariableK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f43640u0 != -1.0f) {
            SolverVariable solverVariableK6 = eVar.k(this.f43643x0);
            SolverVariable solverVariableK7 = eVar.k(objM2);
            float f12 = this.f43640u0;
            androidx.constraintlayout.core.b bVarL = eVar.l();
            bVarL.f43206d.b(solverVariableK6, -1.0f);
            bVarL.f43206d.b(solverVariableK7, f12);
            eVar.c(bVarL);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean f() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        f fVar = (f) constraintWidget;
        this.f43640u0 = fVar.f43640u0;
        this.f43641v0 = fVar.f43641v0;
        this.f43642w0 = fVar.f43642w0;
        W(fVar.f43644y0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor m(ConstraintAnchor.Type type) {
        int iOrdinal = type.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f43644y0 == 0) {
                return this.f43643x0;
            }
            return null;
        }
        if (this.f43644y0 == 1) {
            return this.f43643x0;
        }
        return null;
    }
}
