package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class oy8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry8 b;

    public /* synthetic */ oy8(ry8 ry8Var, int i) {
        this.a = i;
        this.b = ry8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ry8 ry8Var = this.b;
                Context context = ry8Var.a;
                ComponentName componentNameA = ry8Var.c.a.a();
                jkc jkcVar = new jkc();
                jkcVar.c = ry8Var;
                jkcVar.a = new kv8(jkcVar);
                nv8 nv8Var = new nv8(context, componentNameA, jkcVar, ry8Var.b.c.J());
                ry8Var.j = nv8Var;
                Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                nv8Var.a.b.connect();
                break;
            case 1:
                ry8 ry8Var2 = this.b;
                if (!ry8Var2.k && ((tx8) ry8Var2.i.a).e.a() == null) {
                    ry8Var2.R();
                    break;
                }
                break;
            default:
                px8 px8Var = this.b.b;
                px8Var.getClass();
                hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                nx8 nx8Var = px8Var.d;
                nx8Var.getClass();
                a6a.c(new yie(-6));
                nx8Var.z();
                break;
        }
    }

    public /* synthetic */ oy8(ry8 ry8Var, goh gohVar) {
        this.a = 2;
        this.b = ry8Var;
    }
}
