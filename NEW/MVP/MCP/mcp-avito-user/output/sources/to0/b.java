package TO0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReceiptButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTO0/b;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15639a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UO0.c f15640b;

    public b(@k String str, @k UO0.c cVar) {
        this.f15639a = str;
        this.f15640b = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f15639a, bVar.f15639a) && L.f(this.f15640b, bVar.f15640b);
    }

    public final int hashCode() {
        return this.f15640b.hashCode() + (this.f15639a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ReceiptButton(title=" + this.f15639a + ", receipt=" + this.f15640b + ')';
    }
}
