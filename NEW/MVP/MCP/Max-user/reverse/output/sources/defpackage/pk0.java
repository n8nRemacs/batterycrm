package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class pk0 extends le {
    public final /* synthetic */ int b;
    public final /* synthetic */ qk0 c;

    public /* synthetic */ pk0(qk0 qk0Var, int i) {
        this.b = i;
        this.c = qk0Var;
    }

    @Override // defpackage.le
    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                qk0 qk0Var = this.c;
                qk0Var.setIndeterminate(false);
                qk0Var.b(qk0Var.b);
                break;
            default:
                qk0 qk0Var2 = this.c;
                if (!qk0Var2.s0) {
                    qk0Var2.setVisibility(qk0Var2.t0);
                    break;
                }
                break;
        }
    }
}
