package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import he0.C40926c;
import he0.InterfaceC40924a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.free_delivery.mvi.FreeDeliveryActor$process$3", f = "FreeDeliveryActor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FreeDeliveryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f235806q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f235807r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40924a f235808s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40926c f235809t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC40924a interfaceC40924a, C40926c c40926c, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f235808s = interfaceC40924a;
        this.f235809t = c40926c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f235808s, this.f235809t, continuation);
        cVar.f235807r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FreeDeliveryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f235806q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f235807r;
            String str = ((InterfaceC40924a.d) this.f235808s).f397317a;
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
            C40926c c40926c = this.f235809t;
            FreeDeliveryInternalAction.Input input = new FreeDeliveryInternalAction.Input(jLongValue >= 2147483647L ? c40926c.f397330b : (int) jLongValue, c40926c.f397331c, c40926c.f397332d);
            this.f235806q = 1;
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
