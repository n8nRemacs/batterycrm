package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class xn4 implements b48 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ xn4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                vn4 vn4Var = (vn4) this.b;
                switch (wn4.$EnumSwitchMapping$0[k38Var.ordinal()]) {
                    case 1:
                        vn4Var.getClass();
                        break;
                    case 2:
                        vn4Var.onStart(j48Var);
                        break;
                    case 3:
                        vn4Var.onResume(j48Var);
                        break;
                    case 4:
                        vn4Var.onPause(j48Var);
                        break;
                    case 5:
                        vn4Var.onStop(j48Var);
                        break;
                    case 6:
                        vn4Var.onDestroy(j48Var);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                b48 b48Var = (b48) this.c;
                if (b48Var != null) {
                    b48Var.d(j48Var, k38Var);
                    return;
                }
                return;
            case 1:
                bj6 bj6Var = (bj6) this.b;
                l29 l29Var = (l29) this.c;
                if (l29Var.o.P()) {
                    return;
                }
                j48Var.p().f(this);
                if (((FrameLayout) bj6Var.a).isAttachedToWindow()) {
                    l29Var.H(bj6Var);
                    return;
                }
                return;
            case 2:
                if (k38Var == k38.ON_DESTROY) {
                    ((Handler) this.b).removeCallbacks((ue) this.c);
                    j48Var.p().f(this);
                    return;
                }
                return;
            case 3:
                if (k38Var == k38.ON_START) {
                    ((l48) this.b).f(this);
                    ((pn) this.c).g();
                    return;
                }
                return;
            default:
                HashMap map = ((ea3) this.c).a;
                List list = (List) map.get(k38Var);
                Object obj = this.b;
                ea3.a(list, j48Var, k38Var, obj);
                ea3.a((List) map.get(k38.ON_ANY), j48Var, k38Var, obj);
                return;
        }
    }

    public xn4(f48 f48Var) {
        this.a = 4;
        this.b = f48Var;
        ga3 ga3Var = ga3.c;
        Class<?> cls = f48Var.getClass();
        ea3 ea3Var = (ea3) ga3Var.a.get(cls);
        this.c = ea3Var == null ? ga3Var.a(cls, null) : ea3Var;
    }

    public xn4(l29 l29Var, bj6 bj6Var) {
        this.a = 1;
        this.c = l29Var;
        this.b = bj6Var;
    }
}
