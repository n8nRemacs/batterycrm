package E4;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsStrNeighboringDatesItemFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f3737b;

    public h(Provider<com.avito.android.advert.item.similars.j> provider, Provider<com.avito.android.deep_linking.x> provider2) {
        this.f3736a = provider;
        this.f3737b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f3736a.get(), dagger.internal.g.b(this.f3737b));
    }
}
