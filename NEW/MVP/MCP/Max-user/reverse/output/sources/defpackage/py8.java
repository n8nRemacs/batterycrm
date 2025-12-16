package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* loaded from: classes.dex */
public final class py8 implements IBinder.DeathRecipient {
    public final qx8 a = new qx8(this);
    public nl4 b;
    public sx8 c;
    public final Handler d;
    public final /* synthetic */ ry8 e;

    public py8(ry8 ry8Var, Looper looper) {
        this.e = ry8Var;
        this.d = new Handler(looper, new dn3(7, this));
    }

    public final void a(vx8 vx8Var) {
        ry8 ry8Var = this.e;
        qy8 qy8Var = ry8Var.n;
        ry8Var.n = new qy8(vx8Var, qy8Var.b, qy8Var.c, qy8Var.d, qy8Var.e, qy8Var.f, qy8Var.g, qy8Var.h);
        k();
    }

    public final void b(boolean z) {
        px8 px8Var = this.e.b;
        px8Var.getClass();
        hsi.g(Looper.myLooper() == px8Var.o.getLooper());
        nx8 nx8Var = px8Var.d;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        nx8Var.I(new aie("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY));
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i(8, null, null);
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ry8 ry8Var = this.e;
        qy8 qy8Var = ry8Var.n;
        ry8Var.n = new qy8(qy8Var.a, qy8Var.b, qy8Var.c, qy8Var.d, qy8Var.e, qy8Var.f, qy8Var.g, bundle2);
        ry8Var.o = true;
        k();
    }

    public final void d(x19 x19Var) {
        ry8 ry8Var = this.e;
        qy8 qy8Var = ry8Var.n;
        ry8Var.n = new qy8(qy8Var.a, qy8Var.b, x19Var, qy8Var.d, qy8Var.e, qy8Var.f, qy8Var.g, qy8Var.h);
        k();
    }

    public final void e(f3c f3cVar) {
        ry8 ry8Var = this.e;
        qy8 qy8Var = ry8Var.n;
        ry8Var.n = new qy8(qy8Var.a, ry8.o(f3cVar), qy8Var.c, qy8Var.d, qy8Var.e, qy8Var.f, qy8Var.g, qy8Var.h);
        k();
    }

    public final void f(List list) {
        ry8 ry8Var = this.e;
        qy8 qy8Var = ry8Var.n;
        ry8Var.n = new qy8(qy8Var.a, qy8Var.b, qy8Var.c, ry8.m(list), qy8Var.e, qy8Var.f, qy8Var.g, qy8Var.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        ry8 ry8Var = this.e;
        qy8 qy8Var = ry8Var.n;
        ry8Var.n = new qy8(qy8Var.a, qy8Var.b, qy8Var.c, qy8Var.d, charSequence, qy8Var.f, qy8Var.g, qy8Var.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        px8 px8Var = this.e.b;
        px8Var.getClass();
        hsi.g(Looper.myLooper() == px8Var.o.getLooper());
        px8Var.d.I(new aie(str, Bundle.EMPTY));
    }

    public final void i(int i, Object obj, Bundle bundle) {
        nl4 nl4Var = this.b;
        if (nl4Var != null) {
            Message messageObtainMessage = nl4Var.obtainMessage(i, obj);
            if (bundle != null) {
                messageObtainMessage.setData(bundle);
            }
            messageObtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler != null) {
            nl4 nl4Var = new nl4(this, handler.getLooper());
            this.b = nl4Var;
            nl4Var.b = true;
        } else {
            nl4 nl4Var2 = this.b;
            if (nl4Var2 != null) {
                nl4Var2.b = false;
                nl4Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void k() {
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.e.h);
    }
}
