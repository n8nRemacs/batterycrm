package Bw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBw/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bw.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13194b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1797b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f1798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f1799d;

    public C13194b(@k String str, @k String str2) {
        this.f1797b = str;
        this.f1798c = str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("avito_prof_search_clientid", str2);
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f1799d = new ParametrizedClickStreamEvent(9177, 4, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13194b)) {
            return false;
        }
        C13194b c13194b = (C13194b) obj;
        return L.f(this.f1797b, c13194b.f1797b) && L.f(this.f1798c, c13194b.f1798c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f1799d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1799d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f1799d.f90248c;
    }

    public final int hashCode() {
        return this.f1798c.hashCode() + (this.f1797b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealDocumentUploadedSuccessfullyEvent(fromPage=");
        sb2.append(this.f1797b);
        sb2.append(", clientId=");
        return C22026a.c(sb2, this.f1798c, ')');
    }
}
