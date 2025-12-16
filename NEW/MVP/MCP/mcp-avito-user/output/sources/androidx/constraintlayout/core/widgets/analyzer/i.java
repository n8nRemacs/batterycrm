package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public class i {
    public static o a(ConstraintWidget constraintWidget, int i12, ArrayList<o> arrayList, o oVar) {
        int i13;
        int i14 = i12 == 0 ? constraintWidget.f43466s0 : constraintWidget.f43468t0;
        if (i14 != -1 && (oVar == null || i14 != oVar.f43541b)) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i15);
                if (oVar2.f43541b == i14) {
                    if (oVar != null) {
                        oVar.c(i12, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i15++;
                }
            }
        } else if (i14 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) constraintWidget;
                int i16 = 0;
                while (true) {
                    if (i16 >= hVar.f43648v0) {
                        i13 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = hVar.f43647u0[i16];
                    if ((i12 == 0 && (i13 = constraintWidget2.f43466s0) != -1) || (i12 == 1 && (i13 = constraintWidget2.f43468t0) != -1)) {
                        break;
                    }
                    i16++;
                }
                if (i13 != -1) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i17);
                        if (oVar3.f43541b == i13) {
                            oVar = oVar3;
                            break;
                        }
                        i17++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f43540a = new ArrayList<>();
                oVar.f43543d = null;
                oVar.f43544e = -1;
                int i18 = o.f43539f;
                o.f43539f = i18 + 1;
                oVar.f43541b = i18;
                oVar.f43542c = i12;
            }
            arrayList.add(oVar);
        }
        ArrayList<ConstraintWidget> arrayList2 = oVar.f43540a;
        if (!arrayList2.contains(constraintWidget)) {
            arrayList2.add(constraintWidget);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                fVar.f43643x0.c(fVar.f43644y0 == 0 ? 1 : 0, oVar, arrayList);
            }
            int i19 = oVar.f43541b;
            if (i12 == 0) {
                constraintWidget.f43466s0 = i19;
                constraintWidget.f43412J.c(i12, oVar, arrayList);
                constraintWidget.f43414L.c(i12, oVar, arrayList);
            } else {
                constraintWidget.f43468t0 = i19;
                constraintWidget.f43413K.c(i12, oVar, arrayList);
                constraintWidget.f43416N.c(i12, oVar, arrayList);
                constraintWidget.f43415M.c(i12, oVar, arrayList);
            }
            constraintWidget.f43419Q.c(i12, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f43475b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f43478e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f43476c;
        return (dimensionBehaviour3 == dimensionBehaviour5 || dimensionBehaviour3 == dimensionBehaviour7 || (dimensionBehaviour3 == dimensionBehaviour6 && dimensionBehaviour != dimensionBehaviour7)) || (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == dimensionBehaviour7 || (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour2 != dimensionBehaviour7));
    }
}
