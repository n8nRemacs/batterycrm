package com.avito.android.remote;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.ConvertDtoToTyped;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.MainSearchResult;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.carousel_items.CarouselItemsResult;
import com.avito.android.remote.model.category_tree.CategoryTreeResponse;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.filterssuggest.FiltersSuggestResponse;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.suggest.SuggestResponse;
import com.avito.android.remote.model.vertical_main.SearchFormResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SearchApi.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJa\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00102\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH§@¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00102\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00102\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0019\u0010\u0018J1\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00102\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u001c\u0010\u0018Jc\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050$2\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u001f2\b\b\u0001\u0010\"\u001a\u00020\u001f2\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b&\u0010'JY\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050$2\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u001f2\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b(\u0010)Ja\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\u0014\b\u0001\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000e2\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u00102\b\b\u0001\u0010/\u001a\u00020\u0002H'¢\u0006\u0004\b1\u00102J \u00103\u001a\b\u0012\u0004\u0012\u0002000\u00052\b\b\u0001\u0010/\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u00104J,\u00105\u001a\b\u0012\u0004\u0012\u0002000\u00052\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH§@¢\u0006\u0004\b5\u00106Jo\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00102\u0014\b\u0001\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0014\b\u0001\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0014\b\u0001\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b<\u0010=Jo\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u00102\u0014\b\u0001\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0014\b\u0001\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0014\b\u0001\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b>\u0010=JE\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u00102\b\b\u0001\u0010?\u001a\u00020\u00022\b\b\u0001\u0010@\u001a\u00020\u00022\u0014\b\u0001\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bB\u0010CJG\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u00102\b\b\u0001\u0010?\u001a\u00020\u00022\b\b\u0001\u0010D\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bE\u0010FJ;\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00050\u00102\b\b\u0001\u0010G\u001a\u00020\u00022\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bI\u0010JJ+\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00102\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bL\u0010\u0018J+\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00102\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bM\u0010\u0018J+\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\u00102\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bN\u0010\u0018J\u0083\u0001\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u00102\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010O\u001a\u00020\u001f2\b\b\u0001\u0010P\u001a\u00020\u00022\b\b\u0001\u0010Q\u001a\u00020\u00022\b\b\u0001\u0010R\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/avito/android/remote/V0;", "", "", "categoryId", SearchParamsConverterKt.LOCATION_ID, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/MainSearchResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clearGeoFilters", "context", "xSgt", "withSuggestBubble", "", "searchParams", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "i", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "h", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "t", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "k", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/SearchParameters;", "m", "paramId", "query", "", "limit", "offset", "isNewFilters", "params", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/filterssuggest/FiltersSuggestResponse;", "s", "(Ljava/lang/String;Ljava/lang/String;IIILjava/util/Map;)Lio/reactivex/rxjava3/core/I;", "q", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;)Lio/reactivex/rxjava3/core/I;", "fromPage", "togglesMap", "Lcom/avito/android/remote/model/search/suggest/SuggestResponse;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", ContextActionHandler.Link.URL, "Lkotlin/G0;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extendedSearchParams", "changesParams", "inlinesOrder", "segment", "Lcom/avito/android/remote/model/search/InlineFilters;", "c", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "f", "id", "action", "analytics", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "type", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/z;", "widgetType", "Lcom/avito/android/remote/model/vertical_main/SearchFormResult;", "g", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/category_tree/CategoryTreeResponse;", "n", "d", "e", "minItems", "itemsType", "displayType", "xHash", "feedId", "locationForcedByUser", "showedPageCount", "Lcom/avito/android/remote/model/carousel_items/CarouselItemsResult;", "u", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface V0 {

    /* compiled from: SearchApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.f("3/search/main")
    @ConvertDtoToTyped
    @Y61.l
    Object a(@Y61.l @J81.t("categoryId") String str, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str2, @Y61.k Continuation<? super TypedResult<MainSearchResult>> continuation);

    @J81.f
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> b(@J81.y @Y61.k String url);

    @J81.f("5/items/search/header")
    @Qk0.c
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<InlineFilters> c(@J81.u @Y61.k Map<String, String> extendedSearchParams, @J81.u @Y61.k Map<String, String> changesParams, @J81.u @Y61.k Map<String, String> inlinesOrder, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("segment") String segment);

    @J81.f("1/avitoBlackCategory/tree")
    @Y61.k
    io.reactivex.rxjava3.core.z<CategoryTreeResponse> d(@J81.u @Y61.k Map<String, String> params);

    @J81.f("1/profile/category/tree")
    @Y61.k
    io.reactivex.rxjava3.core.z<CategoryTreeResponse> e(@J81.u @Y61.k Map<String, String> params);

    @J81.f("1/items/profile/search/inline-filters")
    @Qk0.c
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<InlineFilters> f(@J81.u @Y61.k Map<String, String> extendedSearchParams, @J81.u @Y61.k Map<String, String> changesParams, @J81.u @Y61.k Map<String, String> inlinesOrder, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("segment") String segment);

    @J81.k({"X-Geo-required: true"})
    @J81.f("1/vertical/{type}")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<SearchFormResult>> g(@J81.s("type") @Y61.k String widgetType, @J81.u @Y61.k Map<String, String> params);

    @J81.k({"X-Geo-required: true"})
    @J81.f("10/items/search/deeplink")
    @Y61.l
    Object h(@Y61.l @J81.t("clearGeoFilters") Boolean bool, @Y61.l @J81.t("context") String str, @J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @J81.k({"X-Geo-required: true"})
    @J81.f("10/items/search/deeplink")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<DeepLinkResponse>> i(@Y61.l @J81.t("clearGeoFilters") Boolean clearGeoFilters, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("x_sgt_transit") String xSgt, @Y61.l @J81.t("had_suggest_bubble") Boolean withSuggestBubble, @J81.u @Y61.k Map<String, String> searchParams);

    @J81.o("1/items/snippet/action")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> j(@J81.c("id") @Y61.k String id2, @J81.c("action") @Y61.k String action, @J81.d @Y61.k Map<String, String> analytics);

    @J81.f("1/user/profile/items/count")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<ChangingParametersForButtons>> k(@J81.u @Y61.k Map<String, String> searchParams);

    @J81.f("1/main/hide")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> l(@J81.t("id") @Y61.k String id2, @J81.t("type") @Y61.k String type, @Y61.l @J81.t("categoryId") String categoryId, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) Integer locationId);

    @J81.f("6/search/parameters")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<SearchParameters>> m(@J81.u @Y61.k Map<String, String> parameters);

    @J81.f("1/category/tree")
    @Y61.k
    io.reactivex.rxjava3.core.z<CategoryTreeResponse> n(@J81.u @Y61.k Map<String, String> params);

    @J81.f
    @Y61.l
    Object o(@J81.y @Y61.k String str, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.o("20/suggest")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<SuggestResponse> p(@J81.c("query") @Y61.k String query, @J81.c("from_page") @Y61.k String fromPage, @J81.c("hadSuggestBubble") @Y61.l Boolean withSuggestBubble, @J81.d @Y61.k Map<String, Boolean> togglesMap, @J81.d @Y61.k Map<String, String> params);

    @J81.f("2/suggest/inline")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<FiltersSuggestResponse>> q(@J81.t("paramId") @Y61.k String paramId, @J81.t("query") @Y61.k String query, @J81.t("limit") int limit, @J81.t("offset") int offset, @J81.u @Y61.k Map<String, String> params);

    @J81.o("1/suggest/clear-search-history")
    @J81.e
    @Y61.l
    Object r(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.f("2/suggest/filter")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<FiltersSuggestResponse>> s(@J81.t("paramId") @Y61.k String paramId, @J81.t("query") @Y61.k String query, @J81.t("limit") int limit, @J81.t("offset") int offset, @J81.t("isNewFilters") int isNewFilters, @J81.u @Y61.k Map<String, String> params);

    @J81.f("1/items/count")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<ChangingParametersForButtons>> t(@J81.u @Y61.k Map<String, String> searchParams);

    @J81.f("1/widget/itemsCarouselWidget")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.z<CarouselItemsResult> u(@J81.t("limit") int limit, @J81.t("minItems") int minItems, @J81.t("itemsType") @Y61.k String itemsType, @J81.t("displayType") @Y61.k String displayType, @J81.t("xHash") @Y61.k String xHash, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String locationId, @Y61.l @J81.t("feedId") String feedId, @Y61.l @J81.t("locationForcedByUser") Boolean locationForcedByUser, @Y61.l @J81.t("showedPageCount") Integer showedPageCount, @Y61.l @J81.t("offset") Integer offset);
}
