package F4;

import com.avito.android.advert.item.similars.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTravelPriceFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f4532a;

    public c(Provider<j> provider) {
        this.f4532a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f4532a.get());
    }
}
