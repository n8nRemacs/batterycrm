package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class lnb implements ij1 {
    public final /* synthetic */ int a;
    public final Object b;

    public lnb() {
        this.a = 0;
        this.b = new CopyOnWriteArraySet();
    }

    private final void a(fj1 fj1Var) {
    }

    private final void b(gj1 gj1Var) {
    }

    private final void c(hj1 hj1Var) {
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsAdded(ej1 ej1Var) {
        switch (this.a) {
            case 0:
                if (!ej1Var.b.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ij1) it.next()).onCallParticipantsAdded(ej1Var);
                    }
                    break;
                }
                break;
            default:
                py0 py0Var = (py0) this.b;
                if (!((k01) py0Var.b).u() && !((k01) py0Var.b).k0.i().isEmpty()) {
                    ((k01) py0Var.b).C();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsChanged(fj1 fj1Var) {
        switch (this.a) {
            case 0:
                if (!fj1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ij1) it.next()).onCallParticipantsChanged(fj1Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsDeAnonimized(gj1 gj1Var) {
        switch (this.a) {
            case 0:
                if (!gj1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ij1) it.next()).onCallParticipantsDeAnonimized(gj1Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ij1
    public final void onCallParticipantsRemoved(hj1 hj1Var) {
        switch (this.a) {
            case 0:
                if (!hj1Var.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ij1) it.next()).onCallParticipantsRemoved(hj1Var);
                    }
                    break;
                }
                break;
        }
    }

    public lnb(py0 py0Var) {
        this.a = 1;
        this.b = py0Var;
    }
}
