package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$filesDeleted$$inlined$transform$1", f = "EvidenceDetailsBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
public final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f149060q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f149061r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f149062s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<EvidenceDetailsInternalAction> f149063b;

        public a(InterfaceC43172j interfaceC43172j) {
            this.f149063b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f149062s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f149062s, continuation);
        iVar.f149061r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f149060q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f149061r);
            this.f149060q = 1;
            if (this.f149062s.collect(aVar, this) == coroutine_suspended) {
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
