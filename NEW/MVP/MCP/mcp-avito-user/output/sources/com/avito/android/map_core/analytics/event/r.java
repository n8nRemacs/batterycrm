package com.avito.android.map_core.analytics.event;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: StartDrawingButtonEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/r;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class r implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f185641b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f185642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f185643d;

    public r(@Y61.l String str, @Y61.l String str2) {
        this.f185641b = str;
        this.f185642c = str2;
        this.f185643d = new ParametrizedClickStreamEvent(12836, 0, C35755b0.c(P0.g(new Q("uid", str), new Q("cid", str2))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f185641b, rVar.f185641b) && L.f(this.f185642c, rVar.f185642c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f185643d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f185643d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f185643d.f90248c;
    }

    public final int hashCode() {
        String str = this.f185641b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f185642c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartDrawingButtonEvent(userId=");
        sb2.append(this.f185641b);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f185642c, ')');
    }
}
