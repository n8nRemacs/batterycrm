package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f43531a = new b.a();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f43423U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f43424V;
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget2 != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget2 : null;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43475b;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar.f43423U[0];
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.f43423U[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f43477d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f43476c;
        boolean z12 = dimensionBehaviour == dimensionBehaviour3 || constraintWidget.E() || dimensionBehaviour == dimensionBehaviour7 || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.f43463r == 0 && constraintWidget.f43427Y == 0.0f && constraintWidget.x(0)) || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.f43463r == 1 && constraintWidget.y(0, constraintWidget.u()));
        boolean z13 = dimensionBehaviour2 == dimensionBehaviour3 || constraintWidget.F() || dimensionBehaviour2 == dimensionBehaviour7 || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.f43465s == 0 && constraintWidget.f43427Y == 0.0f && constraintWidget.x(1)) || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.f43465s == 1 && constraintWidget.y(1, constraintWidget.o()));
        if (constraintWidget.f43427Y <= 0.0f || !(z12 || z13)) {
            return z12 && z13;
        }
        return true;
    }

    public static void b(int i12, ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b, boolean z12) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        Iterator<ConstraintAnchor> it;
        boolean z13;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f43453m) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.D() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.Y(constraintWidget, interfaceC1703b, new b.a());
        }
        ConstraintAnchor constraintAnchorM = constraintWidget.m(ConstraintAnchor.Type.f43393b);
        ConstraintAnchor constraintAnchorM2 = constraintWidget.m(ConstraintAnchor.Type.f43395d);
        int iD2 = constraintAnchorM.d();
        int iD3 = constraintAnchorM2.d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorM.f43384a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43477d;
        if (hashSet != null && constraintAnchorM.f43386c) {
            Iterator<ConstraintAnchor> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next = it2.next();
                ConstraintWidget constraintWidget2 = next.f43387d;
                int i13 = i12 + 1;
                boolean zA2 = a(constraintWidget2);
                if (constraintWidget2.D() && zA2) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget2, interfaceC1703b, new b.a());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f43412J;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f43414L;
                if ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f43389f) != null && constraintAnchor4.f43386c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f43389f) != null && constraintAnchor3.f43386c)) {
                    it = it2;
                    z13 = true;
                } else {
                    it = it2;
                    z13 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.f43423U[0];
                if (dimensionBehaviour2 != dimensionBehaviour || zA2) {
                    if (!constraintWidget2.D()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f43389f == null) {
                            int iE2 = constraintAnchor5.e() + iD2;
                            constraintWidget2.N(iE2, constraintWidget2.u() + iE2);
                            b(i13, constraintWidget2, interfaceC1703b, z12);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f43389f == null) {
                            int iE3 = iD2 - constraintAnchor6.e();
                            constraintWidget2.N(iE3 - constraintWidget2.u(), iE3);
                            b(i13, constraintWidget2, interfaceC1703b, z12);
                        } else if (z13 && !constraintWidget2.B()) {
                            c(i13, constraintWidget2, interfaceC1703b, z12);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f43470v >= 0 && constraintWidget2.f43469u >= 0 && ((constraintWidget2.f43446i0 == 8 || (constraintWidget2.f43463r == 0 && constraintWidget2.f43427Y == 0.0f)) && !constraintWidget2.B() && !constraintWidget2.f43409G && z13 && !constraintWidget2.B())) {
                    d(i13, constraintWidget, interfaceC1703b, constraintWidget2, z12);
                }
                it2 = it;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorM2.f43384a;
        if (hashSet2 != null && constraintAnchorM2.f43386c) {
            Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next2 = it3.next();
                ConstraintWidget constraintWidget3 = next2.f43387d;
                int i14 = i12 + 1;
                boolean zA3 = a(constraintWidget3);
                if (constraintWidget3.D() && zA3) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget3, interfaceC1703b, new b.a());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.f43412J;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f43414L;
                boolean z14 = (next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f43389f) != null && constraintAnchor2.f43386c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f43389f) != null && constraintAnchor.f43386c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f43423U[0];
                if (dimensionBehaviour3 != dimensionBehaviour || zA3) {
                    if (!constraintWidget3.D()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f43389f == null) {
                            int iE4 = constraintAnchor7.e() + iD3;
                            constraintWidget3.N(iE4, constraintWidget3.u() + iE4);
                            b(i14, constraintWidget3, interfaceC1703b, z12);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f43389f == null) {
                            int iE5 = iD3 - constraintAnchor8.e();
                            constraintWidget3.N(iE5 - constraintWidget3.u(), iE5);
                            b(i14, constraintWidget3, interfaceC1703b, z12);
                        } else if (z14 && !constraintWidget3.B()) {
                            c(i14, constraintWidget3, interfaceC1703b, z12);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f43470v >= 0 && constraintWidget3.f43469u >= 0) {
                    if (constraintWidget3.f43446i0 != 8) {
                        if (constraintWidget3.f43463r == 0) {
                            if (constraintWidget3.f43427Y == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.B() && !constraintWidget3.f43409G && z14 && !constraintWidget3.B()) {
                        d(i14, constraintWidget, interfaceC1703b, constraintWidget3, z12);
                    }
                }
            }
        }
        constraintWidget.f43453m = true;
    }

    public static void c(int i12, ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b, boolean z12) {
        float f12 = constraintWidget.f43440f0;
        ConstraintAnchor constraintAnchor = constraintWidget.f43412J;
        int iD2 = constraintAnchor.f43389f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f43414L;
        int iD3 = constraintAnchor2.f43389f.d();
        int iE2 = constraintAnchor.e() + iD2;
        int iE3 = iD3 - constraintAnchor2.e();
        if (iD2 == iD3) {
            f12 = 0.5f;
        } else {
            iD2 = iE2;
            iD3 = iE3;
        }
        int iU2 = constraintWidget.u();
        int i13 = (iD3 - iD2) - iU2;
        if (iD2 > iD3) {
            i13 = (iD2 - iD3) - iU2;
        }
        int i14 = ((int) (i13 > 0 ? (f12 * i13) + 0.5f : f12 * i13)) + iD2;
        int i15 = i14 + iU2;
        if (iD2 > iD3) {
            i15 = i14 - iU2;
        }
        constraintWidget.N(i14, i15);
        b(i12 + 1, constraintWidget, interfaceC1703b, z12);
    }

    public static void d(int i12, ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b, ConstraintWidget constraintWidget2, boolean z12) {
        float f12 = constraintWidget2.f43440f0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f43412J;
        int iE2 = constraintAnchor.e() + constraintAnchor.f43389f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f43414L;
        int iD2 = constraintAnchor2.f43389f.d() - constraintAnchor2.e();
        if (iD2 >= iE2) {
            int iU2 = constraintWidget2.u();
            if (constraintWidget2.f43446i0 != 8) {
                int i13 = constraintWidget2.f43463r;
                if (i13 == 2) {
                    iU2 = (int) (constraintWidget2.f43440f0 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.u() : constraintWidget.f43424V.u()));
                } else if (i13 == 0) {
                    iU2 = iD2 - iE2;
                }
                iU2 = Math.max(constraintWidget2.f43469u, iU2);
                int i14 = constraintWidget2.f43470v;
                if (i14 > 0) {
                    iU2 = Math.min(i14, iU2);
                }
            }
            int i15 = iE2 + ((int) ((f12 * ((iD2 - iE2) - iU2)) + 0.5f));
            constraintWidget2.N(i15, iU2 + i15);
            b(i12 + 1, constraintWidget2, interfaceC1703b, z12);
        }
    }

    public static void e(int i12, ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b) {
        float f12 = constraintWidget.f43442g0;
        ConstraintAnchor constraintAnchor = constraintWidget.f43413K;
        int iD2 = constraintAnchor.f43389f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f43415M;
        int iD3 = constraintAnchor2.f43389f.d();
        int iE2 = constraintAnchor.e() + iD2;
        int iE3 = iD3 - constraintAnchor2.e();
        if (iD2 == iD3) {
            f12 = 0.5f;
        } else {
            iD2 = iE2;
            iD3 = iE3;
        }
        int iO2 = constraintWidget.o();
        int i13 = (iD3 - iD2) - iO2;
        if (iD2 > iD3) {
            i13 = (iD2 - iD3) - iO2;
        }
        int i14 = (int) (i13 > 0 ? (f12 * i13) + 0.5f : f12 * i13);
        int i15 = iD2 + i14;
        int i16 = i15 + iO2;
        if (iD2 > iD3) {
            i15 = iD2 - i14;
            i16 = i15 - iO2;
        }
        constraintWidget.O(i15, i16);
        g(i12 + 1, constraintWidget, interfaceC1703b);
    }

    public static void f(int i12, ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b, ConstraintWidget constraintWidget2) {
        float f12 = constraintWidget2.f43442g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f43413K;
        int iE2 = constraintAnchor.e() + constraintAnchor.f43389f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f43415M;
        int iD2 = constraintAnchor2.f43389f.d() - constraintAnchor2.e();
        if (iD2 >= iE2) {
            int iO2 = constraintWidget2.o();
            if (constraintWidget2.f43446i0 != 8) {
                int i13 = constraintWidget2.f43465s;
                if (i13 == 2) {
                    iO2 = (int) (f12 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.o() : constraintWidget.f43424V.o()));
                } else if (i13 == 0) {
                    iO2 = iD2 - iE2;
                }
                iO2 = Math.max(constraintWidget2.f43472x, iO2);
                int i14 = constraintWidget2.f43473y;
                if (i14 > 0) {
                    iO2 = Math.min(i14, iO2);
                }
            }
            int i15 = iE2 + ((int) ((f12 * ((iD2 - iE2) - iO2)) + 0.5f));
            constraintWidget2.O(i15, iO2 + i15);
            g(i12 + 1, constraintWidget2, interfaceC1703b);
        }
    }

    public static void g(int i12, ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f43455n) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.D() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.Y(constraintWidget, interfaceC1703b, new b.a());
        }
        ConstraintAnchor constraintAnchorM = constraintWidget.m(ConstraintAnchor.Type.f43394c);
        ConstraintAnchor constraintAnchorM2 = constraintWidget.m(ConstraintAnchor.Type.f43396e);
        int iD2 = constraintAnchorM.d();
        int iD3 = constraintAnchorM2.d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorM.f43384a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43477d;
        if (hashSet != null && constraintAnchorM.f43386c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f43387d;
                int i13 = i12 + 1;
                boolean zA2 = a(constraintWidget2);
                if (constraintWidget2.D() && zA2) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget2, interfaceC1703b, new b.a());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f43413K;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f43415M;
                boolean z12 = (next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f43389f) != null && constraintAnchor5.f43386c) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f43389f) != null && constraintAnchor4.f43386c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.f43423U[1];
                if (dimensionBehaviour2 != dimensionBehaviour || zA2) {
                    if (!constraintWidget2.D()) {
                        if (next == constraintAnchor6 && constraintAnchor7.f43389f == null) {
                            int iE2 = constraintAnchor6.e() + iD2;
                            constraintWidget2.O(iE2, constraintWidget2.o() + iE2);
                            g(i13, constraintWidget2, interfaceC1703b);
                        } else if (next == constraintAnchor7 && constraintAnchor6.f43389f == null) {
                            int iE3 = iD2 - constraintAnchor7.e();
                            constraintWidget2.O(iE3 - constraintWidget2.o(), iE3);
                            g(i13, constraintWidget2, interfaceC1703b);
                        } else if (z12 && !constraintWidget2.C()) {
                            e(i13, constraintWidget2, interfaceC1703b);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f43473y >= 0 && constraintWidget2.f43472x >= 0 && (constraintWidget2.f43446i0 == 8 || (constraintWidget2.f43465s == 0 && constraintWidget2.f43427Y == 0.0f))) {
                    if (!constraintWidget2.C() && !constraintWidget2.f43409G && z12 && !constraintWidget2.C()) {
                        f(i13, constraintWidget, interfaceC1703b, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorM2.f43384a;
        if (hashSet2 != null && constraintAnchorM2.f43386c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f43387d;
                int i14 = i12 + 1;
                boolean zA3 = a(constraintWidget3);
                if (constraintWidget3.D() && zA3) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget3, interfaceC1703b, new b.a());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f43413K;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.f43415M;
                boolean z13 = (next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f43389f) != null && constraintAnchor3.f43386c) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f43389f) != null && constraintAnchor2.f43386c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f43423U[1];
                if (dimensionBehaviour3 != dimensionBehaviour || zA3) {
                    if (!constraintWidget3.D()) {
                        if (next2 == constraintAnchor8 && constraintAnchor9.f43389f == null) {
                            int iE4 = constraintAnchor8.e() + iD3;
                            constraintWidget3.O(iE4, constraintWidget3.o() + iE4);
                            g(i14, constraintWidget3, interfaceC1703b);
                        } else if (next2 == constraintAnchor9 && constraintAnchor8.f43389f == null) {
                            int iE5 = iD3 - constraintAnchor9.e();
                            constraintWidget3.O(iE5 - constraintWidget3.o(), iE5);
                            g(i14, constraintWidget3, interfaceC1703b);
                        } else if (z13 && !constraintWidget3.C()) {
                            e(i14, constraintWidget3, interfaceC1703b);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f43473y >= 0 && constraintWidget3.f43472x >= 0) {
                    if (constraintWidget3.f43446i0 != 8) {
                        if (constraintWidget3.f43465s == 0) {
                            if (constraintWidget3.f43427Y == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.C() && !constraintWidget3.f43409G && z13 && !constraintWidget3.C()) {
                        f(i14, constraintWidget, interfaceC1703b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorM3 = constraintWidget.m(ConstraintAnchor.Type.f43397f);
        if (constraintAnchorM3.f43384a != null && constraintAnchorM3.f43386c) {
            int iD4 = constraintAnchorM3.d();
            Iterator<ConstraintAnchor> it3 = constraintAnchorM3.f43384a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f43387d;
                int i15 = i12 + 1;
                boolean zA4 = a(constraintWidget4);
                if (constraintWidget4.D() && zA4) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget4, interfaceC1703b, new b.a());
                }
                if (constraintWidget4.f43423U[1] != dimensionBehaviour || zA4) {
                    if (!constraintWidget4.D() && next3 == (constraintAnchor = constraintWidget4.f43416N)) {
                        int iE6 = next3.e() + iD4;
                        if (constraintWidget4.f43407E) {
                            int i16 = iE6 - constraintWidget4.f43434c0;
                            int i17 = constraintWidget4.f43426X + i16;
                            constraintWidget4.f43432b0 = i16;
                            constraintWidget4.f43413K.l(i16);
                            constraintWidget4.f43415M.l(i17);
                            constraintAnchor.l(iE6);
                            constraintWidget4.f43451l = true;
                        }
                        g(i15, constraintWidget4, interfaceC1703b);
                    }
                }
            }
        }
        constraintWidget.f43455n = true;
    }
}
