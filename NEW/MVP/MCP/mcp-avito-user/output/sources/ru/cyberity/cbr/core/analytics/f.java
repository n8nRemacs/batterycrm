package ru.cyberity.cbr.core.analytics;

import kotlin.Metadata;

/* compiled from: AnalyticsEventBuilder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "ts", "Lru/cyberity/cbr/core/analytics/i;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {
    @Y61.k
    public static final i a(long j12) {
        return new e(j12);
    }

    public static /* synthetic */ i a(long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = System.currentTimeMillis();
        }
        return a(j12);
    }
}
