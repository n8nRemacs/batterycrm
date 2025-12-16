package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class i4i extends hsi {
    public final WindowInsetsController a;
    public final vgd b;
    public Window c;

    public i4i(WindowInsetsController windowInsetsController, vgd vgdVar) {
        this.a = windowInsetsController;
        this.b = vgdVar;
    }

    @Override // defpackage.hsi
    public final void j(int i) {
        this.a.hide(i & (-9));
    }

    @Override // defpackage.hsi
    public final boolean k() {
        this.a.setSystemBarsAppearance(0, 0);
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.hsi
    public final void l(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.hsi
    public final void m(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.a.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.hsi
    public final void n() {
        this.a.setSystemBarsBehavior(2);
    }

    @Override // defpackage.hsi
    public final void o(int i) {
        if ((i & 8) != 0) {
            ((ulc) this.b.b).u();
        }
        this.a.show(i & (-9));
    }
}
