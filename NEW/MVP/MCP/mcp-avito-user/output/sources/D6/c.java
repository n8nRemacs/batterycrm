package D6;

import com.avito.android.advert.item.similars.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsReviewsConverterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f2933a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<VD.b> f2934b;

    public c(Provider<j> provider, Provider<VD.b> provider2) {
        this.f2933a = provider;
        this.f2934b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f2933a.get(), this.f2934b.get());
    }
}
