package Gt0;

import Ht0.C14032a;
import It0.C14157a;
import J81.e;
import J81.k;
import J81.o;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LGt0/a;", "", "LHt0/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LHt0/a;", "b", "(LHt0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "advertId", "LIt0/a;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Gt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13916a {
    @o("2/serviceBooking/verifyPhone")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.c("advertId") @l String str, @Y61.k Continuation<? super TypedResult<C14157a>> continuation);

    @o("2/serviceBooking/form")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.a @Y61.k Ht0.b bVar, @Y61.k Continuation<? super TypedResult<C14032a>> continuation);
}
