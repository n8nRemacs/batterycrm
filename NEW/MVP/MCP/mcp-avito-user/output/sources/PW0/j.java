package pw0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import lj.InterfaceC43779a;

/* compiled from: PromoData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/j;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final InterfaceC43779a f428882a;

    public j(@Y61.l InterfaceC43779a interfaceC43779a) {
        this.f428882a = interfaceC43779a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f428882a, ((j) obj).f428882a);
    }

    public final int hashCode() {
        InterfaceC43779a interfaceC43779a = this.f428882a;
        if (interfaceC43779a == null) {
            return 0;
        }
        return interfaceC43779a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "PromoData(componentsForm=" + this.f428882a + ')';
    }
}
