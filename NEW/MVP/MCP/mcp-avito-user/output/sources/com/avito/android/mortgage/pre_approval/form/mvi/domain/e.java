package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import javax.inject.Inject;
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

/* compiled from: NavigationInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/domain/e;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f201902a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G f201903b;

    /* compiled from: NavigationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.domain.NavigationInteractor$navigatePrevious$1", f = "NavigationInteractor.kt", i = {}, l = {72, 72}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201904q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201905r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ R00.b f201906s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(R00.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f201906s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f201906s, continuation);
            aVar.f201905r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PreApprovalFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201904q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201905r;
                if (this.f201906s.f14058d.b() == null) {
                    PreApprovalFormInternalAction.CloseFlow closeFlow = PreApprovalFormInternalAction.CloseFlow.f201916b;
                    this.f201904q = 1;
                    if (interfaceC43172j.emit(closeFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PreApprovalFormInternalAction.PreviousStep previousStep = PreApprovalFormInternalAction.PreviousStep.f201924b;
                    this.f201904q = 2;
                    if (interfaceC43172j.emit(previousStep, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public e(@k h hVar, @k G g12) {
        this.f201902a = hVar;
        this.f201903b = g12;
    }

    @k
    public static InterfaceC43160i a(@k R00.b bVar) {
        return C43175k.G(new a(bVar, null));
    }
}
