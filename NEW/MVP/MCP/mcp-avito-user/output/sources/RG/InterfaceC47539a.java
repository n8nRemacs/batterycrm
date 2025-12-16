package rG;

import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.gig.shift_action_impl.generated.api.checkout_v_2.Reason;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import sG.C48046a;
import tG.C48551a;

/* compiled from: ShiftActionApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LrG/a;", "", "", "slotId", "", "secret", "Lcom/avito/android/remote/model/TypedResult;", "LsG/a;", "b", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/gig/shift_action_impl/generated/api/checkout_v_2/Reason;", "reason", "LtG/a;", "c", "(JLjava/lang/String;Lcom/avito/android/gig/shift_action_impl/generated/api/checkout_v_2/Reason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LuG/c;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: rG.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC47539a {
    @o("2/gig/workplace/qr-scan")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("secret") String str, @k Continuation<? super TypedResult<uG.c>> continuation);

    @o("1/gig/slot/{slotId}/check-in")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("slotId") long j12, @l @t("secret") String str, @k Continuation<? super TypedResult<C48046a>> continuation);

    @o("2/gig/slot/{slotId}/check-out")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@s("slotId") long j12, @l @t("secret") String str, @l @t("reason") Reason reason, @k Continuation<? super TypedResult<C48551a>> continuation);
}
