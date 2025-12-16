package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.yandex.mobile.ads.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39318e0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39326g0 f384719a;

    @X41.j
    public C39318e0(@Y61.k C39326g0 c39326g0) {
        this.f384719a = c39326g0;
    }

    @Y61.l
    public final Activity a() {
        return this.f384719a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@Y61.k Activity activity) {
        this.f384719a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@Y61.k Activity activity) {
        if (activity.isFinishing()) {
            this.f384719a.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
        this.f384719a.a(activity);
    }

    public /* synthetic */ C39318e0(Activity activity) {
        this(new C39326g0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@Y61.k Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@Y61.k Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@Y61.k Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@Y61.k Activity activity, @Y61.k Bundle bundle) {
    }
}
