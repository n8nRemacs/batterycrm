package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class f5j {
    public static ytd a(ln lnVar, f82 f82Var, Bundle bundle) {
        iei.a();
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImplA = e48.a(lnVar, true);
        if (androidXLifecycleHandlerImplA == null) {
            androidXLifecycleHandlerImplA = new AndroidXLifecycleHandlerImpl();
            ti6 ti6VarZ = lnVar.z();
            ti6VarZ.getClass();
            ue0 ue0Var = new ue0(ti6VarZ);
            ue0Var.f(0, androidXLifecycleHandlerImplA, "LifecycleHandler", 1);
            ue0Var.d(false);
        }
        androidXLifecycleHandlerImplA.u0(lnVar);
        LinkedHashMap linkedHashMap = androidXLifecycleHandlerImplA.getI1().j;
        LinkedHashMap linkedHashMap2 = e48.a;
        b8 b8Var = (b8) linkedHashMap.get(Integer.valueOf(f82Var.getId()));
        if (b8Var != null) {
            b8Var.a0(androidXLifecycleHandlerImplA, f82Var);
        } else {
            b8Var = new b8();
            b8Var.a0(androidXLifecycleHandlerImplA, f82Var);
            if (bundle != null) {
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = b8Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                Bundle bundle2 = bundle.getBundle(sb.toString());
                if (bundle2 != null) {
                    b8Var.O(bundle2);
                }
            }
            androidXLifecycleHandlerImplA.getI1().j.put(Integer.valueOf(f82Var.getId()), b8Var);
        }
        b8Var.J();
        b8Var.e = 1;
        return b8Var;
    }

    public static final void b(esg esgVar) {
        esgVar.d(125, new eya(13));
        esgVar.d(126, new eya(14));
        esgVar.d(127, new eya(15));
        esgVar.d(128, new eya(16));
        esgVar.d(129, new bya(6));
        esgVar.d(130, new eya(17));
        esgVar.d(131, new eya(18));
        esgVar.d(132, new eya(19));
        esgVar.d(133, new cya(11));
        esgVar.d(134, new eya(20));
        esgVar.d(135, new eya(21));
        esgVar.d(136, new eya(12));
        esgVar.b(2, new bya(4));
        esgVar.b(2, new bya(5));
    }
}
