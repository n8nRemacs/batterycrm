package com.avito.android.str_booking.mvi;

import Mx0.C14541a;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrBookingActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "<anonymous>", "(Lcom/avito/android/str_booking/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.mvi.StrBookingActor$process$2", f = "StrBookingActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements Y41.p<com.avito.android.str_booking.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends StrBookingInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f285822q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f285823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C14541a> f285824s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Y41.a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f285823r = aVar2;
        this.f285824s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f285824s, this.f285823r, continuation);
        gVar.f285822q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.str_booking.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends StrBookingInternalAction>> continuation) {
        return ((g) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.str_booking.mvi.entity.a aVar = (com.avito.android.str_booking.mvi.entity.a) this.f285822q;
        this.f285824s.invoke();
        a aVar2 = this.f285823r;
        aVar2.getClass();
        return C43175k.G(new f(aVar, aVar2, null));
    }
}
