package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class yd3 extends uk0 {
    public final /* synthetic */ zd3 a;
    public final /* synthetic */ pd7 b;
    public final /* synthetic */ ld3 c;
    public final /* synthetic */ jd3 d;

    public yd3(zd3 zd3Var, pd7 pd7Var, ld3 ld3Var, jd3 jd3Var) {
        this.a = zd3Var;
        this.b = pd7Var;
        this.c = ld3Var;
        this.d = jd3Var;
    }

    @Override // defpackage.uk0, defpackage.fnd
    public final void a(rf7 rf7Var, String str, boolean z) {
        zd3 zd3Var = this.a;
        ViewGroup viewGroup = zd3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        pd7 pd7Var = this.b;
        ld3 ld3Var = this.c;
        if (zIsCurrentThread) {
            zd3.k(pd7Var, ld3Var, md3.a);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new vd3(zd3Var, pd7Var, ld3Var, 2));
        } else {
            viewGroup.post(new wd3(zd3Var, pd7Var, ld3Var, 2));
        }
    }

    @Override // defpackage.uk0, defpackage.fnd
    public final void b(rf7 rf7Var, Object obj, String str, boolean z) {
        zd3 zd3Var = this.a;
        ViewGroup viewGroup = zd3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        pd7 pd7Var = this.b;
        ld3 ld3Var = this.c;
        jd3 jd3Var = this.d;
        if (zIsCurrentThread) {
            zd3.k(pd7Var, ld3Var, zd3Var.i(jd3Var));
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new xd3(zd3Var, pd7Var, ld3Var, jd3Var, 0));
        } else {
            viewGroup.post(new xd3(zd3Var, pd7Var, ld3Var, jd3Var, 1));
        }
    }

    @Override // defpackage.fnd
    public final void c(rf7 rf7Var, String str, Throwable th, boolean z) {
        zd3 zd3Var = this.a;
        ViewGroup viewGroup = zd3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        pd7 pd7Var = this.b;
        ld3 ld3Var = this.c;
        if (zIsCurrentThread) {
            zd3.k(pd7Var, ld3Var, od3.a);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new vd3(zd3Var, pd7Var, ld3Var, 1));
        } else {
            viewGroup.post(new wd3(zd3Var, pd7Var, ld3Var, 1));
        }
    }

    @Override // defpackage.uk0, defpackage.fnd
    public final void k(String str) {
        zd3 zd3Var = this.a;
        ViewGroup viewGroup = zd3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        pd7 pd7Var = this.b;
        ld3 ld3Var = this.c;
        if (zIsCurrentThread) {
            zd3.k(pd7Var, ld3Var, od3.a);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new vd3(zd3Var, pd7Var, ld3Var, 0));
        } else {
            viewGroup.post(new wd3(zd3Var, pd7Var, ld3Var, 0));
        }
    }
}
