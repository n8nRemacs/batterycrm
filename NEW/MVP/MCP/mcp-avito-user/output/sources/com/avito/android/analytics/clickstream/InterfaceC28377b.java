package com.avito.android.analytics.clickstream;

import kotlin.Metadata;
import okhttp3.ResponseBody;
import proto.events.apps.BatchOuterClass;

/* compiled from: ClickStreamApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/analytics/clickstream/b;", "", "Lproto/events/apps/BatchOuterClass$Envelope;", "batch", "Lio/reactivex/rxjava3/core/I;", "Lokhttp3/ResponseBody;", "a", "(Lproto/events/apps/BatchOuterClass$Envelope;)Lio/reactivex/rxjava3/core/I;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.clickstream.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28377b {
    @J81.o("0/proto")
    @Y61.k
    io.reactivex.rxjava3.core.I<ResponseBody> a(@J81.a @Y61.k BatchOuterClass.Envelope batch);
}
