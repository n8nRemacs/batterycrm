package RF0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateOption.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/b;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f14207a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f14208b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f14209c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f14210d;

    public b(@Y61.k a aVar, @Y61.k a aVar2, @Y61.k a aVar3, @Y61.k a aVar4) {
        this.f14207a = aVar;
        this.f14208b = aVar2;
        this.f14209c = aVar3;
        this.f14210d = aVar4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f14207a, bVar.f14207a) && L.f(this.f14208b, bVar.f14208b) && L.f(this.f14209c, bVar.f14209c) && L.f(this.f14210d, bVar.f14210d);
    }

    public final int hashCode() {
        return this.f14210d.hashCode() + ((this.f14209c.hashCode() + ((this.f14208b.hashCode() + (this.f14207a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "DateRangeOptionsFormat(equal=" + this.f14207a + ", other=" + this.f14208b + ", sameMonth=" + this.f14209c + ", sameYear=" + this.f14210d + ')';
    }
}
