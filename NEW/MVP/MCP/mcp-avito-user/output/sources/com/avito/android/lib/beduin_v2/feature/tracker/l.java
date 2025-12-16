package com.avito.android.lib.beduin_v2.feature.tracker;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShowBeduinContentEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class l implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f176390b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f176391c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f176392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f176393e;

    public l(@Y61.k String str, @Y61.l String str2, @Y61.k ArrayList arrayList) {
        this.f176390b = str;
        this.f176391c = arrayList;
        this.f176392d = str2;
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("screen_name", str);
        dVar.put("feature_owners", arrayList);
        if (str2 != null) {
            dVar.put("feature_name", str2);
        }
        G0 g02 = G0.f406611a;
        this.f176393e = new ParametrizedClickStreamEvent(11025, 1, dVar.b(), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f176390b, lVar.f176390b) && L.f(this.f176391c, lVar.f176391c) && L.f(this.f176392d, lVar.f176392d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f176393e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f176393e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f176393e.f90248c;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f176391c, this.f176390b.hashCode() * 31, 31);
        String str = this.f176392d;
        return iG2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowBeduinContentEvent(screenName=");
        sb2.append(this.f176390b);
        sb2.append(", owners=");
        sb2.append(this.f176391c);
        sb2.append(", featureName=");
        return C22026a.c(sb2, this.f176392d, ')');
    }
}
