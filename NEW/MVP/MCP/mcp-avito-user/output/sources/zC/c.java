package ZC;

import J81.o;
import J81.t;
import J81.u;
import J81.y;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.offlinization.n;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.remote.model.FavoritesRemoveAdvertResponse;
import com.avito.android.remote.model.FavoritesResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FavoritesApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\rJk\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\n2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJI\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\n2\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJI\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\n2\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"LZC/c;", "", "", "segment", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/FavoriteItemsWidgets;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "xHash", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/FavoritesRemoveAdvertResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "d", "", "", "selectedCategoryId", "selectedOrderId", "", "onlyActive", "query", "Lcom/avito/android/remote/model/FavoritesResult;", "g", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "nextPage", "c", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "ids", "fromPage", "e", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "f", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface c {
    @J81.f("2/favorites/items/widgets")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @k
    I<TypedResult<FavoriteItemsWidgets>> a(@l @t("segment") String segment);

    @o("1/favorites/items/clear")
    @J81.e
    @k
    z<FavoritesRemoveAdvertResponse> b(@J81.c("segment") @l String segment, @J81.c("x") @l String xHash);

    @J81.f
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.k({"X-Geo-required: true"})
    @k
    z<TypedResult<FavoritesResult>> c(@y @k String nextPage);

    @o("1/favorites/items/delete_inactive")
    @J81.e
    @k
    z<FavoritesRemoveAdvertResponse> d(@J81.c("segment") @l String segment, @J81.c("x") @l String xHash);

    @o("1/favorites/items/add")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @k
    z<TypedResult<Object>> e(@J81.d @k Map<String, String> ids, @J81.c("x") @l String xHash, @J81.c("fromPage") @l String fromPage);

    @o("1/favorites/items/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @k
    z<TypedResult<Object>> f(@J81.d @k Map<String, String> ids, @J81.c("x") @l String xHash, @J81.c("fromPage") @l String fromPage);

    @C(timeoutMs = 3000)
    @J81.f("3/favorites/items/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.k({"X-Geo-required: true"})
    @k
    z<TypedResult<FavoritesResult>> g(@l @t("segment") String segment, @u @k @n(excludeQuery = {"isAutotekaAppInstalled"}, excludeQueryIfDefault = {@com.avito.android.offlinization.o(key = "0", name = "categoryId"), @com.avito.android.offlinization.o(key = "added_at_desc", name = "order")}) Map<String, Integer> selectedCategoryId, @u @k @n(excludeQuery = {"isAutotekaAppInstalled"}, excludeQueryIfDefault = {@com.avito.android.offlinization.o(key = "0", name = "categoryId"), @com.avito.android.offlinization.o(key = "added_at_desc", name = "order")}) Map<String, String> selectedOrderId, @com.avito.android.offlinization.l(defaultValue = "false") @l @t("onlyActive") Boolean onlyActive, @l @t("query") String query);
}
