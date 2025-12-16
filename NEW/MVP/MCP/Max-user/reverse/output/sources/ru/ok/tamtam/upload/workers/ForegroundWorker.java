package ru.ok.tamtam.upload.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.e44;
import defpackage.hda;
import defpackage.te6;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 #2\u00020\u0001:\u0002\r$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0084@¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0014\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00188\u0014X\u0094D¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lqe6;", "getForegroundInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqqg;", "updateForeground", "Lue6;", "newProgress", "", "needToShowNotification-P3Ng7BI", "(I)Z", "needToShowNotification", "Lla8;", "doWork", "Lhda;", "needUpdateWorkerProgressNotifUseCase", "Lhda;", "", "startTime", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isGetForegroundInfoCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oldProgress", "I", "workDelay", "getWorkDelay", "()J", "Companion", "te6", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ForegroundWorker extends SdkCoroutineWorker {
    private static final te6 Companion = new te6();

    @Deprecated
    public static final long WORK_DELAY = 1000;
    private AtomicBoolean isGetForegroundInfoCalled;
    private final hda needUpdateWorkerProgressNotifUseCase;
    private int oldProgress;
    private long startTime;
    private final long workDelay;

    public ForegroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.needUpdateWorkerProgressNotifUseCase = new hda(new bwf(new e44(20, this)));
        this.isGetForegroundInfoCalled = new AtomicBoolean(false);
        this.oldProgress = 0;
        this.workDelay = 1000L;
    }

    public abstract Object createForegroundInfo(Continuation continuation);

    public abstract Object doForegroundWork(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super defpackage.la8> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ve6
            if (r0 == 0) goto L13
            r0 = r7
            ve6 r0 = (defpackage.ve6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ve6 r0 = new ve6
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 35
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            ru.ok.tamtam.upload.workers.ForegroundWorker r0 = r0.d
            defpackage.g8j.b(r7)
            goto L5f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.g8j.b(r7)
            long r4 = java.lang.System.currentTimeMillis()
            r6.startTime = r4
            gzf r7 = r6.getTamComponent()
            y4e r7 = (defpackage.y4e) r7
            w5 r7 = r7.getAccessor()
            java.lang.Object r7 = r7.c(r2)
            lv4 r7 = (defpackage.lv4) r7
            java.lang.String r1 = r6.getName()
            r7.f(r1)
            r0.d = r6
            r0.Y = r3
            java.lang.Object r7 = r6.doForegroundWork(r0)
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L5e
            return r0
        L5e:
            r0 = r6
        L5f:
            la8 r7 = (defpackage.la8) r7
            gzf r1 = r0.getTamComponent()
            y4e r1 = (defpackage.y4e) r1
            w5 r1 = r1.getAccessor()
            java.lang.Object r1 = r1.c(r2)
            lv4 r1 = (defpackage.lv4) r1
            java.lang.String r0 = r0.getName()
            r1.g(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getForegroundInfo(kotlin.coroutines.Continuation<? super defpackage.qe6> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.we6
            if (r0 == 0) goto L13
            r0 = r5
            we6 r0 = (defpackage.we6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            we6 r0 = new we6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            ru.ok.tamtam.upload.workers.ForegroundWorker r0 = r0.d
            defpackage.g8j.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.isGetForegroundInfoCalled
            r5.set(r2)
            r0.d = r4
            r0.Y = r2
            java.lang.Object r5 = r4.createForegroundInfo(r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L44
            return r0
        L44:
            r0 = r4
        L45:
            qe6 r5 = (defpackage.qe6) r5
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "foreground info = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            defpackage.wqi.c(r0, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.getForegroundInfo(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract String getName();

    public long getWorkDelay() {
        return this.workDelay;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: needToShowNotification-P3Ng7BI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m162needToShowNotificationP3Ng7BI(int r11) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.isGetForegroundInfoCalled
            boolean r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L14
            java.lang.String r0 = r10.getName()
            java.lang.String r2 = "needToShowNotification: first foreground show"
            defpackage.wqi.d(r0, r2)
            goto Lda
        L14:
            r0 = -1
            r2 = 0
            if (r11 != r0) goto L24
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "needToShowNotification: ignore indeterminate (already shown)"
            defpackage.wqi.d(r0, r1)
        L21:
            r1 = r2
            goto Lda
        L24:
            if (r1 > r11) goto Lcf
            r0 = 101(0x65, float:1.42E-43)
            if (r11 >= r0) goto Lcf
            hda r0 = r10.needUpdateWorkerProgressNotifUseCase
            int r3 = r10.oldProgress
            long r4 = r10.startTime
            r0.getClass()
            if (r11 != 0) goto L37
        L35:
            r1 = r2
            goto L83
        L37:
            if (r3 != 0) goto L3a
            goto L83
        L3a:
            if (r11 > r3) goto L3d
            goto L35
        L3d:
            int r3 = r11 - r3
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            bwf r4 = r0.a
            java.lang.Object r4 = r4.getValue()
            age r4 = (defpackage.age) r4
            l5c r4 = (defpackage.l5c) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f168workerprogresstimedifffornotifyms
            r8 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4.m(r5, r8)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = r1
            goto L60
        L5f:
            r4 = r2
        L60:
            float r3 = (float) r3
            bwf r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            age r0 = (defpackage.age) r0
            l5c r0 = (defpackage.l5c) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f121progressdifffornotify
            java.lang.String r5 = r5.name()
            n18 r0 = r0.g
            r6 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0.getFloat(r5, r6)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L81
            goto L83
        L81:
            if (r4 == 0) goto L35
        L83:
            java.lang.String r0 = r10.getName()
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L8c
            goto Lda
        L8c:
            lg8 r3 = defpackage.lg8.d
            boolean r4 = r2.b(r3)
            if (r4 == 0) goto Lda
            int r4 = access$getOldProgress$p(r10)
            java.lang.String r4 = defpackage.ue6.a(r4)
            java.lang.String r5 = defpackage.ue6.a(r11)
            long r6 = access$getStartTime$p(r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "needToShowNotification: "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = ", oldProgress="
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = ", newProgress="
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = ", startTime="
            r8.append(r4)
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            r5 = 0
            r2.c(r3, r0, r4, r5)
            goto Lda
        Lcf:
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "needToShowNotification: none progress, skip"
            defpackage.wqi.d(r0, r1)
            goto L21
        Lda:
            r10.oldProgress = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.m162needToShowNotificationP3Ng7BI(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r1.setForeground((defpackage.qe6) r6, r0) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateForeground(kotlin.coroutines.Continuation<? super defpackage.qqg> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xe6
            if (r0 == 0) goto L13
            r0 = r6
            xe6 r0 = (defpackage.xe6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            xe6 r0 = new xe6
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ru.ok.tamtam.upload.workers.ForegroundWorker r1 = r0.d
            defpackage.g8j.b(r6)
            goto L47
        L38:
            defpackage.g8j.b(r6)
            r0.d = r5
            r0.Y = r3
            java.lang.Object r6 = r5.getForegroundInfo(r0)
            if (r6 != r4) goto L46
            goto L54
        L46:
            r1 = r5
        L47:
            qe6 r6 = (defpackage.qe6) r6
            r3 = 0
            r0.d = r3
            r0.Y = r2
            java.lang.Object r6 = r1.setForeground(r6, r0)
            if (r6 != r4) goto L55
        L54:
            return r4
        L55:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.updateForeground(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
