package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class ep1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static ep1 f385066d = new ep1();

    /* renamed from: a, reason: collision with root package name */
    private boolean f385067a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f385068b;

    /* renamed from: c, reason: collision with root package name */
    private a f385069c;

    public interface a {
    }

    private ep1() {
    }

    public static ep1 a() {
        return f385066d;
    }

    public final void b() {
        this.f385067a = true;
        this.f385068b = false;
        Iterator<to1> it = uo1.a().b().iterator();
        while (it.hasNext()) {
            it.next().i().a(true);
        }
    }

    public final void c() {
        this.f385067a = false;
        this.f385068b = false;
        this.f385069c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f385068b) {
            this.f385068b = false;
            if (this.f385067a) {
                Iterator<to1> it = uo1.a().b().iterator();
                while (it.hasNext()) {
                    it.next().i().a(true);
                }
                if (this.f385069c != null) {
                    wa1.g().getClass();
                    wa1.a();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewE;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z12 = false;
        boolean z13 = runningAppProcessInfo.importance != 100;
        boolean z14 = true;
        for (to1 to1Var : uo1.a().c()) {
            if (to1Var.f() && (viewE = to1Var.e()) != null && viewE.hasWindowFocus()) {
                z14 = false;
            }
        }
        if (z13 && z14) {
            z12 = true;
        }
        if (this.f385068b != z12) {
            this.f385068b = z12;
            if (this.f385067a) {
                boolean z15 = !z12;
                Iterator<to1> it = uo1.a().b().iterator();
                while (it.hasNext()) {
                    it.next().i().a(z15);
                }
                if (this.f385069c != null) {
                    if (z12) {
                        wa1.g().getClass();
                        wa1.c();
                    } else {
                        wa1.g().getClass();
                        wa1.a();
                    }
                }
            }
        }
    }

    public final void a(@j.N Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a(a aVar) {
        this.f385069c = aVar;
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
