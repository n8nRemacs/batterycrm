package com.avito.android.mortgage.verification_flow.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import com.avito.android.mortgage.verification_flow.mvi.entity.VerificationFlowInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
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

/* compiled from: VerificationFlowBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.b<VerificationFlowInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VerificationFlowArguments f203903a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f203904b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f203905c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f203906d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f203907e;

    /* compiled from: VerificationFlowBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$Init;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.verification_flow.mvi.VerificationFlowBootstrap$produce$1", f = "VerificationFlowBootstrap.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super VerificationFlowInternalAction.Init>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203908q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203909r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f203909r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super VerificationFlowInternalAction.Init> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203908q;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203909r;
                if (cVar.f203907e) {
                    return G0.f406611a;
                }
                cVar.f203907e = true;
                VerificationFlowInternalAction.Init init = new VerificationFlowInternalAction.Init(cVar.f203903a);
                this.f203908q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            cVar.f203905c.getClass();
            String strA = com.avito.android.mortgage.util.d.a();
            IZ.a aVar = cVar.f203904b.get();
            String str = cVar.f203903a.f203900b;
            this.f203908q = 2;
            if (aVar.t(str, "requested", strA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k VerificationFlowArguments verificationFlowArguments, @Y61.k h31.e<IZ.a> eVar, @Y61.k com.avito.android.mortgage.util.d dVar, @Y61.k R0 r02) {
        this.f203903a = verificationFlowArguments;
        this.f203904b = eVar;
        this.f203905c = dVar;
        this.f203906d = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<VerificationFlowInternalAction> a() {
        return C43175k.I(this.f203906d.a(), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
