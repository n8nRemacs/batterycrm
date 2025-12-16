package com.avito.android.mortgage_invite.client_form.mvi;

import Y41.p;
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
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.mvi.ApplicationClientFormActor$process$2", f = "ApplicationClientFormActor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationClientFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205216q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f205218s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ U10.c f205219t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, U10.c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f205218s = eVar;
        this.f205219t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f205218s, this.f205219t, continuation);
        bVar.f205217r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationClientFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205216q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f205217r;
            ApplicationClientFormInternalAction.OpenClientSearch openClientSearch = new ApplicationClientFormInternalAction.OpenClientSearch(e.c(this.f205218s, this.f205219t));
            this.f205216q = 1;
            if (interfaceC43172j.emit(openClientSearch, this) == coroutine_suspended) {
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
