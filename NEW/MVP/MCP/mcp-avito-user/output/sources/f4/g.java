package F4;

import com.avito.android.advert.item.similars.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTravelTrustItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f4535a;

    public g(Provider<j> provider) {
        this.f4535a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f4535a.get());
    }
}
