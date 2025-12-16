package com.avito.android.serp.adapter.rich_snippets.realty;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: GalleryWatchEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/W;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class W implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f270967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270968c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f270969d;

    public W() {
        throw null;
    }

    public W(String str, int i12, int i13, Map map, int i14, C42822w c42822w) {
        i12 = (i14 & 2) != 0 ? 5235 : i12;
        i13 = (i14 & 4) != 0 ? 2 : i13;
        map = (i14 & 8) != 0 ? P0.g(new kotlin.Q("catalog_jk_source", "serp_snippet"), new kotlin.Q("developmentId", str)) : map;
        this.f270967b = i12;
        this.f270968c = i13;
        this.f270969d = map;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF270967b() {
        return this.f270967b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f270969d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF270968c() {
        return this.f270968c;
    }
}
