package com.avito.android.mortgage_invite.client_form.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationClientFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.mvi.ApplicationClientFormActor$process$4", f = "ApplicationClientFormActor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationClientFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205224q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205225r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U10.c f205226s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(U10.c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f205226s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f205226s, continuation);
        dVar.f205225r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationClientFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205224q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f205225r;
            DeepLink deepLink = this.f205226s.f16111d;
            if (deepLink != null) {
                ApplicationClientFormInternalAction.HandleDeeplink handleDeeplink = new ApplicationClientFormInternalAction.HandleDeeplink(deepLink, true);
                this.f205224q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
