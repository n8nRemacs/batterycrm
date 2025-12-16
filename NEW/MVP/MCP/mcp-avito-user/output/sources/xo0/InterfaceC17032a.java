package Xo0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import Yo0.C18312a;
import Zo0.C19581a;
import ap0.C23649a;
import ap0.C23650b;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.ApiCreateDispatchV1Response;
import cp0.C39391b;
import dp0.C39777a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import ep0.C40143a;
import ep0.C40144b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SbcApi.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006JX\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001e\u0010\u001bJ<\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020\u00072\u0010\b\u0001\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010!H§@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"LXo0/a;", "", "LYo0/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "c", "(LYo0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "discountValue", "dispatchId", "expiresAt", "", "offerSlug", "recipientsCount", "", "useCompanyWallet", "LZo0/a;", "e", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;JLjava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lap0/b;", "Lap0/a;", "b", "(Lap0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "action", "itemId", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response;", "d", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkoutContext", "Lcp0/b;", "f", "timestampFrom", "maxCount", "", "statuses", "Ldp0/a;", "a", "(JJLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lep0/b;", "Lep0/a;", "g", "(Lep0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Xo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC17032a {
    @f("1/sbc/getAutoDispatches")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("timestampFrom") long j12, @t("maxCount") long j13, @l @t("statuses") List<String> list, @k Continuation<? super TypedResult<C39777a>> continuation);

    @o("1/sbc/createAutoDispatch")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k C23650b c23650b, @k Continuation<? super TypedResult<C23649a>> continuation);

    @o("1/sbc/cancelAutoDispatch")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k C18312a c18312a, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/sbc/createDispatch")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@J81.c("action") @l String str, @J81.c("itemId") long j12, @k Continuation<? super TypedResult<ApiCreateDispatchV1Response>> continuation);

    @o("1/sbc/confirmDispatch")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object e(@J81.c("discountValue") @l Long l12, @J81.c("dispatchId") long j12, @J81.c("expiresAt") @l Long l13, @J81.c("offerSlug") @k String str, @J81.c("recipientsCount") long j13, @J81.c("useCompanyWallet") @l Boolean bool, @k Continuation<? super TypedResult<C19581a>> continuation);

    @o("1/sbc/createDispatchVAS")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object f(@J81.c("checkoutContext") @k String str, @J81.c("itemId") long j12, @k Continuation<? super TypedResult<C39391b>> continuation);

    @o("1/sbc/getForecastsForAutoDispatch")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@J81.a @k C40144b c40144b, @k Continuation<? super TypedResult<C40143a>> continuation);
}
