package androidx.constraintlayout.core.widgets.analyzer;

import androidx.appcompat.app.r;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<p> f43499k;

    /* renamed from: l, reason: collision with root package name */
    public int f43500l;

    public c(ConstraintWidget constraintWidget, int i12) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.f43499k = new ArrayList<>();
        this.f43550f = i12;
        ConstraintWidget constraintWidget3 = this.f43546b;
        ConstraintWidget constraintWidgetQ = constraintWidget3.q(i12);
        while (true) {
            ConstraintWidget constraintWidget4 = constraintWidgetQ;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetQ = constraintWidget3.q(this.f43550f);
            }
        }
        this.f43546b = constraintWidget2;
        int i13 = this.f43550f;
        p pVar = i13 == 0 ? constraintWidget2.f43435d : i13 == 1 ? constraintWidget2.f43437e : null;
        ArrayList<p> arrayList = this.f43499k;
        arrayList.add(pVar);
        ConstraintWidget constraintWidgetP = constraintWidget2.p(this.f43550f);
        while (constraintWidgetP != null) {
            int i14 = this.f43550f;
            arrayList.add(i14 == 0 ? constraintWidgetP.f43435d : i14 == 1 ? constraintWidgetP.f43437e : null);
            constraintWidgetP = constraintWidgetP.p(this.f43550f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i15 = this.f43550f;
            if (i15 == 0) {
                next.f43546b.f43431b = this;
            } else if (i15 == 1) {
                next.f43546b.f43433c = this;
            }
        }
        if (this.f43550f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f43546b.f43424V).f43596z0 && arrayList.size() > 1) {
            this.f43546b = ((p) r.j(1, arrayList)).f43546b;
        }
        this.f43500l = this.f43550f == 0 ? this.f43546b.f43452l0 : this.f43546b.f43454m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.constraintlayout.core.widgets.analyzer.d r28) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void d() {
        ArrayList<p> arrayList = this.f43499k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f43546b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f43546b;
        int i12 = this.f43550f;
        f fVar = this.f43553i;
        f fVar2 = this.f43552h;
        if (i12 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f43412J;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f43414L;
            f fVarI = p.i(constraintAnchor, 0);
            int iE2 = constraintAnchor.e();
            ConstraintWidget constraintWidgetM = m();
            if (constraintWidgetM != null) {
                iE2 = constraintWidgetM.f43412J.e();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iE2);
            }
            f fVarI2 = p.i(constraintAnchor2, 0);
            int iE3 = constraintAnchor2.e();
            ConstraintWidget constraintWidgetN = n();
            if (constraintWidgetN != null) {
                iE3 = constraintWidgetN.f43414L.e();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iE3);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f43413K;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f43415M;
            f fVarI3 = p.i(constraintAnchor3, 1);
            int iE4 = constraintAnchor3.e();
            ConstraintWidget constraintWidgetM2 = m();
            if (constraintWidgetM2 != null) {
                iE4 = constraintWidgetM2.f43413K.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE4);
            }
            f fVarI4 = p.i(constraintAnchor4, 1);
            int iE5 = constraintAnchor4.e();
            ConstraintWidget constraintWidgetN2 = n();
            if (constraintWidgetN2 != null) {
                iE5 = constraintWidgetN2.f43415M.e();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iE5);
            }
        }
        fVar2.f43509a = this;
        fVar.f43509a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void e() {
        int i12 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f43499k;
            if (i12 >= arrayList.size()) {
                return;
            }
            arrayList.get(i12).e();
            i12++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final void f() {
        this.f43547c = null;
        Iterator<p> it = this.f43499k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final long j() {
        ArrayList<p> arrayList = this.f43499k;
        int size = arrayList.size();
        long j12 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            j12 = r5.f43553i.f43514f + arrayList.get(i12).j() + j12 + r5.f43552h.f43514f;
        }
        return j12;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public final boolean k() {
        ArrayList<p> arrayList = this.f43499k;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (!arrayList.get(i12).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i12 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f43499k;
            if (i12 >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = arrayList.get(i12).f43546b;
            if (constraintWidget.f43446i0 != 8) {
                return constraintWidget;
            }
            i12++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList<p> arrayList = this.f43499k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f43546b;
            if (constraintWidget.f43446i0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f43550f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f43499k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
