package com.vk.push.core.network.utils;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.r;
import okhttp3.Call;

/* compiled from: CallHandler.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core-network_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {
    @Y61.l
    public static final Object a(@Y61.k Call call, @Y61.k ContinuationImpl continuationImpl) {
        r rVar = new r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        e eVar = new e(call, rVar);
        call.enqueue(eVar);
        rVar.r(eVar);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objO;
    }
}
