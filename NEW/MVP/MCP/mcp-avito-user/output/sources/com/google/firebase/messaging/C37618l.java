package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FcmLifecycleCallbacks.java */
/* renamed from: com.google.firebase.messaging.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37618l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final Set<Intent> f361873b = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.f361873b.add(intent)) {
            return;
        }
        Bundle bundle2 = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
            if (bundle2 != null) {
                if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                    com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.c().b(com.google.firebase.analytics.connector.a.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (aVar != null) {
                        String string = bundle2.getString("google.c.a.c_id");
                        aVar.b(string);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString(SearchParamsConverterKt.SOURCE, "Firebase");
                        bundle3.putString("medium", NotificationsSettings.Section.SECTION_PAID_SERVICES);
                        bundle3.putString("campaign", string);
                        aVar.a("fcm", "_cmp", bundle3);
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            t.a(bundle2, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f361873b.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
