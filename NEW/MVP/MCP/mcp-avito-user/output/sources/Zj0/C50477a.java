package zJ0;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.advert_collection_list.AdvertCollectionListFragment;
import com.avito.android.lib.deprecated_design.tab.b;
import com.avito.android.user_favorites.adapter.collection_list.CollectionListTab;
import kotlin.Metadata;

/* compiled from: CollectionListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LzJ0/a;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Lcom/avito/android/user_favorites/adapter/collection_list/CollectionListTab;", "<init>", "()V", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zJ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50477a implements b<CollectionListTab> {
    @Override // com.avito.android.lib.deprecated_design.tab.b
    @l
    public final Fragment a(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return new AdvertCollectionListFragment();
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof CollectionListTab;
    }
}
