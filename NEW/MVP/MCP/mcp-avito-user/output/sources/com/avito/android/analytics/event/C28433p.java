package com.avito.android.analytics.event;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Business360OnboardingShownEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C28433p implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90122b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f90123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90124d;

    public C28433p(@Y61.k String str, @Y61.k String str2) {
        this.f90122b = str;
        this.f90123c = str2;
        this.f90124d = new ParametrizedClickStreamEvent(14250, 1, kotlin.collections.P0.g(new kotlin.Q("from_page", str), new kotlin.Q("target_page", str2)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28433p)) {
            return false;
        }
        C28433p c28433p = (C28433p) obj;
        return kotlin.jvm.internal.L.f(this.f90122b, c28433p.f90122b) && kotlin.jvm.internal.L.f(this.f90123c, c28433p.f90123c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f90124d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90124d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f90124d.f90248c;
    }

    public final int hashCode() {
        return this.f90123c.hashCode() + (this.f90122b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Business360OnboardingShownEvent(fromPage=");
        sb2.append(this.f90122b);
        sb2.append(", targetPage=");
        return C22026a.c(sb2, this.f90123c, ')');
    }
}
