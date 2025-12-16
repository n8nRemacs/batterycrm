package defpackage;

import android.app.Activity;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jh0 extends zc5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                sh0 sh0Var = (sh0) this.b;
                sh0Var.d.f();
                sh0Var.e.f();
                break;
            default:
                boolean z = ((tih) this.b).k;
                if (!((tih) this.b).k) {
                    wqi.o("tih", null, "set visible=true on onActivityResumed", Arrays.copyOf(new Object[0], 0));
                    ((tih) this.b).k = true;
                }
                boolean z2 = ((tih) this.b).l;
                if (!((tih) this.b).l) {
                    wqi.o("tih", null, "set screenOn=true on onActivityResumed", Arrays.copyOf(new Object[0], 0));
                    ((tih) this.b).l = true;
                }
                if (!z || !z2) {
                    wqi.o("tih", null, "crutch! call onAppGoesForeground", Arrays.copyOf(new Object[0], 0));
                    ((tih) this.b).b();
                    break;
                }
        }
    }

    @Override // defpackage.zc5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                ((tih) this.b).f++;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "tih", "onActivityStarted, visibleActivitiesCount: " + ((tih) this.b).f, null);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.zc5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                tih tihVar = (tih) this.b;
                tihVar.f--;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "tih", "onActivityStopped, visibleActivitiesCount: " + ((tih) this.b).f, null);
                    }
                }
                if (((tih) this.b).k) {
                    tih tihVar2 = (tih) this.b;
                    if (tihVar2.f == 0) {
                        tihVar2.k = false;
                        ((tih) this.b).a();
                        break;
                    }
                }
                break;
        }
    }
}
