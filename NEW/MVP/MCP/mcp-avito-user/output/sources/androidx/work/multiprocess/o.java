package androidx.work.multiprocess;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RemoteExecute.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-multiprocess_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:33:0x0098, B:35:0x009c, B:38:0x00a8), top: B:49:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, android.os.IBinder$DeathRecipient, androidx.work.multiprocess.n] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k android.os.IInterface r6, @Y61.k androidx.work.multiprocess.InterfaceC23629j r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.work.multiprocess.l
            if (r0 == 0) goto L13
            r0 = r8
            androidx.work.multiprocess.l r0 = (androidx.work.multiprocess.l) r0
            int r1 = r0.f56172v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56172v = r1
            goto L18
        L13:
            androidx.work.multiprocess.l r0 = new androidx.work.multiprocess.l
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f56171u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f56172v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            android.os.IBinder r6 = r0.f56170t
            android.os.IBinder r6 = (android.os.IBinder) r6
            kotlin.jvm.internal.l0$h r7 = r0.f56169s
            android.os.IInterface r0 = r0.f56167q
            android.os.IInterface r0 = (android.os.IInterface) r0
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L34
            goto L8c
        L34:
            r8 = move-exception
            goto L98
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.jvm.internal.l0$h r8 = androidx.compose.foundation.H.t(r8)
            android.os.IBinder r2 = r6.asBinder()
            r5 = r6
            android.os.IInterface r5 = (android.os.IInterface) r5     // Catch: java.lang.Throwable -> L81
            r0.f56167q = r5     // Catch: java.lang.Throwable -> L81
            r0.f56168r = r7     // Catch: java.lang.Throwable -> L81
            r0.f56169s = r8     // Catch: java.lang.Throwable -> L81
            r5 = r2
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L81
            r0.f56170t = r5     // Catch: java.lang.Throwable -> L81
            r0.f56172v = r4     // Catch: java.lang.Throwable -> L81
            kotlin.coroutines.SafeContinuation r4 = new kotlin.coroutines.SafeContinuation     // Catch: java.lang.Throwable -> L81
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L81
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L81
            androidx.work.multiprocess.n r5 = new androidx.work.multiprocess.n     // Catch: java.lang.Throwable -> L81
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L81
            r8.f406842b = r5     // Catch: java.lang.Throwable -> L81
            r2.linkToDeath(r5, r3)     // Catch: java.lang.Throwable -> L81
            androidx.work.multiprocess.m r5 = new androidx.work.multiprocess.m     // Catch: java.lang.Throwable -> L81
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L81
            android.os.IInterface r6 = (android.os.IInterface) r6     // Catch: java.lang.Throwable -> L81
            r7.i(r6, r5)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r6 = r4.getOrThrow()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L81
            if (r6 != r7) goto L86
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r2
            goto L98
        L86:
            if (r6 != r1) goto L89
            return r1
        L89:
            r7 = r8
            r8 = r6
            r6 = r2
        L8c:
            byte[] r8 = (byte[]) r8     // Catch: java.lang.Throwable -> L34
            T r7 = r7.f406842b
            android.os.IBinder$DeathRecipient r7 = (android.os.IBinder.DeathRecipient) r7
            if (r7 == 0) goto L97
            r6.unlinkToDeath(r7, r3)     // Catch: java.util.NoSuchElementException -> L97
        L97:
            return r8
        L98:
            boolean r0 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto La8
            androidx.work.G r0 = androidx.work.G.a()     // Catch: java.lang.Throwable -> La6
            int r1 = androidx.work.multiprocess.C23625f.f56154e     // Catch: java.lang.Throwable -> La6
            r0.getClass()     // Catch: java.lang.Throwable -> La6
            goto La8
        La6:
            r8 = move-exception
            goto La9
        La8:
            throw r8     // Catch: java.lang.Throwable -> La6
        La9:
            T r7 = r7.f406842b
            android.os.IBinder$DeathRecipient r7 = (android.os.IBinder.DeathRecipient) r7
            if (r7 == 0) goto Lb2
            r6.unlinkToDeath(r7, r3)     // Catch: java.util.NoSuchElementException -> Lb2
        Lb2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.o.a(android.os.IInterface, androidx.work.multiprocess.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
