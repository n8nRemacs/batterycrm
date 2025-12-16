package sH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/h;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437588a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f437589b;

    public h(@k String str, @k DeepLink deepLink) {
        this.f437588a = str;
        this.f437589b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f437588a, hVar.f437588a) && L.f(this.f437589b, hVar.f437589b);
    }

    public final int hashCode() {
        return this.f437589b.hashCode() + (this.f437588a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PrimaryButton(title=");
        sb2.append(this.f437588a);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f437589b, ')');
    }
}
