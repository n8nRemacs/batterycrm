package xv;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import com.avito.android.delivery.DeliveryFlowPaymentStatus;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxv/g;", "LJu/c$b;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g implements InterfaceC14249c.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeliveryFlowPaymentStatus f442694b;

    public g(@k DeliveryFlowPaymentStatus deliveryFlowPaymentStatus) {
        this.f442694b = deliveryFlowPaymentStatus;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f442694b == ((g) obj).f442694b;
    }

    public final int hashCode() {
        return this.f442694b.hashCode();
    }

    @k
    public final String toString() {
        return "UniversalDeliveryTypeDeeplinkResult(paymentStatus=" + this.f442694b + ')';
    }
}
