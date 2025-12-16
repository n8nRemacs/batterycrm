package ru.ok.tamtam.android.notifications.messages.tracker;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.pb3;
import defpackage.q2b;
import defpackage.qpa;
import defpackage.y4e;
import defpackage.z74;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ok/tamtam/android/notifications/messages/tracker/NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqpa;", "notificationsTracker", "Lpb3;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqpa;Lpb3;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker extends SdkCoroutineWorker {
    public final qpa a;
    public final pb3 b;
    public final z74 c;

    public NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(Context context, WorkerParameters workerParameters, qpa qpaVar, pb3 pb3Var) {
        super(context, workerParameters);
        this.a = qpaVar;
        this.b = pb3Var;
        this.c = ((q2b) ((y4e) getTamComponent()).j()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.pna
            if (r0 == 0) goto L13
            r0 = r8
            pna r0 = (defpackage.pna) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            pna r0 = new pna
            q44 r8 = (defpackage.q44) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.g8j.b(r8)
            goto L63
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.g8j.b(r8)
            pb3 r8 = r7.b
            w4e r8 = (defpackage.w4e) r8
            long r3 = r8.j()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            r5 = 7
            long r5 = r8.toMillis(r5)
            long r3 = r3 - r5
            r0.X = r2
            qpa r8 = r7.a
            lzf r1 = r8.a
            q2b r1 = (defpackage.q2b) r1
            z74 r1 = r1.b()
            opa r2 = new opa
            r5 = 0
            r2.<init>(r3, r8, r5)
            java.lang.Object r8 = defpackage.svi.i(r1, r2, r0)
            g84 r0 = defpackage.g84.a
            if (r8 != r0) goto L5e
            goto L60
        L5e:
            qqg r8 = defpackage.qqg.a
        L60:
            if (r8 != r0) goto L63
            return r0
        L63:
            ka8 r8 = defpackage.la8.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* renamed from: getCoroutineContext, reason: from getter */
    public final z74 getC() {
        return this.c;
    }
}
