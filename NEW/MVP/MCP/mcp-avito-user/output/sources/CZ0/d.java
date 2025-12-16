package cz0;

import com.avito.android.str_seller_orders.navigation.f;
import com.avito.android.str_seller_orders.strsellerordersrange.StrOrdersRangeDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrOrdersDeeplinkHandlerModule_ProvideStrOrdersRangeDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C39439a f393102a;

    /* renamed from: b, reason: collision with root package name */
    public final f f393103b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.navigation.d f393104c;

    public d(C39439a c39439a, f fVar, com.avito.android.str_seller_orders.navigation.d dVar) {
        this.f393102a = c39439a;
        this.f393103b = fVar;
        this.f393104c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f393103b.getClass();
        com.avito.android.str_seller_orders.navigation.e eVar = new com.avito.android.str_seller_orders.navigation.e();
        this.f393102a.getClass();
        return new C43834a(StrOrdersRangeDeeplink.class, eVar, new C43834a.b.C11809b(this.f393104c));
    }
}
