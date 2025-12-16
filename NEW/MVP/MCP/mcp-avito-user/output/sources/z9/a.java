package Z9;

import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import aa.C19848a;
import aa.C19849b;
import ba.C25604a;
import ca.C27133a;
import com.avito.android.remote.model.TypedResult;
import da.C39687a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvertDetailsApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LZ9/a;", "", "Laa/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Laa/b;", "c", "(Laa/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "itemId", "Lda/a;", "a", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "context", "Lba/a;", "b", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lca/a;", "d", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes10.dex */
public interface a {
    @f("1/job/vacancy/market_salary_widget")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("itemId") Long l12, @k Continuation<? super TypedResult<C39687a>> continuation);

    @f("1/str/booking/neighboringDates/{itemId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("itemId") long j12, @t("context") @k String str, @k Continuation<? super TypedResult<C25604a>> continuation);

    @o("1/delivery/request-free-delivery")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k C19848a c19848a, @k Continuation<? super TypedResult<C19849b>> continuation);

    @o("1/user-habits/wantToBuy/request")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@J81.c("itemId") long j12, @k Continuation<? super TypedResult<C27133a>> continuation);
}
