package defpackage;

import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class ud3 extends kj0 {
    public final /* synthetic */ zd3 b;
    public final /* synthetic */ rf7 c;
    public final /* synthetic */ ld3 d;
    public final /* synthetic */ pd7 e;
    public final /* synthetic */ jd3 f;

    public ud3(zd3 zd3Var, rf7 rf7Var, ld3 ld3Var, pd7 pd7Var, jd3 jd3Var) {
        this.b = zd3Var;
        this.c = rf7Var;
        this.d = ld3Var;
        this.e = pd7Var;
        this.f = jd3Var;
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void b(String str, Object obj, Animatable animatable) {
        zd3 zd3Var = this.b;
        ViewGroup viewGroup = zd3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        ld3 ld3Var = this.d;
        jd3 jd3Var = this.f;
        if (zIsCurrentThread) {
            ld3Var.a();
            viewGroup.postInvalidate();
            zd3Var.i.invoke(jd3Var.i());
        } else {
            Handler handler = viewGroup.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new rd3(ld3Var, zd3Var, jd3Var, 0));
            } else {
                viewGroup.post(new rd3(ld3Var, zd3Var, jd3Var, 1));
            }
        }
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void d(String str, Throwable th) {
        ViewGroup viewGroup = this.b.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        ld3 ld3Var = this.d;
        if (zIsCurrentThread) {
            ld3Var.a();
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new qd3(ld3Var, 0));
        } else {
            viewGroup.post(new qd3(ld3Var, 1));
        }
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void e(String str) {
        ViewGroup viewGroup = this.b.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        ld3 ld3Var = this.d;
        if (zIsCurrentThread) {
            ld3Var.a();
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new qd3(ld3Var, 2));
        } else {
            viewGroup.post(new qd3(ld3Var, 3));
        }
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void g(String str) {
        zd3 zd3Var = this.b;
        ViewGroup viewGroup = zd3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        rf7 rf7Var = this.c;
        ld3 ld3Var = this.d;
        pd7 pd7Var = this.e;
        if (!zIsCurrentThread) {
            Handler handler = viewGroup.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new sd3(rf7Var, ld3Var, zd3Var, pd7Var, 0));
                return;
            } else {
                viewGroup.post(new sd3(rf7Var, ld3Var, zd3Var, pd7Var, 1));
                return;
            }
        }
        if (rf7Var != null) {
            pe4 pe4VarB = zk6.e().b(rf7Var, null);
            ld3Var.d = pe4VarB;
            if (zd3Var.e) {
                ((r0) pe4VarB).l(new td3(zd3Var, pd7Var, ld3Var), yu1.a);
            }
        }
    }
}
