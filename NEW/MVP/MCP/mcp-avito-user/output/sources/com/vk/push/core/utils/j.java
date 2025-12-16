package com.vk.push.core.utils;

import androidx.datastore.preferences.core.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: DataStoreExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k androidx.datastore.core.h r5, @Y61.k androidx.datastore.preferences.core.f.a r6, @Y61.l java.lang.Integer r7, java.lang.Integer r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof com.vk.push.core.utils.e
            if (r0 == 0) goto L13
            r0 = r9
            com.vk.push.core.utils.e r0 = (com.vk.push.core.utils.e) r0
            int r1 = r0.f367165v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f367165v = r1
            goto L18
        L13:
            com.vk.push.core.utils.e r0 = new com.vk.push.core.utils.e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f367164u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f367165v
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            int r5 = r0.f367163t
            kotlin.C42729a0.b(r9)
            goto L6d
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Integer r7 = r0.f367162s
            androidx.datastore.preferences.core.f$a r6 = r0.f367161r
            androidx.datastore.core.h r5 = r0.f367160q
            kotlin.C42729a0.b(r9)
            goto L52
        L40:
            kotlin.C42729a0.b(r9)
            r0.f367160q = r5
            r0.f367161r = r6
            r0.f367162s = r7
            r0.f367165v = r3
            java.lang.Object r9 = b(r5, r6, r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            boolean r8 = kotlin.jvm.internal.L.f(r9, r7)
            r9 = r8 ^ 1
            if (r8 != 0) goto L6e
            r8 = 0
            r0.f367160q = r8
            r0.f367161r = r8
            r0.f367162s = r8
            r0.f367163t = r9
            r0.f367165v = r4
            java.lang.Object r5 = d(r5, r6, r7, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            r5 = r9
        L6d:
            r9 = r5
        L6e:
            if (r9 == 0) goto L71
            goto L72
        L71:
            r3 = 0
        L72:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.utils.j.a(androidx.datastore.core.h, androidx.datastore.preferences.core.f$a, java.lang.Integer, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k androidx.datastore.core.h r4, @Y61.k androidx.datastore.preferences.core.f.a r5, java.lang.Integer r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof com.vk.push.core.utils.g
            if (r0 == 0) goto L13
            r0 = r7
            com.vk.push.core.utils.g r0 = (com.vk.push.core.utils.g) r0
            int r1 = r0.f367175s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f367175s = r1
            goto L18
        L13:
            com.vk.push.core.utils.g r0 = new com.vk.push.core.utils.g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f367174r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f367175s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Integer r6 = r0.f367173q
            kotlin.C42729a0.b(r7)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r7)
            r0.f367173q = r6
            r0.f367175s = r3
            java.lang.Object r7 = c(r4, r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            if (r7 != 0) goto L44
            goto L45
        L44:
            r6 = r7
        L45:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.utils.j.b(androidx.datastore.core.h, androidx.datastore.preferences.core.f$a, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public static final Object c(@Y61.k androidx.datastore.core.h hVar, @Y61.k f.a aVar, @Y61.k ContinuationImpl continuationImpl) {
        return C43175k.A(new f(hVar.getData(), aVar), continuationImpl);
    }

    @Y61.l
    public static final Object d(@Y61.k androidx.datastore.core.h hVar, @Y61.k f.a aVar, @Y61.l Object obj, @Y61.k ContinuationImpl continuationImpl) {
        Object objA = androidx.datastore.preferences.core.j.a(hVar, new i(obj, aVar, null), continuationImpl);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
