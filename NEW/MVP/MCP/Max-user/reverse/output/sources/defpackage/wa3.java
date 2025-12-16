package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class wa3 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                za3 za3Var = (za3) this.b;
                za3Var.t(za3Var.u());
                break;
            case 1:
                d65 d65Var = (d65) this.b;
                d65Var.l = z;
                d65Var.q();
                if (!z) {
                    d65Var.t(false);
                    d65Var.m = false;
                    break;
                }
                break;
            case 2:
                ((em6) this.b).invoke(Boolean.valueOf(z));
                break;
            case 3:
                j8b j8bVar = (j8b) this.b;
                if (!z) {
                    j8bVar.o = false;
                    break;
                }
                break;
            default:
                ((rm7) this.b).invoke(Boolean.valueOf(z));
                break;
        }
    }
}
