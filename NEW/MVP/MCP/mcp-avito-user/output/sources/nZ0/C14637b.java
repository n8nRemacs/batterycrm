package Nz0;

import com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink;
import com.avito.android.str_seller_orders_calendar.navigation.c;
import com.avito.android.str_seller_orders_calendar.navigation.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrOrdersCalendarLinkHandlerModule_ProvideDeeplinkHandlerFactory.java */
@e
@y
@x
/* renamed from: Nz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14637b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14636a f11892a;

    /* renamed from: b, reason: collision with root package name */
    public final d f11893b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.navigation.b f11894c;

    public C14637b(C14636a c14636a, d dVar, com.avito.android.str_seller_orders_calendar.navigation.b bVar) {
        this.f11892a = c14636a;
        this.f11893b = dVar;
        this.f11894c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f11893b.getClass();
        c cVar = new c();
        this.f11892a.getClass();
        return new C43834a(StrOrdersCalendarLink.class, cVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrOrdersCalendarLink.class), this.f11894c));
    }
}
