package C4;

import com.avito.android.advert.item.similars.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDividerItemFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f1903a;

    public b(Provider<j> provider) {
        this.f1903a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f1903a.get());
    }
}
