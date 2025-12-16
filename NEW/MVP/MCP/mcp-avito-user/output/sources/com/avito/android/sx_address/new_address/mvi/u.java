package com.avito.android.sx_address.new_address.mvi;

import com.avito.android.sx_address.new_address.mvi.B;
import com.avito.android.sx_address.new_address.mvi.InterfaceC35192g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SxNewAddressMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressMviActor$handle$9", f = "SxNewAddressMviActor.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super B>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293835q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293836r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35192g.l f293837s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InterfaceC35192g.l lVar, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f293837s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u uVar = new u(this.f293837s, continuation);
        uVar.f293836r = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293835q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293836r;
            InterfaceC35192g.l lVar = this.f293837s;
            B.r rVar = new B.r(lVar.f293790a, lVar.f293791b);
            this.f293835q = 1;
            if (interfaceC43172j.emit(rVar, this) == coroutine_suspended) {
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
