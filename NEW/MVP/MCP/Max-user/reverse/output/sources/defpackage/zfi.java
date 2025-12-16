package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class zfi {
    public static final rha a;
    public static final tha b;
    public static final qha c;

    static {
        int i = 28;
        a = new rha(i);
        b = new tha(i);
        c = new qha(i);
    }

    public static final void a(ViewGroup viewGroup) {
        b(viewGroup, new eo7(0, new ms0(3, 1, false), 7), null);
    }

    public static final void b(View view, eo7 eo7Var, em6 em6Var) {
        ms0 ms0Var = eo7Var.d;
        int i = ms0Var != null ? ms0Var.b : 0;
        int i2 = i == 0 ? -1 : go7.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 == -1 || i2 == 1) {
            new mdf(view, eo7Var, em6Var);
        } else if (i2 == 2) {
            new lf(view, eo7Var, em6Var);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            new mf(view, eo7Var, em6Var, 40);
        }
    }

    public static void c(View view) {
        b(view, new eo7(3, null, 13), null);
    }

    public static final eyd d(d8a d8aVar) {
        LinkedHashMap linkedHashMap = d8aVar.a;
        kyd kydVar = (kyd) linkedHashMap.get(a);
        if (kydVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ggh gghVar = (ggh) linkedHashMap.get(b);
        if (gghVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(r8j.B0);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        jyd jydVarD = kydVar.l().d();
        hyd hydVar = jydVarD instanceof hyd ? (hyd) jydVarD : null;
        if (hydVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        SavedStateHandlesVM savedStateHandlesVMF = f(gghVar);
        eyd eydVar = (eyd) savedStateHandlesVMF.b.get(str);
        if (eydVar != null) {
            return eydVar;
        }
        Class[] clsArr = eyd.f;
        hydVar.b();
        Bundle bundle2 = hydVar.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = hydVar.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = hydVar.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            hydVar.c = null;
        }
        eyd eydVarA = c9j.a(bundle3, bundle);
        savedStateHandlesVMF.b.put(str, eydVarA);
        return eydVarA;
    }

    public static final void e(kyd kydVar) {
        l38 l38Var = kydVar.p().d;
        if (l38Var != l38.b && l38Var != l38.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (kydVar.l().d() == null) {
            hyd hydVar = new hyd(kydVar.l(), (ggh) kydVar);
            kydVar.l().f("androidx.lifecycle.internal.SavedStateHandlesProvider", hydVar);
            kydVar.p().a(new nhd(7, hydVar));
        }
    }

    public static final SavedStateHandlesVM f(ggh gghVar) {
        return (SavedStateHandlesVM) new ka5(gghVar.h(), new gyd(), gghVar instanceof s07 ? ((s07) gghVar).e() : y94.b).l(vid.a(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final b26 g(zde zdeVar, em6 em6Var, em6 em6Var2) {
        return new b26(zdeVar, (em6) new a7c(em6Var, 12, em6Var2), (em6) oee.a);
    }
}
