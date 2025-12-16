package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39373w implements InterfaceC39367u {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f391232f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile C39373w f391233g;

    /* renamed from: d, reason: collision with root package name */
    private boolean f391237d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f391234a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final WeakHashMap f391235b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final WeakHashMap f391236c = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f391238e = new a();

    @Override // com.yandex.mobile.ads.impl.InterfaceC39367u
    public final void b(@j.N Context context, @j.N InterfaceC39322f0 interfaceC39322f0) {
        boolean z12;
        synchronized (this.f391234a) {
            this.f391235b.put(interfaceC39322f0, null);
            synchronized (this.f391234a) {
                z12 = this.f391237d;
            }
            if (!z12) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f391238e);
                    this.f391237d = true;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @j.N
    public static C39373w a() {
        if (f391233g == null) {
            synchronized (f391232f) {
                try {
                    if (f391233g == null) {
                        f391233g = new C39373w();
                    }
                } finally {
                }
            }
        }
        return f391233g;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39367u
    public final void a(@j.N Context context, @j.N InterfaceC39322f0 interfaceC39322f0) {
        synchronized (this.f391234a) {
            this.f391235b.remove(interfaceC39322f0);
            a(context);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39367u
    public final void b(@j.N Context context, @j.N vz0 vz0Var) {
        boolean z12;
        synchronized (this.f391234a) {
            this.f391236c.put(vz0Var, null);
            synchronized (this.f391234a) {
                z12 = this.f391237d;
            }
            if (!z12) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f391238e);
                    this.f391237d = true;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39367u
    public final void a(@j.N Context context, @j.N vz0 vz0Var) {
        synchronized (this.f391234a) {
            this.f391236c.remove(vz0Var);
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@j.N Context context) {
        boolean z12;
        synchronized (this.f391234a) {
            if (this.f391235b.isEmpty() && this.f391236c.isEmpty()) {
                try {
                    synchronized (this.f391234a) {
                        z12 = this.f391237d;
                    }
                    if (z12) {
                        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f391238e);
                        this.f391237d = false;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @j.N
        private HashSet a(@j.N WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (C39373w.this.f391234a) {
                try {
                    Set setKeySet = weakHashMap.keySet();
                    hashSet = new HashSet(setKeySet.size());
                    for (Object obj : setKeySet) {
                        if (obj != null) {
                            hashSet.add(obj);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hashSet;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@j.N Activity activity, @j.P Bundle bundle) {
            Iterator it = a(C39373w.this.f391236c).iterator();
            while (it.hasNext()) {
                ((vz0) it.next()).a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@j.N Activity activity) {
            Iterator it = a(C39373w.this.f391235b).iterator();
            while (it.hasNext()) {
                ((InterfaceC39322f0) it.next()).a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@j.N Activity activity) {
            Iterator it = a(C39373w.this.f391235b).iterator();
            while (it.hasNext()) {
                ((InterfaceC39322f0) it.next()).b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@j.N Activity activity, @j.P Bundle bundle) {
            Iterator it = a(C39373w.this.f391236c).iterator();
            while (it.hasNext()) {
                ((vz0) it.next()).b(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@j.N Activity activity) {
            C39373w.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@j.N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@j.N Activity activity) {
        }
    }
}
