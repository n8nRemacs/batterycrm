package sH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPaymentSignResult.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/c;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeepLink f437575a;

    public c(@k DeepLink deepLink) {
        this.f437575a = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f437575a, ((c) obj).f437575a);
    }

    public final int hashCode() {
        return this.f437575a.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("MotivationPaymentSignResult(deeplink="), this.f437575a, ')');
    }
}
