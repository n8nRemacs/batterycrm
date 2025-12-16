package en0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CloseGalleryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Len0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: en0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40134a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395359b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f395360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395361d;

    public C40134a(@l String str, @l String str2) {
        this.f395359b = str;
        this.f395360c = str2;
        this.f395361d = new ParametrizedClickStreamEvent(11172, 0, "Закрытие расхлопа галереи по крестику или свайпу", C35755b0.c(P0.g(new Q("uid", str), new Q("item_id", str2))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40134a)) {
            return false;
        }
        C40134a c40134a = (C40134a) obj;
        return L.f(this.f395359b, c40134a.f395359b) && L.f(this.f395360c, c40134a.f395360c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f395361d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f395361d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f395361d.f90248c;
    }

    public final int hashCode() {
        String str = this.f395359b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f395360c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseGalleryEvent(userId=");
        sb2.append(this.f395359b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f395360c, ')');
    }
}
