package ZO0;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/g;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Color f20144a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Color f20145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f20146c;

    public g(@Y61.l Color color, @Y61.l Color color2, @Y61.l String str) {
        this.f20144a = color;
        this.f20145b = color2;
        this.f20146c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f20144a, gVar.f20144a) && L.f(this.f20145b, gVar.f20145b) && L.f(this.f20146c, gVar.f20146c);
    }

    public final int hashCode() {
        Color color = this.f20144a;
        int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
        Color color2 = this.f20145b;
        int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
        String str = this.f20146c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPagePromoBannerBackgroundColor(valueLight=");
        sb2.append(this.f20144a);
        sb2.append(", valueDark=");
        sb2.append(this.f20145b);
        sb2.append(", valueName=");
        return C22026a.c(sb2, this.f20146c, ')');
    }
}
