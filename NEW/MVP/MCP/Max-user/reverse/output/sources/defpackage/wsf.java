package defpackage;

import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class wsf {
    public static int a(int i, double d) {
        return (Double.hashCode(d) + i) * 31;
    }

    public static void b(ha8 ha8Var, rn6 rn6Var, Executor executor) {
        rn6Var.getClass();
        ha8Var.d(new zn6(ha8Var, 0, rn6Var), executor);
    }

    public static s98 c(List list) {
        return new s98(new ArrayList(list), true, ayi.a());
    }

    public static Object d(Future future) {
        z5j.f("Future was expected to be done, " + future, future.isDone());
        return e(future);
    }

    public static Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static ag7 f(Object obj) {
        return obj == null ? ag7.c : new ag7(0, obj);
    }

    public static ha8 g(ha8 ha8Var) {
        ha8Var.getClass();
        return ha8Var.isDone() ? ha8Var : ixi.a(new wn6(ha8Var, 1));
    }

    public static void h(ha8 ha8Var, tu1 tu1Var) {
        i(true, ha8Var, tu1Var, ayi.a());
    }

    public static void i(boolean z, ha8 ha8Var, tu1 tu1Var, ex4 ex4Var) {
        ha8Var.getClass();
        tu1Var.getClass();
        ex4Var.getClass();
        b(ha8Var, new as4(tu1Var, 1), ex4Var);
        if (z) {
            tu1Var.a(new ue(24, ha8Var), ayi.a());
        }
    }

    public static void j(View view, TextPaint textPaint, t5g t5gVar) {
        t5gVar.a(view.getContext(), textPaint, view.getResources().getDisplayMetrics(), t75.b);
    }

    public static s98 k(ArrayList arrayList) {
        return new s98(new ArrayList(arrayList), false, ayi.a());
    }

    public static q72 l(ha8 ha8Var, yu yuVar, Executor executor) {
        q72 q72Var = new q72(yuVar, ha8Var);
        ha8Var.d(q72Var, executor);
        return q72Var;
    }
}
