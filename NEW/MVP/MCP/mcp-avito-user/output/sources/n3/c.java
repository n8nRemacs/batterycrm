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

/* compiled from: ShowGalleryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN3/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f11178b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f11179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11180d;

    public c(@l String str, @l String str2) {
        this.f11178b = str;
        this.f11179c = str2;
        this.f11180d = new ParametrizedClickStreamEvent(11170, 1, "Показ блока галереи отзывов на карточке айтема и в отзывах", C35755b0.c(P0.g(new Q("uid", str), new Q("item_id", str2))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11178b, cVar.f11178b) && L.f(this.f11179c, cVar.f11179c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f11180d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11180d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f11180d.f90248c;
    }

    public final int hashCode() {
        String str = this.f11178b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11179c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowGalleryEvent(userId=");
        sb2.append(this.f11178b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f11179c, ')');
    }
}
