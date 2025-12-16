package HG;

import J81.f;
import J81.k;
import J81.o;
import J81.s;
import Y61.l;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotV7Response;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SlotScreenApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LHG/a;", "", "LIG/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LIG/b;", "a", "(LIG/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "slotId", "LKG/a;", "d", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJG/a;", "b", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response;", "c", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface a {
    @o("1/gig/shift/payment/retry")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.a @Y61.k IG.a aVar, @Y61.k Continuation<? super TypedResult<IG.b>> continuation);

    @o("1/gig/slot/{slotId}/sign-payment")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("slotId") long j12, @Y61.k Continuation<? super TypedResult<JG.a>> continuation);

    @f("7/gig/slot/{slotId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@s("slotId") long j12, @Y61.k Continuation<? super TypedResult<SlotV7Response>> continuation);

    @o("1/gig/slot/{slotId}/confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@s("slotId") long j12, @Y61.k Continuation<? super TypedResult<KG.a>> continuation);
}
