package W60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerFeatureParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW60/a;", "", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17749a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f17750b;

    public a(@k String str, @k String str2) {
        this.f17749a = str;
        this.f17750b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f17749a, aVar.f17749a) && L.f(this.f17750b, aVar.f17750b);
    }

    public final int hashCode() {
        return this.f17750b.hashCode() + (this.f17749a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerFeatureParams(bannerPlacement=");
        sb2.append(this.f17749a);
        sb2.append(", featureName=");
        return C22026a.c(sb2, this.f17750b, ')');
    }
}
