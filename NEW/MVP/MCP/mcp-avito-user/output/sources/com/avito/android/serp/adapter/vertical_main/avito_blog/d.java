package com.avito.android.serp.adapter.vertical_main.avito_blog;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AvitoBlogAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f272626c;

    public d(@Y61.k String str) {
        this.f272625b = str;
        this.f272626c = new ParametrizedClickStreamEvent(9883, 2, P0.g(new Q("from_page", "avitoBlogWidget"), new Q("action_type", "Просмотр видео"), new Q("landing_slug", str), new Q("platform_name", "android")), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f272625b, ((d) obj).f272625b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f272626c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f272626c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f272626c.f90248c;
    }

    public final int hashCode() {
        return this.f272625b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("AvitoBlogClickEvent(videoTitle="), this.f272625b, ')');
    }
}
