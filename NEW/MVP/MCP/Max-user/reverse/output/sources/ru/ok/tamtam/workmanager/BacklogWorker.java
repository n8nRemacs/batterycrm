package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.cm6;
import defpackage.g5i;
import java.util.HashSet;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.BacklogWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/workmanager/BacklogWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "lui", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BacklogWorker extends SdkCoroutineWorker {
    public static BacklogWorker X;
    public final bwf a;
    public final bwf b;
    public final Object c;
    public final HashSet d;
    public volatile boolean o;

    public BacklogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new bwf(new cm6(this) { // from class: sf0
            public final /* synthetic */ BacklogWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((y4e) this.b.getTamComponent()).j();
                    default:
                        return (g5i) ((y4e) this.b.getTamComponent()).getAccessor().c(169);
                }
            }
        });
        final int i2 = 1;
        this.b = new bwf(new cm6(this) { // from class: sf0
            public final /* synthetic */ BacklogWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((y4e) this.b.getTamComponent()).j();
                    default:
                        return (g5i) ((y4e) this.b.getTamComponent()).getAccessor().c(169);
                }
            }
        });
        this.c = new Object();
        this.d = new HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        if (defpackage.svi.i(r1, r4, r2) == r3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ru.ok.tamtam.workmanager.BacklogWorker r16, defpackage.q44 r17) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.b(ru.ok.tamtam.workmanager.BacklogWorker, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:23:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r8, defpackage.q44 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tf0
            if (r0 == 0) goto L13
            r0 = r9
            tf0 r0 = (defpackage.tf0) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            tf0 r0 = new tf0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            int r8 = r0.X
            uid r1 = r0.o
            java.util.List r3 = r0.d
            defpackage.g8j.b(r9)
            goto L75
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.g8j.b(r9)
            uid r9 = new uid
            r9.<init>()
            r9.a = r7
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L42:
            r3 = 10
            if (r8 <= r3) goto L49
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L49:
            java.lang.Object r3 = r1.a
            ru.ok.tamtam.workmanager.BacklogWorker r3 = (ru.ok.tamtam.workmanager.BacklogWorker) r3
            bwf r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            lzf r3 = (defpackage.lzf) r3
            q2b r3 = (defpackage.q2b) r3
            z74 r3 = r3.b()
            uf0 r4 = new uf0
            r5 = 0
            r4.<init>(r1, r9, r5)
            r0.d = r9
            r0.o = r1
            r0.X = r8
            r0.s0 = r2
            java.lang.Object r3 = defpackage.svi.i(r3, r4, r0)
            g84 r4 = defpackage.g84.a
            if (r3 != r4) goto L72
            return r4
        L72:
            r6 = r3
            r3 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L86
            java.lang.Object r9 = r1.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            int r8 = r8 + r2
            r1.a = r9
            r9 = r3
            goto L42
        L86:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.c(java.util.List, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r1.e(r0) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wf0
            if (r0 == 0) goto L13
            r0 = r7
            wf0 r0 = (defpackage.wf0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            wf0 r0 = new wf0
            q44 r7 = (defpackage.q44) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 0
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.g8j.b(r7)
            goto L59
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            ru.ok.tamtam.workmanager.BacklogWorker r1 = r0.d
            defpackage.g8j.b(r7)
            goto L4e
        L3b:
            defpackage.g8j.b(r7)
            ru.ok.tamtam.workmanager.BacklogWorker.X = r6
            r0.d = r6
            r0.Y = r4
            hd5 r7 = defpackage.hd5.a
            java.lang.Object r7 = r6.h(r7, r0)
            if (r7 != r5) goto L4d
            goto L58
        L4d:
            r1 = r6
        L4e:
            r0.d = r2
            r0.Y = r3
            java.lang.Object r7 = r1.e(r0)
            if (r7 != r5) goto L59
        L58:
            return r5
        L59:
            ru.ok.tamtam.workmanager.BacklogWorker.X = r2
            ka8 r7 = defpackage.la8.b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0096 -> B:29:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.q44 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.vf0
            if (r0 == 0) goto L13
            r0 = r10
            vf0 r0 = (defpackage.vf0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vf0 r0 = new vf0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uid r2 = r0.d
            defpackage.g8j.b(r10)
            goto L99
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            defpackage.g8j.b(r10)
            uid r10 = new uid
            r10.<init>()
            r10.a = r9
            r2 = r10
        L3c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r4 = r2.a
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4
            java.lang.Object r4 = r4.c
            monitor-enter(r4)
            java.lang.String r5 = "BACKLOG_WORKER"
            java.lang.String r6 = "checkStayAliveAndRunIfNeeded %d"
            java.lang.Object r7 = r2.a     // Catch: java.lang.Throwable -> L81
            ru.ok.tamtam.workmanager.BacklogWorker r7 = (ru.ok.tamtam.workmanager.BacklogWorker) r7     // Catch: java.lang.Throwable -> L81
            java.util.HashSet r7 = r7.d     // Catch: java.lang.Throwable -> L81
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> L81
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r7 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L81
            defpackage.wqi.c(r5, r6, r7)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L81
            ru.ok.tamtam.workmanager.BacklogWorker r5 = (ru.ok.tamtam.workmanager.BacklogWorker) r5     // Catch: java.lang.Throwable -> L81
            java.util.HashSet r5 = r5.d     // Catch: java.lang.Throwable -> L81
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L83
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L81
            ru.ok.tamtam.workmanager.BacklogWorker r5 = (ru.ok.tamtam.workmanager.BacklogWorker) r5     // Catch: java.lang.Throwable -> L81
            java.util.HashSet r5 = r5.d     // Catch: java.lang.Throwable -> L81
            r10.addAll(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L81
            ru.ok.tamtam.workmanager.BacklogWorker r5 = (ru.ok.tamtam.workmanager.BacklogWorker) r5     // Catch: java.lang.Throwable -> L81
            java.util.HashSet r5 = r5.d     // Catch: java.lang.Throwable -> L81
            r5.clear()     // Catch: java.lang.Throwable -> L81
            goto L83
        L81:
            r10 = move-exception
            goto La3
        L83:
            monitor-exit(r4)
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto La0
            java.lang.Object r4 = r2.a
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4
            r0.d = r2
            r0.Y = r3
            java.lang.Object r10 = r4.h(r10, r0)
            if (r10 != r1) goto L99
            return r1
        L99:
            java.lang.Object r10 = r2.a
            ru.ok.tamtam.workmanager.BacklogWorker r10 = (ru.ok.tamtam.workmanager.BacklogWorker) r10
            r2.a = r10
            goto L3c
        La0:
            qqg r10 = defpackage.qqg.a
            return r10
        La3:
            monitor-exit(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.e(q44):java.lang.Object");
    }

    public final g5i g() {
        return (g5i) this.b.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x013d, code lost:
    
        if (defpackage.s8j.c((r0 * 1000) * r13, r2) == r3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[Catch: all -> 0x003e, CancellationException -> 0x0041, TryCatch #2 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:15:0x0038, B:33:0x0078, B:35:0x007e, B:39:0x00a7, B:41:0x00c3, B:43:0x00c9, B:46:0x00d9, B:49:0x00e3, B:54:0x00f4, B:58:0x0102, B:63:0x010f, B:66:0x012b, B:24:0x0050, B:27:0x005b, B:30:0x0066), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3 A[Catch: all -> 0x003e, CancellationException -> 0x0041, TryCatch #2 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:15:0x0038, B:33:0x0078, B:35:0x007e, B:39:0x00a7, B:41:0x00c3, B:43:0x00c9, B:46:0x00d9, B:49:0x00e3, B:54:0x00f4, B:58:0x0102, B:63:0x010f, B:66:0x012b, B:24:0x0050, B:27:0x005b, B:30:0x0066), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3 A[Catch: all -> 0x003e, CancellationException -> 0x0041, PHI: r4 r6 r11 r12
  0x00e3: PHI (r4v5 int) = (r4v7 int), (r4v8 int) binds: [B:47:0x00df, B:40:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r6v2 int) = (r6v3 int), (r6v4 int) binds: [B:47:0x00df, B:40:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r11v2 java.util.List) = (r11v3 java.util.List), (r11v4 java.util.List) binds: [B:47:0x00df, B:40:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r12v5 ru.ok.tamtam.workmanager.BacklogWorker) = (r12v6 ru.ok.tamtam.workmanager.BacklogWorker), (r12v7 ru.ok.tamtam.workmanager.BacklogWorker) binds: [B:47:0x00df, B:40:0x00c1] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:15:0x0038, B:33:0x0078, B:35:0x007e, B:39:0x00a7, B:41:0x00c3, B:43:0x00c9, B:46:0x00d9, B:49:0x00e3, B:54:0x00f4, B:58:0x0102, B:63:0x010f, B:66:0x012b, B:24:0x0050, B:27:0x005b, B:30:0x0066), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4 A[Catch: all -> 0x003e, CancellationException -> 0x0041, TryCatch #2 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:15:0x0038, B:33:0x0078, B:35:0x007e, B:39:0x00a7, B:41:0x00c3, B:43:0x00c9, B:46:0x00d9, B:49:0x00e3, B:54:0x00f4, B:58:0x0102, B:63:0x010f, B:66:0x012b, B:24:0x0050, B:27:0x005b, B:30:0x0066), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[Catch: all -> 0x003e, CancellationException -> 0x0041, PHI: r4 r11 r12
  0x010f: PHI (r4v2 int) = (r4v4 int), (r4v5 int) binds: [B:62:0x010d, B:53:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r11v0 java.util.List) = (r11v1 java.util.List), (r11v2 java.util.List) binds: [B:62:0x010d, B:53:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r12v3 ru.ok.tamtam.workmanager.BacklogWorker) = (r12v4 ru.ok.tamtam.workmanager.BacklogWorker), (r12v5 ru.ok.tamtam.workmanager.BacklogWorker) binds: [B:62:0x010d, B:53:0x00f2] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:15:0x0038, B:33:0x0078, B:35:0x007e, B:39:0x00a7, B:41:0x00c3, B:43:0x00c9, B:46:0x00d9, B:49:0x00e3, B:54:0x00f4, B:58:0x0102, B:63:0x010f, B:66:0x012b, B:24:0x0050, B:27:0x005b, B:30:0x0066), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x013d -> B:16:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r20, defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.h(java.util.List, q44):java.lang.Object");
    }
}
