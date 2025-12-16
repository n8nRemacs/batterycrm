package X91;

import androidx.view.M0;

/* loaded from: classes9.dex */
public final class s extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final U91.c f18755E;

    public s(U91.c cVar) {
        this.f18755E = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ke(android.content.Context r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof X91.r
            if (r0 == 0) goto L13
            r0 = r6
            X91.r r0 = (X91.r) r0
            int r1 = r0.f18754t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18754t = r1
            goto L18
        L13:
            X91.r r0 = new X91.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18752r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f18754t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            android.content.Context r5 = r0.f18751q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L2b:
            r6 = move-exception
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            int r6 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
            U91.c r6 = r4.f18755E     // Catch: java.lang.Throwable -> L2b
            r0.f18751q = r5     // Catch: java.lang.Throwable -> L2b
            r0.f18754t = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2b
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
            goto L54
        L4c:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r6)
            r6 = r0
        L54:
            java.lang.Throwable r0 = kotlin.Z.b(r6)
            if (r0 != 0) goto L70
            kotlin.G0 r6 = (kotlin.G0) r6
            boolean r6 = Ba1.q.a(r5)
            if (r6 == 0) goto L65
            ru.mts.biometry.sdk.IdentificationCancelReason r5 = ru.mts.biometry.sdk.IdentificationCancelReason.f436367f
            goto L94
        L65:
            boolean r5 = Ba1.E.a(r5)
            if (r5 == 0) goto L6e
            ru.mts.biometry.sdk.IdentificationCancelReason r5 = ru.mts.biometry.sdk.IdentificationCancelReason.f436366e
            goto L94
        L6e:
            r5 = 0
            goto L94
        L70:
            boolean r5 = r0 instanceof ru.mts.biometry.api.FlowException
            if (r5 == 0) goto L92
            ru.mts.biometry.api.FlowException r0 = (ru.mts.biometry.api.FlowException) r0
            ru.mts.biometry.api.entity.FlowStatus r5 = r0.f436292b
            java.lang.String r5 = r5.getStatus()
            java.lang.String r6 = "identificationFailed"
            boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
            if (r6 == 0) goto L87
            ru.mts.biometry.sdk.IdentificationCancelReason r5 = ru.mts.biometry.sdk.IdentificationCancelReason.f436365d
            goto L94
        L87:
            java.lang.String r6 = "dataAccepted"
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 == 0) goto L92
            ru.mts.biometry.sdk.IdentificationCancelReason r5 = ru.mts.biometry.sdk.IdentificationCancelReason.f436363b
            goto L94
        L92:
            ru.mts.biometry.sdk.IdentificationCancelReason r5 = ru.mts.biometry.sdk.IdentificationCancelReason.f436364c
        L94:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X91.s.ke(android.content.Context, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
