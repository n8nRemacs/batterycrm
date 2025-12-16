package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class jt5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jt5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity, Bundle bundle) {
    }

    private final void k(Activity activity, Bundle bundle) {
    }

    private final void l(Activity activity, Bundle bundle) {
    }

    private final void m(Activity activity) {
    }

    private final void n(Activity activity) {
    }

    private final void o(Activity activity) {
    }

    private final void p(Activity activity) {
    }

    private final void q(Activity activity) {
    }

    private final void r(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                Bundle bundle2 = null;
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("google.message_id");
                        if (string == null) {
                            string = extras.getString("message_id");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            if (arrayDeque.contains(string)) {
                                return;
                            } else {
                                arrayDeque.add(string);
                            }
                        }
                        bundle2 = extras.getBundle("gcm.n.analytics_data");
                    }
                } catch (RuntimeException e) {
                    Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                }
                if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                    if (bundle2 != null) {
                        if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                            h06 h06VarB = h06.b();
                            h06VarB.a();
                            if (h06VarB.d.a(ed.class) != null) {
                                throw new ClassCastException();
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                            }
                            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                        }
                    }
                    qwi.c("_no", bundle2);
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((urb) this.b).b.f();
                break;
            default:
                msb msbVar = (msb) this.b;
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    msbVar.d.f();
                }
                msbVar.e.f();
                tl6 tl6Var = msbVar.k;
                if (tl6Var != null) {
                    tl6Var.f();
                }
                msbVar.f.f();
                if (i >= 34) {
                    msbVar.g.f();
                }
                msbVar.h.f();
                msbVar.i.f();
                msbVar.j.f();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
    }

    public jt5() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }
}
