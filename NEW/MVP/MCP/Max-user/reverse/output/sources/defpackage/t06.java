package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class t06 implements ij1 {
    public final cm6 a;
    public final w06 b;
    public boolean c;
    public boolean d;

    public t06(cm6 cm6Var, w06 w06Var) {
        this.a = cm6Var;
        this.b = w06Var;
    }

    public final void a(ti1 ti1Var, List list) {
        if (this.c && this.d) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yi1 yi1Var = (yi1) it.next();
            if (yi1Var.c()) {
                boolean zA = fni.a(yi1Var.a, ti1Var);
                w06 w06Var = this.b;
                if (zA) {
                    if (!this.c) {
                        w06Var.e();
                        this.c = true;
                    }
                } else if (!this.d) {
                    w06Var.b();
                    this.d = true;
                }
            }
        }
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsAdded(ej1 ej1Var) {
        a((ti1) this.a.invoke(), ej1Var.b);
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsChanged(fj1 fj1Var) {
        a((ti1) this.a.invoke(), fj1Var.a);
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsDeAnonimized(gj1 gj1Var) {
        a((ti1) this.a.invoke(), gj1Var.a);
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsRemoved(hj1 hj1Var) {
    }
}
