package ru.ok.messages;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a3g;
import defpackage.aef;
import defpackage.alf;
import defpackage.b27;
import defpackage.c6i;
import defpackage.c7c;
import defpackage.dd;
import defpackage.ei4;
import defpackage.en8;
import defpackage.fg8;
import defpackage.fxa;
import defpackage.ho7;
import defpackage.hwa;
import defpackage.jq;
import defpackage.k18;
import defpackage.k6g;
import defpackage.la8;
import defpackage.lla;
import defpackage.lr3;
import defpackage.lv4;
import defpackage.m0g;
import defpackage.ma8;
import defpackage.msb;
import defpackage.mvd;
import defpackage.nla;
import defpackage.o00;
import defpackage.p35;
import defpackage.p3b;
import defpackage.pb2;
import defpackage.pe8;
import defpackage.q35;
import defpackage.q7b;
import defpackage.qpa;
import defpackage.r1g;
import defpackage.she;
import defpackage.ul8;
import defpackage.ur3;
import defpackage.ve2;
import defpackage.w4e;
import defpackage.wqi;
import defpackage.x2g;
import defpackage.x7b;
import defpackage.yi5;
import defpackage.z5i;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import ru.ok.messages.TimeChangeReceiver;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final class a extends z5i {
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final k18 m;
    public final k18 n;
    public final k18 o;
    public final k18 p;
    public final k18 q;
    public final k18 r;
    public final k18 s;

    public a(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12, k18 k18Var13, k18 k18Var14, k18 k18Var15, k18 k18Var16, k18 k18Var17, k18 k18Var18) {
        this.b = k18Var16;
        this.c = k18Var17;
        this.d = k18Var18;
        this.e = k18Var;
        this.f = k18Var2;
        this.g = k18Var3;
        this.h = k18Var4;
        this.i = k18Var5;
        this.j = k18Var6;
        this.k = k18Var7;
        this.l = k18Var8;
        this.m = k18Var9;
        this.n = k18Var10;
        this.o = k18Var11;
        this.p = k18Var12;
        this.q = k18Var13;
        this.r = k18Var14;
        this.s = k18Var15;
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, k18] */
    @Override // defpackage.z5i
    public final ma8 a(final Context context, String str, final WorkerParameters workerParameters) {
        boolean zEquals = str.equals(DailyAnalyticsWorker.class.getName());
        k18 k18Var = this.f;
        if (zEquals) {
            return new DailyAnalyticsWorker(context, workerParameters, (dd) this.e.getValue(), (jq) k18Var.getValue(), (ur3) this.g.getValue(), (lv4) this.h.getValue(), (alf) this.i.getValue(), (msb) this.s.getValue(), this.b);
        }
        boolean zEquals2 = str.equals(TaskMonitor$TaskMonitorWorker.class.getName());
        k18 k18Var2 = this.j;
        if (zEquals2) {
            return new TaskMonitor$TaskMonitorWorker(context, workerParameters, (a3g) this.k.getValue(), (m0g) this.r.getValue(), (c6i) this.l.getValue(), ((z7c) k18Var2.getValue()).a);
        }
        if (str.equals(HeartbeatScheduler$TaskHeartbeatWorker.class.getName())) {
            final b27 b27Var = (b27) this.m.getValue();
            return new SdkCoroutineWorker(context, workerParameters, b27Var) { // from class: ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker
                public final b27 a;

                {
                    this.a = b27Var;
                }

                @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
                public final Object doWork(Continuation continuation) {
                    wqi.c("c27", "work %s started", getId());
                    b27 b27Var2 = this.a;
                    String str2 = b27Var2.a;
                    k18 k18Var3 = b27Var2.d;
                    k18 k18Var4 = b27Var2.c;
                    Log.d(str2, "onHeartbeat");
                    if (((fxa) b27Var2.b.getValue()).b()) {
                        ((lv4) k18Var4.getValue()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        pe8 pe8Var = ((z7c) k18Var3.getValue()).a;
                        if (Math.abs(jElapsedRealtime - ((Number) pe8Var.D.D(pe8Var, w4e.m0[21])).longValue()) > 2.88E7d) {
                            Log.d(str2, "time since last successful request less than needed, force connection");
                            ((z7c) k18Var3.getValue()).a.A(true);
                            ((x2g) b27Var2.e.getValue()).a();
                        }
                        if (!((lv4) k18Var4.getValue()).d() && ((lr3) b27Var2.f.getValue()).f()) {
                            ((hwa) b27Var2.g.getValue()).B(((lv4) k18Var4.getValue()).d());
                            she.v((c6i) b27Var2.h.getValue());
                        }
                    }
                    ((fg8) b27Var2.i.getValue()).f("heartbeat", false);
                    wqi.c("c27", "work %s finished", getId());
                    return la8.b();
                }
            };
        }
        if (str.equals(DbCleanUpScheduler$DbCleanUpWorker.class.getName())) {
            return new DbCleanUpScheduler$DbCleanUpWorker(context, workerParameters, (aef) this.c.getValue(), (yi5) this.d.getValue());
        }
        if (str.equals(TimeChangeReceiver.TaskTimeChangeWorker.class.getName())) {
            return new TimeChangeReceiver.TaskTimeChangeWorker(context, workerParameters, (c7c) this.n.getValue(), (ve2) this.o.getValue(), (en8) this.p.getValue(), (r1g) this.q.getValue());
        }
        if (str.equals(NotificationDraftScheduler$TaskNotificationDraftWorker.class.getName())) {
            final p35 p35Var = (p35) ((jq) k18Var.getValue()).n.getValue();
            return new Worker(context, workerParameters, p35Var) { // from class: ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker
                public final p35 b;

                {
                    this.b = p35Var;
                }

                @Override // androidx.work.Worker
                public final la8 a() {
                    String str2;
                    Intent intentJ;
                    wqi.c("ayi", "work " + getId() + " started", new Object[0]);
                    q35 q35Var = (q35) this.b;
                    z7c z7cVar = q35Var.b;
                    Context context2 = q35Var.a;
                    x7b x7bVar = q35Var.c;
                    wqi.c("q35", "notifyDrafts", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ve2 ve2Var = q35Var.e;
                    o00 o00Var = ve2.I;
                    ArrayList arrayListN = ve2Var.N(ve2.M, true, null);
                    Collections.sort(arrayListN, o00Var);
                    Iterator it = Collections.unmodifiableList(arrayListN).iterator();
                    while (it.hasNext()) {
                        p3b p3bVar = ((pb2) it.next()).b.c0;
                    }
                    if (arrayList.isEmpty()) {
                        wqi.c("q35", "notifyDrafts: no drafts", new Object[0]);
                    } else {
                        pe8 pe8Var = z7cVar.a;
                        pe8Var.u0.O(pe8Var, pe8.U0[7], Boolean.FALSE);
                        if (arrayList.size() > 1) {
                            wqi.c("q35", "notifyDrafts: multiple chats", new Object[0]);
                            str2 = String.format(context2.getString(mvd.N0), Integer.valueOf(arrayList.size()));
                            intentJ = x7bVar.f(false);
                        } else {
                            pb2 pb2Var = (pb2) arrayList.get(0);
                            if (!pb2Var.Q() || pb2Var.n() == null) {
                                wqi.c("q35", "notifyDrafts: chat", new Object[0]);
                                String string = context2.getString(mvd.L0);
                                String str3 = pb2Var.b.g;
                                int i = k6g.a;
                                str2 = String.format(string, (str3 == null || str3.length() == 0) ? "" : ho7.i("\"", str3, "\""));
                            } else {
                                wqi.c("q35", "notifyDrafts: dialog", new Object[0]);
                                str2 = String.format(context2.getString(mvd.M0), pb2Var.n().e());
                            }
                            long j = pb2Var.a;
                            x7bVar.getClass();
                            ul8.c.getClass();
                            intentJ = x7bVar.j(new ei4(":chats?id=" + j + "&type=local"));
                        }
                        Intent intent = intentJ;
                        q35Var.d.getClass();
                        z7cVar.c.getClass();
                        nla nlaVarH = x7bVar.h("ru.oneme.app.misc", false, false);
                        nlaVarH.d(str2);
                        lla llaVar = new lla(0);
                        llaVar.f = nla.c(str2);
                        nlaVarH.i(llaVar);
                        ((q7b) x7bVar.d.getValue()).getClass();
                        x7bVar.k(nlaVarH, intent, null, 2, "CHAT_NOTIF");
                    }
                    wqi.c("ayi", "work " + getId() + " finished", new Object[0]);
                    return la8.b();
                }
            };
        }
        if (str.equals(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class.getName())) {
            return new NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(context, workerParameters, (qpa) ((jq) k18Var.getValue()).h.getValue(), ((z7c) k18Var2.getValue()).a);
        }
        return null;
    }
}
