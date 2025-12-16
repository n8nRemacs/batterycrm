package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public final f f43536k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.a f43537l;

    /* compiled from: VerticalWidgetRun.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43538a;

        static {
            int[] iArr = new int[p.b.values().length];
            f43538a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43538a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43538a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        f fVar = new f(this);
        this.f43536k = fVar;
        this.f43537l = null;
        this.f43552h.f43513e = f.a.f43526g;
        this.f43553i.f43513e = f.a.f43527h;
        fVar.f43513e = f.a.f43528i;
        this.f43550f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        float f12;
        float f13;
        float f14;
        int i12;
        if (this.f43554j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f43546b;
            l(constraintWidget.f43413K, constraintWidget.f43415M, 1);
            return;
        }
        g gVar = this.f43549e;
        boolean z12 = gVar.f43511c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43477d;
        if (z12 && !gVar.f43518j && this.f43548d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f43546b;
            int i13 = constraintWidget2.f43465s;
            if (i13 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f43424V;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.f43437e.f43549e.f43518j) {
                        gVar.d((int) ((r1.f43515g * constraintWidget2.f43474z) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                g gVar2 = constraintWidget2.f43435d.f43549e;
                if (gVar2.f43518j) {
                    int i14 = constraintWidget2.f43428Z;
                    if (i14 == -1) {
                        f12 = gVar2.f43515g;
                        f13 = constraintWidget2.f43427Y;
                    } else if (i14 == 0) {
                        f14 = gVar2.f43515g * constraintWidget2.f43427Y;
                        i12 = (int) (f14 + 0.5f);
                        gVar.d(i12);
                    } else if (i14 != 1) {
                        i12 = 0;
                        gVar.d(i12);
                    } else {
                        f12 = gVar2.f43515g;
                        f13 = constraintWidget2.f43427Y;
                    }
                    f14 = f12 / f13;
                    i12 = (int) (f14 + 0.5f);
                    gVar.d(i12);
                }
            }
        }
        f fVar = this.f43552h;
        if (fVar.f43511c) {
            f fVar2 = this.f43553i;
            if (fVar2.f43511c) {
                if (fVar.f43518j && fVar2.f43518j && gVar.f43518j) {
                    return;
                }
                if (!gVar.f43518j && this.f43548d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f43546b;
                    if (constraintWidget4.f43463r == 0 && !constraintWidget4.C()) {
                        f fVar3 = (f) fVar.f43520l.get(0);
                        f fVar4 = (f) fVar2.f43520l.get(0);
                        int i15 = fVar3.f43515g + fVar.f43514f;
                        int i16 = fVar4.f43515g + fVar2.f43514f;
                        fVar.d(i15);
                        fVar2.d(i16);
                        gVar.d(i16 - i15);
                        return;
                    }
                }
                if (!gVar.f43518j && this.f43548d == dimensionBehaviour && this.f43545a == 1 && fVar.f43520l.size() > 0 && fVar2.f43520l.size() > 0) {
                    f fVar5 = (f) fVar.f43520l.get(0);
                    int i17 = (((f) fVar2.f43520l.get(0)).f43515g + fVar2.f43514f) - (fVar5.f43515g + fVar.f43514f);
                    int i18 = gVar.f43530m;
                    if (i17 < i18) {
                        gVar.d(i17);
                    } else {
                        gVar.d(i18);
                    }
                }
                if (gVar.f43518j && fVar.f43520l.size() > 0 && fVar2.f43520l.size() > 0) {
                    f fVar6 = (f) fVar.f43520l.get(0);
                    f fVar7 = (f) fVar2.f43520l.get(0);
                    int i19 = fVar6.f43515g;
                    int i22 = fVar.f43514f + i19;
                    int i23 = fVar7.f43515g;
                    int i24 = fVar2.f43514f + i23;
                    float f15 = this.f43546b.f43442g0;
                    if (fVar6 == fVar7) {
                        f15 = 0.5f;
                    } else {
                        i19 = i22;
                        i23 = i24;
                    }
                    fVar.d((int) ((((i23 - i19) - gVar.f43515g) * f15) + i19 + 0.5f));
                    fVar2.d(fVar.f43515g + gVar.f43515g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f43546b;
        boolean z12 = constraintWidget5.f43429a;
        g gVar = this.f43549e;
        if (z12) {
            gVar.d(constraintWidget5.o());
        }
        boolean z13 = gVar.f43518j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43478e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43475b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43477d;
        f fVar = this.f43553i;
        f fVar2 = this.f43552h;
        if (!z13) {
            ConstraintWidget constraintWidget6 = this.f43546b;
            this.f43548d = constraintWidget6.f43423U[1];
            if (constraintWidget6.f43407E) {
                this.f43537l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f43548d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.f43546b.f43424V) != null && constraintWidget4.f43423U[1] == dimensionBehaviour2) {
                    int iO2 = (constraintWidget4.o() - this.f43546b.f43413K.e()) - this.f43546b.f43415M.e();
                    p.b(fVar2, constraintWidget4.f43437e.f43552h, this.f43546b.f43413K.e());
                    p.b(fVar, constraintWidget4.f43437e.f43553i, -this.f43546b.f43415M.e());
                    gVar.d(iO2);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    gVar.d(this.f43546b.o());
                }
            }
        } else if (this.f43548d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.f43546b).f43424V) != null && constraintWidget2.f43423U[1] == dimensionBehaviour2) {
            p.b(fVar2, constraintWidget2.f43437e.f43552h, constraintWidget.f43413K.e());
            p.b(fVar, constraintWidget2.f43437e.f43553i, -this.f43546b.f43415M.e());
            return;
        }
        boolean z14 = gVar.f43518j;
        f fVar3 = this.f43536k;
        if (z14) {
            ConstraintWidget constraintWidget7 = this.f43546b;
            if (constraintWidget7.f43429a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f43420R;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f43389f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f43389f != null) {
                    if (constraintWidget7.C()) {
                        fVar2.f43514f = this.f43546b.f43420R[2].e();
                        fVar.f43514f = -this.f43546b.f43420R[3].e();
                    } else {
                        f fVarH = p.h(this.f43546b.f43420R[2]);
                        if (fVarH != null) {
                            p.b(fVar2, fVarH, this.f43546b.f43420R[2].e());
                        }
                        f fVarH2 = p.h(this.f43546b.f43420R[3]);
                        if (fVarH2 != null) {
                            p.b(fVar, fVarH2, -this.f43546b.f43420R[3].e());
                        }
                        fVar2.f43510b = true;
                        fVar.f43510b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f43546b;
                    if (constraintWidget8.f43407E) {
                        p.b(fVar3, fVar2, constraintWidget8.f43434c0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    f fVarH3 = p.h(constraintAnchor);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f43546b.f43420R[2].e());
                        p.b(fVar, fVar2, gVar.f43515g);
                        ConstraintWidget constraintWidget9 = this.f43546b;
                        if (constraintWidget9.f43407E) {
                            p.b(fVar3, fVar2, constraintWidget9.f43434c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f43389f != null) {
                    f fVarH4 = p.h(constraintAnchor3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f43546b.f43420R[3].e());
                        p.b(fVar2, fVar, -gVar.f43515g);
                    }
                    ConstraintWidget constraintWidget10 = this.f43546b;
                    if (constraintWidget10.f43407E) {
                        p.b(fVar3, fVar2, constraintWidget10.f43434c0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f43389f != null) {
                    f fVarH5 = p.h(constraintAnchor4);
                    if (fVarH5 != null) {
                        p.b(fVar3, fVarH5, 0);
                        p.b(fVar2, fVar3, -this.f43546b.f43434c0);
                        p.b(fVar, fVar2, gVar.f43515g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.g) || constraintWidget7.f43424V == null || constraintWidget7.m(ConstraintAnchor.Type.f43398g).f43389f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f43546b;
                p.b(fVar2, constraintWidget11.f43424V.f43437e.f43552h, constraintWidget11.w());
                p.b(fVar, fVar2, gVar.f43515g);
                ConstraintWidget constraintWidget12 = this.f43546b;
                if (constraintWidget12.f43407E) {
                    p.b(fVar3, fVar2, constraintWidget12.f43434c0);
                    return;
                }
                return;
            }
        }
        if (z14 || this.f43548d != dimensionBehaviour3) {
            gVar.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f43546b;
            int i12 = constraintWidget13.f43465s;
            if (i12 == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.f43424V;
                if (constraintWidget14 != null) {
                    g gVar2 = constraintWidget14.f43437e.f43549e;
                    gVar.f43520l.add(gVar2);
                    gVar2.f43519k.add(gVar);
                    gVar.f43510b = true;
                    gVar.f43519k.add(fVar2);
                    gVar.f43519k.add(fVar);
                }
            } else if (i12 == 3 && !constraintWidget13.C()) {
                ConstraintWidget constraintWidget15 = this.f43546b;
                if (constraintWidget15.f43463r != 3) {
                    g gVar3 = constraintWidget15.f43435d.f43549e;
                    gVar.f43520l.add(gVar3);
                    gVar3.f43519k.add(gVar);
                    gVar.f43510b = true;
                    gVar.f43519k.add(fVar2);
                    gVar.f43519k.add(fVar);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f43546b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.f43420R;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f43389f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f43389f != null) {
            if (constraintWidget16.C()) {
                fVar2.f43514f = this.f43546b.f43420R[2].e();
                fVar.f43514f = -this.f43546b.f43420R[3].e();
            } else {
                f fVarH6 = p.h(this.f43546b.f43420R[2]);
                f fVarH7 = p.h(this.f43546b.f43420R[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f43554j = p.b.f43557c;
            }
            if (this.f43546b.f43407E) {
                c(fVar3, fVar2, 1, this.f43537l);
            }
        } else if (constraintAnchor6 != null) {
            f fVarH8 = p.h(constraintAnchor5);
            if (fVarH8 != null) {
                p.b(fVar2, fVarH8, this.f43546b.f43420R[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f43546b.f43407E) {
                    c(fVar3, fVar2, 1, this.f43537l);
                }
                if (this.f43548d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f43546b;
                    if (constraintWidget17.f43427Y > 0.0f) {
                        l lVar = constraintWidget17.f43435d;
                        if (lVar.f43548d == dimensionBehaviour3) {
                            lVar.f43549e.f43519k.add(gVar);
                            gVar.f43520l.add(this.f43546b.f43435d.f43549e);
                            gVar.f43509a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f43389f != null) {
                f fVarH9 = p.h(constraintAnchor7);
                if (fVarH9 != null) {
                    p.b(fVar, fVarH9, -this.f43546b.f43420R[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f43546b.f43407E) {
                        c(fVar3, fVar2, 1, this.f43537l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f43389f != null) {
                    f fVarH10 = p.h(constraintAnchor8);
                    if (fVarH10 != null) {
                        p.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f43537l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(constraintWidget16 instanceof androidx.constraintlayout.core.widgets.g) && (constraintWidget3 = constraintWidget16.f43424V) != null) {
                    p.b(fVar2, constraintWidget3.f43437e.f43552h, constraintWidget16.w());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f43546b.f43407E) {
                        c(fVar3, fVar2, 1, this.f43537l);
                    }
                    if (this.f43548d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget18 = this.f43546b;
                        if (constraintWidget18.f43427Y > 0.0f) {
                            l lVar2 = constraintWidget18.f43435d;
                            if (lVar2.f43548d == dimensionBehaviour3) {
                                lVar2.f43549e.f43519k.add(gVar);
                                gVar.f43520l.add(this.f43546b.f43435d.f43549e);
                                gVar.f43509a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f43520l.size() == 0) {
            gVar.f43511c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void e() {
        f fVar = this.f43552h;
        if (fVar.f43518j) {
            this.f43546b.f43432b0 = fVar.f43515g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void f() {
        this.f43547c = null;
        this.f43552h.c();
        this.f43553i.c();
        this.f43536k.c();
        this.f43549e.c();
        this.f43551g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final boolean k() {
        return this.f43548d != ConstraintWidget.DimensionBehaviour.f43477d || this.f43546b.f43465s == 0;
    }

    public final void m() {
        this.f43551g = false;
        f fVar = this.f43552h;
        fVar.c();
        fVar.f43518j = false;
        f fVar2 = this.f43553i;
        fVar2.c();
        fVar2.f43518j = false;
        f fVar3 = this.f43536k;
        fVar3.c();
        fVar3.f43518j = false;
        this.f43549e.f43518j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f43546b.f43450k0;
    }
}
