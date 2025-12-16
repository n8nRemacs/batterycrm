package com.avito.android.user_adverts.tab_actions.info.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import bJ0.C25520c;
import com.avito.android.user_adverts.tab_actions.info.mvi.entity.UserAdvertsActionResultInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsActionResultActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.info.mvi.UserAdvertsActionResultActor$initialize$1", f = "UserAdvertsActionResultActor.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super UserAdvertsActionResultInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314671q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f314672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C25520c f314673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C25520c c25520c, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f314673s = c25520c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f314673s, continuation);
        aVar.f314672r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAdvertsActionResultInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314671q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f314672r;
            UserAdvertsActionResultInternalAction userAdvertsActionResultInternalAction = this.f314673s.f57036c instanceof C25520c.a.b ? UserAdvertsActionResultInternalAction.Init.f314681b : UserAdvertsActionResultInternalAction.NoChange.f314682b;
            this.f314671q = 1;
            if (interfaceC43172j.emit(userAdvertsActionResultInternalAction, this) == coroutine_suspended) {
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
