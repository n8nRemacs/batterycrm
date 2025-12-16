package bs0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellersCarouselWidgetModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.b f57498a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.b f57499b;

    public e(com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.b bVar, com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.b bVar2) {
        this.f57498a = bVar;
        this.f57499b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.a aVar = (com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.a) this.f57498a.get();
        com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.a aVar2 = (com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.a) this.f57499b.get();
        d.f57497a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
