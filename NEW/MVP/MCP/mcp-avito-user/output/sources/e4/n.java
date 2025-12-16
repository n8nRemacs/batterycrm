package E4;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTravelPaymentTogglesItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f3741a;

    public n(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f3741a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f3741a.get());
    }
}
