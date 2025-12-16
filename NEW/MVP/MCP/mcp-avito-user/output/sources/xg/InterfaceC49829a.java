package xG;

import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1.Reason;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import yG.C50111c;
import zG.C50458a;

/* compiled from: ShiftCancelApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LxG/a;", "", "", "slotId", "Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_v_1/Reason;", "reason", "Lcom/avito/android/remote/model/TypedResult;", "LzG/a;", "a", "(JLcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_v_1/Reason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LyG/c;", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: xG.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49829a {
    @o("1/gig/slot/{slotId}/cancel")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("slotId") long j12, @l @t("reason") Reason reason, @k Continuation<? super TypedResult<C50458a>> continuation);

    @f("1/gig/slot/{slotId}/cancel-info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("slotId") long j12, @k Continuation<? super TypedResult<C50111c>> continuation);
}
