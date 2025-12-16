package FJ0;

import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import com.avito.android.user_favorites.di.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchTabModule_ProvideTabBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4671a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4672b;

    public b(a aVar, k kVar) {
        this.f4671a = aVar;
        this.f4672b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FavoritesSpace favoritesSpace = (FavoritesSpace) this.f4672b.get();
        this.f4671a.getClass();
        return new EJ0.a(favoritesSpace);
    }
}
