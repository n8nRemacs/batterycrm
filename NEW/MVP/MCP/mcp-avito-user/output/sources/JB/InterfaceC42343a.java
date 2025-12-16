package jb;

import J81.f;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.advert_stats.remote.model.detail_stats.PeriodSpendingsExpenses;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kb.C42659a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lb.C43718a;

/* compiled from: AdvertStatsApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljb/a;", "", "", "itemId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lkb/a;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Llb/a;", "Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendingsExpenses;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: jb.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC42343a {
    @f("5/profile/item/{itemId}/vas/stats/pro")
    @l
    Object a(@s("itemId") @k String str, @k Continuation<? super TypedResult<C43718a<PeriodSpendingsExpenses>>> continuation);

    @f("9/profile/item/{itemId}/vas/stats")
    @k
    z<TypedResult<C42659a>> b(@s("itemId") @k String itemId);
}
