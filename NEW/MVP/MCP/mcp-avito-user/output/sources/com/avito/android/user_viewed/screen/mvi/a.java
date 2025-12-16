package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.statsd.y;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserViewedActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_viewed.screen.mvi.UserViewedActor$process$1", f = "UserViewedActor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserViewedInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f318393q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f318394r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserViewedState f318395s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f318396t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UserViewedState userViewedState, e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f318395s = userViewedState;
        this.f318396t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f318395s, this.f318396t, continuation);
        aVar.f318394r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserViewedInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f318393q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f318394r;
            UserViewedState userViewedState = this.f318395s;
            if (userViewedState instanceof UserViewedState.Content) {
                UserViewedState.Content content = (UserViewedState.Content) userViewedState;
                if (!content.f318423e) {
                    this.f318396t.f318410d.c(new y.b("userViewedAbTest.tab.bottom", Boxing.boxInt(content.f318420b.size()), null));
                    UserViewedInternalAction.ScrolledBottom scrolledBottom = UserViewedInternalAction.ScrolledBottom.f318417b;
                    this.f318393q = 1;
                    if (interfaceC43172j.emit(scrolledBottom, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
