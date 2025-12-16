package CJ0;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.favorites.FavoritesFragment;
import com.avito.android.favorites.FavoritesFragmentParams;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.lib.deprecated_design.tab.b;
import com.avito.android.user_favorites.adapter.items.ItemsTab;
import kotlin.Metadata;

/* compiled from: ItemsTabBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LCJ0/a;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Lcom/avito/android/user_favorites/adapter/items/ItemsTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements b<ItemsTab> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FavoritesSpace f2080a;

    public a(@k FavoritesSpace favoritesSpace) {
        this.f2080a = favoritesSpace;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    @l
    public final Fragment a(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        FavoritesFragment.a aVar2 = FavoritesFragment.f156217a1;
        FavoritesFragmentParams favoritesFragmentParams = new FavoritesFragmentParams(this.f2080a, ((ItemsTab) aVar).f316851i);
        aVar2.getClass();
        FavoritesFragment favoritesFragment = new FavoritesFragment();
        favoritesFragment.f156239U0.setValue(favoritesFragment, FavoritesFragment.f156218b1[0], favoritesFragmentParams);
        return favoritesFragment;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof ItemsTab;
    }
}
