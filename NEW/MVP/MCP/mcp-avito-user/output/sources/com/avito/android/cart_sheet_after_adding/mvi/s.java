package com.avito.android.cart_sheet_after_adding.mvi;

import gn.InterfaceC40710b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tn.d;
import vn.C49355b;

/* compiled from: CartSnippetActionsStateToActionsMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSnippetActionsStateToActionsMapper$mapToActions$1", f = "CartSnippetActionsStateToActionsMapper.kt", i = {0}, l = {14, 18}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115445q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115446r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ tn.d f115447s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tn.d dVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f115447s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f115447s, continuation);
        sVar.f115446r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Object> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115445q;
        tn.d dVar = this.f115447s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f115446r;
            d.b bVar = dVar.f439436e;
            if (bVar.f439441b || !bVar.f439440a.isEmpty()) {
                InterfaceC40710b.g gVar = new InterfaceC40710b.g(dVar.f439436e);
                this.f115446r = interfaceC43172j;
                this.f115445q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f115446r;
            C42729a0.b(obj);
        }
        C49355b c49355b = dVar.f439439h;
        if (c49355b != tn.e.f439442a) {
            InterfaceC40710b.e eVar = new InterfaceC40710b.e(c49355b);
            this.f115446r = null;
            this.f115445q = 2;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
