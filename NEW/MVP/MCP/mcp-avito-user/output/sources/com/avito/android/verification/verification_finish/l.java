package com.avito.android.verification.verification_finish;

import com.avito.android.remote.A1;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.VerificationFinishResult;
import com.avito.android.util.C35936s;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationFinishInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_finish.VerificationFinishInteractor$subscribeToStatusUpdate$2$1", f = "VerificationFinishInteractor.kt", i = {0}, l = {49, 50}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FinishInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325262q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f325264s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f325264s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f325264s, continuation);
        lVar.f325263r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FinishInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325262q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f325263r;
            i iVar = this.f325264s;
            A1 a12 = iVar.f325247a;
            ?? r62 = iVar.f325249c.f325227b;
            this.f325263r = interfaceC43172j;
            this.f325262q = 1;
            obj = a12.q(r62, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f325263r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            FinishInternalAction.Loaded loaded = new FinishInternalAction.Loaded((VerificationFinishResult) ((TypedResult.Success) typedResult).getResult());
            this.f325263r = null;
            this.f325262q = 2;
            if (interfaceC43172j.emit(loaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
        }
        return G0.f406611a;
    }
}
