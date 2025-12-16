package ZO0;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/c;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f20126a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f20127b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f20128c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f20129d;

    public c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l DeepLink deepLink) {
        this.f20126a = str;
        this.f20127b = str2;
        this.f20128c = str3;
        this.f20129d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f20126a, cVar.f20126a) && L.f(this.f20127b, cVar.f20127b) && L.f(this.f20128c, cVar.f20128c) && L.f(this.f20129d, cVar.f20129d);
    }

    public final int hashCode() {
        int iHashCode = this.f20126a.hashCode() * 31;
        String str = this.f20127b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20128c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f20129d;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPageBonuses(balance=");
        sb2.append(this.f20126a);
        sb2.append(", title=");
        sb2.append(this.f20127b);
        sb2.append(", textStyle=");
        sb2.append(this.f20128c);
        sb2.append(", infoLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f20129d, ')');
    }
}
