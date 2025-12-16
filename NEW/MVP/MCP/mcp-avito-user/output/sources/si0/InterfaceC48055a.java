package sI0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdviceDetail;
import com.avito.android.remote.model.Advices;
import com.avito.android.remote.model.IncomeInfo;
import com.avito.android.remote.model.IncomeResultV2;
import com.avito.android.remote.model.ProfileItemsConfig;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UserAdvertsFiltersResult;
import com.avito.android.remote.model.UserSearchSuggests;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserAdvertsApi.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H§@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005H§@¢\u0006\u0004\b\u0013\u0010\u000fJ%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0003H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u0003H'¢\u0006\u0004\b\u001b\u0010\u0018J=\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00152\b\b\u0001\u0010\u001c\u001a\u00020\u00032\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LsI0/a;", "", "", "", "filterParams", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/UserAdvertsFiltersResult;", "d", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "Lcom/avito/android/remote/model/UserSearchSuggests;", "g", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/IncomeResultV2;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/IncomeInfo;", "c", "Lcom/avito/android/remote/model/ProfileItemsConfig;", "b", "viewType", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/Advices;", "e", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "id", "Lcom/avito/android/remote/model/AdviceDetail;", "a", "adviceId", "itemId", "action", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sI0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC48055a {
    @f("1/advices/detail")
    @k
    I<TypedResult<AdviceDetail>> a(@t("id") @k String id2);

    @f("1/profile/items/bootstrap")
    @l
    Object b(@k Continuation<? super TypedResult<ProfileItemsConfig>> continuation);

    @f("2/profile/items/income/show")
    @l
    Object c(@k Continuation<? super TypedResult<IncomeInfo>> continuation);

    @f("1/serp/profile/items/filters")
    @l
    Object d(@u @k Map<String, String> map, @k Continuation<? super TypedResult<UserAdvertsFiltersResult>> continuation);

    @f("1/advices")
    @k
    I<TypedResult<Advices>> e(@t("view") @k String viewType);

    @f("2/profile/items/income")
    @l
    Object f(@k Continuation<? super TypedResult<IncomeResultV2>> continuation);

    @f("1/profile/items/suggest")
    @l
    Object g(@t("q") @k String str, @k Continuation<? super TypedResult<UserSearchSuggests>> continuation);

    @o("1/advices/complete")
    @e
    @k
    I<TypedResult<Object>> h(@J81.c("adviceId") @k String adviceId, @J81.c("itemId") @l String itemId, @J81.c("action") @l String action);
}
