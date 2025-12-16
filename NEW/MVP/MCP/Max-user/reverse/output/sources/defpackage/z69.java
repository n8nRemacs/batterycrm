package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class z69 {
    public boolean c;
    public ey e;
    public final Object a = new Object();
    public final y69 b = new y69(this);
    public WeakReference d = new WeakReference(null);

    public void A(long j) {
    }

    public void B() {
    }

    public final void a(b79 b79Var, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            f3c f3cVar = b79Var.g;
            long j = f3cVar == null ? 0L : f3cVar.o;
            boolean z = f3cVar != null && f3cVar.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                h();
            } else {
                if (z || !z2) {
                    return;
                }
                i();
            }
        }
    }

    public void b(wy8 wy8Var) {
    }

    public void c(wy8 wy8Var, int i) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void f() {
    }

    public boolean g(Intent intent) {
        b79 b79Var;
        ey eyVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.a) {
                b79Var = (b79) this.d.get();
                eyVar = this.e;
            }
            if (b79Var != null && eyVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                b89 b89VarB = b79Var.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(b79Var, eyVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(b79Var, eyVar);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    eyVar.sendMessageDelayed(eyVar.obtainMessage(1, b89VarB), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                eyVar.removeMessages(1);
                this.c = false;
                f3c f3cVar = b79Var.g;
                if (((f3cVar == null ? 0L : f3cVar.o) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void h() {
    }

    public void i() {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void m() {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void q(wy8 wy8Var) {
    }

    public void r() {
    }

    public void s(long j) {
    }

    public void t(float f) {
    }

    public void u(j8d j8dVar) {
    }

    public void v(j8d j8dVar) {
    }

    public void w(int i) {
    }

    public void x(int i) {
    }

    public void y() {
    }

    public void z() {
    }
}
