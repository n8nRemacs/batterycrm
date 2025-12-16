package com.avito.android.comfortable_deal.client_room.seller_recall;

import ip.InterfaceC42085a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e2;

/* compiled from: SellerRecallView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.seller_recall.SellerRecallViewImpl$initListeners$2", f = "SellerRecallView.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class o extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f120013q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120014r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f120015s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f120015s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f120015s, continuation);
        oVar.f120014r = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((o) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f120013q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = (String) this.f120014r;
            e2 e2Var = this.f120015s.f120026e;
            InterfaceC42085a.b bVar = new InterfaceC42085a.b(str);
            this.f120013q = 1;
            if (e2Var.emit(bVar, this) == coroutine_suspended) {
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
