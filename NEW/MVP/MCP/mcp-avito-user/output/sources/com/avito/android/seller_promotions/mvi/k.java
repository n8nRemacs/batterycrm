package com.avito.android.seller_promotions.mvi;

import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SellerPromotionsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$1", f = "SellerPromotionsActor.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f268013q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f268014r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34670a f268015s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C34670a c34670a, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f268015s = c34670a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f268015s, continuation);
        kVar.f268014r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f268013q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f268014r;
            SellerPromotionsInternalAction.PromotionsLoading promotionsLoading = new SellerPromotionsInternalAction.PromotionsLoading(false);
            this.f268014r = interfaceC43172j;
            this.f268013q = 1;
            if (interfaceC43172j.emit(promotionsLoading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f268014r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<SellerPromotionsInternalAction> interfaceC43160iC = this.f268015s.f267927b.c();
        this.f268014r = null;
        this.f268013q = 2;
        if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
