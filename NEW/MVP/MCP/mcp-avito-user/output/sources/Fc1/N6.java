package Fc1;

import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes9.dex */
public final class N6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C13607f1 f5110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f5111b = new LinkedHashMap();

    @Inject
    public N6(@Y61.k C13607f1 c13607f1) {
        this.f5110a = c13607f1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Fc1.M6
            if (r0 == 0) goto L13
            r0 = r7
            Fc1.M6 r0 = (Fc1.M6) r0
            int r1 = r0.f5102u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5102u = r1
            goto L18
        L13:
            Fc1.M6 r0 = new Fc1.M6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5100s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5102u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r6 = r0.f5099r
            Fc1.N6 r0 = r0.f5098q
            kotlin.C42729a0.b(r7)
            goto L83
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            java.util.LinkedHashMap r7 = r5.f5111b
            boolean r2 = r7.containsKey(r6)
            if (r2 == 0) goto L4f
            java.lang.Object r6 = r7.get(r6)
            androidx.compose.ui.graphics.q0 r6 = (androidx.compose.ui.graphics.InterfaceC22280q0) r6
            if (r6 != 0) goto L90
            int r6 = androidx.compose.ui.graphics.InterfaceC22280q0.f39746a
            androidx.compose.ui.graphics.k r6 = Fc1.O4.a()
            goto L90
        L4f:
            r0.f5098q = r5
            r0.f5099r = r6
            r0.f5102u = r3
            Fc1.f1 r7 = r5.f5110a
            r7.getClass()
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r4)
            r2.p()
            com.android.volley.u r7 = r7.a()
            Fc1.f6 r3 = new Fc1.f6
            r3.<init>(r6, r2)
            r7.a(r3)
            java.lang.Object r7 = r2.o()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r2) goto L7f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L7f:
            if (r7 != r1) goto L82
            return r1
        L82:
            r0 = r5
        L83:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            androidx.compose.ui.graphics.k r1 = new androidx.compose.ui.graphics.k
            r1.<init>(r7)
            java.util.LinkedHashMap r7 = r0.f5111b
            r7.put(r6, r1)
            r6 = r1
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.N6.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
