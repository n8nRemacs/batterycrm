package defpackage;

import android.view.View;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;

/* loaded from: classes.dex */
public final class m54 extends a54 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m54(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void u(c54 c54Var) {
    }

    @Override // defpackage.a54
    public void d(c54 c54Var) {
        switch (this.a) {
            case 1:
                ((p54) this.b).a.d(k38.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.a54
    public void g(c54 c54Var) {
        switch (this.a) {
            case 0:
                ((nx1) this.b).b.d(k38.ON_RESUME);
                break;
            case 1:
                ((p54) this.b).a.d(k38.ON_RESUME);
                break;
            case 3:
                uh7 uh7Var = (uh7) vl8.a.getAccessor().f();
                if (uh7Var != null) {
                    uh7Var.e(Integer.valueOf(((f1e) this.b).a));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void h(c54 c54Var) {
        switch (this.a) {
            case 0:
                ((nx1) this.b).b.d(k38.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.a54
    public void j(c54 c54Var, View view) {
        switch (this.a) {
            case 0:
                ((nx1) this.b).b.d(k38.ON_START);
                break;
            case 1:
                p54 p54Var = (p54) this.b;
                pai.d(view, p54Var);
                if (!l54.a(c54Var)) {
                    p54Var.a.d(k38.ON_CREATE);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void k(c54 c54Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                int i2 = FileDownloadWarningBottomSheet.c;
                ((FileDownloadWarningBottomSheet) obj).getClass();
                iw5.c.p0().d();
                break;
            case 4:
                ((ytd) obj).d.remove(c54Var);
                break;
        }
    }

    @Override // defpackage.a54
    public void l(c54 c54Var) {
        switch (this.a) {
            case 1:
                p54 p54Var = (p54) this.b;
                if (p54Var.a.d.a(l38.c)) {
                    p54Var.a.d(k38.ON_DESTROY);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void n(c54 c54Var, View view) {
        switch (this.a) {
            case 1:
                ((p54) this.b).a.d(k38.ON_START);
                break;
        }
    }

    @Override // defpackage.a54
    public void p(c54 c54Var) {
        int i = this.a;
    }

    @Override // defpackage.a54
    public void q(c54 c54Var) {
        switch (this.a) {
            case 1:
                p54 p54Var = (p54) this.b;
                if (p54Var.a.d == l38.a) {
                    p54Var.a = new l48(p54Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void r(c54 c54Var) {
        switch (this.a) {
            case 0:
                l48 l48Var = ((nx1) this.b).b;
                if (l48Var.d != l38.b) {
                    l48Var.d(k38.ON_DESTROY);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void s(c54 c54Var, View view) {
        switch (this.a) {
            case 0:
                ((nx1) this.b).b.d(k38.ON_STOP);
                break;
            case 1:
                ((p54) this.b).a.d(k38.ON_STOP);
                break;
        }
    }

    @Override // defpackage.a54
    public void t(c54 c54Var) {
        switch (this.a) {
            case 0:
                ((nx1) this.b).b.d(k38.ON_PAUSE);
                break;
            case 1:
                ((p54) this.b).a.d(k38.ON_PAUSE);
                break;
        }
    }
}
