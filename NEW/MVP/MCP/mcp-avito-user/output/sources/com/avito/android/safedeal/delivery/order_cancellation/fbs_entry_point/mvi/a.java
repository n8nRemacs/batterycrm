package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import Fn0.C13819a;
import Gn0.InterfaceC13900a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.entity.FbsEntryPointInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FbsEntryPointActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.FbsEntryPointActor$process$1", f = "FbsEntryPointActor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super FbsEntryPointInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f256334q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f256335r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f256336s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13900a f256337t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC13900a interfaceC13900a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f256336s = bVar;
        this.f256337t = interfaceC13900a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f256336s, this.f256337t, continuation);
        aVar.f256335r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FbsEntryPointInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f256334q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f256335r;
            b bVar = this.f256336s;
            bVar.f256338a.c(new C13819a(Integer.parseInt(bVar.f256339b.getId()), bVar.f256340c));
            FbsEntryPointInternalAction.HandleDeeplink handleDeeplink = new FbsEntryPointInternalAction.HandleDeeplink(((InterfaceC13900a.b) this.f256337t).f6729a);
            this.f256334q = 1;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
