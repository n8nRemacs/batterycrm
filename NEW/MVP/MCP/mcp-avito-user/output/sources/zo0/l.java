package ZO0;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/l;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f20156a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f20157b;

    public l(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f20156a = str;
        this.f20157b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f20156a, lVar.f20156a) && L.f(this.f20157b, lVar.f20157b);
    }

    public final int hashCode() {
        return this.f20157b.hashCode() + (this.f20156a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPageTopUpAction(title=");
        sb2.append(this.f20156a);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f20157b, ')');
    }
}
