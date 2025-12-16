package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class aac extends ad5 {
    final /* synthetic */ bac this$0;

    public static final class a extends ad5 {
        final /* synthetic */ bac this$0;

        public a(bac bacVar) {
            this.this$0 = bacVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            bac bacVar = this.this$0;
            int i = bacVar.a + 1;
            bacVar.a = i;
            if (i == 1 && bacVar.d) {
                bacVar.X.d(k38.ON_START);
                bacVar.d = false;
            }
        }
    }

    public aac(bac bacVar) {
        this.this$0 = bacVar;
    }

    @Override // defpackage.ad5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = nmd.b;
            ((nmd) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.this$0.Z;
        }
    }

    @Override // defpackage.ad5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        bac bacVar = this.this$0;
        int i = bacVar.b - 1;
        bacVar.b = i;
        if (i == 0) {
            bacVar.o.postDelayed(bacVar.Y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        z9c.a(activity, new a(this.this$0));
    }

    @Override // defpackage.ad5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        bac bacVar = this.this$0;
        int i = bacVar.a - 1;
        bacVar.a = i;
        if (i == 0 && bacVar.c) {
            bacVar.X.d(k38.ON_STOP);
            bacVar.d = true;
        }
    }
}
