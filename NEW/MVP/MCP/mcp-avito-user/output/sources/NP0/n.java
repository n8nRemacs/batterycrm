package NP0;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/n;", "LNP0/o;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f11505a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f11506b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f11507c;

    public n(@Y61.l String str, @Y61.l String str2, @Y61.k Map<String, String> map) {
        this.f11505a = str;
        this.f11506b = str2;
        this.f11507c = map;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f11505a, nVar.f11505a) && L.f(this.f11506b, nVar.f11506b) && L.f(this.f11507c, nVar.f11507c);
    }

    public final int hashCode() {
        String str = this.f11505a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11506b;
        return this.f11507c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecentSearch(locationName=");
        sb2.append(this.f11505a);
        sb2.append(", title=");
        sb2.append(this.f11506b);
        sb2.append(", params=");
        return androidx.appcompat.app.r.w(sb2, this.f11507c, ')');
    }
}
