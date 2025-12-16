package com.avito.android.authorization.complete_registration;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.model.UserDialog;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.complete_registration.CompleteRegistrationFragment$showUserDialog$1", f = "CompleteRegistrationFragment.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93530q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CompleteRegistrationFragment f93531r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserDialog f93532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CompleteRegistrationFragment completeRegistrationFragment, UserDialog userDialog, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f93531r = completeRegistrationFragment;
        this.f93532s = userDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f93531r, this.f93532s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f93530q;
        CompleteRegistrationFragment completeRegistrationFragment = this.f93531r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC30274a interfaceC30274a = completeRegistrationFragment.f93390q0;
            if (interfaceC30274a == null) {
                interfaceC30274a = null;
            }
            io.reactivex.rxjava3.core.q qVarF = interfaceC30274a.f(this.f93532s);
            this.f93530q = 1;
            obj = C43292o.g(qVarF, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        DeepLink deepLink = (DeepLink) obj;
        if (deepLink != null) {
            completeRegistrationFragment.i7(deepLink);
        }
        return G0.f406611a;
    }
}
