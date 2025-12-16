package ZO0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/d;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f20130a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f20131b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f20132c;

    public d(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f20130a = str;
        this.f20131b = str2;
        this.f20132c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f20130a, dVar.f20130a) && L.f(this.f20131b, dVar.f20131b) && L.f(this.f20132c, dVar.f20132c);
    }

    public final int hashCode() {
        int iHashCode = this.f20130a.hashCode() * 31;
        String str = this.f20131b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20132c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPageMoney(balance=");
        sb2.append(this.f20130a);
        sb2.append(", title=");
        sb2.append(this.f20131b);
        sb2.append(", textStyle=");
        return C22026a.c(sb2, this.f20132c, ')');
    }
}
