package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import Y41.p;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacFinishedFallbackScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.IacFinishedFallbackScreenActor$onMessengerClicked$1", f = "IacFinishedFallbackScreenActor.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super IacFinishedFallbackScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166584q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166585r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFallbackScreenState f166586s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f166587t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFallbackScreenAction f166588u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IacFinishedFallbackScreenState iacFinishedFallbackScreenState, a aVar, IacFinishedFallbackScreenAction iacFinishedFallbackScreenAction, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f166586s = iacFinishedFallbackScreenState;
        this.f166587t = aVar;
        this.f166588u = iacFinishedFallbackScreenAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f166586s, this.f166587t, this.f166588u, continuation);
        cVar.f166585r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacFinishedFallbackScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166584q;
        a aVar = this.f166587t;
        IacFinishedFallbackScreenState iacFinishedFallbackScreenState = this.f166586s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f166585r;
            IacPiiDeepLink messengerLink = iacFinishedFallbackScreenState.getArgument().getMessengerLink();
            if (messengerLink == null) {
                a.c(aVar, this.f166588u, "messenger link is null, but button is clicked");
                return G0.f406611a;
            }
            IacFinishedFallbackScreenInternalAction.HandleDeeplink handleDeeplink = new IacFinishedFallbackScreenInternalAction.HandleDeeplink(messengerLink);
            this.f166584q = 1;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        String itemId = iacFinishedFallbackScreenState.getArgument().getItemId();
        if (itemId != null) {
            aVar.f166575a.c(new i1(aVar.f166578d, aVar.f166575a, 0L, (TreeClickStreamParent) null, itemId, "iac_call_end_fallback", Boxing.boxInt(11), (String) null, (String) null, (String) null, 512, (C42822w) null));
            aVar.f166577c.a();
        }
        return G0.f406611a;
    }
}
