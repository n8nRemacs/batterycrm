package ZC;

import J81.o;
import J81.t;
import J81.u;
import J81.y;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.offlinization.n;
import com.avito.android.remote.model.AdvertCollectionListResult;
import com.avito.android.remote.model.CollectionLink;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.remote.model.FavoritesResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FavoritesCoroutinesApi.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001Jf\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0010J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0010J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\b\b\u0001\u0010\u001e\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b \u0010\u0010J6\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LZC/f;", "", "", "collectionId", "token", "", "", "selectedCategoryId", "selectedOrderId", "fromPage", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/FavoritesResult;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextPage", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/FavoriteItemsWidgets;", "e", "Lcom/avito/android/remote/model/CollectionLink;", "h", "", "collectionIds", "a", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onlyUserCollections", "Lcom/avito/android/remote/model/AdvertCollectionListResult;", "b", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "Lcom/avito/android/remote/model/CreateAdvertCollectionResult;", "d", "g", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface f {

    /* compiled from: FavoritesCoroutinesApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @o("1/favorites/collections/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @l
    Object a(@J81.c("ids") @k List<String> list, @J81.c("fromPage") @l String str, @k Continuation<? super TypedResult<Object>> continuation);

    @J81.f("1/favorites/collections/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object b(@t("isOnlyUserCollections") boolean z12, @k Continuation<? super TypedResult<AdvertCollectionListResult>> continuation);

    @C(timeoutMs = 3000)
    @J81.f("3/favorites/items/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.k({"X-Geo-required: true"})
    @l
    Object c(@l @t("collection") String str, @com.avito.android.offlinization.k @l @t("token") String str2, @u @k @n(excludeQuery = {"isAutotekaAppInstalled"}, excludeQueryIfDefault = {@com.avito.android.offlinization.o(key = "0", name = "categoryId"), @com.avito.android.offlinization.o(key = "added_at_desc", name = "order")}) Map<String, Integer> map, @u @k @n(excludeQuery = {"isAutotekaAppInstalled"}, excludeQueryIfDefault = {@com.avito.android.offlinization.o(key = "0", name = "categoryId"), @com.avito.android.offlinization.o(key = "added_at_desc", name = "order")}) Map<String, String> map2, @l @t("fromPage") String str3, @k Continuation<? super TypedResult<FavoritesResult>> continuation);

    @o("1/favorites/collections/create")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @l
    Object d(@J81.c("name") @k String str, @J81.c("fromPage") @l String str2, @k Continuation<? super TypedResult<CreateAdvertCollectionResult>> continuation);

    @J81.f("2/favorites/items/widgets")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object e(@l @t("collection") String str, @l @t("token") String str2, @k Continuation<? super TypedResult<FavoriteItemsWidgets>> continuation);

    @J81.f
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.k({"X-Geo-required: true"})
    @l
    Object f(@y @k String str, @l @t("fromPage") String str2, @k Continuation<? super TypedResult<FavoritesResult>> continuation);

    @o("1/favorites/items/move")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @l
    Object g(@J81.c("collection") @k String str, @J81.d @k Map<String, String> map, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/favorites/collections/share")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @l
    Object h(@J81.c("collection") @k String str, @J81.c("token") @l String str2, @k Continuation<? super TypedResult<CollectionLink>> continuation);
}
