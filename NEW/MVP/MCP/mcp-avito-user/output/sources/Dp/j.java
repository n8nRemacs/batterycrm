package dp;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedPagingDto.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldp/j;", "T", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class j<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k<T> f394071a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f394072b;

    public j(@Y61.k k<T> kVar, @Y61.l DeepLink deepLink) {
        this.f394071a = kVar;
        this.f394072b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f394071a, jVar.f394071a) && L.f(this.f394072b, jVar.f394072b);
    }

    public final int hashCode() {
        int iHashCode = this.f394071a.hashCode() * 31;
        DeepLink deepLink = this.f394072b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedPagingDto(pagingDto=");
        sb2.append(this.f394071a);
        sb2.append(", mortgageEntryPoint=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f394072b, ')');
    }

    public /* synthetic */ j(k kVar, DeepLink deepLink, int i12, C42822w c42822w) {
        this(kVar, (i12 & 2) != 0 ? null : deepLink);
    }
}
