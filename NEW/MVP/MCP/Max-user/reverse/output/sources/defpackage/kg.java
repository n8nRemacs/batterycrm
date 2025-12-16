package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kg {
    public static final ThreadLocal i = new ThreadLocal();
    public final xt4 e;
    public i5i h;
    public final z0f a = new z0f(0);
    public final ArrayList b = new ArrayList();
    public final y6i c = new y6i(2, this);
    public final o3 d = new o3(6, this);
    public boolean f = false;
    public float g = 1.0f;

    public kg(xt4 xt4Var) {
        this.e = xt4Var;
    }

    public final boolean a() {
        xt4 xt4Var = this.e;
        xt4Var.getClass();
        return Thread.currentThread() == ((Looper) xt4Var.c).getThread();
    }
}
