package com.avito.android.sbc.autodispatcheslist;

import Ro0.c;
import Xo0.InterfaceC17032a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.sbc.autodispatches.C34466b;
import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import com.avito.android.util.C35936s;
import dp0.C39777a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SbcAutoDispatchesListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LRo0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListInteractorImpl$loadAutoDispatchesForStatuses$1", f = "SbcAutoDispatchesListInteractor.kt", i = {0}, l = {40, 65}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super Ro0.c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259094q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259095r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f259096s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Long f259097t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Long l12, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f259096s = fVar;
        this.f259097t = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f259096s, this.f259097t, continuation);
        dVar.f259095r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Ro0.c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        com.avito.android.arch.mvi.utils.c bVar;
        ?? r12;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259094q;
        f fVar = this.f259096s;
        boolean z12 = true;
        try {
        } catch (Throwable th2) {
            Q0.e(getF411447c());
            bVar = new c.b(th2);
            r12 = i12;
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f259095r;
            InterfaceC17032a interfaceC17032a = fVar.f259101b;
            Long l12 = this.f259097t;
            long jLongValue = l12 != null ? l12.longValue() : fVar.f259103d.now();
            List<String> list = fVar.f259104e.f258988c;
            this.f259095r = interfaceC43172j2;
            this.f259094q = 1;
            obj = interfaceC17032a.a(jLongValue, 50L, list, this);
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
            InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f259095r;
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
        if (bVar instanceof c.C2712c) {
            List<AutoDispatchOut> listA = ((C39777a) ((c.C2712c) bVar).f92028b).a();
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            if (!listA.isEmpty() && listA.size() >= 50) {
                z12 = false;
            }
            C34466b c34466b = new C34466b(listA, z12);
            boolean z13 = fVar.f259104e.f258987b;
            InterfaceC34468d interfaceC34468d = fVar.f259100a;
            if (z13) {
                interfaceC34468d.d(c34466b);
            } else {
                interfaceC34468d.a(c34466b);
            }
        } else {
            c.C0982c c0982c = c.C0982c.f14643a;
            this.f259095r = null;
            this.f259094q = 2;
            if (r12.emit(c0982c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
