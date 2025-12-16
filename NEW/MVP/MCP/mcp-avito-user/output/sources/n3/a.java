package N3;

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

/* compiled from: OpenReviewGalleryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN3/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f11173b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f11174c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f11175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11176e;

    public a(@l String str, @l String str2, @k String str3) {
        this.f11173b = str;
        this.f11174c = str2;
        this.f11175d = str3;
        this.f11176e = new ParametrizedClickStreamEvent(11171, 2, "Тап на фото в блоке галереи и открытие расхлопа", C35755b0.c(P0.g(new Q("uid", str), new Q("item_id", str2), new Q("from_source", str3))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f11173b, aVar.f11173b) && L.f(this.f11174c, aVar.f11174c) && L.f(this.f11175d, aVar.f11175d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f11176e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11176e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f11176e.f90248c;
    }

    public final int hashCode() {
        String str = this.f11173b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11174c;
        return this.f11175d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenReviewGalleryEvent(userId=");
        sb2.append(this.f11173b);
        sb2.append(", itemId=");
        sb2.append(this.f11174c);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f11175d, ')');
    }
}
