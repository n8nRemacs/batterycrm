package com.avito.android.activeOrders;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.activeOrders.UpdatedActiveOrdersInteractorImpl$updatedOrders$$inlined$flatMapLatest$1", f = "UpdatedActiveOrdersInteractorImpl.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super OrdersNeedActionResponse>, Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68246q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f68247r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f68248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Boolean f68249t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f68250u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, Boolean bool, r rVar) {
        super(3, continuation);
        this.f68249t = bool;
        this.f68250u = rVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super OrdersNeedActionResponse> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
        q qVar = new q(continuation, this.f68249t, this.f68250u);
        qVar.f68247r = interfaceC43172j;
        qVar.f68248s = bool;
        return qVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iG;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f68246q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f68247r;
            if (((Boolean) this.f68248s).booleanValue()) {
                boolean zF2 = L.f(this.f68249t, Boxing.boxBoolean(true));
                r rVar = this.f68250u;
                if (zF2) {
                    rVar.getClass();
                    AtomicLong atomicLong = new AtomicLong(0L);
                    com.avito.android.clientEventBus.a aVar = rVar.f68251a;
                    interfaceC43160iG = C43175k.G(new k(C43175k.Y(y.a(aVar.a().y0(new j(atomicLong, aVar))), new f(null, rVar)), null));
                } else {
                    com.avito.android.clientEventBus.a aVar2 = rVar.f68251a;
                    interfaceC43160iG = C43175k.G(new p(C43175k.Y(y.a(aVar2.a().y0(new o(aVar2))), new l(null, rVar)), null));
                }
            } else {
                interfaceC43160iG = C43175k.w();
            }
            this.f68246q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
