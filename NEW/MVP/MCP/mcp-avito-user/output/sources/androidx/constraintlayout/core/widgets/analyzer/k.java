package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.f;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
class k extends p {
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f43546b;
        int i12 = aVar.f43482w0;
        f fVar = this.f43552h;
        Iterator it = fVar.f43520l.iterator();
        int i13 = 0;
        int i14 = -1;
        while (it.hasNext()) {
            int i15 = ((f) it.next()).f43515g;
            if (i14 == -1 || i15 < i14) {
                i14 = i15;
            }
            if (i13 < i15) {
                i13 = i15;
            }
        }
        if (i12 == 0 || i12 == 2) {
            fVar.d(i14 + aVar.f43484y0);
        } else {
            fVar.d(i13 + aVar.f43484y0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void d() {
        ConstraintWidget constraintWidget = this.f43546b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            f fVar = this.f43552h;
            fVar.f43510b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i12 = aVar.f43482w0;
            boolean z12 = aVar.f43483x0;
            int i13 = 0;
            if (i12 == 0) {
                fVar.f43513e = f.a.f43524e;
                while (i13 < aVar.f43648v0) {
                    ConstraintWidget constraintWidget2 = aVar.f43647u0[i13];
                    if (z12 || constraintWidget2.f43446i0 != 8) {
                        f fVar2 = constraintWidget2.f43435d.f43552h;
                        fVar2.f43519k.add(fVar);
                        fVar.f43520l.add(fVar2);
                    }
                    i13++;
                }
                m(this.f43546b.f43435d.f43552h);
                m(this.f43546b.f43435d.f43553i);
                return;
            }
            if (i12 == 1) {
                fVar.f43513e = f.a.f43525f;
                while (i13 < aVar.f43648v0) {
                    ConstraintWidget constraintWidget3 = aVar.f43647u0[i13];
                    if (z12 || constraintWidget3.f43446i0 != 8) {
                        f fVar3 = constraintWidget3.f43435d.f43553i;
                        fVar3.f43519k.add(fVar);
                        fVar.f43520l.add(fVar3);
                    }
                    i13++;
                }
                m(this.f43546b.f43435d.f43552h);
                m(this.f43546b.f43435d.f43553i);
                return;
            }
            if (i12 == 2) {
                fVar.f43513e = f.a.f43526g;
                while (i13 < aVar.f43648v0) {
                    ConstraintWidget constraintWidget4 = aVar.f43647u0[i13];
                    if (z12 || constraintWidget4.f43446i0 != 8) {
                        f fVar4 = constraintWidget4.f43437e.f43552h;
                        fVar4.f43519k.add(fVar);
                        fVar.f43520l.add(fVar4);
                    }
                    i13++;
                }
                m(this.f43546b.f43437e.f43552h);
                m(this.f43546b.f43437e.f43553i);
                return;
            }
            if (i12 != 3) {
                return;
            }
            fVar.f43513e = f.a.f43527h;
            while (i13 < aVar.f43648v0) {
                ConstraintWidget constraintWidget5 = aVar.f43647u0[i13];
                if (z12 || constraintWidget5.f43446i0 != 8) {
                    f fVar5 = constraintWidget5.f43437e.f43553i;
                    fVar5.f43519k.add(fVar);
                    fVar.f43520l.add(fVar5);
                }
                i13++;
            }
            m(this.f43546b.f43437e.f43552h);
            m(this.f43546b.f43437e.f43553i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void e() {
        ConstraintWidget constraintWidget = this.f43546b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i12 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).f43482w0;
            f fVar = this.f43552h;
            if (i12 == 0 || i12 == 1) {
                constraintWidget.f43430a0 = fVar.f43515g;
            } else {
                constraintWidget.f43432b0 = fVar.f43515g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void f() {
        this.f43547c = null;
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
