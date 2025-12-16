package Y60;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY60/a;", "", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f19305a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19306b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f19307c;

    public a(@l String str, @k String str2, @l String str3) {
        this.f19305a = str;
        this.f19306b = str2;
        this.f19307c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f19305a, aVar.f19305a) && L.f(this.f19306b, aVar.f19306b) && L.f(this.f19307c, aVar.f19307c);
    }

    public final int hashCode() {
        String str = this.f19305a;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f19306b);
        String str2 = this.f19307c;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerRequest(userSegment=");
        sb2.append(this.f19305a);
        sb2.append(", bannerPlacement=");
        sb2.append(this.f19306b);
        sb2.append(", bannerContext=");
        return C22026a.c(sb2, this.f19307c, ')');
    }
}
