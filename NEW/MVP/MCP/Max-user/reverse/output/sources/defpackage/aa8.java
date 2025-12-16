package defpackage;

/* loaded from: classes.dex */
public final class aa8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca8 b;

    public /* synthetic */ aa8(ca8 ca8Var, int i) {
        this.a = i;
        this.b = ca8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q55 q55Var = this.b.c;
                if (q55Var != null) {
                    q55Var.setListSelectionHidden(true);
                    q55Var.requestLayout();
                    break;
                }
                break;
            default:
                ca8 ca8Var = this.b;
                q55 q55Var2 = ca8Var.c;
                if (q55Var2 != null && q55Var2.isAttachedToWindow() && ca8Var.c.getCount() > ca8Var.c.getChildCount() && ca8Var.c.getChildCount() <= ca8Var.w0) {
                    ca8Var.J0.setInputMethodMode(2);
                    ca8Var.g();
                    break;
                }
                break;
        }
    }
}
