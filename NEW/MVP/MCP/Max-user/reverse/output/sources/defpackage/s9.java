package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class s9 extends ws4 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9(hj0 hj0Var, int i) {
        super(hj0Var);
        this.c = i;
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) throws IOException {
        switch (this.c) {
            case 0:
                ce5 ce5Var = (ce5) obj;
                hj0 hj0Var = this.b;
                if (ce5Var == null) {
                    hj0Var.g(i, null);
                    return;
                }
                if (!ce5.Q(ce5Var)) {
                    ce5Var.P();
                }
                hj0Var.g(i, ce5Var);
                return;
            case 1:
                vc3 vc3Var = (vc3) obj;
                if (hj0.b(i)) {
                    return;
                }
                this.b.g(i, vc3Var);
                return;
            case 2:
                ce5 ce5Var2 = (ce5) obj;
                vc3 vc3VarY = null;
                try {
                    if (ce5.h0(ce5Var2) && ce5Var2 != null) {
                        vc3VarY = vc3.y(ce5Var2.a);
                    }
                    this.b.g(i, vc3VarY);
                    return;
                } finally {
                    vc3.P(vc3VarY);
                }
            default:
                if (hj0.a(i)) {
                    this.b.g(i, null);
                    return;
                }
                return;
        }
    }
}
