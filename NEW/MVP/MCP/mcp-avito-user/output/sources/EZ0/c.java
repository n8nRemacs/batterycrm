package Ez0;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersRangeIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<com.avito.android.str_seller_orders.strsellerordersrange.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f4466a;

    public c(l lVar) {
        this.f4466a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.str_seller_orders.strsellerordersrange.a((Application) this.f4466a.f393949a);
    }
}
