package com.avito.android.favorites.adapter.promo;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.remote.model.ParametrizedEvent;
import hc.C40911a;
import hc.C40912b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesPromoAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/b;", "Lcom/avito/android/favorites/adapter/promo/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f156655a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f156655a = interfaceC28373a;
    }

    @Override // com.avito.android.favorites.adapter.promo.a
    public final void O(@Y61.k ParametrizedEvent parametrizedEvent) {
        this.f156655a.c(a0.a(parametrizedEvent));
    }

    @Override // com.avito.android.favorites.adapter.promo.a
    public final void a(@Y61.l String str) {
        if (L.f(str, "autoSelectPromoWidget")) {
            C40911a.f397284g.getClass();
            this.f156655a.c(new C40911a(FromPage.f90016f, str, null, "promo_banner", 4, null));
        }
    }

    @Override // com.avito.android.favorites.adapter.promo.a
    public final void b(@Y61.l String str) {
        if (L.f(str, "autoSelectPromoWidget")) {
            C40912b.f397290g.getClass();
            this.f156655a.c(new C40912b(null, FromPage.f90016f, str, "promo_banner", 1, null));
        }
    }
}
