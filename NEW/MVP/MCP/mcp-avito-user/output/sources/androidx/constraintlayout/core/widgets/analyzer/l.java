package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f43532k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43533a;

        static {
            int[] iArr = new int[p.b.values().length];
            f43533a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43533a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43533a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f43552h.f43513e = f.a.f43524e;
        this.f43553i.f43513e = f.a.f43525f;
        this.f43550f = 0;
    }

    public static void m(int[] iArr, int i12, int i13, int i14, int i15, float f12, int i16) {
        int i17 = i13 - i12;
        int i18 = i15 - i14;
        if (i16 != -1) {
            if (i16 == 0) {
                iArr[0] = (int) ((i18 * f12) + 0.5f);
                iArr[1] = i18;
                return;
            } else {
                if (i16 != 1) {
                    return;
                }
                iArr[0] = i17;
                iArr[1] = (int) ((i17 * f12) + 0.5f);
                return;
            }
        }
        int i19 = (int) ((i18 * f12) + 0.5f);
        int i22 = (int) ((i17 / f12) + 0.5f);
        if (i19 <= i17) {
            iArr[0] = i19;
            iArr[1] = i18;
        } else if (i22 <= i18) {
            iArr[0] = i17;
            iArr[1] = i22;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x026f  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.constraintlayout.core.widgets.analyzer.d r24) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.l.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.f43546b;
        boolean z12 = constraintWidget5.f43429a;
        g gVar = this.f43549e;
        if (z12) {
            gVar.d(constraintWidget5.u());
        }
        boolean z13 = gVar.f43518j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43478e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43477d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f43475b;
        f fVar = this.f43553i;
        f fVar2 = this.f43552h;
        if (!z13) {
            ConstraintWidget constraintWidget6 = this.f43546b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.f43423U[0];
            this.f43548d = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour4) {
                if (dimensionBehaviour6 == dimensionBehaviour3 && (constraintWidget4 = constraintWidget6.f43424V) != null && ((dimensionBehaviour2 = constraintWidget4.f43423U[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour3)) {
                    int iU2 = (constraintWidget4.u() - this.f43546b.f43412J.e()) - this.f43546b.f43414L.e();
                    p.b(fVar2, constraintWidget4.f43435d.f43552h, this.f43546b.f43412J.e());
                    p.b(fVar, constraintWidget4.f43435d.f43553i, -this.f43546b.f43414L.e());
                    gVar.d(iU2);
                    return;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5) {
                    gVar.d(constraintWidget6.u());
                }
            }
        } else if (this.f43548d == dimensionBehaviour3 && (constraintWidget2 = (constraintWidget = this.f43546b).f43424V) != null && ((dimensionBehaviour = constraintWidget2.f43423U[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour3)) {
            p.b(fVar2, constraintWidget2.f43435d.f43552h, constraintWidget.f43412J.e());
            p.b(fVar, constraintWidget2.f43435d.f43553i, -this.f43546b.f43414L.e());
            return;
        }
        if (gVar.f43518j) {
            ConstraintWidget constraintWidget7 = this.f43546b;
            if (constraintWidget7.f43429a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f43420R;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f43389f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f43389f != null) {
                    if (constraintWidget7.B()) {
                        fVar2.f43514f = this.f43546b.f43420R[0].e();
                        fVar.f43514f = -this.f43546b.f43420R[1].e();
                        return;
                    }
                    f fVarH = p.h(this.f43546b.f43420R[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f43546b.f43420R[0].e());
                    }
                    f fVarH2 = p.h(this.f43546b.f43420R[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f43546b.f43420R[1].e());
                    }
                    fVar2.f43510b = true;
                    fVar.f43510b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    f fVarH3 = p.h(constraintAnchor);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f43546b.f43420R[0].e());
                        p.b(fVar, fVar2, gVar.f43515g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f43389f != null) {
                    f fVarH4 = p.h(constraintAnchor3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f43546b.f43420R[1].e());
                        p.b(fVar2, fVar, -gVar.f43515g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.g) || constraintWidget7.f43424V == null || constraintWidget7.m(ConstraintAnchor.Type.f43398g).f43389f != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f43546b;
                p.b(fVar2, constraintWidget8.f43424V.f43435d.f43552h, constraintWidget8.v());
                p.b(fVar, fVar2, gVar.f43515g);
                return;
            }
        }
        if (this.f43548d == dimensionBehaviour4) {
            ConstraintWidget constraintWidget9 = this.f43546b;
            int i12 = constraintWidget9.f43463r;
            if (i12 == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.f43424V;
                if (constraintWidget10 != null) {
                    g gVar2 = constraintWidget10.f43437e.f43549e;
                    gVar.f43520l.add(gVar2);
                    gVar2.f43519k.add(gVar);
                    gVar.f43510b = true;
                    gVar.f43519k.add(fVar2);
                    gVar.f43519k.add(fVar);
                }
            } else if (i12 == 3) {
                if (constraintWidget9.f43465s == 3) {
                    fVar2.f43509a = this;
                    fVar.f43509a = this;
                    n nVar = constraintWidget9.f43437e;
                    nVar.f43552h.f43509a = this;
                    nVar.f43553i.f43509a = this;
                    gVar.f43509a = this;
                    if (constraintWidget9.C()) {
                        gVar.f43520l.add(this.f43546b.f43437e.f43549e);
                        this.f43546b.f43437e.f43549e.f43519k.add(gVar);
                        n nVar2 = this.f43546b.f43437e;
                        nVar2.f43549e.f43509a = this;
                        gVar.f43520l.add(nVar2.f43552h);
                        gVar.f43520l.add(this.f43546b.f43437e.f43553i);
                        this.f43546b.f43437e.f43552h.f43519k.add(gVar);
                        this.f43546b.f43437e.f43553i.f43519k.add(gVar);
                    } else if (this.f43546b.B()) {
                        this.f43546b.f43437e.f43549e.f43520l.add(gVar);
                        gVar.f43519k.add(this.f43546b.f43437e.f43549e);
                    } else {
                        this.f43546b.f43437e.f43549e.f43520l.add(gVar);
                    }
                } else {
                    g gVar3 = constraintWidget9.f43437e.f43549e;
                    gVar.f43520l.add(gVar3);
                    gVar3.f43519k.add(gVar);
                    this.f43546b.f43437e.f43552h.f43519k.add(gVar);
                    this.f43546b.f43437e.f43553i.f43519k.add(gVar);
                    gVar.f43510b = true;
                    gVar.f43519k.add(fVar2);
                    gVar.f43519k.add(fVar);
                    fVar2.f43520l.add(gVar);
                    fVar.f43520l.add(gVar);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f43546b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.f43420R;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f43389f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f43389f != null) {
            if (constraintWidget11.B()) {
                fVar2.f43514f = this.f43546b.f43420R[0].e();
                fVar.f43514f = -this.f43546b.f43420R[1].e();
                return;
            }
            f fVarH5 = p.h(this.f43546b.f43420R[0]);
            f fVarH6 = p.h(this.f43546b.f43420R[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f43554j = p.b.f43557c;
            return;
        }
        if (constraintAnchor5 != null) {
            f fVarH7 = p.h(constraintAnchor4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f43546b.f43420R[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f43389f != null) {
            f fVarH8 = p.h(constraintAnchor6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f43546b.f43420R[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof androidx.constraintlayout.core.widgets.g) || (constraintWidget3 = constraintWidget11.f43424V) == null) {
            return;
        }
        p.b(fVar2, constraintWidget3.f43435d.f43552h, constraintWidget11.v());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void e() {
        f fVar = this.f43552h;
        if (fVar.f43518j) {
            this.f43546b.f43430a0 = fVar.f43515g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void f() {
        this.f43547c = null;
        this.f43552h.c();
        this.f43553i.c();
        this.f43549e.c();
        this.f43551g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final boolean k() {
        return this.f43548d != ConstraintWidget.DimensionBehaviour.f43477d || this.f43546b.f43463r == 0;
    }

    public final void n() {
        this.f43551g = false;
        f fVar = this.f43552h;
        fVar.c();
        fVar.f43518j = false;
        f fVar2 = this.f43553i;
        fVar2.c();
        fVar2.f43518j = false;
        this.f43549e.f43518j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f43546b.f43450k0;
    }
}
