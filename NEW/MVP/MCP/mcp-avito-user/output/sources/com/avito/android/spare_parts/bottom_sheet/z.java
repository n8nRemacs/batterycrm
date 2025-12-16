package com.avito.android.spare_parts.bottom_sheet;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsBottomSheetAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/z;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class z implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f284836b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f284837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f284838d;

    public z(@Y61.k String str, @Y61.k String str2) {
        this.f284836b = str;
        this.f284837c = str2;
        this.f284838d = new ParametrizedClickStreamEvent(10964, 0, P0.g(new Q("item_id", str), new Q("landing_action", "model_click"), new Q("landing_slug", str2)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f284836b, zVar.f284836b) && L.f(this.f284837c, zVar.f284837c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f284838d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f284838d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f284838d.f90248c;
    }

    public final int hashCode() {
        return this.f284837c.hashCode() + (this.f284836b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsItemModelClickedEvent(advertId=");
        sb2.append(this.f284836b);
        sb2.append(", model=");
        return C22026a.c(sb2, this.f284837c, ')');
    }
}
