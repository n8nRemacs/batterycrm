package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lK0.InterfaceC43650a;

/* compiled from: UserViewedActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_viewed.screen.mvi.UserViewedActor$process$4", f = "UserViewedActor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserViewedInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f318400q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f318401r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f318402s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43650a f318403t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, InterfaceC43650a interfaceC43650a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f318402s = eVar;
        this.f318403t = interfaceC43650a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f318402s, this.f318403t, continuation);
        cVar.f318401r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserViewedInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f318400q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f318401r;
            InterfaceC28373a interfaceC28373a = this.f318402s.f318410d;
            StringBuilder sb2 = new StringBuilder("userViewedAbTest.tab.button.contact.");
            InterfaceC43650a.c cVar = (InterfaceC43650a.c) this.f318403t;
            sb2.append(cVar.f413719c);
            interfaceC28373a.c(new y.a(sb2.toString(), 0L, 2, null));
            UserViewedInternalAction.OpenDeeplink openDeeplink = new UserViewedInternalAction.OpenDeeplink(cVar.f413717a, cVar.f413718b);
            this.f318400q = 1;
            if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
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
