package com.avito.android.favorite;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.favorite.AbstractC30569c;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pC.C46930a;

/* compiled from: FavoriteAdvertsEventInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/e;", "Lcom/avito/android/favorite/d;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30571e implements InterfaceC30570d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f155182a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f155183b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f155184c = new com.jakewharton.rxrelay3.c();

    @Inject
    public C30571e(@Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f155182a = e12;
        this.f155183b = interfaceC28373a;
    }

    @Override // com.avito.android.favorite.InterfaceC30570d
    public final void a(@Y61.k AbstractC30569c abstractC30569c) {
        this.f155184c.accept(abstractC30569c);
        boolean z12 = abstractC30569c instanceof AbstractC30569c.a;
        com.avito.android.account.E e12 = this.f155182a;
        InterfaceC28373a interfaceC28373a = this.f155183b;
        if (z12) {
            AbstractC30569c.a aVar = (AbstractC30569c.a) abstractC30569c;
            boolean zB2 = e12.b();
            AbstractC30567a abstractC30567a = aVar.f155168b;
            interfaceC28373a.c(new C46930a(aVar.f155167a, aVar.f155170d, zB2, abstractC30567a.f155165a, abstractC30567a.f155166b, aVar.f155171e, aVar.f155172f, 0, aVar.f155173g, aVar.f155174h, aVar.f155175i, aVar.f155176j, 128, null));
            interfaceC28373a.c(new pC.c(aVar.f155169c, aVar.f155170d));
            return;
        }
        if (abstractC30569c instanceof AbstractC30569c.b) {
            AbstractC30569c.b bVar = (AbstractC30569c.b) abstractC30569c;
            for (String str : bVar.f155177a) {
                boolean zB3 = e12.b();
                AbstractC30567a abstractC30567a2 = bVar.f155178b;
                interfaceC28373a.c(new pC.d(str, abstractC30567a2.f155165a, abstractC30567a2.f155166b, bVar.f155179c, bVar.f155180d, bVar.f155181e, zB3));
            }
        }
    }

    @Override // com.avito.android.favorite.InterfaceC30573g
    @Y61.k
    public final AbstractC41777j<AbstractC30569c> c() {
        com.jakewharton.rxrelay3.c cVar = this.f155184c;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).G0(BackpressureStrategy.f401953b);
    }
}
