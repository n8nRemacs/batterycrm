package com.iab.omid.library.corpmailru.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f363971a = new b();

    /* renamed from: b, reason: collision with root package name */
    private boolean f363972b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f363973c;

    /* renamed from: d, reason: collision with root package name */
    private a f363974d;

    public interface a {
        void a(boolean z12);
    }

    private b() {
    }

    public static b a() {
        return f363971a;
    }

    private void e() {
        boolean z12 = !this.f363973c;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = com.iab.omid.library.corpmailru.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z12);
        }
    }

    public void b() {
        this.f363972b = true;
        this.f363973c = false;
        e();
    }

    public void c() {
        this.f363972b = false;
        this.f363973c = false;
        this.f363974d = null;
    }

    @VisibleForTesting
    @RequiresApi(api = 16)
    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View viewD;
        boolean z12 = false;
        boolean z13 = d().importance != 100;
        boolean z14 = true;
        for (com.iab.omid.library.corpmailru.adsession.a aVar : com.iab.omid.library.corpmailru.b.a.a().c()) {
            if (aVar.e() && (viewD = aVar.d()) != null && viewD.hasWindowFocus()) {
                z14 = false;
            }
        }
        if (z13 && z14) {
            z12 = true;
        }
        a(z12);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f363974d = aVar;
    }

    private void a(boolean z12) {
        if (this.f363973c != z12) {
            this.f363973c = z12;
            if (this.f363972b) {
                e();
                a aVar = this.f363974d;
                if (aVar != null) {
                    aVar.a(!z12);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
