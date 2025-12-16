package B8;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GridGalleryShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f881c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f883e;

    public a(long j12, int i12, @l String str) {
        this.f880b = j12;
        this.f881c = i12;
        this.f882d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("iid", Long.valueOf(j12));
        linkedHashMap.put("position", Integer.valueOf(i12));
        if (str != null) {
            linkedHashMap.put("x", str);
        }
        this.f883e = new ParametrizedClickStreamEvent(16123, 2, "travel_new_gallery", linkedHashMap);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f880b == aVar.f880b && this.f881c == aVar.f881c && L.f(this.f882d, aVar.f882d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f883e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f883e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f883e.f90248c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f881c, Long.hashCode(this.f880b) * 31, 31);
        String str = this.f882d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GridGalleryShowEvent(itemId=");
        sb2.append(this.f880b);
        sb2.append(", position=");
        sb2.append(this.f881c);
        sb2.append(", searchX=");
        return C22026a.c(sb2, this.f882d, ')');
    }
}
