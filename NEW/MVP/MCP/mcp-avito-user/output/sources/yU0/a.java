package YU0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYU0/a;", "", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f19482b;

    public a(@k String str, @k b bVar) {
        this.f19481a = str;
        this.f19482b = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f19481a, aVar.f19481a) && L.f(this.f19482b, aVar.f19482b);
    }

    public final int hashCode() {
        return this.f19482b.hashCode() + (this.f19481a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "CartItem(itemId=" + this.f19481a + ", itemInfo=" + this.f19482b + ')';
    }
}
