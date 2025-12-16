package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import bZ0.InterfaceC25600a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ComponentCallbacks2C36631d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
    public static final ComponentCallbacks2C36631d f349105f = new ComponentCallbacks2C36631d();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f349106b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f349107c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC25600a
    public final ArrayList f349108d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC25600a
    public boolean f349109e = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public interface a {
        @RX0.a
        void a(boolean z12);
    }

    @RX0.a
    public ComponentCallbacks2C36631d() {
    }

    @RX0.a
    public static void b(@j.N Application application) {
        ComponentCallbacks2C36631d componentCallbacks2C36631d = f349105f;
        synchronized (componentCallbacks2C36631d) {
            try {
                if (!componentCallbacks2C36631d.f349109e) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C36631d);
                    application.registerComponentCallbacks(componentCallbacks2C36631d);
                    componentCallbacks2C36631d.f349109e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z12) {
        synchronized (f349105f) {
            try {
                Iterator it = this.f349108d.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@j.N Activity activity, @j.P Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f349107c;
        boolean zCompareAndSet = this.f349106b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@j.N Activity activity) {
        AtomicBoolean atomicBoolean = this.f349107c;
        boolean zCompareAndSet = this.f349106b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        if (i12 == 20 && this.f349106b.compareAndSet(false, true)) {
            this.f349107c.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@j.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@j.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@j.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@j.N Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@j.N Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@j.N Activity activity, @j.N Bundle bundle) {
    }
}
