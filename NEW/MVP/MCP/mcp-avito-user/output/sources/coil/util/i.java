package coil.util;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Lifecycles.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.lifecycle.O, coil.util.h] */
    @Y61.l
    @j.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k androidx.view.Lifecycle r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil.util.g
            if (r0 == 0) goto L13
            r0 = r7
            coil.util.g r0 = (coil.util.g) r0
            int r1 = r0.f58778t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58778t = r1
            goto L18
        L13:
            coil.util.g r0 = new coil.util.g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58777s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f58778t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.l0$h r6 = r0.f58776r
            androidx.lifecycle.Lifecycle r0 = r0.f58775q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L83
        L2d:
            r7 = move-exception
            goto L8f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getF46705d()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.f46682e
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L49
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L49:
            kotlin.jvm.internal.l0$h r7 = new kotlin.jvm.internal.l0$h
            r7.<init>()
            r0.f58775q = r6     // Catch: java.lang.Throwable -> L78
            r0.f58776r = r7     // Catch: java.lang.Throwable -> L78
            r0.f58778t = r3     // Catch: java.lang.Throwable -> L78
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L78
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L78
            r2.p()     // Catch: java.lang.Throwable -> L78
            coil.util.h r3 = new coil.util.h     // Catch: java.lang.Throwable -> L78
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L78
            r7.f406842b = r3     // Catch: java.lang.Throwable -> L78
            r6.a(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.o()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L78
            if (r2 != r3) goto L7e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L78
            goto L7e
        L78:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L8f
        L7e:
            if (r2 != r1) goto L81
            return r1
        L81:
            r0 = r6
            r6 = r7
        L83:
            T r6 = r6.f406842b
            androidx.lifecycle.O r6 = (androidx.view.InterfaceC22982O) r6
            if (r6 == 0) goto L8c
            r0.c(r6)
        L8c:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L8f:
            T r6 = r6.f406842b
            androidx.lifecycle.O r6 = (androidx.view.InterfaceC22982O) r6
            if (r6 == 0) goto L98
            r0.c(r6)
        L98:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.i.a(androidx.lifecycle.Lifecycle, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
