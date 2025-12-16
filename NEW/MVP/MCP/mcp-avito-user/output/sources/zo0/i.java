package ZO0;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/i;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f20150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20151b;

    public i(int i12, int i13) {
        this.f20150a = i12;
        this.f20151b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20150a == iVar.f20150a && this.f20151b == iVar.f20151b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20151b) + (Integer.hashCode(this.f20150a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPagePromoBannerIconSize(height=");
        sb2.append(this.f20150a);
        sb2.append(", width=");
        return r.t(sb2, this.f20151b, ')');
    }
}
