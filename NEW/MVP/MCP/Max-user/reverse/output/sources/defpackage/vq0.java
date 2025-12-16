package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class vq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((wq0) this.b).c();
                break;
            default:
                fn5 fn5Var = (fn5) this.b;
                if (!fn5Var.w0 && fn5Var.getMeasuredWidth() > 0) {
                    fn5Var.b(fn5Var.getMeasuredWidth());
                    fn5Var.w0 = true;
                    fn5Var.requestLayout();
                }
                if (fn5Var.w0) {
                    fn5Var.getViewTreeObserver().removeOnPreDrawListener(fn5Var.A0);
                    fn5Var.A0 = null;
                    break;
                }
                break;
        }
        return true;
    }
}
