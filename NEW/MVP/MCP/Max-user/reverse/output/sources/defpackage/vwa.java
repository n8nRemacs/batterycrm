package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class vwa extends zc5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final /* synthetic */ OneMeApplication b;

    public vwa(OneMeApplication oneMeApplication) {
        this.b = oneMeApplication;
    }

    @Override // defpackage.zc5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        rwa rwaVar = OneMeApplication.s0;
        if (rwa.a(activity)) {
            this.a.add(new WeakReference(activity));
        }
    }

    @Override // defpackage.zc5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.removeIf(new a6(8, new uq(activity, 1)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object value;
        rwa rwaVar = OneMeApplication.s0;
        if (rwa.a(activity)) {
            tcf tcfVar = (tcf) a93.s0.x(this.b).X;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
        }
    }
}
