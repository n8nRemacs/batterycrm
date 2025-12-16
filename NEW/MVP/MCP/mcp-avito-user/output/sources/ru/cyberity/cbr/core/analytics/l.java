package ru.cyberity.cbr.core.analytics;

import kotlin.Metadata;

/* compiled from: AnalyticsEventBuilder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/analytics/l;", "", "", "immediately", "Lkotlin/G0;", "a", "(Z)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface l {
    static /* synthetic */ void a(l lVar, boolean z12, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        lVar.a(z12);
    }

    void a(boolean immediately);
}
