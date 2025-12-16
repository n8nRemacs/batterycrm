package com.avito.android.sbc.autodispatches;

import Xo0.InterfaceC17032a;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import dp0.C39777a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SbcAutoDispatchesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/arch/mvi/utils/c;", "", "Ldp0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesInteractorImpl$loadAutoDispatchesForStatuses$1", f = "SbcAutoDispatchesInteractor.kt", i = {0}, l = {116, 128}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends C39777a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258951q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f258952r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f258953s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<String> f258954t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, List<String> list, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f258953s = vVar;
        this.f258954t = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f258953s, this.f258954t, continuation);
        qVar.f258952r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends C39777a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.arch.mvi.utils.c bVar;
        ?? r12;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f258951q;
        try {
        } catch (Throwable th2) {
            Q0.e(getF411447c());
            bVar = new c.b(th2);
            r12 = i12;
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f258952r;
            v vVar = this.f258953s;
            List<String> list = this.f258954t;
            InterfaceC17032a interfaceC17032a = vVar.f258965b;
            long jNow = vVar.f258967d.now();
            this.f258952r = interfaceC43172j2;
            this.f258951q = 1;
            obj = interfaceC17032a.a(jNow, 50L, list, this);
            interfaceC43172j = interfaceC43172j2;
            if (obj == coroutine_suspended) {
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
            InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f258952r;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j3;
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                throw C35936s.a(((TypedResult.Error) typedResult).getError(), null);
            }
            throw new NoWhenBranchMatchedException();
        }
        bVar = new c.C2712c((C39777a) ((TypedResult.Success) typedResult).getResult());
        r12 = interfaceC43172j;
        this.f258952r = null;
        this.f258951q = 2;
        if (r12.emit(bVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
