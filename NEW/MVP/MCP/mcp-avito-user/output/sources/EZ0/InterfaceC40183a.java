package ez0;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import hz0.C41197a;
import hz0.h;
import iz0.C42141a;
import jz0.C42455a;
import jz0.C42462h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: StrSellerOrdersApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lez0/a;", "", "Lhz0/h;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Lhz0/a;", "c", "(Lhz0/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "itemId", "startDate", "endDate", "Liz0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljz0/h;", "Ljz0/a;", "b", "(Ljz0/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ez0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC40183a {
    @f("2/str/seller/orders/range")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("itemId") @k String str, @t("startDate") @k String str2, @t("endDate") @k String str3, @k Continuation<? super TypedResult<C42141a>> continuation);

    @o("4/str/seller/orders/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k C42462h c42462h, @k Continuation<? super TypedResult<C42455a>> continuation);

    @o("2/str/seller/orders/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k h hVar, @k Continuation<? super TypedResult<C41197a>> continuation);
}
