package L4;

import com.avito.android.advert.item.similars.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBrandingGalleryBlockItemFactory_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.brandingGallery.items.factory.b f9773a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f9774b;

    public b(com.avito.android.advert.item.brandingGallery.items.factory.b bVar, Provider provider) {
        this.f9773a = bVar;
        this.f9774b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f9773a.getClass();
        return new a(new com.avito.android.advert.item.brandingGallery.items.factory.a(), this.f9774b.get());
    }
}
