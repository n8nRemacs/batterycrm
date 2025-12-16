package o6;

import android.os.Bundle;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.advert.item.preload.d;
import com.avito.android.advert.item.preload.f;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.preloading.j;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPreloadModule_PreloadingPromiseFactory.java */
@e
@y
@x
/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C44592b implements h<j<f, AdvertDetailsWithMeta>> {

    /* renamed from: a, reason: collision with root package name */
    public final C44591a f419389a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.preload.e f419390b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f419391c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f419392d;

    /* renamed from: e, reason: collision with root package name */
    public final l f419393e;

    public C44592b(C44591a c44591a, com.avito.android.advert.item.preload.e eVar, Provider provider, Provider provider2, l lVar) {
        this.f419389a = c44591a;
        this.f419390b = eVar;
        this.f419391c = provider;
        this.f419392d = provider2;
        this.f419393e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f419390b.get();
        C c12 = this.f419391c.get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = this.f419392d.get();
        Bundle bundle = (Bundle) this.f419393e.f393949a;
        this.f419389a.getClass();
        if (!preloadingPromiseTestGroup.a()) {
            return new com.avito.android.preloading.c();
        }
        boolean z12 = (bundle != null ? (AdvertDetailsWithMeta) bundle.getParcelable("advertItem") : null) == null;
        j.a aVar = j.f221853g;
        f fVar = new f(null, null, 3, null);
        aVar.getClass();
        return z12 ? new com.avito.android.preloading.a(fVar, dVar, c12) : new com.avito.android.preloading.b(dVar, c12);
    }
}
