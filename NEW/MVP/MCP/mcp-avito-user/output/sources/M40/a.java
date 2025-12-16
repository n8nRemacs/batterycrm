package M40;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mx0.InterfaceC44149a;

/* compiled from: OrderUpdateEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LM40/a;", "Lmx0/a;", "", "orderId", "", "isActionRequired", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "_avito_order_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements InterfaceC44149a {

    @c("isActionRequired")
    @l
    private final Boolean isActionRequired;

    @c("orderID")
    @k
    private final String orderId;

    public a(@k String str, @l Boolean bool) {
        this.orderId = str;
        this.isActionRequired = bool;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getIsActionRequired() {
        return this.isActionRequired;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.orderId, aVar.orderId) && L.f(this.isActionRequired, aVar.isActionRequired);
    }

    public final int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        Boolean bool = this.isActionRequired;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderUpdateEvent(orderId=");
        sb2.append(this.orderId);
        sb2.append(", isActionRequired=");
        return C0.g(sb2, this.isActionRequired, ')');
    }
}
