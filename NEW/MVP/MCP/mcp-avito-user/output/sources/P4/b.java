package P4;

import com.avito.android.advert.item.similars.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingAdvantagesBlockItemFactory_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.branding_advantages.block_element.factory.b f12813a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f12814b;

    public b(com.avito.android.advert.item.branding_advantages.block_element.factory.b bVar, Provider provider) {
        this.f12813a = bVar;
        this.f12814b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f12813a.getClass();
        return new a(new com.avito.android.advert.item.branding_advantages.block_element.factory.a(), this.f12814b.get());
    }
}
