package zv;

import Av.C13084a;
import J81.p;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PriceReductionApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzv/a;", "", "", "itemId", "price", "Lcom/avito/android/remote/model/TypedResult;", "LAv/a;", "a", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: zv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC50632a {
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    @p("1/delivery/item/price-confirmation")
    Object a(@t("itemId") long j12, @t("price") long j13, @k Continuation<? super TypedResult<C13084a>> continuation);
}
