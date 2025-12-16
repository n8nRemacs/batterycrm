package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
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

/* compiled from: NavigationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.domain.NavigationInteractor$goNext$1", f = "NavigationInteractor.kt", i = {}, l = {34, 39, 41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201884q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201885r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ R00.b f201886s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f201887t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(R00.b bVar, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f201886s = bVar;
        this.f201887t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f201886s, this.f201887t, continuation);
        cVar.f201885r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PreApprovalFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201884q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201885r;
        R00.b bVar = this.f201886s;
        if (bVar.f14058d.a() != null) {
            PreApprovalFormInternalAction.NextStep nextStep = PreApprovalFormInternalAction.NextStep.f201922b;
            this.f201884q = 1;
            if (interfaceC43172j.emit(nextStep, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        if (this.f201887t.f201903b.b()) {
            InterfaceC43160i interfaceC43160iG = C43175k.G(new f(bVar, null));
            this.f201884q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            PreApprovalFormInternalAction.OpenAuthorization openAuthorization = PreApprovalFormInternalAction.OpenAuthorization.f201923b;
            this.f201884q = 3;
            if (interfaceC43172j.emit(openAuthorization, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
