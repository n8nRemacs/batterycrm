package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
class j extends p {
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        f fVar = this.f43552h;
        if (fVar.f43511c && !fVar.f43518j) {
            fVar.d((int) ((((f) fVar.f43520l.get(0)).f43515g * ((androidx.constraintlayout.core.widgets.f) this.f43546b).f43640u0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void d() {
        ConstraintWidget constraintWidget = this.f43546b;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        int i12 = fVar.f43641v0;
        int i13 = fVar.f43642w0;
        int i14 = fVar.f43644y0;
        f fVar2 = this.f43552h;
        if (i14 == 1) {
            if (i12 != -1) {
                fVar2.f43520l.add(constraintWidget.f43424V.f43435d.f43552h);
                this.f43546b.f43424V.f43435d.f43552h.f43519k.add(fVar2);
                fVar2.f43514f = i12;
            } else if (i13 != -1) {
                fVar2.f43520l.add(constraintWidget.f43424V.f43435d.f43553i);
                this.f43546b.f43424V.f43435d.f43553i.f43519k.add(fVar2);
                fVar2.f43514f = -i13;
            } else {
                fVar2.f43510b = true;
                fVar2.f43520l.add(constraintWidget.f43424V.f43435d.f43553i);
                this.f43546b.f43424V.f43435d.f43553i.f43519k.add(fVar2);
            }
            m(this.f43546b.f43435d.f43552h);
            m(this.f43546b.f43435d.f43553i);
            return;
        }
        if (i12 != -1) {
            fVar2.f43520l.add(constraintWidget.f43424V.f43437e.f43552h);
            this.f43546b.f43424V.f43437e.f43552h.f43519k.add(fVar2);
            fVar2.f43514f = i12;
        } else if (i13 != -1) {
            fVar2.f43520l.add(constraintWidget.f43424V.f43437e.f43553i);
            this.f43546b.f43424V.f43437e.f43553i.f43519k.add(fVar2);
            fVar2.f43514f = -i13;
        } else {
            fVar2.f43510b = true;
            fVar2.f43520l.add(constraintWidget.f43424V.f43437e.f43553i);
            this.f43546b.f43424V.f43437e.f43553i.f43519k.add(fVar2);
        }
        m(this.f43546b.f43437e.f43552h);
        m(this.f43546b.f43437e.f43553i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void e() {
        ConstraintWidget constraintWidget = this.f43546b;
        int i12 = ((androidx.constraintlayout.core.widgets.f) constraintWidget).f43644y0;
        f fVar = this.f43552h;
        if (i12 == 1) {
            constraintWidget.f43430a0 = fVar.f43515g;
        } else {
            constraintWidget.f43432b0 = fVar.f43515g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void f() {
        this.f43552h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f43552h;
        fVar2.f43519k.add(fVar);
        fVar.f43520l.add(fVar2);
    }
}
