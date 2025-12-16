package OG;

import J81.f;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.gig.slot_show_qr_impl.generated.api.show_qrv_1.Action;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SlotShowQrApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LOG/a;", "", "", "slotId", "Lcom/avito/android/gig/slot_show_qr_impl/generated/api/show_qrv_1/Action;", "action", "Lcom/avito/android/remote/model/TypedResult;", "LPG/a;", "a", "(JLcom/avito/android/gig/slot_show_qr_impl/generated/api/show_qrv_1/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface a {
    @f("1/gig/slot/{slotId}/show-qr/{action}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("slotId") long j12, @s("action") @k Action action, @k Continuation<? super TypedResult<PG.a>> continuation);
}
