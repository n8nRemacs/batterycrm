package DJ0;

import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import com.avito.android.user_favorites.di.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemsTabModule_ProvideTabBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3155b;

    public b(a aVar, k kVar) {
        this.f3154a = aVar;
        this.f3155b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FavoritesSpace favoritesSpace = (FavoritesSpace) this.f3155b.get();
        this.f3154a.getClass();
        return new CJ0.a(favoritesSpace);
    }
}
