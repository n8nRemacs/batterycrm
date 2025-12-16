package com.avito.android.mortgage.root.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import g10.C40513c;
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

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$handleIssueClick$1", f = "MortgageRootActor.kt", i = {}, l = {448, 450}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.root.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32685c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f202953q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f202954r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeepLink f202955s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f202956t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C40513c f202957u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32685c(DeepLink deepLink, s sVar, C40513c c40513c, Continuation<? super C32685c> continuation) {
        super(2, continuation);
        this.f202955s = deepLink;
        this.f202956t = sVar;
        this.f202957u = c40513c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32685c c32685c = new C32685c(this.f202955s, this.f202956t, this.f202957u, continuation);
        c32685c.f202954r = obj;
        return c32685c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32685c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f202953q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f202954r;
            DeepLink deepLink = this.f202955s;
            if (deepLink == null || (deepLink instanceof NoMatchLink)) {
                InterfaceC43160i<MortgageRootInternalAction> interfaceC43160iD = this.f202956t.d(this.f202957u, ApplicationProcessType.PREVIOUS, false);
                this.f202953q = 2;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                MortgageRootInternalAction.HandleDeeplink handleDeeplink = new MortgageRootInternalAction.HandleDeeplink(deepLink);
                this.f202953q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
