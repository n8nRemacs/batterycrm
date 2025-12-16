package E4;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShortTermRentStrButtonsItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f3732a;

    public f(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f3732a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f3732a.get());
    }
}
