package GJ0;

import com.avito.android.user_favorites.adapter.FavoritesTab;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellersTabModule_ProvideTabBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f6441a;

    public b(a aVar) {
        this.f6441a = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f6441a.getClass();
        return new com.avito.android.user_favorites.adapter.sellers.a();
    }
}
