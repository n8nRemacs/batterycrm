package androidx.constraintlayout.core.widgets;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends h {

    /* renamed from: w0, reason: collision with root package name */
    public int f43482w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f43483x0 = true;

    /* renamed from: y0, reason: collision with root package name */
    public int f43484y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f43485z0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean E() {
        return this.f43485z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.f43485z0;
    }

    public final boolean W() {
        int i12;
        int i13;
        int i14;
        boolean z12 = true;
        int i15 = 0;
        while (true) {
            i12 = this.f43648v0;
            if (i15 >= i12) {
                break;
            }
            ConstraintWidget constraintWidget = this.f43647u0[i15];
            if ((this.f43483x0 || constraintWidget.f()) && ((((i13 = this.f43482w0) == 0 || i13 == 1) && !constraintWidget.E()) || (((i14 = this.f43482w0) == 2 || i14 == 3) && !constraintWidget.F()))) {
                z12 = false;
            }
            i15++;
        }
        if (!z12 || i12 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z13 = false;
        for (int i16 = 0; i16 < this.f43648v0; i16++) {
            ConstraintWidget constraintWidget2 = this.f43647u0[i16];
            if (this.f43483x0 || constraintWidget2.f()) {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.f43396e;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f43394c;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f43395d;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f43393b;
                if (!z13) {
                    int i17 = this.f43482w0;
                    if (i17 == 0) {
                        iMax = constraintWidget2.m(type4).d();
                    } else if (i17 == 1) {
                        iMax = constraintWidget2.m(type3).d();
                    } else if (i17 == 2) {
                        iMax = constraintWidget2.m(type2).d();
                    } else if (i17 == 3) {
                        iMax = constraintWidget2.m(type).d();
                    }
                    z13 = true;
                }
                int i18 = this.f43482w0;
                if (i18 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.m(type4).d());
                } else if (i18 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.m(type3).d());
                } else if (i18 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.m(type2).d());
                } else if (i18 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.m(type).d());
                }
            }
        }
        int i19 = iMax + this.f43484y0;
        int i22 = this.f43482w0;
        if (i22 == 0 || i22 == 1) {
            N(i19, i19);
        } else {
            O(i19, i19);
        }
        this.f43485z0 = true;
        return true;
    }

    public final int X() {
        int i12 = this.f43482w0;
        if (i12 == 0 || i12 == 1) {
            return 0;
        }
        return (i12 == 2 || i12 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.e eVar, boolean z12) {
        boolean z13;
        int i12;
        ConstraintAnchor[] constraintAnchorArr = this.f43420R;
        ConstraintAnchor constraintAnchor = this.f43412J;
        constraintAnchorArr[0] = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = this.f43413K;
        int i13 = 2;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.f43414L;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.f43415M;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.f43392i = eVar.k(constraintAnchor5);
        }
        int i14 = this.f43482w0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i14];
        if (!this.f43485z0) {
            W();
        }
        if (this.f43485z0) {
            this.f43485z0 = false;
            int i15 = this.f43482w0;
            if (i15 == 0 || i15 == 1) {
                eVar.d(constraintAnchor.f43392i, this.f43430a0);
                eVar.d(constraintAnchor3.f43392i, this.f43430a0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    eVar.d(constraintAnchor2.f43392i, this.f43432b0);
                    eVar.d(constraintAnchor4.f43392i, this.f43432b0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f43648v0; i16++) {
            ConstraintWidget constraintWidget = this.f43647u0[i16];
            if (this.f43483x0 || constraintWidget.f()) {
                int i17 = this.f43482w0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43477d;
                if (((i17 == 0 || i17 == 1) && constraintWidget.f43423U[0] == dimensionBehaviour && constraintWidget.f43412J.f43389f != null && constraintWidget.f43414L.f43389f != null) || ((i17 == 2 || i17 == 3) && constraintWidget.f43423U[1] == dimensionBehaviour && constraintWidget.f43413K.f43389f != null && constraintWidget.f43415M.f43389f != null)) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        boolean z14 = constraintAnchor.g() || constraintAnchor3.g();
        boolean z15 = constraintAnchor2.g() || constraintAnchor4.g();
        int i18 = (z13 || !(((i12 = this.f43482w0) == 0 && z14) || ((i12 == 2 && z15) || ((i12 == 1 && z14) || (i12 == 3 && z15))))) ? 4 : 5;
        int i19 = 0;
        while (i19 < this.f43648v0) {
            ConstraintWidget constraintWidget2 = this.f43647u0[i19];
            if (this.f43483x0 || constraintWidget2.f()) {
                SolverVariable solverVariableK = eVar.k(constraintWidget2.f43420R[this.f43482w0]);
                int i22 = this.f43482w0;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f43420R[i22];
                constraintAnchor7.f43392i = solverVariableK;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f43389f;
                int i23 = (constraintAnchor8 == null || constraintAnchor8.f43387d != this) ? 0 : constraintAnchor7.f43390g;
                if (i22 == 0 || i22 == i13) {
                    SolverVariable solverVariable = constraintAnchor6.f43392i;
                    int i24 = this.f43484y0 - i23;
                    androidx.constraintlayout.core.b bVarL = eVar.l();
                    SolverVariable solverVariableM = eVar.m();
                    solverVariableM.f43178e = 0;
                    bVarL.d(solverVariable, solverVariableK, solverVariableM, i24);
                    eVar.c(bVarL);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.f43392i;
                    int i25 = this.f43484y0 + i23;
                    androidx.constraintlayout.core.b bVarL2 = eVar.l();
                    SolverVariable solverVariableM2 = eVar.m();
                    solverVariableM2.f43178e = 0;
                    bVarL2.c(solverVariable2, solverVariableK, solverVariableM2, i25);
                    eVar.c(bVarL2);
                }
                eVar.e(constraintAnchor6.f43392i, solverVariableK, this.f43484y0 + i23, i18);
            }
            i19++;
            i13 = 2;
        }
        int i26 = this.f43482w0;
        if (i26 == 0) {
            eVar.e(constraintAnchor3.f43392i, constraintAnchor.f43392i, 0, 8);
            eVar.e(constraintAnchor.f43392i, this.f43424V.f43414L.f43392i, 0, 4);
            eVar.e(constraintAnchor.f43392i, this.f43424V.f43412J.f43392i, 0, 0);
            return;
        }
        if (i26 == 1) {
            eVar.e(constraintAnchor.f43392i, constraintAnchor3.f43392i, 0, 8);
            eVar.e(constraintAnchor.f43392i, this.f43424V.f43412J.f43392i, 0, 4);
            eVar.e(constraintAnchor.f43392i, this.f43424V.f43414L.f43392i, 0, 0);
        } else if (i26 == 2) {
            eVar.e(constraintAnchor4.f43392i, constraintAnchor2.f43392i, 0, 8);
            eVar.e(constraintAnchor2.f43392i, this.f43424V.f43415M.f43392i, 0, 4);
            eVar.e(constraintAnchor2.f43392i, this.f43424V.f43413K.f43392i, 0, 0);
        } else if (i26 == 3) {
            eVar.e(constraintAnchor2.f43392i, constraintAnchor4.f43392i, 0, 8);
            eVar.e(constraintAnchor2.f43392i, this.f43424V.f43413K.f43392i, 0, 4);
            eVar.e(constraintAnchor2.f43392i, this.f43424V.f43415M.f43392i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean f() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        a aVar = (a) constraintWidget;
        this.f43482w0 = aVar.f43482w0;
        this.f43483x0 = aVar.f43483x0;
        this.f43484y0 = aVar.f43484y0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strS = AK.c.s(new StringBuilder("[Barrier] "), this.f43450k0, " {");
        for (int i12 = 0; i12 < this.f43648v0; i12++) {
            ConstraintWidget constraintWidget = this.f43647u0[i12];
            if (i12 > 0) {
                strS = r.q(strS, ", ");
            }
            StringBuilder sbR = H.r(strS);
            sbR.append(constraintWidget.f43450k0);
            strS = sbR.toString();
        }
        return r.q(strS, "}");
    }
}
