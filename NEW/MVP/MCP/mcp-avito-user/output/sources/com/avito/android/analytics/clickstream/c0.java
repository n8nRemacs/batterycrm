package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.C28379d;
import kotlin.Metadata;

/* compiled from: NonFatalClickstreamEventFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/c0;", "Lcom/avito/android/analytics/clickstream/d$f;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c0 implements C28379d.f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.I f89780b;

    public c0(@Y61.k com.avito.android.I i12) {
        this.f89780b = i12;
    }

    @Override // com.avito.android.analytics.clickstream.C28379d.f
    public final boolean b(@Y61.k com.avito.android.analytics.provider.clickstream.a aVar) {
        return !(aVar instanceof cc.g) || this.f89780b.t().invoke().booleanValue();
    }
}
