package Go0;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ConvertDtoToTyped;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.model.SearchSubscription;
import com.avito.android.saved_searches.model.SubscriptionResponse;
import com.avito.android.saved_searches.model.SubscriptionResult;
import com.avito.android.saved_searches.model.SubscriptionUnreadCount;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SavedSearchApi.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJk\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u00042\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018Jf\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\f2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH§@¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\f0\u0004H'¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"LGo0/a;", "", "", "segment", "Lio/reactivex/rxjava3/core/z;", "", "Lcom/avito/android/saved_searches/model/SearchSubscription;", "h", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "subscriptionId", "Lcom/avito/android/saved_searches/model/SubscriptionResult;", "e", "Lcom/avito/android/remote/model/TypedResult;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "body", SearchParamsConverterKt.DRAW_ID, "xHash", EntryPointParameter.TYPE, "", "pushAllowed", "titleEdited", "g", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lio/reactivex/rxjava3/core/z;", "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/saved_searches/model/SubscriptionResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "filterId", "searchParams", "Lcom/avito/android/saved_searches/model/SavedSearchData;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/saved_searches/model/SubscriptionUnreadCount;", "f", "()Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Go0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13902a {

    /* compiled from: SavedSearchApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Go0.a$a, reason: collision with other inner class name */
    public static final class C0371a {
    }

    @f("2/subscriptions/{filterId}")
    @k
    @InterfaceC42830m
    z<SubscriptionResponse> a(@s("filterId") @k String id2, @l @t(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) String from);

    @o("4/subscription")
    @e
    @l
    Object b(@d @k Map<String, String> map, @J81.c(SearchParamsConverterKt.DRAW_ID) @l String str, @J81.c("xHash") @l String str2, @J81.c(EntryPointParameter.TYPE) @l String str3, @J81.c("isPushAllowed") boolean z12, @J81.c("isTitleEdited") @l Boolean bool, @k Continuation<? super TypedResult<SearchSubscription>> continuation);

    @f("1/subscriptions/configuration_form")
    @l
    Object c(@l @t("filterId") String str, @l @t(SearchParamsConverterKt.DRAW_ID) String str2, @u @k Map<String, String> map, @k Continuation<? super TypedResult<SavedSearchData>> continuation);

    @J81.b("2/subscriptions/{subscriptionId}")
    @ConvertDtoToTyped
    @l
    Object d(@s("subscriptionId") @k String str, @k Continuation<? super TypedResult<SubscriptionResult>> continuation);

    @J81.b("2/subscriptions/{subscriptionId}")
    @k
    @InterfaceC42830m
    z<SubscriptionResult> e(@s("subscriptionId") @k String subscriptionId);

    @f("2/subscriptions/count_with_new_items")
    @k
    @InterfaceC42830m
    z<TypedResult<SubscriptionUnreadCount>> f();

    @o("4/subscription")
    @e
    @InterfaceC42830m
    @k
    z<TypedResult<SearchSubscription>> g(@d @k Map<String, String> body, @J81.c(SearchParamsConverterKt.DRAW_ID) @l String drawId, @J81.c("xHash") @l String xHash, @J81.c(EntryPointParameter.TYPE) @l String entryPoint, @J81.c("isPushAllowed") boolean pushAllowed, @J81.c("isTitleEdited") @l Boolean titleEdited);

    @f("4/subscriptions")
    @k
    @InterfaceC42830m
    z<List<SearchSubscription>> h(@l @t("segment") String segment);
}
