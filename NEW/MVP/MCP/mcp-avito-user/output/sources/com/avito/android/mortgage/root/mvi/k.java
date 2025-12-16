package com.avito.android.mortgage.root.mvi;

import KZ.C14272b;
import KZ.C14281k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.InterfaceC40199a;
import g10.C40513c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$3", f = "MortgageRootActor.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203278q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203279r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f203280s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40513c f203281t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40199a f203282u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, InterfaceC40199a interfaceC40199a, C40513c c40513c, Continuation continuation) {
        super(2, continuation);
        this.f203280s = sVar;
        this.f203281t = c40513c;
        this.f203282u = interfaceC40199a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C40513c c40513c = this.f203281t;
        k kVar = new k(this.f203280s, this.f203282u, c40513c, continuation);
        kVar.f203279r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deeplink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203278q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203279r;
            C14272b c14272bC = s.c(this.f203280s, this.f203281t.f396248d, ((InterfaceC40199a.C40201c) this.f203282u).f395598a);
            if (c14272bC == null) {
                return G0.f406611a;
            }
            C14281k textToManagerButton = c14272bC.getTextToManagerButton();
            if (textToManagerButton == null || (deeplink = textToManagerButton.getDeeplink()) == null) {
                return G0.f406611a;
            }
            MortgageRootInternalAction.HandleDeeplink handleDeeplink = new MortgageRootInternalAction.HandleDeeplink(deeplink);
            this.f203278q = 1;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
