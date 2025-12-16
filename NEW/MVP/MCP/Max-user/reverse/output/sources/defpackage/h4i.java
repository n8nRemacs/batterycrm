package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class h4i extends hsi {
    public final Window a;
    public final vgd b;

    public h4i(Window window, vgd vgdVar) {
        this.a = window;
        this.b = vgdVar;
    }

    @Override // defpackage.hsi
    public final void j(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    q(4);
                } else if (i2 == 2) {
                    q(2);
                } else if (i2 == 8) {
                    ((ulc) this.b.b).o();
                }
            }
        }
    }

    @Override // defpackage.hsi
    public final boolean k() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.hsi
    public final void l(boolean z) {
        if (!z) {
            r(16);
            return;
        }
        Window window = this.a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        q(16);
    }

    @Override // defpackage.hsi
    public final void m(boolean z) {
        if (!z) {
            r(8192);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        q(8192);
    }

    @Override // defpackage.hsi
    public final void n() {
        r(2048);
        q(4096);
    }

    @Override // defpackage.hsi
    public final void o(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    r(4);
                    this.a.clearFlags(1024);
                } else if (i2 == 2) {
                    r(2);
                } else if (i2 == 8) {
                    ((ulc) this.b.b).u();
                }
            }
        }
    }

    public final void q(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void r(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
