package com.avito.android.free_delivery.mvi;

import UE.a;
import Y41.p;
import com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FreeDeliveryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.free_delivery.mvi.FreeDeliveryActor$process$2", f = "FreeDeliveryActor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super FreeDeliveryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158774q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UE.a f158776s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UE.c f158777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UE.a aVar, UE.c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f158776s = aVar;
        this.f158777t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f158776s, this.f158777t, continuation);
        bVar.f158775r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FreeDeliveryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f158774q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f158775r;
            String str = ((a.d) this.f158776s).f16306a;
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            Long lZ02 = C43066x.z0(sb2.toString());
            long jLongValue = lZ02 != null ? lZ02.longValue() : 0L;
            FreeDeliveryInternalAction.Input input = new FreeDeliveryInternalAction.Input(jLongValue >= 2147483647L ? this.f158777t.f16313b : (int) jLongValue);
            this.f158774q = 1;
            if (interfaceC43172j.emit(input, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
