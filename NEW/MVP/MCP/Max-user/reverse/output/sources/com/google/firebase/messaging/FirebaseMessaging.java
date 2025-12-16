package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.bof;
import defpackage.dl6;
import defpackage.ed;
import defpackage.ex4;
import defpackage.f9h;
import defpackage.fud;
import defpackage.h06;
import defpackage.jdg;
import defpackage.jt5;
import defpackage.l06;
import defpackage.lz9;
import defpackage.m6j;
import defpackage.n4e;
import defpackage.n5e;
import defpackage.nl;
import defpackage.o06;
import defpackage.pc4;
import defpackage.qwi;
import defpackage.rpc;
import defpackage.s5j;
import defpackage.ssb;
import defpackage.tl3;
import defpackage.uaj;
import defpackage.us;
import defpackage.uvf;
import defpackage.v1a;
import defpackage.ybj;
import defpackage.z6j;
import defpackage.z9a;
import defpackage.zkf;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static n4e k;
    public static ScheduledThreadPoolExecutor m;
    public final h06 a;
    public final Context b;
    public final lz9 c;
    public final ssb d;
    public final dl6 e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final f9h h;
    public boolean i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static rpc l = new tl3(5);

    public FirebaseMessaging(h06 h06Var, rpc rpcVar, rpc rpcVar2, l06 l06Var, rpc rpcVar3, bof bofVar) {
        h06Var.a();
        Context context = h06Var.a;
        final f9h f9hVar = new f9h(context);
        h06Var.a();
        fud fudVar = new fud(h06Var.a);
        final lz9 lz9Var = new lz9();
        lz9Var.a = h06Var;
        lz9Var.b = f9hVar;
        lz9Var.c = fudVar;
        lz9Var.d = rpcVar;
        lz9Var.o = rpcVar2;
        lz9Var.X = l06Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new pc4("Firebase-Messaging-Task", 2));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new pc4("Firebase-Messaging-Init", 2));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pc4("Firebase-Messaging-File-Io", 2));
        final int i2 = 0;
        this.i = false;
        l = rpcVar3;
        this.a = h06Var;
        dl6 dl6Var = new dl6();
        dl6Var.d = this;
        dl6Var.b = bofVar;
        this.e = dl6Var;
        h06Var.a();
        final Context context2 = h06Var.a;
        this.b = context2;
        jt5 jt5Var = new jt5();
        this.h = f9hVar;
        this.c = lz9Var;
        this.d = new ssb(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        h06Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jt5Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: n06
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.i() && firebaseMessaging.j(firebaseMessaging.f())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.i(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context3 = firebaseMessaging2.b;
                        z6j.b(context3);
                        a7j.c(context3, firebaseMessaging2.c, firebaseMessaging2.h());
                        if (firebaseMessaging2.h()) {
                            firebaseMessaging2.g();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new pc4("Firebase-Messaging-Topics-Io", 2));
        int i3 = jdg.j;
        n5e.d(new Callable() { // from class: idg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hdg hdgVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                f9h f9hVar2 = f9hVar;
                lz9 lz9Var2 = lz9Var;
                synchronized (hdg.class) {
                    try {
                        WeakReference weakReference = hdg.c;
                        hdgVar = weakReference != null ? (hdg) weakReference.get() : null;
                        if (hdgVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            hdg hdgVar2 = new hdg(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (hdgVar2) {
                                hdgVar2.a = fs4.b(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            hdg.c = new WeakReference(hdgVar2);
                            hdgVar = hdgVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new jdg(firebaseMessaging, f9hVar2, hdgVar, lz9Var2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).d(scheduledThreadPoolExecutor, new o06(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: n06
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.i() && firebaseMessaging.j(firebaseMessaging.f())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.i(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context3 = firebaseMessaging2.b;
                        z6j.b(context3);
                        a7j.c(context3, firebaseMessaging2.c, firebaseMessaging2.h());
                        if (firebaseMessaging2.h()) {
                            firebaseMessaging2.g();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new pc4("TAG", 2));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(h06.b());
    }

    public static synchronized n4e d(Context context) {
        try {
            if (k == null) {
                k = new n4e(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(h06 h06Var) {
        FirebaseMessaging firebaseMessaging;
        h06Var.a();
        firebaseMessaging = (FirebaseMessaging) h06Var.d.a(FirebaseMessaging.class);
        s5j.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskL;
        zkf zkfVarF = f();
        if (!j(zkfVarF)) {
            return zkfVarF.a;
        }
        String strB = f9h.b(this.a);
        ssb ssbVar = this.d;
        synchronized (ssbVar) {
            taskL = (Task) ((us) ssbVar.c).get(strB);
            if (taskL == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                lz9 lz9Var = this.c;
                taskL = lz9Var.f(lz9Var.j(f9h.b((h06) lz9Var.a), "*", new Bundle())).m(this.g, new nl(this, strB, zkfVarF)).l((Executor) ssbVar.b, new z9a(ssbVar, 15, strB));
                ((us) ssbVar.c).put(strB, taskL);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) n5e.a(taskL);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final String e() {
        h06 h06Var = this.a;
        h06Var.a();
        return "[DEFAULT]".equals(h06Var.b) ? "" : h06Var.c();
    }

    public final zkf f() {
        zkf zkfVarB;
        n4e n4eVarD = d(this.b);
        String strE = e();
        String strB = f9h.b(this.a);
        synchronized (n4eVarD) {
            zkfVarB = zkf.b(((SharedPreferences) n4eVarD.a).getString(n4e.c(strE, strB), null));
        }
        return zkfVarB;
    }

    public final void g() {
        ybj ybjVarE;
        int i;
        fud fudVar = (fud) this.c.c;
        if (fudVar.c.h() >= 241100000) {
            uaj uajVarE = uaj.e(fudVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (uajVarE) {
                i = uajVarE.b;
                uajVarE.b = i + 1;
            }
            ybjVarE = uajVarE.f(new m6j(i, 5, bundle, 1)).k(ex4.d, v1a.A0);
        } else {
            ybjVarE = n5e.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        ybjVarE.d(this.f, new o06(this, 1));
    }

    public final boolean h() {
        Context context = this.b;
        z6j.b(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                h06 h06Var = this.a;
                h06Var.a();
                if (h06Var.d.a(ed.class) != null) {
                    return true;
                }
                if (qwi.a() && l != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void i(long j2) {
        b(new uvf(this, Math.min(Math.max(30L, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean j(zkf zkfVar) {
        if (zkfVar != null) {
            return System.currentTimeMillis() > zkfVar.c + zkf.d || !this.h.a().equals(zkfVar.b);
        }
        return true;
    }
}
