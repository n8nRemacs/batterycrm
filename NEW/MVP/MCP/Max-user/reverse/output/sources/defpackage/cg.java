package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class cg {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final bwf e;
    public static final mc f;
    public static final mc g;

    static {
        bwf bwfVar = new bwf(new l(4));
        e = bwfVar;
        mc mcVar = new mc(1);
        f = mcVar;
        mc mcVar2 = new mc(2);
        g = mcVar2;
        ((Handler) bwfVar.getValue()).post(mcVar);
        ((Handler) bwfVar.getValue()).post(mcVar2);
    }

    public static void a(ak6 ak6Var, int i) {
        int i2 = ak6Var.a;
        t3g t3gVar = ak6Var.b;
        float f2 = i2 * 0.5f;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        int iC = n7j.c(t3gVar.Y + i, (int) f2, i2);
        int i3 = t3gVar.Y;
        if (iC == i3 || iC == i3) {
            return;
        }
        t3gVar.Y = n7j.c(iC, 1, t3gVar.X);
        xu0 xu0VarQ = t3gVar.q();
        if (xu0VarQ != null) {
            xu0VarQ.a(t3gVar.Y);
        }
    }
}
