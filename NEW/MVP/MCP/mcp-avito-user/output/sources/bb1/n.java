package bb1;

import androidx.datastore.preferences.core.f;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.datastore.core.h<androidx.datastore.preferences.core.f> f57247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f.a<Boolean> f57248b = new f.a<>("test_mode_enabled");

    public n(@Y61.k androidx.datastore.core.h<androidx.datastore.preferences.core.f> hVar) {
        this.f57247a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof bb1.m
            if (r0 == 0) goto L13
            r0 = r10
            bb1.m r0 = (bb1.m) r0
            int r1 = r0.f57246u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57246u = r1
            goto L18
        L13:
            bb1.m r0 = new bb1.m
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f57244s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f57246u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            int r0 = r0.f57243r
            kotlin.C42729a0.b(r10)
            goto L73
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            bb1.n r2 = r0.f57242q
            kotlin.C42729a0.b(r10)
            goto L50
        L3d:
            kotlin.C42729a0.b(r10)
            r0.f57242q = r9
            r0.f57246u = r5
            androidx.datastore.preferences.core.f$a<java.lang.Boolean> r10 = r9.f57248b
            androidx.datastore.core.h<androidx.datastore.preferences.core.f> r2 = r9.f57247a
            java.lang.Object r10 = com.vk.push.core.utils.j.c(r2, r10, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r2 = r9
        L50:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L59
            boolean r10 = r10.booleanValue()
            goto L5a
        L59:
            r10 = r3
        L5a:
            if (r10 == 0) goto L72
            androidx.datastore.core.h<androidx.datastore.preferences.core.f> r6 = r2.f57247a
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r8 = 0
            r0.f57242q = r8
            r0.f57243r = r10
            r0.f57246u = r4
            androidx.datastore.preferences.core.f$a<java.lang.Boolean> r2 = r2.f57248b
            java.lang.Object r0 = com.vk.push.core.utils.j.d(r6, r2, r7, r0)
            if (r0 != r1) goto L72
            return r1
        L72:
            r0 = r10
        L73:
            if (r0 == 0) goto L76
            r3 = r5
        L76:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.n.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
