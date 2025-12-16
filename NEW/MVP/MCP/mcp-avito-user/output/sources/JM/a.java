package JM;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesAnalyticsData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJM/a;", "", "_avito_important-addresses_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f8923a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f8924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f8925c;

    public a(@l String str, @k String str2, @k String str3) {
        this.f8923a = str;
        this.f8924b = str2;
        this.f8925c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f8923a, aVar.f8923a) && L.f(this.f8924b, aVar.f8924b) && L.f(this.f8925c, aVar.f8925c);
    }

    public final int hashCode() {
        String str = this.f8923a;
        return this.f8925c.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f8924b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantAddressesAnalyticsData(microCategoryId=");
        sb2.append(this.f8923a);
        sb2.append(", fromPage=");
        sb2.append(this.f8924b);
        sb2.append(", iid=");
        return C22026a.c(sb2, this.f8925c, ')');
    }
}
