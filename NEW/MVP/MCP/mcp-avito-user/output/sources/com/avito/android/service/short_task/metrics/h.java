package com.avito.android.service.short_task.metrics;

import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeviceInfoMetricProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/h;", "Lcom/avito/android/service/short_task/metrics/n;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> f274082a;

    @Inject
    public h(@Y61.k L0 l02) {
        this.f274082a = io.reactivex.rxjava3.core.z.V(new m("manufacturer", l02.getF318655a().e()), new m("screen_width_dp", Integer.valueOf(l02.a())), new m("screen_height_dp", Integer.valueOf(l02.h())), new m("app_width_dp", Integer.valueOf(l02.f())), new m("app_height_dp", Integer.valueOf(l02.b())), new m("screen_dpi", Integer.valueOf(l02.getF318659e())), new m("text_scale", Float.valueOf(l02.getF318658d() / l02.getF318657c())), new m("os_version", Integer.valueOf(l02.getF318655a().j())));
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        return this.f274082a;
    }
}
