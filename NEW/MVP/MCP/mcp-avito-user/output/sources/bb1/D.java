package bb1;

import kotlinx.coroutines.C43262l0;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final OkHttpClient f57210a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T11.e f57211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.scheduling.b f57212c;

    public D(OkHttpClient okHttpClient, T11.e eVar) {
        kotlinx.coroutines.scheduling.b bVar = C43262l0.f411947c;
        this.f57210a = okHttpClient;
        this.f57211b = eVar;
        this.f57212c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bb1.z
            if (r0 == 0) goto L13
            r0 = r6
            bb1.z r0 = (bb1.z) r0
            int r1 = r0.f57288s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57288s = r1
            goto L18
        L13:
            bb1.z r0 = new bb1.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f57286q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57288s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            bb1.A r6 = new bb1.A
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.f57288s = r3
            kotlinx.coroutines.scheduling.b r5 = r4.f57212c
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.Z r6 = (kotlin.Z) r6
            java.lang.Object r5 = r6.f406625b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.D.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof bb1.B
            if (r0 == 0) goto L13
            r0 = r7
            bb1.B r0 = (bb1.B) r0
            int r1 = r0.f57203s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57203s = r1
            goto L18
        L13:
            bb1.B r0 = new bb1.B
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f57201q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57203s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            bb1.C r7 = new bb1.C
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f57203s = r3
            kotlinx.coroutines.scheduling.b r5 = r4.f57212c
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            kotlin.Z r7 = (kotlin.Z) r7
            java.lang.Object r5 = r7.f406625b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.D.b(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
