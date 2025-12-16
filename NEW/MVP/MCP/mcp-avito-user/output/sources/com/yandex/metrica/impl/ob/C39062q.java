package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import j.InterfaceC42148d;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39062q extends C38914k0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private Application f381387a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private volatile c f381388b = c.NOT_WATCHING_YET;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39108rm<a, b> f381389c = new C39108rm<>(true);

    /* renamed from: com.yandex.metrica.impl.ob.q$a */
    public enum a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* renamed from: com.yandex.metrica.impl.ob.q$b */
    public interface b {
        @j.K
        void a(@j.N Activity activity, @j.N a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.q$c */
    public enum c {
        WATCHING(null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");


        /* renamed from: a, reason: collision with root package name */
        public final String f381401a;

        c(String str) {
            this.f381401a = str;
        }
    }

    @InterfaceC42148d
    private synchronized void b() {
        c cVar = this.f381388b;
        c cVar2 = c.WATCHING;
        if (cVar != cVar2 && !this.f381389c.b()) {
            if (this.f381387a == null) {
                this.f381388b = c.NO_APPLICATION;
            } else {
                this.f381388b = cVar2;
                this.f381387a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    @InterfaceC42148d
    public synchronized void a(@j.N Context context) {
        if (this.f381387a == null) {
            try {
                this.f381387a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @j.K
    public void onActivityCreated(@j.N Activity activity, @j.P Bundle bundle) {
        a(a.CREATED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@j.N Activity activity) {
        a(a.DESTROYED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @j.K
    public void onActivityPaused(@j.N Activity activity) {
        a(a.PAUSED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @j.K
    public void onActivityResumed(@j.N Activity activity) {
        a(a.RESUMED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@j.N Activity activity) {
        a(a.STARTED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@j.N Activity activity) {
        a(a.STOPPED, activity);
    }

    @InterfaceC42148d
    public synchronized void a(@j.N Application application) {
        try {
            if (this.f381387a == null) {
                this.f381387a = application;
            }
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.N
    @InterfaceC42148d
    public c a() {
        return this.f381388b;
    }

    private void a(@j.N a aVar, @j.N Activity activity) {
        Collection<b> collectionA;
        synchronized (this) {
            collectionA = this.f381389c.a(aVar);
        }
        if (collectionA != null) {
            Iterator<b> it = collectionA.iterator();
            while (it.hasNext()) {
                it.next().a(activity, aVar);
            }
        }
    }

    @InterfaceC42148d
    public synchronized void a(@j.N b bVar, @j.P a... aVarArr) {
        try {
            if (aVarArr.length == 0) {
                aVarArr = a.values();
            }
            for (a aVar : aVarArr) {
                this.f381389c.a(aVar, bVar);
            }
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
