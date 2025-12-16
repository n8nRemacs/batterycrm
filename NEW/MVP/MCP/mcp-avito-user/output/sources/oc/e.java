package oC;

import com.avito.android.favorite.w;
import com.avito.android.favorite.z;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.reflect.n;

/* compiled from: FavoriteStorageModule_ProvideFavoriteStorageFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<com.avito.android.favorite.x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f419584a;

    /* renamed from: b, reason: collision with root package name */
    public final f f419585b;

    /* renamed from: c, reason: collision with root package name */
    public final AD.c f419586c;

    public e(Provider provider, f fVar, AD.c cVar) {
        this.f419584a = provider;
        this.f419585b = fVar;
        this.f419586c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z zVar = this.f419584a.get();
        w wVar = (w) this.f419585b.get();
        AD.a aVar = (AD.a) this.f419586c.get();
        d.f419583a.getClass();
        n<Object> nVar = AD.a.f216k[2];
        return ((Boolean) aVar.f218c.a().invoke()).booleanValue() ? zVar : wVar;
    }
}
