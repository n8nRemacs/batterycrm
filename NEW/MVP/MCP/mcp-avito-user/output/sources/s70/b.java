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

/* compiled from: OpenFullScreenGalleryEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS70/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f14827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14828c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f14829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f14830e;

    public b(long j12, int i12, @l String str) {
        this.f14827b = j12;
        this.f14828c = i12;
        this.f14829d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("iid", Long.valueOf(j12));
        linkedHashMap.put("position", Integer.valueOf(i12));
        if (str != null) {
            linkedHashMap.put("x", str);
        }
        this.f14830e = new ParametrizedClickStreamEvent(16124, 1, "travel_new_gallery_item_click", linkedHashMap);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14827b == bVar.f14827b && this.f14828c == bVar.f14828c && L.f(this.f14829d, bVar.f14829d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f14830e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f14830e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f14830e.f90248c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f14828c, Long.hashCode(this.f14827b) * 31, 31);
        String str = this.f14829d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenFullScreenGalleryEvent(advertId=");
        sb2.append(this.f14827b);
        sb2.append(", position=");
        sb2.append(this.f14828c);
        sb2.append(", searchX=");
        return C22026a.c(sb2, this.f14829d, ')');
    }
}
