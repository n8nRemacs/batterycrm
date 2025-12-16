package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.nmd;

/* loaded from: classes.dex */
public abstract class lmd {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, k38 k38Var) {
        l48 l48VarP;
        if (!(activity instanceof j48) || (l48VarP = ((j48) activity).p()) == null) {
            return;
        }
        l48VarP.d(k38Var);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            nmd.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new nmd.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new nmd(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
