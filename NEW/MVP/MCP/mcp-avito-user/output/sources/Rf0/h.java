package RF0;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoStrButtonAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/h;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f14239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f14240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f14241c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Boolean f14242d;

    public h(@Y61.k String str, @Y61.l DeepLink deepLink, @Y61.l String str2, @Y61.l Boolean bool) {
        this.f14239a = str;
        this.f14240b = deepLink;
        this.f14241c = str2;
        this.f14242d = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f14239a, hVar.f14239a) && L.f(this.f14240b, hVar.f14240b) && L.f(this.f14241c, hVar.f14241c) && L.f(this.f14242d, hVar.f14242d);
    }

    public final int hashCode() {
        int iHashCode = this.f14239a.hashCode() * 31;
        DeepLink deepLink = this.f14240b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f14241c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f14242d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoStrButtonAction(title=");
        sb2.append(this.f14239a);
        sb2.append(", deeplink=");
        sb2.append(this.f14240b);
        sb2.append(", style=");
        sb2.append(this.f14241c);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f14242d, ')');
    }

    public /* synthetic */ h(String str, DeepLink deepLink, String str2, Boolean bool, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : bool);
    }
}
