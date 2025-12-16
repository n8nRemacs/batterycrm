package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f43649a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.e eVar, ConstraintWidget constraintWidget) {
        constraintWidget.f43457o = -1;
        constraintWidget.f43459p = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f43423U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43476c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43478e;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f43423U[0] == dimensionBehaviour3) {
            ConstraintAnchor constraintAnchor = constraintWidget.f43412J;
            int i12 = constraintAnchor.f43390g;
            int iU2 = dVar.u();
            ConstraintAnchor constraintAnchor2 = constraintWidget.f43414L;
            int i13 = iU2 - constraintAnchor2.f43390g;
            constraintAnchor.f43392i = eVar.k(constraintAnchor);
            constraintAnchor2.f43392i = eVar.k(constraintAnchor2);
            eVar.d(constraintAnchor.f43392i, i12);
            eVar.d(constraintAnchor2.f43392i, i13);
            constraintWidget.f43457o = 2;
            constraintWidget.f43430a0 = i12;
            int i14 = i13 - i12;
            constraintWidget.f43425W = i14;
            int i15 = constraintWidget.f43436d0;
            if (i14 < i15) {
                constraintWidget.f43425W = i15;
            }
        }
        if (dVar.f43423U[1] == dimensionBehaviour2 || constraintWidget.f43423U[1] != dimensionBehaviour3) {
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f43413K;
        int i16 = constraintAnchor3.f43390g;
        int iO2 = dVar.o();
        ConstraintAnchor constraintAnchor4 = constraintWidget.f43415M;
        int i17 = iO2 - constraintAnchor4.f43390g;
        constraintAnchor3.f43392i = eVar.k(constraintAnchor3);
        constraintAnchor4.f43392i = eVar.k(constraintAnchor4);
        eVar.d(constraintAnchor3.f43392i, i16);
        eVar.d(constraintAnchor4.f43392i, i17);
        if (constraintWidget.f43434c0 > 0 || constraintWidget.f43446i0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f43416N;
            constraintAnchor5.f43392i = eVar.k(constraintAnchor5);
            eVar.d(constraintAnchor5.f43392i, constraintWidget.f43434c0 + i16);
        }
        constraintWidget.f43459p = 2;
        constraintWidget.f43432b0 = i16;
        int i18 = i17 - i16;
        constraintWidget.f43426X = i18;
        int i19 = constraintWidget.f43438e0;
        if (i18 < i19) {
            constraintWidget.f43426X = i19;
        }
    }

    public static final boolean b(int i12, int i13) {
        return (i12 & i13) == i13;
    }
}
