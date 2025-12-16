package com.avito.android.autoteka.helpers;

import kotlin.Metadata;

/* compiled from: DelayPolling.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_autoteka_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0079 -> B:25:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008f -> B:29:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0096 -> B:29:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0098 -> B:33:0x009a). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k Y41.p r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof com.avito.android.autoteka.helpers.g
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.autoteka.helpers.g r0 = (com.avito.android.autoteka.helpers.g) r0
            int r1 = r0.f96662v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96662v = r1
            goto L18
        L13:
            com.avito.android.autoteka.helpers.g r0 = new com.avito.android.autoteka.helpers.g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f96661u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96662v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r5 = r0.f96660t
            int r10 = r0.f96659s
            com.avito.android.remote.model.TypedResult r2 = r0.f96658r
            Y41.p r7 = r0.f96657q
            Y41.p r7 = (Y41.p) r7
            kotlin.C42729a0.b(r11)
            goto L92
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            long r5 = r0.f96660t
            int r10 = r0.f96659s
            Y41.p r2 = r0.f96657q
            Y41.p r2 = (Y41.p) r2
            kotlin.C42729a0.b(r11)
            r7 = r2
            goto L6d
        L4b:
            kotlin.C42729a0.b(r11)
            r11 = 0
            r5 = 0
        L51:
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r7 = r10
            Y41.p r7 = (Y41.p) r7
            r0.f96657q = r7
            r7 = 0
            r0.f96658r = r7
            r0.f96659s = r11
            r0.f96660t = r5
            r0.f96662v = r4
            java.lang.Object r2 = r10.invoke(r2, r0)
            if (r2 != r1) goto L6a
            return r1
        L6a:
            r7 = r10
            r10 = r11
            r11 = r2
        L6d:
            com.avito.android.autoteka.helpers.i r11 = (com.avito.android.autoteka.helpers.i) r11
            com.avito.android.remote.model.TypedResult<T> r2 = r11.f96663a
            boolean r8 = r2 instanceof com.avito.android.remote.model.TypedResult.Success
            boolean r9 = r11.f96664b
            if (r8 == 0) goto L94
            if (r9 == 0) goto L7c
            r11 = r4
        L7a:
            r10 = r7
            goto L9a
        L7c:
            r8 = r7
            Y41.p r8 = (Y41.p) r8
            r0.f96657q = r8
            r0.f96658r = r2
            r0.f96659s = r10
            r0.f96660t = r5
            r0.f96662v = r3
            long r8 = r11.f96665c
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r8, r0)
            if (r11 != r1) goto L92
            return r1
        L92:
            r11 = r10
            goto L7a
        L94:
            boolean r11 = r2 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r11 == 0) goto L92
            r10 = r7
            r11 = r9
        L9a:
            r7 = 1
            long r5 = r5 + r7
            if (r11 == 0) goto L51
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.helpers.h.a(Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
