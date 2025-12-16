package com.my.tracker;

import android.app.Application;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.MyTrackerInternal;
import com.my.tracker.core.TimeCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.TrackerConfig;
import com.my.tracker.core.b;
import com.my.tracker.core.o.a0;
import com.my.tracker.core.o.b0;
import com.my.tracker.core.o.c0;
import com.my.tracker.core.o.d0;
import com.my.tracker.core.o.e0;
import com.my.tracker.core.o.g;
import com.my.tracker.core.o.h;
import com.my.tracker.core.o.q;
import com.my.tracker.core.o.s0;
import com.my.tracker.core.o.u0;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimeUtils;
import defpackage.lba;
import defpackage.mba;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class MyTracker {
    private static final Object a = new Object();
    static final AtomicInteger b = new AtomicInteger(0);
    static final TrackerConfig c;
    static final MyTrackerConfig d;
    static volatile EngineMiniCore e;
    static volatile b f;
    private static a0 g;
    private static com.my.tracker.core.o.a h;

    @FunctionalInterface
    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    public class a implements TimeCore {
        @Override // com.my.tracker.core.TimeCore
        public long currentTimeSec() {
            return TimeUtils.currentTimeSec();
        }
    }

    static {
        TrackerConfig trackerConfigNewConfig = TrackerConfig.newConfig();
        c = trackerConfigNewConfig;
        d = MyTrackerConfig.a(trackerConfigNewConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Semaphore semaphore, Application application, TrackerConfig trackerConfig, com.my.tracker.core.a aVar, h hVar, a0 a0Var, q qVar, com.my.tracker.core.o.a aVar2) {
        h hVar2;
        Throwable th;
        c0 c0VarA;
        d0 d0VarA;
        SQLiteDatabase sQLiteDatabase;
        try {
            semaphore.acquire();
            s0.a(application);
            c0VarA = c0.a(e0.a(application));
            b0 b0VarA = b0.a(trackerConfig.getId(), application);
            if (b0VarA != null) {
                try {
                    SQLiteDatabase sQLiteDatabaseH = b0VarA.h();
                    d0VarA = d0.a(b0VarA);
                    sQLiteDatabase = sQLiteDatabaseH;
                } catch (Throwable th2) {
                    th = th2;
                    hVar2 = hVar;
                    Tracer.e("Unexpected exception: " + th, th);
                    aVar2.a();
                    hVar2.b();
                    b.set(3);
                    Tracer.e("MyTracker init failed, version: " + getVersion());
                    return;
                }
            } else {
                d0VarA = null;
                sQLiteDatabase = null;
            }
            try {
            } catch (Throwable th3) {
                th = th3;
                th = th;
                Tracer.e("Unexpected exception: " + th, th);
                aVar2.a();
                hVar2.b();
                b.set(3);
                Tracer.e("MyTracker init failed, version: " + getVersion());
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            hVar2 = hVar;
        }
        if (sQLiteDatabase == null || d0VarA == null) {
            hVar2 = hVar;
            Tracer.e("MyTracker error: repository is null");
            aVar2.a();
            hVar2.b();
            b.set(3);
            Tracer.e("MyTracker init failed, version: " + getVersion());
            return;
        }
        b bVarA = b.a(aVar, hVar, d0VarA, c0VarA, sQLiteDatabase, a0Var, qVar);
        bVarA.b();
        MyTrackerInternal.a(bVarA, a0Var);
        f = bVarA;
        g = a0Var;
        h = aVar2;
        a0Var.a(bVarA, aVar2);
        hVar.a(bVarA);
        bVarA.c();
        b.set(2);
    }

    public static void flush() {
        EngineMiniCore engineMiniCore = e;
        if (engineMiniCore == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            engineMiniCore.onEngineWorkerWithEngineCore(new lba(0));
        }
    }

    public static String getInstanceId(Application application) {
        return u0.a(application);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return d;
    }

    public static MyTrackerParams getTrackerParams() {
        return c.getMyTrackerParams();
    }

    public static String getVersion() {
        return "4.0.0";
    }

    public static String handleDeeplink(Intent intent) {
        int i = b.get();
        if (i != 2) {
            Tracer.e("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first. InitState=" + i);
            return null;
        }
        b bVar = f;
        if (bVar != null) {
            return bVar.a(intent);
        }
        Tracer.e("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first. engine is null");
        return null;
    }

    public static void initTracker(String str, Application application) {
        synchronized (a) {
            try {
                if (TextUtils.isEmpty(str)) {
                    Tracer.e("MyTracker initialization failed: id can't be empty");
                    return;
                }
                if (!b.compareAndSet(0, 1)) {
                    Tracer.i("MyTracker has already been initialized");
                    return;
                }
                TrackerConfig trackerConfig = c;
                trackerConfig.a(str);
                Tracer.i("MyTracker is initialized with id: " + trackerConfig.getId());
                g.a(trackerConfig.getBackgroundExecutors());
                h hVarA = h.a();
                a aVar = new a();
                q qVarA = q.a();
                com.my.tracker.core.a aVarA = com.my.tracker.core.a.a(application, trackerConfig, hVarA, aVar, qVarA);
                aVarA.a();
                com.my.tracker.core.o.a aVarA2 = com.my.tracker.core.o.a.a(aVarA);
                aVarA2.b();
                a0 a0VarA = a0.a(trackerConfig, g.a);
                a();
                Semaphore semaphore = new Semaphore(0, false);
                g.b(new mba(semaphore, application, trackerConfig, aVarA, hVarA, a0VarA, qVarA, aVarA2));
                MyTrackerInternal.a(aVarA);
                e = aVarA;
                semaphore.release();
                Tracer.i("MyTracker init OK, version: " + getVersion());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isDebugMode() {
        return Tracer.isEnabled();
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z) {
        Tracer.setEnabled(z);
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        c.setAttributionListener(attributionListener, handler);
    }

    public static void trackEvent(final String str, Map<String, String> map) {
        EngineMiniCore engineMiniCore = e;
        if (engineMiniCore == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
            return;
        }
        final long jCurrentTimeSec = engineMiniCore.getTimeCore().currentTimeSec();
        final Map<String, String> mapCopyParams = TrackerUtils.copyParams(map);
        engineMiniCore.onEngineWorkerWithEngineCore(new Consumer() { // from class: nba
            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                MyTracker.a(str, jCurrentTimeSec, mapCopyParams, (EngineCore) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, long j, Map map, EngineCore engineCore) {
        b bVar = f;
        if (bVar == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            bVar.a(str, j, map);
        }
    }

    public static void a() {
        ClassLoader classLoader = c.getClass().getClassLoader();
        a("com.my.tracker.applifecycle.MyTrackerAppLifecycle", classLoader);
        a("com.my.tracker.ads.MyTrackerAds", classLoader);
        a("com.my.tracker.antifraud.MyTrackerAntifraud", classLoader);
        a("com.my.tracker.environment.MyTrackerEnvironment", classLoader);
        a("com.my.tracker.game.MyTrackerGame", classLoader);
        a("com.my.tracker.miniapps.MyTrackerMiniApps", classLoader);
        a("com.my.tracker.purchase.MyTrackerPurchase", classLoader);
        a("com.my.tracker.remoteconfig.MyTrackerRemoteConfig", classLoader);
        a("com.my.tracker.timespent.MyTrackerTimespent", classLoader);
        a("com.my.tracker.userlifecycle.MyTrackerUserLifecycle", classLoader);
    }

    private static void a(String str, ClassLoader classLoader) {
        try {
            Class.forName(str, true, classLoader);
        } catch (Throwable unused) {
        }
    }
}
