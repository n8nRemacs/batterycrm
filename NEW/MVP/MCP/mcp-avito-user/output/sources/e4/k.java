package E4;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsStrOptimalPriceItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f3739a;

    public k(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f3739a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f3739a.get());
    }
}
