package dm0;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import em0.C40129a;
import em0.C40130b;
import gm0.C40708a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserAdvertsActionsApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldm0/a;", "", "Lem0/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Lem0/a;", "b", "(Lem0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "itemIds", "Lgm0/a;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: dm0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC39755a {
    @o("2/cpt/items/activate/prepare")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("itemIds") @k List<Long> list, @k Continuation<? super TypedResult<C40708a>> continuation);

    @o("1/profile/item/availableActions")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Employeemode-required: true"})
    @l
    Object b(@J81.a @k C40130b c40130b, @k Continuation<? super TypedResult<C40129a>> continuation);
}
