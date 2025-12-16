package YU0;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CartItemInfo.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYU0/b;", "", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f19483a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f19484b;

    public b(int i12, @l Integer num) {
        this.f19483a = i12;
        this.f19484b = num;
    }

    @k
    public final A a(@k C36272i c36272i) {
        d dVar = new d();
        dVar.put("quantity", c36272i.c(this.f19483a));
        Integer num = this.f19484b;
        if (num != null) {
            dVar.put("maxQuantity", c36272i.c(num.intValue()));
        }
        return new A(new m(dVar.b()), null, 2, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19483a == bVar.f19483a && L.f(this.f19484b, bVar.f19484b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19483a) * 31;
        Integer num = this.f19484b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartItemInfo(quantity=");
        sb2.append(this.f19483a);
        sb2.append(", maxQuantity=");
        return s.j(sb2, this.f19484b, ')');
    }
}
