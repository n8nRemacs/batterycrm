package EJ0;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.lib.deprecated_design.tab.b;
import com.avito.android.search.subscriptions.SearchSubscriptionFragment;
import com.avito.android.search.subscriptions.SearchSubscriptionFragmentParams;
import com.avito.android.user_favorites.adapter.search.SearchTab;
import kotlin.Metadata;

/* compiled from: SearchTabBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LEJ0/a;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Lcom/avito/android/user_favorites/adapter/search/SearchTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements b<SearchTab> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FavoritesSpace f3930a;

    public a(@k FavoritesSpace favoritesSpace) {
        this.f3930a = favoritesSpace;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    @l
    public final Fragment a(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        SearchSubscriptionFragment.a aVar2 = SearchSubscriptionFragment.f263838v0;
        SearchSubscriptionFragmentParams searchSubscriptionFragmentParams = new SearchSubscriptionFragmentParams(this.f3930a);
        aVar2.getClass();
        SearchSubscriptionFragment searchSubscriptionFragment = new SearchSubscriptionFragment();
        searchSubscriptionFragment.f263846t0.setValue(searchSubscriptionFragment, SearchSubscriptionFragment.f263839w0[0], searchSubscriptionFragmentParams);
        return searchSubscriptionFragment;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof SearchTab;
    }
}
