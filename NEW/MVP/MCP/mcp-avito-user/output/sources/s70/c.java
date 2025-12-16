package S70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserLeftGridGalleryEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS70/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f14831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14832c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f14833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f14834e;

    public c(long j12, int i12, @l String str) {
        this.f14831b = j12;
        this.f14832c = i12;
        this.f14833d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("iid", Long.valueOf(j12));
        linkedHashMap.put("position", Integer.valueOf(i12));
        if (str != null) {
            linkedHashMap.put("x", str);
        }
        this.f14834e = new ParametrizedClickStreamEvent(16192, 1, "travel_new_gallery_item_doskroll", linkedHashMap);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14831b == cVar.f14831b && this.f14832c == cVar.f14832c && L.f(this.f14833d, cVar.f14833d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f14834e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f14834e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f14834e.f90248c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f14832c, Long.hashCode(this.f14831b) * 31, 31);
        String str = this.f14833d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserLeftGridGalleryEvent(advertId=");
        sb2.append(this.f14831b);
        sb2.append(", position=");
        sb2.append(this.f14832c);
        sb2.append(", searchX=");
        return C22026a.c(sb2, this.f14833d, ')');
    }
}
