package Ez0;

import com.avito.android.str_seller_orders.strsellerordersrange.mvi.i;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersRangeViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f4467a;

    public f(j jVar) {
        this.f4467a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f4467a.get(), null, 2, null);
    }
}
