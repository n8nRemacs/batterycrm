package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ov8 implements lf7 {
    public Object X;
    public final Object Y;
    public final Object a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object o;

    public ov8(lf7 lf7Var) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.Y = new jd7(1, this);
        this.d = lf7Var;
        this.o = lf7Var.getSurface();
    }

    public void a() {
        synchronized (this.a) {
            try {
                this.c = true;
                ((lf7) this.d).g();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        if (this.c) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
        }
        this.c = true;
        Bundle bundle = (Bundle) this.X;
        String str = (String) this.o;
        us usVar = ((k89) this.Y).o;
        pv8 pv8Var = (pv8) this.d;
        vv8 vv8Var = pv8Var.e;
        String str2 = pv8Var.a;
        vv8Var.getClass();
        if (usVar.get(((wv8) vv8Var).a.getBinder()) != pv8Var) {
            if (k89.v0) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str2 + " id=" + str);
                return;
            }
            return;
        }
        if ((1 & this.b) != 0) {
            boolean z = k89.v0;
        }
        try {
            ((wv8) vv8Var).a(str, null, bundle);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + str2);
        }
    }

    @Override // defpackage.lf7
    public void close() {
        synchronized (this.a) {
            try {
                Surface surface = (Surface) this.o;
                if (surface != null) {
                    surface.release();
                }
                ((lf7) this.d).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lf7
    public jf7 e() {
        kd7 kd7Var;
        synchronized (this.a) {
            jf7 jf7VarE = ((lf7) this.d).e();
            if (jf7VarE != null) {
                this.b++;
                kd7Var = new kd7(jf7VarE);
                kd7Var.c((jd7) this.Y);
            } else {
                kd7Var = null;
            }
        }
        return kd7Var;
    }

    @Override // defpackage.lf7
    public int f() {
        int iF;
        synchronized (this.a) {
            iF = ((lf7) this.d).f();
        }
        return iF;
    }

    @Override // defpackage.lf7
    public void g() {
        synchronized (this.a) {
            ((lf7) this.d).g();
        }
    }

    @Override // defpackage.lf7
    public int getHeight() {
        int height;
        synchronized (this.a) {
            height = ((lf7) this.d).getHeight();
        }
        return height;
    }

    @Override // defpackage.lf7
    public Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = ((lf7) this.d).getSurface();
        }
        return surface;
    }

    @Override // defpackage.lf7
    public int getWidth() {
        int width;
        synchronized (this.a) {
            width = ((lf7) this.d).getWidth();
        }
        return width;
    }

    @Override // defpackage.lf7
    public void i(kf7 kf7Var, Executor executor) {
        synchronized (this.a) {
            ((lf7) this.d).i(new z9a(this, 21, kf7Var), executor);
        }
    }

    @Override // defpackage.lf7
    public int m() {
        int iM;
        synchronized (this.a) {
            iM = ((lf7) this.d).m();
        }
        return iM;
    }

    @Override // defpackage.lf7
    public jf7 n() {
        kd7 kd7Var;
        synchronized (this.a) {
            jf7 jf7VarN = ((lf7) this.d).n();
            if (jf7VarN != null) {
                this.b++;
                kd7Var = new kd7(jf7VarN);
                kd7Var.c((jd7) this.Y);
            } else {
                kd7Var = null;
            }
        }
        return kd7Var;
    }

    public ov8(k89 k89Var, Object obj, pv8 pv8Var, String str, Bundle bundle) {
        this.Y = k89Var;
        this.d = pv8Var;
        this.o = str;
        this.X = bundle;
        this.a = obj;
    }
}
