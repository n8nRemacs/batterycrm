package com.avito.android.service.short_task.metrics;

import com.avito.android.analytics.H;
import com.avito.android.serp.adapter.U;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NetworkMetricProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/o;", "Lcom/avito/android/service/short_task/metrics/n;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f274091a;

    @Inject
    public o(@Y61.k H h12) {
        this.f274091a = h12;
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        return io.reactivex.rxjava3.core.z.W(new U(this, 1));
    }
}
