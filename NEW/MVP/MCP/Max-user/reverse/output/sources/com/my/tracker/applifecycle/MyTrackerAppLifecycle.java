package com.my.tracker.applifecycle;

import android.app.Activity;
import com.my.tracker.applifecycle.o.a;
import com.my.tracker.applifecycle.o.b;
import com.my.tracker.applifecycle.o.c;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.MyTrackerInternal;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.TimePoint;
import defpackage.lba;
import defpackage.oba;
import defpackage.pba;

/* loaded from: classes.dex */
public final class MyTrackerAppLifecycle {
    private static EngineMiniCore a;
    private static d b;

    static {
        MyTrackerInternal.registerInit("applifecycle", new lba(1), new pba());
    }

    public static void a(EngineMiniCore engineMiniCore) {
        a = engineMiniCore;
    }

    public static void trackLaunchManually(Activity activity) {
        EngineMiniCore engineMiniCore = a;
        if (engineMiniCore == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            engineMiniCore.onEngineWorkerWithEngineCore(new oba(activity, 0, TimePoint.now()));
        }
    }

    public static void a(EngineCore engineCore, MyTrackerActivityHandler myTrackerActivityHandler) {
        d dVarA = d.a(myTrackerActivityHandler);
        b = dVarA;
        dVarA.a();
        c.a(engineCore, b);
        a.a(engineCore, b);
        b.a(engineCore, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Activity activity, TimePoint timePoint, EngineCore engineCore) {
        d dVar = b;
        if (dVar == null) {
            Tracer.e(MyTrackerInternal.INIT_ERROR);
        } else {
            dVar.a(engineCore, activity, timePoint);
        }
    }
}
