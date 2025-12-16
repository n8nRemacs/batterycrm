package com.avito.android.mortgage.root.mvi;

import KZ.C14285o;
import KZ.InterfaceC14286p;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import g10.C40513c;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$11", f = "MortgageRootActor.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203262q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f203264s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40513c f203265t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, C40513c c40513c, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f203264s = sVar;
        this.f203265t = c40513c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f203264s, this.f203265t, continuation);
        gVar.f203263r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203262q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203263r;
            C40513c c40513c = this.f203265t;
            Iterator<T> it = c40513c.f396248d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C14285o) next).f9530b instanceof KZ.D) {
                    break;
                }
            }
            C14285o c14285o = (C14285o) next;
            InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
            KZ.D d12 = (KZ.D) (interfaceC14286p instanceof KZ.D ? interfaceC14286p : null);
            if (d12 == null) {
                return G0.f406611a;
            }
            InterfaceC43160i<MortgageRootInternalAction> interfaceC43160iB = this.f203264s.f203339k.b(c40513c.f396246b, d12);
            this.f203262q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
