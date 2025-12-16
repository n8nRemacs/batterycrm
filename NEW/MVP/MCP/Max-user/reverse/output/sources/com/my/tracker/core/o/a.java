package com.my.tracker.core.o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.TimePoint;
import defpackage.d8i;
import defpackage.oba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private final EngineMiniCore a;
    private final Object b = new Object();
    private List c = new ArrayList();
    private MyTrackerActivityHandler d = null;

    private a(EngineMiniCore engineMiniCore) {
        this.a = engineMiniCore;
    }

    public static a a(EngineMiniCore engineMiniCore) {
        return new a(engineMiniCore);
    }

    public void b() {
        this.a.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
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
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(new d8i(activity, TimePoint.now(), 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(new d8i(activity, TimePoint.now(), 0));
    }

    public void a() {
        synchronized (this.b) {
            this.a.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.c = new ArrayList();
            this.d = null;
        }
    }

    private void a(BiConsumer biConsumer) {
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    List list = this.c;
                    if (list != null) {
                        list.add(biConsumer);
                    }
                } else {
                    this.a.onEngineWorkerWithEngineCore(new oba(this, 1, biConsumer));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BiConsumer biConsumer, EngineCore engineCore) {
        biConsumer.accept(engineCore, this.d);
    }

    public void a(EngineCore engineCore, MyTrackerActivityHandler myTrackerActivityHandler) {
        List list;
        while (true) {
            synchronized (this.b) {
                try {
                    List list2 = this.c;
                    if (list2 == null) {
                        Tracer.e("ActivityLifecycleListener: unexpected branch 1");
                        return;
                    } else if (list2.isEmpty()) {
                        this.c = null;
                        this.d = myTrackerActivityHandler;
                        return;
                    } else {
                        list = this.c;
                        this.c = new ArrayList();
                    }
                } finally {
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((BiConsumer) it.next()).accept(engineCore, myTrackerActivityHandler);
                } catch (Throwable th) {
                    Tracer.d("ActivityLifecycleListener: unexpected error 2: " + th, th);
                }
            }
        }
    }
}
