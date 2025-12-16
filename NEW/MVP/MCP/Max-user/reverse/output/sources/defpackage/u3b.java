package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class u3b implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ em6 a;
    public final /* synthetic */ v3b b;

    public u3b(em6 em6Var, v3b v3bVar) {
        this.a = em6Var;
        this.b = v3bVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (((Boolean) this.a.invoke(activity)).booleanValue()) {
            ssd ssdVar = ssd.a;
            ssd.b.add(new c74(2, this.b));
            View decorView = activity.getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.setOnHierarchyChangeListener(ssdVar);
            }
            nz5 nz5Var = new nz5(zfi.g(ys.f(new View[]{activity.getWindow().getDecorView().getRootView()}), new dga(11), new dga(12)));
            while (nz5Var.hasNext()) {
                View view = (View) nz5Var.next();
                ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup2 != null) {
                    viewGroup2.setOnHierarchyChangeListener(ssdVar);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
