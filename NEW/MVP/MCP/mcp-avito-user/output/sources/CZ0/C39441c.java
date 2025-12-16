package cz0;

import com.avito.android.str_seller_orders.navigation.j;
import com.avito.android.str_seller_orders.navigation.k;
import com.avito.android.str_seller_orders.strsellerorders.StrOrdersSellerDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrOrdersDeeplinkHandlerModule_ProvideStrOrdersDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: cz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39441c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C39439a f393099a;

    /* renamed from: b, reason: collision with root package name */
    public final k f393100b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.navigation.h f393101c;

    public C39441c(C39439a c39439a, k kVar, com.avito.android.str_seller_orders.navigation.h hVar) {
        this.f393099a = c39439a;
        this.f393100b = kVar;
        this.f393101c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f393100b.getClass();
        j jVar = new j();
        this.f393099a.getClass();
        return new C43834a(StrOrdersSellerDeeplink.class, jVar, new C43834a.b.C11809b(this.f393101c));
    }
}
