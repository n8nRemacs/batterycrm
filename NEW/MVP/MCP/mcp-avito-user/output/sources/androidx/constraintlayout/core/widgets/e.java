package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public class e extends l {

    /* renamed from: e1, reason: collision with root package name */
    public ConstraintWidget[] f43620e1;

    /* renamed from: H0, reason: collision with root package name */
    public int f43597H0 = -1;

    /* renamed from: I0, reason: collision with root package name */
    public int f43598I0 = -1;

    /* renamed from: J0, reason: collision with root package name */
    public int f43599J0 = -1;

    /* renamed from: K0, reason: collision with root package name */
    public int f43600K0 = -1;

    /* renamed from: L0, reason: collision with root package name */
    public int f43601L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    public int f43602M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    public float f43603N0 = 0.5f;

    /* renamed from: O0, reason: collision with root package name */
    public float f43604O0 = 0.5f;

    /* renamed from: P0, reason: collision with root package name */
    public float f43605P0 = 0.5f;

    /* renamed from: Q0, reason: collision with root package name */
    public float f43606Q0 = 0.5f;

    /* renamed from: R0, reason: collision with root package name */
    public float f43607R0 = 0.5f;

    /* renamed from: S0, reason: collision with root package name */
    public float f43608S0 = 0.5f;

    /* renamed from: T0, reason: collision with root package name */
    public int f43609T0 = 0;

    /* renamed from: U0, reason: collision with root package name */
    public int f43610U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    public int f43611V0 = 2;

    /* renamed from: W0, reason: collision with root package name */
    public int f43612W0 = 2;

    /* renamed from: X0, reason: collision with root package name */
    public int f43613X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f43614Y0 = -1;

    /* renamed from: Z0, reason: collision with root package name */
    public int f43615Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    public final ArrayList<a> f43616a1 = new ArrayList<>();

    /* renamed from: b1, reason: collision with root package name */
    public ConstraintWidget[] f43617b1 = null;

    /* renamed from: c1, reason: collision with root package name */
    public ConstraintWidget[] f43618c1 = null;

    /* renamed from: d1, reason: collision with root package name */
    public int[] f43619d1 = null;

    /* renamed from: f1, reason: collision with root package name */
    public int f43621f1 = 0;

    /* compiled from: Flow.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f43622a;

        /* renamed from: d, reason: collision with root package name */
        public ConstraintAnchor f43625d;

        /* renamed from: e, reason: collision with root package name */
        public ConstraintAnchor f43626e;

        /* renamed from: f, reason: collision with root package name */
        public ConstraintAnchor f43627f;

        /* renamed from: g, reason: collision with root package name */
        public ConstraintAnchor f43628g;

        /* renamed from: h, reason: collision with root package name */
        public int f43629h;

        /* renamed from: i, reason: collision with root package name */
        public int f43630i;

        /* renamed from: j, reason: collision with root package name */
        public int f43631j;

        /* renamed from: k, reason: collision with root package name */
        public int f43632k;

        /* renamed from: q, reason: collision with root package name */
        public int f43638q;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget f43623b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f43624c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f43633l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f43634m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f43635n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f43636o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f43637p = 0;

        public a(int i12, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i13) {
            this.f43629h = 0;
            this.f43630i = 0;
            this.f43631j = 0;
            this.f43632k = 0;
            this.f43638q = 0;
            this.f43622a = i12;
            this.f43625d = constraintAnchor;
            this.f43626e = constraintAnchor2;
            this.f43627f = constraintAnchor3;
            this.f43628g = constraintAnchor4;
            this.f43629h = e.this.f43650A0;
            this.f43630i = e.this.f43657w0;
            this.f43631j = e.this.f43651B0;
            this.f43632k = e.this.f43658x0;
            this.f43638q = i13;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i12 = this.f43622a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43477d;
            e eVar = e.this;
            if (i12 == 0) {
                int iZ2 = eVar.Z(constraintWidget, this.f43638q);
                if (constraintWidget.f43423U[0] == dimensionBehaviour) {
                    this.f43637p++;
                    iZ2 = 0;
                }
                this.f43633l = iZ2 + (constraintWidget.f43446i0 != 8 ? eVar.f43609T0 : 0) + this.f43633l;
                int iY2 = eVar.Y(constraintWidget, this.f43638q);
                if (this.f43623b == null || this.f43624c < iY2) {
                    this.f43623b = constraintWidget;
                    this.f43624c = iY2;
                    this.f43634m = iY2;
                }
            } else {
                int iZ3 = eVar.Z(constraintWidget, this.f43638q);
                int iY3 = eVar.Y(constraintWidget, this.f43638q);
                if (constraintWidget.f43423U[1] == dimensionBehaviour) {
                    this.f43637p++;
                    iY3 = 0;
                }
                this.f43634m = iY3 + (constraintWidget.f43446i0 != 8 ? eVar.f43610U0 : 0) + this.f43634m;
                if (this.f43623b == null || this.f43624c < iZ3) {
                    this.f43623b = constraintWidget;
                    this.f43624c = iZ3;
                    this.f43633l = iZ3;
                }
            }
            this.f43636o++;
        }

        public final void b(int i12, boolean z12, boolean z13) {
            e eVar;
            int i13;
            int i14;
            int i15;
            ConstraintWidget constraintWidget;
            int i16;
            char c12;
            int i17;
            float f12;
            float f13;
            int i18;
            float f14;
            int i19;
            int i22 = this.f43636o;
            int i23 = 0;
            while (true) {
                eVar = e.this;
                if (i23 >= i22 || (i19 = this.f43635n + i23) >= eVar.f43621f1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f43620e1[i19];
                if (constraintWidget2 != null) {
                    constraintWidget2.H();
                }
                i23++;
            }
            if (i22 == 0 || this.f43623b == null) {
                return;
            }
            boolean z14 = z13 && i12 == 0;
            int i24 = -1;
            int i25 = -1;
            for (int i26 = 0; i26 < i22; i26++) {
                int i27 = this.f43635n + (z12 ? (i22 - 1) - i26 : i26);
                if (i27 >= eVar.f43621f1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = eVar.f43620e1[i27];
                if (constraintWidget3 != null && constraintWidget3.f43446i0 == 0) {
                    if (i24 == -1) {
                        i24 = i26;
                    }
                    i25 = i26;
                }
            }
            if (this.f43622a != 0) {
                ConstraintWidget constraintWidget4 = this.f43623b;
                constraintWidget4.f43452l0 = eVar.f43597H0;
                int i28 = this.f43629h;
                if (i12 > 0) {
                    i28 += eVar.f43609T0;
                }
                ConstraintAnchor constraintAnchor = constraintWidget4.f43412J;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.f43414L;
                if (z12) {
                    constraintAnchor2.a(this.f43627f, i28);
                    if (z13) {
                        constraintAnchor.a(this.f43625d, this.f43631j);
                    }
                    if (i12 > 0) {
                        this.f43627f.f43387d.f43412J.a(constraintAnchor2, 0);
                    }
                } else {
                    constraintAnchor.a(this.f43625d, i28);
                    if (z13) {
                        constraintAnchor2.a(this.f43627f, this.f43631j);
                    }
                    if (i12 > 0) {
                        this.f43625d.f43387d.f43414L.a(constraintAnchor, 0);
                    }
                }
                ConstraintWidget constraintWidget5 = null;
                for (int i29 = 0; i29 < i22; i29++) {
                    int i32 = this.f43635n + i29;
                    if (i32 >= eVar.f43621f1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = eVar.f43620e1[i32];
                    if (constraintWidget6 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.f43413K;
                        if (i29 == 0) {
                            constraintWidget6.i(constraintAnchor3, this.f43626e, this.f43630i);
                            int i33 = eVar.f43598I0;
                            float f15 = eVar.f43604O0;
                            if (this.f43635n == 0) {
                                i15 = eVar.f43600K0;
                                i13 = i33;
                                i14 = -1;
                                if (i15 != -1) {
                                    f15 = eVar.f43606Q0;
                                }
                                constraintWidget6.f43454m0 = i15;
                                constraintWidget6.f43442g0 = f15;
                            } else {
                                i13 = i33;
                                i14 = -1;
                            }
                            if (!z13 || (i15 = eVar.f43602M0) == i14) {
                                i15 = i13;
                            } else {
                                f15 = eVar.f43608S0;
                            }
                            constraintWidget6.f43454m0 = i15;
                            constraintWidget6.f43442g0 = f15;
                        }
                        if (i29 == i22 - 1) {
                            constraintWidget6.i(constraintWidget6.f43415M, this.f43628g, this.f43632k);
                        }
                        if (constraintWidget5 != null) {
                            int i34 = eVar.f43610U0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget5.f43415M;
                            constraintAnchor3.a(constraintAnchor4, i34);
                            if (i29 == i24) {
                                int i35 = this.f43630i;
                                if (constraintAnchor3.h()) {
                                    constraintAnchor3.f43391h = i35;
                                }
                            }
                            constraintAnchor4.a(constraintAnchor3, 0);
                            if (i29 == i25 + 1) {
                                int i36 = this.f43632k;
                                if (constraintAnchor4.h()) {
                                    constraintAnchor4.f43391h = i36;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            ConstraintAnchor constraintAnchor5 = constraintWidget6.f43414L;
                            ConstraintAnchor constraintAnchor6 = constraintWidget6.f43412J;
                            if (z12) {
                                int i37 = eVar.f43611V0;
                                if (i37 == 0) {
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                } else if (i37 == 1) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                } else if (i37 == 2) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                }
                                constraintWidget5 = constraintWidget6;
                            } else {
                                int i38 = eVar.f43611V0;
                                if (i38 == 0) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                } else if (i38 == 1) {
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                } else if (i38 == 2) {
                                    if (z14) {
                                        constraintAnchor6.a(this.f43625d, this.f43629h);
                                        constraintAnchor5.a(this.f43627f, this.f43631j);
                                    } else {
                                        constraintAnchor6.a(constraintAnchor, 0);
                                        constraintAnchor5.a(constraintAnchor2, 0);
                                    }
                                }
                                constraintWidget5 = constraintWidget6;
                            }
                        } else {
                            constraintWidget5 = constraintWidget6;
                        }
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f43623b;
            constraintWidget7.f43454m0 = eVar.f43598I0;
            int i39 = this.f43630i;
            if (i12 > 0) {
                i39 += eVar.f43610U0;
            }
            ConstraintAnchor constraintAnchor7 = this.f43626e;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.f43413K;
            constraintAnchor8.a(constraintAnchor7, i39);
            ConstraintAnchor constraintAnchor9 = constraintWidget7.f43415M;
            if (z13) {
                constraintAnchor9.a(this.f43628g, this.f43632k);
            }
            if (i12 > 0) {
                this.f43626e.f43387d.f43415M.a(constraintAnchor8, 0);
            }
            if (eVar.f43612W0 != 3 || constraintWidget7.f43407E) {
                constraintWidget = constraintWidget7;
            } else {
                for (int i42 = 0; i42 < i22; i42++) {
                    int i43 = this.f43635n + (z12 ? (i22 - 1) - i42 : i42);
                    if (i43 >= eVar.f43621f1) {
                        break;
                    }
                    constraintWidget = eVar.f43620e1[i43];
                    if (constraintWidget.f43407E) {
                        break;
                    }
                }
                constraintWidget = constraintWidget7;
            }
            int i44 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (i44 < i22) {
                int i45 = z12 ? (i22 - 1) - i44 : i44;
                int i46 = this.f43635n + i45;
                if (i46 >= eVar.f43621f1) {
                    return;
                }
                ConstraintWidget constraintWidget9 = eVar.f43620e1[i46];
                if (constraintWidget9 == null) {
                    i16 = i22;
                    c12 = 3;
                } else {
                    ConstraintAnchor constraintAnchor10 = constraintWidget9.f43412J;
                    if (i44 == 0) {
                        constraintWidget9.i(constraintAnchor10, this.f43625d, this.f43629h);
                    }
                    if (i45 == 0) {
                        int i47 = eVar.f43597H0;
                        if (z12) {
                            i17 = i47;
                            f12 = 1.0f - eVar.f43603N0;
                        } else {
                            i17 = i47;
                            f12 = eVar.f43603N0;
                        }
                        if (this.f43635n == 0) {
                            int i48 = eVar.f43599J0;
                            f13 = f12;
                            if (i48 != -1) {
                                f14 = z12 ? 1.0f - eVar.f43605P0 : eVar.f43605P0;
                                i18 = i48;
                            }
                            constraintWidget9.f43452l0 = i18;
                            constraintWidget9.f43440f0 = f14;
                        } else {
                            f13 = f12;
                        }
                        if (!z13 || (i18 = eVar.f43601L0) == -1) {
                            i18 = i17;
                            f14 = f13;
                        } else {
                            f14 = z12 ? 1.0f - eVar.f43607R0 : eVar.f43607R0;
                        }
                        constraintWidget9.f43452l0 = i18;
                        constraintWidget9.f43440f0 = f14;
                    }
                    if (i44 == i22 - 1) {
                        i16 = i22;
                        constraintWidget9.i(constraintWidget9.f43414L, this.f43627f, this.f43631j);
                    } else {
                        i16 = i22;
                    }
                    if (constraintWidget8 != null) {
                        int i49 = eVar.f43609T0;
                        ConstraintAnchor constraintAnchor11 = constraintWidget8.f43414L;
                        constraintAnchor10.a(constraintAnchor11, i49);
                        if (i44 == i24) {
                            int i52 = this.f43629h;
                            if (constraintAnchor10.h()) {
                                constraintAnchor10.f43391h = i52;
                            }
                        }
                        constraintAnchor11.a(constraintAnchor10, 0);
                        if (i44 == i25 + 1) {
                            int i53 = this.f43631j;
                            if (constraintAnchor11.h()) {
                                constraintAnchor11.f43391h = i53;
                            }
                        }
                    }
                    if (constraintWidget9 != constraintWidget7) {
                        int i54 = eVar.f43612W0;
                        c12 = 3;
                        if (i54 == 3 && constraintWidget.f43407E && constraintWidget9 != constraintWidget && constraintWidget9.f43407E) {
                            constraintWidget9.f43416N.a(constraintWidget.f43416N, 0);
                        } else {
                            ConstraintAnchor constraintAnchor12 = constraintWidget9.f43413K;
                            if (i54 != 0) {
                                ConstraintAnchor constraintAnchor13 = constraintWidget9.f43415M;
                                if (i54 == 1) {
                                    constraintAnchor13.a(constraintAnchor9, 0);
                                } else if (z14) {
                                    constraintAnchor12.a(this.f43626e, this.f43630i);
                                    constraintAnchor13.a(this.f43628g, this.f43632k);
                                } else {
                                    constraintAnchor12.a(constraintAnchor8, 0);
                                    constraintAnchor13.a(constraintAnchor9, 0);
                                }
                            } else {
                                constraintAnchor12.a(constraintAnchor8, 0);
                            }
                        }
                    } else {
                        c12 = 3;
                    }
                    constraintWidget8 = constraintWidget9;
                }
                i44++;
                i22 = i16;
            }
        }

        public final int c() {
            return this.f43622a == 1 ? this.f43634m - e.this.f43610U0 : this.f43634m;
        }

        public final int d() {
            return this.f43622a == 0 ? this.f43633l - e.this.f43609T0 : this.f43633l;
        }

        public final void e(int i12) {
            int i13 = this.f43637p;
            if (i13 == 0) {
                return;
            }
            int i14 = this.f43636o;
            int i15 = i12 / i13;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = this.f43635n;
                int i18 = i17 + i16;
                e eVar = e.this;
                if (i18 >= eVar.f43621f1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar.f43620e1[i17 + i16];
                int i19 = this.f43622a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43475b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43477d;
                if (i19 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f43423U;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.f43463r == 0) {
                            eVar.X(constraintWidget, dimensionBehaviour, i15, dimensionBehaviourArr[1], constraintWidget.o());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f43423U;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.f43465s == 0) {
                        eVar.X(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.u(), dimensionBehaviour, i15);
                    }
                }
            }
            this.f43633l = 0;
            this.f43634m = 0;
            this.f43623b = null;
            this.f43624c = 0;
            int i22 = this.f43636o;
            for (int i23 = 0; i23 < i22; i23++) {
                int i24 = this.f43635n + i23;
                e eVar2 = e.this;
                if (i24 >= eVar2.f43621f1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = eVar2.f43620e1[i24];
                if (this.f43622a == 0) {
                    int iU2 = constraintWidget2.u();
                    int i25 = eVar2.f43609T0;
                    if (constraintWidget2.f43446i0 == 8) {
                        i25 = 0;
                    }
                    this.f43633l = iU2 + i25 + this.f43633l;
                    int iY2 = eVar2.Y(constraintWidget2, this.f43638q);
                    if (this.f43623b == null || this.f43624c < iY2) {
                        this.f43623b = constraintWidget2;
                        this.f43624c = iY2;
                        this.f43634m = iY2;
                    }
                } else {
                    int iZ2 = eVar2.Z(constraintWidget2, this.f43638q);
                    int iY3 = eVar2.Y(constraintWidget2, this.f43638q);
                    int i26 = eVar2.f43610U0;
                    if (constraintWidget2.f43446i0 == 8) {
                        i26 = 0;
                    }
                    this.f43634m = iY3 + i26 + this.f43634m;
                    if (this.f43623b == null || this.f43624c < iZ2) {
                        this.f43623b = constraintWidget2;
                        this.f43624c = iZ2;
                        this.f43633l = iZ2;
                    }
                }
            }
        }

        public final void f(int i12, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i13, int i14, int i15, int i16, int i17) {
            this.f43622a = i12;
            this.f43625d = constraintAnchor;
            this.f43626e = constraintAnchor2;
            this.f43627f = constraintAnchor3;
            this.f43628g = constraintAnchor4;
            this.f43629h = i13;
            this.f43630i = i14;
            this.f43631j = i15;
            this.f43632k = i16;
            this.f43638q = i17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    @Override // androidx.constraintlayout.core.widgets.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(int r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.W(int, int, int, int):void");
    }

    public final int Y(ConstraintWidget constraintWidget, int i12) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f43423U[1] == ConstraintWidget.DimensionBehaviour.f43477d) {
            int i13 = constraintWidget.f43465s;
            if (i13 == 0) {
                return 0;
            }
            if (i13 == 2) {
                int i14 = (int) (constraintWidget.f43474z * i12);
                if (i14 != constraintWidget.o()) {
                    constraintWidget.f43441g = true;
                    X(constraintWidget, constraintWidget.f43423U[0], constraintWidget.u(), ConstraintWidget.DimensionBehaviour.f43475b, i14);
                }
                return i14;
            }
            if (i13 == 1) {
                return constraintWidget.o();
            }
            if (i13 == 3) {
                return (int) ((constraintWidget.u() * constraintWidget.f43427Y) + 0.5f);
            }
        }
        return constraintWidget.o();
    }

    public final int Z(ConstraintWidget constraintWidget, int i12) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f43423U[0] == ConstraintWidget.DimensionBehaviour.f43477d) {
            int i13 = constraintWidget.f43463r;
            if (i13 == 0) {
                return 0;
            }
            if (i13 == 2) {
                int i14 = (int) (constraintWidget.f43471w * i12);
                if (i14 != constraintWidget.u()) {
                    constraintWidget.f43441g = true;
                    X(constraintWidget, ConstraintWidget.DimensionBehaviour.f43475b, i14, constraintWidget.f43423U[1], constraintWidget.o());
                }
                return i14;
            }
            if (i13 == 1) {
                return constraintWidget.u();
            }
            if (i13 == 3) {
                return (int) ((constraintWidget.o() * constraintWidget.f43427Y) + 0.5f);
            }
        }
        return constraintWidget.u();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.e eVar, boolean z12) {
        ConstraintWidget constraintWidget;
        float f12;
        int i12;
        super.e(eVar, z12);
        ConstraintWidget constraintWidget2 = this.f43424V;
        boolean z13 = constraintWidget2 != null && ((d) constraintWidget2).f43596z0;
        int i13 = this.f43613X0;
        ArrayList<a> arrayList = this.f43616a1;
        if (i13 != 0) {
            if (i13 == 1) {
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    arrayList.get(i14).b(i14, z13, i14 == size + (-1));
                    i14++;
                }
            } else if (i13 != 2) {
                if (i13 == 3) {
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        arrayList.get(i15).b(i15, z13, i15 == size2 + (-1));
                        i15++;
                    }
                }
            } else if (this.f43619d1 != null && this.f43618c1 != null && this.f43617b1 != null) {
                for (int i16 = 0; i16 < this.f43621f1; i16++) {
                    this.f43620e1[i16].H();
                }
                int[] iArr = this.f43619d1;
                int i17 = iArr[0];
                int i18 = iArr[1];
                float f13 = this.f43603N0;
                ConstraintWidget constraintWidget3 = null;
                int i19 = 0;
                while (i19 < i17) {
                    if (z13) {
                        i12 = (i17 - i19) - 1;
                        f12 = 1.0f - this.f43603N0;
                    } else {
                        f12 = f13;
                        i12 = i19;
                    }
                    ConstraintWidget constraintWidget4 = this.f43618c1[i12];
                    if (constraintWidget4 != null && constraintWidget4.f43446i0 != 8) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.f43412J;
                        if (i19 == 0) {
                            constraintWidget4.i(constraintAnchor, this.f43412J, this.f43650A0);
                            constraintWidget4.f43452l0 = this.f43597H0;
                            constraintWidget4.f43440f0 = f12;
                        }
                        if (i19 == i17 - 1) {
                            constraintWidget4.i(constraintWidget4.f43414L, this.f43414L, this.f43651B0);
                        }
                        if (i19 > 0 && constraintWidget3 != null) {
                            int i22 = this.f43609T0;
                            ConstraintAnchor constraintAnchor2 = constraintWidget3.f43414L;
                            constraintWidget4.i(constraintAnchor, constraintAnchor2, i22);
                            constraintWidget3.i(constraintAnchor2, constraintAnchor, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                    i19++;
                    f13 = f12;
                }
                for (int i23 = 0; i23 < i18; i23++) {
                    ConstraintWidget constraintWidget5 = this.f43617b1[i23];
                    if (constraintWidget5 != null && constraintWidget5.f43446i0 != 8) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.f43413K;
                        if (i23 == 0) {
                            constraintWidget5.i(constraintAnchor3, this.f43413K, this.f43657w0);
                            constraintWidget5.f43454m0 = this.f43598I0;
                            constraintWidget5.f43442g0 = this.f43604O0;
                        }
                        if (i23 == i18 - 1) {
                            constraintWidget5.i(constraintWidget5.f43415M, this.f43415M, this.f43658x0);
                        }
                        if (i23 > 0 && constraintWidget3 != null) {
                            int i24 = this.f43610U0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget3.f43415M;
                            constraintWidget5.i(constraintAnchor3, constraintAnchor4, i24);
                            constraintWidget3.i(constraintAnchor4, constraintAnchor3, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i25 = 0; i25 < i17; i25++) {
                    for (int i26 = 0; i26 < i18; i26++) {
                        int i27 = (i26 * i17) + i25;
                        if (this.f43615Z0 == 1) {
                            i27 = (i25 * i18) + i26;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f43620e1;
                        if (i27 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i27]) != null && constraintWidget.f43446i0 != 8) {
                            ConstraintWidget constraintWidget6 = this.f43618c1[i25];
                            ConstraintWidget constraintWidget7 = this.f43617b1[i26];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.i(constraintWidget.f43412J, constraintWidget6.f43412J, 0);
                                constraintWidget.i(constraintWidget.f43414L, constraintWidget6.f43414L, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.i(constraintWidget.f43413K, constraintWidget7.f43413K, 0);
                                constraintWidget.i(constraintWidget.f43415M, constraintWidget7.f43415M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z13, true);
        }
        this.f43652C0 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.j(constraintWidget, map);
        e eVar = (e) constraintWidget;
        this.f43597H0 = eVar.f43597H0;
        this.f43598I0 = eVar.f43598I0;
        this.f43599J0 = eVar.f43599J0;
        this.f43600K0 = eVar.f43600K0;
        this.f43601L0 = eVar.f43601L0;
        this.f43602M0 = eVar.f43602M0;
        this.f43603N0 = eVar.f43603N0;
        this.f43604O0 = eVar.f43604O0;
        this.f43605P0 = eVar.f43605P0;
        this.f43606Q0 = eVar.f43606Q0;
        this.f43607R0 = eVar.f43607R0;
        this.f43608S0 = eVar.f43608S0;
        this.f43609T0 = eVar.f43609T0;
        this.f43610U0 = eVar.f43610U0;
        this.f43611V0 = eVar.f43611V0;
        this.f43612W0 = eVar.f43612W0;
        this.f43613X0 = eVar.f43613X0;
        this.f43614Y0 = eVar.f43614Y0;
        this.f43615Z0 = eVar.f43615Z0;
    }
}
