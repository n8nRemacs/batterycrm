package com.avito.android.analytics.screens.tracker;

import kotlin.Metadata;

/* compiled from: ContentLoadingTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/k;", "Lcom/avito/android/analytics/screens/tracker/X;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28489k extends X {

    /* compiled from: ContentLoadingTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.screens.tracker.k$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC28489k interfaceC28489k, Integer num, com.avito.android.analytics.screens.J j12, long j13, int i12) {
            if ((i12 & 1) != 0) {
                num = null;
            }
            if ((i12 & 4) != 0) {
                j13 = -1;
            }
            interfaceC28489k.g(num, j12, j13);
        }
    }

    void e();

    void g(@Y61.l Integer num, @Y61.k com.avito.android.analytics.screens.J j12, long j13);
}
