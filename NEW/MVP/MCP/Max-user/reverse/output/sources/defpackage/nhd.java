package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class nhd implements b48 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nhd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) throws NoSuchMethodException, SecurityException {
        View view;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kyd kydVar = (kyd) obj;
                if (k38Var != k38.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                j48Var.p().f(this);
                Bundle bundleC = kydVar.l().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, nhd.class.getClassLoader()).asSubclass(iyd.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                if (!(kydVar instanceof ggh)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                fgh fghVarH = ((ggh) kydVar).h();
                                pn pnVarL = kydVar.l();
                                fghVarH.getClass();
                                LinkedHashMap linkedHashMap = fghVarH.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    j8.a((yfh) linkedHashMap.get((String) it.next()), pnVarL, kydVar.p());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    pnVarL.g();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(wy1.h("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(ho7.i("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                b bVar = (b) obj;
                if (bVar.o == null) {
                    jl3 jl3Var = (jl3) bVar.getLastNonConfigurationInstance();
                    if (jl3Var != null) {
                        bVar.o = jl3Var.b;
                    }
                    if (bVar.o == null) {
                        bVar.o = new fgh();
                    }
                }
                bVar.a.f(this);
                return;
            case 2:
                new HashMap();
                zq6[] zq6VarArr = (zq6[]) obj;
                if (zq6VarArr.length > 0) {
                    zq6 zq6Var = zq6VarArr[0];
                    throw null;
                }
                if (zq6VarArr.length <= 0) {
                    return;
                }
                zq6 zq6Var2 = zq6VarArr[0];
                throw null;
            case 3:
                if (k38Var == k38.ON_DESTROY) {
                    wzd wzdVar = (wzd) obj;
                    wzdVar.a = null;
                    LinkedList linkedList = wzdVar.b;
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        ((cp5) it2.next()).b.invoke();
                    }
                    linkedList.clear();
                    return;
                }
                return;
            case 4:
                if (k38Var != k38.ON_STOP || (view = ((a) obj).S0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 5:
                ((wo8) obj).g(false);
                return;
            case 6:
                fs4 fs4Var = (fs4) obj;
                wqi.c("fs4", "onStateChanged: new event = " + k38Var, new Object[0]);
                if (k38Var != k38.ON_RESUME) {
                    return;
                }
                x9f x9fVar = (x9f) fs4Var.e;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                int i2 = ((bj7) ((a3b) fs4Var.c).b).y0.get();
                wqi.c("fs4", "onStateChanged: prevAllMediaCount = " + i2, new Object[0]);
                fs4Var.e = svi.e((bj7) fs4Var.a, (a84) fs4Var.b, null, new hn8(fs4Var, i2, null), 2);
                return;
            default:
                if (k38Var != k38.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + k38Var).toString());
                }
                j48Var.p().f(this);
                ((hyd) obj).b();
                return;
        }
    }
}
