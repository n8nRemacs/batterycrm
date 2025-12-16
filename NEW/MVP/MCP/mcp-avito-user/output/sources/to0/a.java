package TO0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailsListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTO0/a;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15636a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15637b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f15638c;

    public a(@k String str, @k String str2, @l DeepLink deepLink) {
        this.f15636a = str;
        this.f15637b = str2;
        this.f15638c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f15636a, aVar.f15636a) && L.f(this.f15637b, aVar.f15637b) && L.f(this.f15638c, aVar.f15638c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f15636a.hashCode() * 31, 31, this.f15637b);
        DeepLink deepLink = this.f15638c;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsListItem(leftText=");
        sb2.append(this.f15636a);
        sb2.append(", rightText=");
        sb2.append(this.f15637b);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f15638c, ')');
    }

    public /* synthetic */ a(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : deepLink);
    }
}
