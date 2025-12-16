package RF0;

import androidx.compose.runtime.C22026a;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateOption.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/d;", "LRF0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f14211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f14212c;

    public d(@Y61.l String str, @Y61.l String str2) {
        this.f14211b = str;
        this.f14212c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f14211b, dVar.f14211b) && L.f(this.f14212c, dVar.f14212c);
    }

    public final int hashCode() {
        String str = this.f14211b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14212c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // Y41.p
    public final String invoke(String str, LocalDate localDate) {
        return cG0.d.b(str, this.f14211b, null, this.f14212c, null, localDate, null);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedTitleFormatterImpl(placeholder=");
        sb2.append(this.f14211b);
        sb2.append(", format=");
        return C22026a.c(sb2, this.f14212c, ')');
    }
}
