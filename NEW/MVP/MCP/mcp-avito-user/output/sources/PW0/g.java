package pw0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/g;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final List<rw0.j> f428875a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final rw0.j f428876b;

    public g(@Y61.l List<rw0.j> list, @Y61.l rw0.j jVar) {
        this.f428875a = list;
        this.f428876b = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f428875a, gVar.f428875a) && L.f(this.f428876b, gVar.f428876b);
    }

    public final int hashCode() {
        List<rw0.j> list = this.f428875a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        rw0.j jVar = this.f428876b;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PaymentData(payments=" + this.f428875a + ", selectedPayment=" + this.f428876b + ')';
    }
}
