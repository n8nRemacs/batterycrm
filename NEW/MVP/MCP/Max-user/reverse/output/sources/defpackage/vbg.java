package defpackage;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class vbg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ vbg(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xbg xbgVar = this.b.Z0;
                zf9 zf9Var = xbgVar == null ? null : xbgVar.b;
                if (zf9Var != null) {
                    zf9Var.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
