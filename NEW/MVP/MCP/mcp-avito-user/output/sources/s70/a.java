package S70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OnGroupClickEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS70/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f14823b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f14824c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f14825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f14826e;

    public a(long j12, @l String str, @k String str2) {
        this.f14823b = j12;
        this.f14824c = str;
        this.f14825d = str2;
        d dVar = new d();
        dVar.put("button_name", str2);
        dVar.put("iid", Long.valueOf(j12));
        if (str != null) {
            dVar.put("x", str);
        }
        this.f14826e = new ParametrizedClickStreamEvent(16618, 1, "new_gallery_grouped_click_mobile", dVar.b());
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14823b == aVar.f14823b && L.f(this.f14824c, aVar.f14824c) && L.f(this.f14825d, aVar.f14825d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f14826e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f14826e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f14826e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f14823b) * 31;
        String str = this.f14824c;
        return this.f14825d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnGroupClickEvent(advertId=");
        sb2.append(this.f14823b);
        sb2.append(", searchX=");
        sb2.append(this.f14824c);
        sb2.append(", groupTitle=");
        return C22026a.c(sb2, this.f14825d, ')');
    }
}
