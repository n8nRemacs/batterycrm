package ZO0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/j;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f20152a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f20153b;

    public j(@Y61.l String str, @Y61.k String str2) {
        this.f20152a = str;
        this.f20153b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f20152a, jVar.f20152a) && L.f(this.f20153b, jVar.f20153b);
    }

    public final int hashCode() {
        String str = this.f20152a;
        return this.f20153b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPagePromoBannerLocalImage(color=");
        sb2.append(this.f20152a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f20153b, ')');
    }
}
