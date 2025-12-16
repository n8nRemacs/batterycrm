package com.avito.android.saved_searches.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchEntryPointsVisibilityTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/analytics/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f258257b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f258258c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f258259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f258260e;

    public b(@l String str, @k String str2, @k String str3) {
        this.f258257b = str;
        this.f258258c = str2;
        this.f258259d = str3;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str2), new Q("entry_point", str3));
        if (str != null) {
            linkedHashMapJ.put("cid", str);
        }
        G0 g02 = G0.f406611a;
        this.f258260e = new ParametrizedClickStreamEvent(8188, 2, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f258257b, bVar.f258257b) && L.f(this.f258258c, bVar.f258258c) && L.f(this.f258259d, bVar.f258259d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f258260e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f258260e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f258260e.f90248c;
    }

    public final int hashCode() {
        String str = this.f258257b;
        return this.f258259d.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f258258c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EntryPointShownEvent(cid=");
        sb2.append(this.f258257b);
        sb2.append(", fromPage=");
        sb2.append(this.f258258c);
        sb2.append(", entryPoint=");
        return C22026a.c(sb2, this.f258259d, ')');
    }
}
