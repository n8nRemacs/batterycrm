package com.avito.android.oauth.presentation.mvi;

import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import io.reactivex.rxjava3.internal.operators.completable.K;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;
import l40.InterfaceC43542a;

/* compiled from: OAuthActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthActor$process$2", f = "OAuthActor.kt", i = {0, 1}, l = {30, 31, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208348q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208349r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32904a f208350s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C32904a c32904a, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f208350s = c32904a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f208350s, continuation);
        mVar.f208349r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f208348q;
        try {
        } catch (Throwable unused) {
            OAuthInternalAction.ShowNetworkError showNetworkError = new OAuthInternalAction.ShowNetworkError(InterfaceC43542a.g.f413455a, null, 2, null);
            this.f208349r = null;
            this.f208348q = 3;
            if (r12.emit(showNetworkError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (r12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f208349r;
            K kA2 = this.f208350s.f208279b.a(null, true);
            this.f208349r = interfaceC43172j;
            this.f208348q = 1;
            if (C43292o.a(kA2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (r12 != 1) {
                if (r12 == 2) {
                    C42729a0.b(obj);
                } else {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f208349r;
            C42729a0.b(obj);
        }
        OAuthInternalAction.Unauthorized unauthorized = OAuthInternalAction.Unauthorized.f208325b;
        this.f208349r = interfaceC43172j;
        this.f208348q = 2;
        if (interfaceC43172j.emit(unauthorized, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
