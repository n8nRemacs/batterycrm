package IJ0;

import com.avito.android.user_favorites.adapter.FavoritesTab;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ViewedTabModule_ProvideViewedTabBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f8120a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_viewed.b> f8121b;

    public b(a aVar, Provider<com.avito.android.user_viewed.b> provider) {
        this.f8120a = aVar;
        this.f8121b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.user_viewed.b bVar = this.f8121b.get();
        this.f8120a.getClass();
        return new HJ0.a(bVar);
    }
}
