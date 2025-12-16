package sH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/j;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437592a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f437593b;

    public j(@k String str, @l DeepLink deepLink) {
        this.f437592a = str;
        this.f437593b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f437592a, jVar.f437592a) && L.f(this.f437593b, jVar.f437593b);
    }

    public final int hashCode() {
        int iHashCode = this.f437592a.hashCode() * 31;
        DeepLink deepLink = this.f437593b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToastInfo(title=");
        sb2.append(this.f437592a);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f437593b, ')');
    }
}
