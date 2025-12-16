package sW;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LocationListScreenOpenEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsW/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48115b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f437691b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f437692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f437693d;

    public C48115b(@l String str, @l String str2) {
        this.f437691b = str;
        this.f437692c = str2;
        HashMap map = new HashMap();
        if (str != null) {
            map.put("cid", str);
        }
        if (str2 != null) {
            map.put("lid", str2);
        }
        G0 g02 = G0.f406611a;
        this.f437693d = new ParametrizedClickStreamEvent(2916, 1, map, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48115b)) {
            return false;
        }
        C48115b c48115b = (C48115b) obj;
        return L.f(this.f437691b, c48115b.f437691b) && L.f(this.f437692c, c48115b.f437692c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f437693d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437693d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f437693d.f90248c;
    }

    public final int hashCode() {
        String str = this.f437691b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f437692c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationListScreenOpenEvent(categoryId=");
        sb2.append(this.f437691b);
        sb2.append(", locationId=");
        return C22026a.c(sb2, this.f437692c, ')');
    }
}
