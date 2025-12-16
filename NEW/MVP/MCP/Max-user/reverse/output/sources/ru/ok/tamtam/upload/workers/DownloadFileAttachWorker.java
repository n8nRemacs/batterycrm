package ru.ok.tamtam.upload.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.ctf;
import defpackage.lzf;
import defpackage.n15;
import defpackage.p15;
import defpackage.q2b;
import defpackage.qqg;
import defpackage.wqi;
import defpackage.z74;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadFileAttachWorker extends ForegroundWorker {
    public CharSequence X;
    public String Y;
    public final bwf Z;
    public final bwf a;
    public final bwf b;
    public final bwf c;
    public final bwf d;
    public final bwf o;
    public final bwf s0;

    public DownloadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = new bwf(new p15(this, 0));
        this.b = new bwf(new p15(this, 9));
        this.c = new bwf(new p15(this, 10));
        this.d = new bwf(new p15(this, 11));
        this.o = new bwf(new p15(this, 12));
        this.X = "";
        this.Y = "";
        this.Z = new bwf(new p15(this, 13));
        this.s0 = new bwf(new p15(this, 14));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:11)(2:12|13))(7:14|(2:17|(1:19))|20|(1:22)|(1:24)|25|(5:39|40|55|41|(5:43|49|(1:52)|53|54)(2:46|47))(2:29|(1:31)(1:32)))|33|(3:35|(1:37)|38)(0)|40|55|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        r0 = new defpackage.ipd(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:41:0x00dd, B:43:0x00eb, B:46:0x00f2, B:47:0x00f9), top: B:55:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:41:0x00dd, B:43:0x00eb, B:46:0x00f2, B:47:0x00f9), top: B:55:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createForegroundInfo(kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.createForegroundInfo(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.s15
            if (r0 == 0) goto L13
            r0 = r5
            s15 r0 = (defpackage.s15) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            s15 r0 = new s15
            q44 r5 = (defpackage.q44) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.g8j.b(r5)
            goto L61
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            android.content.Context r5 = r4.getApplicationContext()
            bwf r1 = r4.d
            java.lang.Object r1 = r1.getValue()
            qw5 r1 = (defpackage.qw5) r1
            int r1 = r1.e
            java.lang.String r5 = r5.getString(r1)
            r4.Y = r5
            bwf r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            n15 r5 = (defpackage.n15) r5
            x6i r1 = new x6i
            r3 = 14
            r1.<init>(r3, r4)
            r0.X = r2
            r2 = 0
            java.lang.Object r5 = r5.k(r1, r2, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L61
            return r0
        L61:
            la8 r5 = (defpackage.la8) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* renamed from: getCoroutineContext */
    public final z74 getC() {
        return ((q2b) ((lzf) this.o.getValue())).d();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("taskName");
        return strE == null ? "workers:DownloadFileAttachWorker" : strE;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final long getWorkDelay() {
        return 500L;
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object onStopWork(Continuation continuation) {
        wqi.c("workers:DownloadFileAttachWorker", "File download. OnStopWork", new Object[0]);
        n15 n15Var = (n15) this.Z.getValue();
        wqi.m(n15Var.m, "stop", new Object[0]);
        ctf ctfVar = (ctf) n15Var.e.getValue();
        ctfVar.a.k(n15Var.j(), n15Var.a.b, continuation);
        return qqg.a;
    }
}
