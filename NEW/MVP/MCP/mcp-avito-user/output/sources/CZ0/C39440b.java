package cz0;

import com.avito.android.deep_linking.links.G;
import com.avito.android.deep_linking.links.H;
import com.avito.android.deep_linking.links.StrOrdersBuyerDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrOrdersDeeplinkHandlerModule_ProvideStrOrdersBuyerDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: cz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39440b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C39439a f393096a;

    /* renamed from: b, reason: collision with root package name */
    public final H f393097b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.navigation.b f393098c;

    public C39440b(C39439a c39439a, H h12, com.avito.android.str_seller_orders.navigation.b bVar) {
        this.f393096a = c39439a;
        this.f393097b = h12;
        this.f393098c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f393097b.getClass();
        G g12 = new G();
        com.avito.android.str_seller_orders.navigation.b bVar = this.f393098c;
        this.f393096a.getClass();
        return new C43834a(StrOrdersBuyerDeeplink.class, g12, new C43834a.b.C11809b(bVar));
    }
}
