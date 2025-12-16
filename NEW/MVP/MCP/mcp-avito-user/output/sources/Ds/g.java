package Ds;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.credits.models.CreditCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditBrokerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDs/g;", "", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Uri f3515a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CreditCalculator.Type f3516b;

    public g(@l Uri uri, @k CreditCalculator.Type type) {
        this.f3515a = uri;
        this.f3516b = type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f3515a, gVar.f3515a) && this.f3516b == gVar.f3516b;
    }

    public final int hashCode() {
        Uri uri = this.f3515a;
        return this.f3516b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "CreditPartnerScreenData(uri=" + this.f3515a + ", calculatorType=" + this.f3516b + ')';
    }
}
