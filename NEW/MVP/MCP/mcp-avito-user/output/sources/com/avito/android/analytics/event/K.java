package com.avito.android.analytics.event;

import com.avito.android.remote.model.category_parameters.PhotoParameter;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GalleryClickEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/K;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class K implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f89955b = new com.avito.android.analytics.provider.clickstream.b(3510, 1);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f89956c;

    public K(@Y61.k String str, int i12, int i13) {
        this.f89956c = kotlin.collections.P0.g(new kotlin.Q("iid", str), new kotlin.Q("from_block", Integer.valueOf(i12)), new kotlin.Q(PhotoParameter.TYPE, Integer.valueOf(i13)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f89955b.f90262b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f89956c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f89955b.f90263c;
    }
}
