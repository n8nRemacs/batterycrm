package com.avito.android.remote;

import com.avito.android.remote.model.FavoriteSellersCount;
import com.avito.android.remote.model.FavoriteSellersLoadingResult;
import com.avito.android.remote.model.SubscribeResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UnsubscribeResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FavoriteSellersApi.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJJ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0012\u0010\nJ,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H§@¢\u0006\u0004\b\u001d\u0010\u0019JO\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001f\u0010 J9\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b!\u0010\"J9\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0005H'¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00070\u001eH'¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/remote/Q;", "", "", "src", "userKey", "", "withCounters", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/UnsubscribeResult;", "i", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPushAllowed", "profileSession", "Lcom/avito/android/remote/model/SubscribeResult;", "g", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isActivate", "Lkotlin/G0;", "a", "", "userIds", "j", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/FavoriteSellersLoadingResult;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextPage", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lio/reactivex/rxjava3/core/z;", "f", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lio/reactivex/rxjava3/core/z;", "k", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/z;", "d", "Lcom/avito/android/remote/model/FavoriteSellersCount;", "h", "()Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface Q {

    /* compiled from: FavoriteSellersApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("1/profile/favorite-sellers/notifications/activate")
    @J81.e
    @Y61.l
    Object a(@J81.c("src") @Y61.k String str, @J81.c("hashUserId") @Y61.k String str2, @J81.c("isActivate") boolean z12, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.f
    @Y61.l
    Object b(@J81.y @Y61.k String str, @Y61.k Continuation<? super TypedResult<FavoriteSellersLoadingResult>> continuation);

    @J81.f("6/profile/favorite-sellers")
    @Y61.l
    Object c(@Y61.k Continuation<? super TypedResult<FavoriteSellersLoadingResult>> continuation);

    @J81.o("1/profile/favorite-sellers/notifications/activate")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> d(@J81.c("src") @Y61.k String src, @J81.c("hashUserId") @Y61.k String userKey, @J81.c("isActivate") boolean isActivate);

    @J81.o("1/profile/favorite-sellers/unread/clear")
    @Y61.l
    Object e(@Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.o("3/profile/favorite-sellers/subscribe")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<SubscribeResult>> f(@J81.c("src") @Y61.k String src, @J81.c("hashUserId") @Y61.k String userKey, @J81.c("isPushAllowed") boolean isPushAllowed, @J81.c("withCounters") boolean withCounters, @J81.c("profileSession") @Y61.l String profileSession);

    @J81.o("3/profile/favorite-sellers/subscribe")
    @J81.e
    @Y61.l
    Object g(@J81.c("src") @Y61.k String str, @J81.c("hashUserId") @Y61.k String str2, @J81.c("isPushAllowed") boolean z12, @J81.c("withCounters") boolean z13, @J81.c("profileSession") @Y61.l String str3, @Y61.k Continuation<? super TypedResult<SubscribeResult>> continuation);

    @J81.f("1/profile/favorite-sellers/unread/counter")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<FavoriteSellersCount>> h();

    @J81.o("1/profile/favorite-sellers/unsubscribe")
    @J81.e
    @Y61.l
    Object i(@J81.c("src") @Y61.k String str, @J81.c("hashUserId") @Y61.k String str2, @J81.c("withCounters") boolean z12, @Y61.k Continuation<? super TypedResult<UnsubscribeResult>> continuation);

    @J81.o("1/profile/favorite-sellers/mark-as-read")
    @J81.e
    @Y61.l
    Object j(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.o("1/profile/favorite-sellers/unsubscribe")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<UnsubscribeResult>> k(@J81.c("src") @Y61.k String src, @J81.c("hashUserId") @Y61.k String userKey, @J81.c("withCounters") boolean withCounters);
}
