package bV0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: CartTotalQuantity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbV0/a;", "", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bV0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C25569a {

    /* renamed from: a, reason: collision with root package name */
    public final int f57097a;

    public C25569a(int i12) {
        this.f57097a = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25569a) && this.f57097a == ((C25569a) obj).f57097a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57097a);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("CartTotalQuantity(quantity="), this.f57097a, ')');
    }
}
