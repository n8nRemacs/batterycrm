package com.vk.push.core.network.data.source;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import okhttp3.OkHttpClient;

/* compiled from: MasterHostApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/core/network/data/source/g;", "", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OkHttpClient f367113a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T11.e f367114b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final M f367115c;

    public g(OkHttpClient okHttpClient, T11.e eVar, M m12, int i12, C42822w c42822w) {
        m12 = (i12 & 4) != 0 ? C43262l0.f411947c : m12;
        this.f367113a = okHttpClient;
        this.f367114b = eVar;
        this.f367115c = m12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.List r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.vk.push.core.network.data.source.c
            if (r0 == 0) goto L13
            r0 = r6
            com.vk.push.core.network.data.source.c r0 = (com.vk.push.core.network.data.source.c) r0
            int r1 = r0.f367104s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f367104s = r1
            goto L18
        L13:
            com.vk.push.core.network.data.source.c r0 = new com.vk.push.core.network.data.source.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f367102q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f367104s
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
            com.vk.push.core.network.data.source.d r6 = new com.vk.push.core.network.data.source.d
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.f367104s = r3
            kotlinx.coroutines.M r5 = r4.f367115c
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.Z r6 = (kotlin.Z) r6
            java.lang.Object r5 = r6.f406625b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.network.data.source.g.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
