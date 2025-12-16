package defpackage;

import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class c5i extends z4i {
    public static c5i k;
    public static c5i l;
    public static final Object m;
    public final Context a;
    public final qo3 b;
    public final WorkDatabase c;
    public final u5i d;
    public final List e;
    public final jac f;
    public final qc7 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final ywf j;

    static {
        cei.m("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public c5i(Context context, qo3 qo3Var, u5i u5iVar) throws Resources.NotFoundException {
        krd krdVar;
        boolean z = context.getResources().getBoolean(hvc.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        uee ueeVar = (uee) u5iVar.a;
        if (z) {
            krdVar = new krd(applicationContext, WorkDatabase.class, null);
            krdVar.j = true;
        } else {
            if (vmf.F("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            krd krdVar2 = new krd(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            krdVar2.i = new iq(applicationContext);
            krdVar = krdVar2;
        }
        krdVar.g = ueeVar;
        krdVar.d.add(ja3.b);
        krdVar.a(sz9.g);
        krdVar.a(new rnd(2, 3, applicationContext));
        krdVar.a(sz9.h);
        krdVar.a(sz9.i);
        krdVar.a(new rnd(5, 6, applicationContext));
        krdVar.a(sz9.j);
        krdVar.a(sz9.k);
        krdVar.a(sz9.l);
        krdVar.a(new rnd(applicationContext));
        krdVar.a(new rnd(10, 11, applicationContext));
        krdVar.a(sz9.d);
        krdVar.a(sz9.e);
        krdVar.a(sz9.f);
        krdVar.l = false;
        krdVar.m = true;
        WorkDatabase workDatabase = (WorkDatabase) krdVar.b();
        Context applicationContext2 = context.getApplicationContext();
        yg8 yg8Var = new yg8(qo3Var.f);
        synchronized (cei.a) {
            cei.b = yg8Var;
        }
        jm0 jm0Var = new jm0(applicationContext2.getApplicationContext(), u5iVar, 0);
        jm0 jm0Var2 = new jm0(applicationContext2.getApplicationContext(), u5iVar, 1);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        String str = iea.a;
        hea heaVar = new hea(applicationContext3, u5iVar);
        jm0 jm0Var3 = new jm0(applicationContext2.getApplicationContext(), u5iVar, 2);
        ywf ywfVar = new ywf();
        ywfVar.a = jm0Var;
        ywfVar.b = jm0Var2;
        ywfVar.c = heaVar;
        ywfVar.d = jm0Var3;
        this.j = ywfVar;
        String str2 = v0e.a;
        axf axfVar = new axf(applicationContext2, this);
        klb.a(applicationContext2, SystemJobService.class, true);
        cei.g().c(v0e.a, "Created SystemJobScheduler and enabled SystemJobService");
        List listAsList = Arrays.asList(axfVar, new ux6(applicationContext2, qo3Var, ywfVar, this));
        jac jacVar = new jac(context, qo3Var, u5iVar, workDatabase, listAsList);
        Context applicationContext4 = context.getApplicationContext();
        this.a = applicationContext4;
        this.b = qo3Var;
        this.d = u5iVar;
        this.c = workDatabase;
        this.e = listAsList;
        this.f = jacVar;
        this.g = new qc7(workDatabase);
        this.h = false;
        if (b5i.a(applicationContext4)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.c(new ne6(applicationContext4, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c5i d(Context context) {
        c5i c5iVarD;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    c5iVarD = k;
                    if (c5iVarD == null) {
                        c5iVarD = l;
                    }
                }
                return c5iVarD;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (c5iVarD == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof oo3)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            e(applicationContext, ((oo3) applicationContext).a());
            c5iVarD = d(applicationContext);
        }
        return c5iVarD;
    }

    public static void e(Context context, qo3 qo3Var) {
        synchronized (m) {
            try {
                c5i c5iVar = k;
                if (c5iVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c5iVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        ExecutorService executorService = qo3Var.b;
                        u5i u5iVar = new u5i();
                        u5iVar.b = new Handler(Looper.getMainLooper());
                        u5iVar.c = new i30(u5iVar);
                        u5iVar.a = new uee(executorService, 0);
                        l = new c5i(applicationContext, qo3Var, u5iVar);
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.z4i
    public final vib b(String str, int i, nrb nrbVar) {
        if (i != 3) {
            return new p4i(this, str, i == 2 ? uk5.b : uk5.a, Collections.singletonList(nrbVar), 0).c();
        }
        wib wibVar = new wib(0);
        ((uee) this.d.a).execute(new ev1((Object) this, str, (Object) wibVar, (Object) new d6i(nrbVar, this, str, wibVar), (Object) nrbVar, 7));
        return wibVar;
    }

    public final PendingIntent c(UUID uuid) {
        String string = uuid.toString();
        String str = pwf.t0;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + string));
        intent.putExtra("KEY_WORKSPEC_ID", string);
        return PendingIntent.getService(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayListD;
        String str = axf.o;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListD = axf.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                axf.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.c;
        s5i s5iVarX = workDatabase.x();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s5iVarX.a;
        workDatabase_Impl.b();
        olh olhVar = (olh) s5iVarX.l;
        vk6 vk6VarA = olhVar.a();
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
            v0e.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
            throw th;
        }
    }

    public final void h(acf acfVar, hc8 hc8Var) {
        nt3 nt3Var = new nt3(7);
        nt3Var.b = this;
        nt3Var.c = acfVar;
        nt3Var.d = hc8Var;
        this.d.c(nt3Var);
    }
}
