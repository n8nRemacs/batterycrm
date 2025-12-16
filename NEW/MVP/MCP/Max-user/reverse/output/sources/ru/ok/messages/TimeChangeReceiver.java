package ru.ok.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.c7c;
import defpackage.eg0;
import defpackage.g5i;
import defpackage.la8;
import defpackage.mf4;
import defpackage.ml6;
import defpackage.n73;
import defpackage.ngb;
import defpackage.ogb;
import defpackage.pb2;
import defpackage.r1g;
import defpackage.t1b;
import defpackage.tw0;
import defpackage.uk5;
import defpackage.uu;
import defpackage.ve2;
import defpackage.wqi;
import defpackage.zm;
import java.util.Collections;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "TaskTimeChangeWorker", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeChangeReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/TimeChangeReceiver$TaskTimeChangeWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lc7c;", "preProcessDataCache", "Lve2;", "chatController", "Ltw0;", "uiBus", "Lr1g;", "themeController", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lc7c;Lve2;Ltw0;Lr1g;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TaskTimeChangeWorker extends Worker {
        public final c7c b;
        public final ve2 c;
        public final tw0 d;
        public final r1g o;

        public TaskTimeChangeWorker(Context context, WorkerParameters workerParameters, c7c c7cVar, ve2 ve2Var, tw0 tw0Var, r1g r1gVar) {
            super(context, workerParameters);
            this.b = c7cVar;
            this.c = ve2Var;
            this.d = tw0Var;
            this.o = r1gVar;
        }

        @Override // androidx.work.Worker
        public final la8 a() {
            int i = TimeChangeReceiver.a;
            wqi.c("ru.ok.messages.TimeChangeReceiver", "work %s started", getId());
            synchronized (ml6.c) {
                ml6.b = null;
            }
            synchronized (ml6.e) {
                ml6.d = null;
            }
            synchronized (ml6.g) {
                ml6.f = null;
            }
            synchronized (ml6.i) {
                ml6.h = null;
            }
            synchronized (ml6.k) {
                ml6.j = null;
            }
            synchronized (ml6.m) {
                ml6.l = null;
            }
            synchronized (ml6.n) {
            }
            synchronized (ml6.o) {
            }
            synchronized (ml6.u) {
                ml6.t = null;
            }
            synchronized (ml6.s) {
                ml6.r = null;
            }
            this.b.a();
            ve2 ve2Var = this.c;
            if (ve2Var.k) {
                Iterator it = ve2Var.h.values().iterator();
                while (it.hasNext()) {
                    ((pb2) it.next()).y0 = null;
                }
                ve2Var.n.c(new n73(Collections.EMPTY_LIST, true));
            }
            this.d.c(new uu(10));
            this.o.e();
            new TimeChangeReceiver();
            TimeChangeReceiver.a(getApplicationContext());
            wqi.c("ru.ok.messages.TimeChangeReceiver", "work %s finished", getId());
            return la8.b();
        }
    }

    public static void a(Context context) {
        g5i g5iVar = (g5i) ((t1b) zm.a()).getAccessor().c(169);
        ngb ngbVar = new ngb(TaskTimeChangeWorker.class);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ngb ngbVar2 = (ngb) ngbVar.setBackoffCriteria(eg0.a, WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        mf4 mf4VarN = mf4.n(TimeZone.getDefault());
        long j = new mf4(mf4VarN.a, mf4VarN.b, mf4VarN.c, null, null, null, null).p(1).j(TimeZone.getDefault()) - mf4.n(TimeZone.getDefault()).j(TimeZone.getDefault());
        if (j > 0) {
            ngbVar2.setInitialDelay(j, timeUnit);
        }
        ogb ogbVar = (ogb) ((ngb) ngbVar2.addTag("TIME_CHANGE")).build();
        wqi.c("ru.ok.messages.TimeChangeReceiver", "work " + ogbVar.getId() + " try to add TIME_CHANGE request. Schedule on next date", new Object[0]);
        g5iVar.b("TIME_CHANGE", uk5.c, ogbVar).c();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g5i g5iVar = (g5i) ((t1b) zm.a()).getAccessor().c(169);
        ogb ogbVar = (ogb) ((ngb) ((ngb) new ngb(TaskTimeChangeWorker.class).setBackoffCriteria(eg0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TIME_CHANGE")).build();
        wqi.c("ru.ok.messages.TimeChangeReceiver", "work " + ogbVar.getId() + " try to add TIME_CHANGE request. Schedule now", new Object[0]);
        g5iVar.b("TIME_CHANGE", uk5.a, ogbVar).c();
    }
}
