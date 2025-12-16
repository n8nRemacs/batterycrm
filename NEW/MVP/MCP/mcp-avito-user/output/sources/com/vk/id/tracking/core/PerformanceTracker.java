package com.vk.id.tracking.core;

import Y61.k;
import Y61.l;
import com.vk.id.common.InternalVKIDApi;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PerformanceTracker.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J6\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vk/id/tracking/core/PerformanceTracker;", "", "", "key", "Lkotlin/G0;", "startTracking", "(Ljava/lang/String;)V", "endTracking", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "action", "runTrackingSuspend", "(Ljava/lang/String;LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracking-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PerformanceTracker {
    void endTracking(@k String key);

    @l
    Object runTrackingSuspend(@k String str, @k Y41.l<? super Continuation<? super G0>, ? extends Object> lVar, @k Continuation<? super G0> continuation);

    void startTracking(@k String key);
}
