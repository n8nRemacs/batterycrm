package com.avito.android.analytics.statsd;

import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* compiled from: StatsdApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/analytics/statsd/l;", "", "", "Lcom/avito/android/analytics/statsd/StatsdRecord;", "events", "Lio/reactivex/rxjava3/core/I;", "Lokhttp3/ResponseBody;", "a", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/I;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.statsd.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28520l {
    @J81.o("1/stats/realtime")
    @Y61.k
    io.reactivex.rxjava3.core.I<ResponseBody> a(@J81.a @Y61.k List<StatsdRecord> events);
}
