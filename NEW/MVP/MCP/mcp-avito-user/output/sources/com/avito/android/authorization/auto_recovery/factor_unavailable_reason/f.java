package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import Y41.p;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FactorUnavailableReasonFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment$acceptAction$1", f = "FactorUnavailableReasonFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ FactorUnavailableReasonFragment f93115q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FactorUnavailableReasonAction f93116r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FactorUnavailableReasonFragment factorUnavailableReasonFragment, FactorUnavailableReasonAction factorUnavailableReasonAction, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f93115q = factorUnavailableReasonFragment;
        this.f93116r = factorUnavailableReasonAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f93115q, this.f93116r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((l) this.f93115q.f93082o0.getValue()).accept(this.f93116r);
        return G0.f406611a;
    }
}
