package ru.ok.messages.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.ffb;
import defpackage.fge;
import defpackage.ivd;
import defpackage.mvd;
import defpackage.n1c;
import defpackage.nla;
import defpackage.qe6;
import defpackage.tla;
import defpackage.v4j;
import defpackage.w1c;
import defpackage.x7b;
import defpackage.xa5;
import defpackage.zka;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/services/PipWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PipWorker extends SdkCoroutineWorker {
    public final bwf a;

    public PipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = new bwf(new ffb(14, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.a2c
            if (r0 == 0) goto L13
            r0 = r7
            a2c r0 = (defpackage.a2c) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            a2c r0 = new a2c
            q44 r7 = (defpackage.q44) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            java.lang.String r2 = "PIP_WORKER"
            if (r1 == 0) goto L68
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L5b
            r5 = 3
            if (r1 == r3) goto L3c
            if (r1 != r5) goto L34
            ru.ok.messages.services.PipWorker r0 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L81
        L31:
            r7 = move-exception
            goto La3
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            ru.ok.messages.services.PipWorker r1 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L58
            int r7 = defpackage.s65.d     // Catch: java.lang.Throwable -> L58
            y65 r7 = defpackage.y65.SECONDS     // Catch: java.lang.Throwable -> L58
            long r3 = defpackage.v9j.h(r4, r7)     // Catch: java.lang.Throwable -> L58
            r0.d = r1     // Catch: java.lang.Throwable -> L58
            r0.Y = r5     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.s8j.d(r3, r0)     // Catch: java.lang.Throwable -> L58
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L56
            return r0
        L56:
            r0 = r1
            goto L81
        L58:
            r7 = move-exception
            r0 = r1
            goto La3
        L5b:
            ru.ok.messages.services.PipWorker r1 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L58
            qe6 r7 = (defpackage.qe6) r7     // Catch: java.lang.Throwable -> L58
            r0.d = r1     // Catch: java.lang.Throwable -> L58
            r0.Y = r3     // Catch: java.lang.Throwable -> L58
            r7 = 0
            throw r7     // Catch: java.lang.Throwable -> L58
        L68:
            defpackage.g8j.b(r7)
            java.lang.String r7 = "doWork"
            defpackage.wqi.d(r2, r7)
            r6.getApplicationContext()
            qm3 r7 = defpackage.zm.a()
            t1b r7 = (defpackage.t1b) r7
            lv4 r7 = r7.e()
            r7.f(r2)
            r0 = r6
        L81:
            boolean r7 = r0.isStopped()     // Catch: java.lang.Throwable -> L31
            bwf r1 = r0.a
            if (r7 != 0) goto L9e
            java.lang.Object r7 = r1.getValue()     // Catch: java.lang.Throwable -> L31
            n1c r7 = (defpackage.n1c) r7     // Catch: java.lang.Throwable -> L31
            r7.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r1.getValue()     // Catch: java.lang.Throwable -> L31
            n1c r7 = (defpackage.n1c) r7     // Catch: java.lang.Throwable -> L31
            r7.getClass()     // Catch: java.lang.Throwable -> L31
            r0.stop()     // Catch: java.lang.Throwable -> L31
        L9e:
            ka8 r7 = defpackage.la8.b()     // Catch: java.lang.Throwable -> L31
            goto Lac
        La3:
            java.lang.String r1 = "failure!"
            defpackage.wqi.e(r2, r1, r7)
            ia8 r7 = defpackage.la8.a()
        Lac:
            java.lang.String r1 = "doWork finish %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r7}
            defpackage.wqi.c(r2, r1, r3)
            r0.getApplicationContext()
            qm3 r0 = defpackage.zm.a()
            t1b r0 = (defpackage.t1b) r0
            lv4 r0 = r0.e()
            r0.g(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.services.PipWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object getForegroundInfo(Continuation continuation) {
        w1c w1cVar = ((n1c) this.a.getValue()).a;
        w1cVar.b.c();
        x7b x7bVar = w1cVar.b;
        w1cVar.c.getClass();
        nla nlaVarH = x7bVar.h("ru.oneme.app.media", true, true);
        tla tlaVar = new tla();
        tlaVar.e = null;
        tlaVar.f = ((MediaSessionCompat) w1cVar.d.getValue()).getSessionToken();
        tlaVar.e = new int[]{0};
        xa5 xa5Var = w1cVar.e;
        xa5Var.getClass();
        Intent intent = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        Context context = xa5Var.a;
        PendingIntent.getBroadcast(context, 5, intent, v4j.d(intent, v4j.a(134217728)));
        Intent intent2 = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 5, intent2, v4j.d(intent2, v4j.a(134217728)));
        Notification notification = nlaVarH.F;
        notification.deleteIntent = broadcast;
        nlaVarH.f(2, false);
        nlaVarH.f(8, true);
        nlaVarH.d(w1cVar.a.getText(mvd.m2));
        notification.icon = ivd.Q0;
        Intent intent3 = new Intent().setAction("ru.ok.video.ACTION_VIDEO_PLAY").setPackage("ru.oneme.app");
        nlaVarH.b.add(new zka(ivd.w0, "", PendingIntent.getBroadcast(context, 5, intent3, v4j.d(intent3, v4j.a(134217728)))));
        nlaVarH.i(tlaVar);
        return new qe6(5, nlaVarH.a(), fge.b);
    }
}
