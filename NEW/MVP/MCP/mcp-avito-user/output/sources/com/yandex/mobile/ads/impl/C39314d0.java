package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39314d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C39314d0 f384501a = new C39314d0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private static C39318e0 f384502b;

    private C39314d0() {
    }

    @X41.n
    public static final void a(@Y61.k Context context) {
        synchronized (f384501a) {
            try {
                if (f384502b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        C39318e0 c39318e0 = new C39318e0(activity);
                        f384502b = c39318e0;
                        application.registerActivityLifecycleCallbacks(c39318e0);
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @X41.n
    @Y61.l
    public static final Activity a() {
        Activity activityA;
        synchronized (f384501a) {
            C39318e0 c39318e0 = f384502b;
            activityA = c39318e0 != null ? c39318e0.a() : null;
        }
        return activityA;
    }
}
