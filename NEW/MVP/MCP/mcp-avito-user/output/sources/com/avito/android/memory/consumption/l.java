package com.avito.android.memory.consumption;

import android.os.Debug;
import kotlin.Metadata;

/* compiled from: MemoryMetricsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/memory/consumption/l;", "", "<init>", "()V", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l {
    @Y61.k
    public static g a() throws NumberFormatException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return new g(Long.parseLong(memoryInfo.getMemoryStat("summary.java-heap")), Long.parseLong(memoryInfo.getMemoryStat("summary.native-heap")), Long.parseLong(memoryInfo.getMemoryStat("summary.code")), Long.parseLong(memoryInfo.getMemoryStat("summary.stack")), Long.parseLong(memoryInfo.getMemoryStat("summary.graphics")), Long.parseLong(memoryInfo.getMemoryStat("summary.private-other")), Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count")), Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time")), Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count")), Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time")));
    }
}
