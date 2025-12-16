package Hl0;

import Il0.C14129b;
import Il0.InterfaceC14128a;
import J81.e;
import J81.k;
import J81.o;
import Jl0.C14211a;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ShortTermRentApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LHl0/a;", "", "LIl0/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LIl0/a;", "a", "(LIl0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "bookingId", "LJl0/a;", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Hl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14002a {
    @o("2/str/booking/request/pay")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.a @Y61.k C14129b c14129b, @Y61.k Continuation<? super TypedResult<InterfaceC14128a>> continuation);

    @o("3/str/booking/request/payout")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("bookingId") long j12, @Y61.k Continuation<? super TypedResult<C14211a>> continuation);
}
