package com.avito.android.analytics.statsd;

import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendStatsdEventsTaskDelegateImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/statsd/i;", "Lcom/avito/android/analytics/statsd/f;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.statsd.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28517i implements InterfaceC28514f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J f91055a;

    @Inject
    public C28517i(@Y61.k J j12) {
        this.f91055a = j12;
    }

    @Override // com.avito.android.analytics.statsd.InterfaceC28514f
    @Y61.k
    public final U start() {
        return this.f91055a.a().k(new C28515g(this)).r(new C28516h(this)).u(new com.avito.android.analytics.clickstream.I(1));
    }
}
