package defpackage;

import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes.dex */
public final /* synthetic */ class sp0 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ sp0(up0 up0Var, int i) {
        this.a = i;
        this.b = up0Var;
    }

    @Override // defpackage.a4h
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                up0 up0Var = this.b;
                if (!up0Var.d.isEmpty()) {
                    up0Var.t0 = true;
                    break;
                } else {
                    jp4 jp4Var = up0Var.Y;
                    jp4Var.getClass();
                    jp4Var.c();
                    ah4.a();
                    break;
                }
            case 1:
                up0 up0Var2 = this.b;
                up0Var2.s0++;
                up0Var2.z();
                break;
            default:
                up0 up0Var3 = this.b;
                tu6 tu6Var = up0Var3.Z;
                if (tu6Var != null) {
                    tu6Var.a();
                }
                up0Var3.d.clear();
                break;
        }
    }
}
