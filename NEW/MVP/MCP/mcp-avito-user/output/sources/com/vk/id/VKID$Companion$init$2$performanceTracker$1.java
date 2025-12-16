package com.vk.id;

import Y41.l;
import com.vk.id.tracking.core.PerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J6\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/vk/id/VKID$Companion$init$2$performanceTracker$1", "Lcom/vk/id/tracking/core/PerformanceTracker;", "", "key", "Lkotlin/G0;", "startTracking", "(Ljava/lang/String;)V", "endTracking", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "action", "runTrackingSuspend", "(Ljava/lang/String;LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKID$Companion$init$2$performanceTracker$1 implements PerformanceTracker {
    @Override // com.vk.id.tracking.core.PerformanceTracker
    public Object runTrackingSuspend(String str, l<? super Continuation<? super G0>, ? extends Object> lVar, Continuation<? super G0> continuation) {
        Object objInvoke = lVar.invoke(continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
    }

    @Override // com.vk.id.tracking.core.PerformanceTracker
    public void endTracking(String key) {
    }

    @Override // com.vk.id.tracking.core.PerformanceTracker
    public void startTracking(String key) {
    }
}
