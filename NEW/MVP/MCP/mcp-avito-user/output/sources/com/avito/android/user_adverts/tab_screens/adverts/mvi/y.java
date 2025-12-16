package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
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

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processRefresh$1", f = "UserAdvertsListActor.kt", i = {0}, l = {380, 381}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class y extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAdvertsListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315519q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListState f315521s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35670a f315522t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListParams f315523u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(UserAdvertsListState userAdvertsListState, C35670a c35670a, UserAdvertsListParams userAdvertsListParams, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f315521s = userAdvertsListState;
        this.f315522t = c35670a;
        this.f315523u = userAdvertsListParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f315521s, this.f315522t, this.f315523u, continuation);
        yVar.f315520r = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((y) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315519q;
        UserAdvertsListState userAdvertsListState = this.f315521s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f315520r;
            UserAdvertsListInternalAction.RefreshingStart refreshingStart = new UserAdvertsListInternalAction.RefreshingStart(userAdvertsListState.f315384b);
            this.f315520r = interfaceC43172j;
            this.f315519q = 1;
            if (interfaceC43172j.emit(refreshingStart, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f315520r;
            C42729a0.b(obj);
        }
        int i13 = C35670a.f315271j;
        InterfaceC43160i<UserAdvertsListInternalAction> interfaceC43160iD = this.f315522t.d(this.f315523u, userAdvertsListState, false);
        this.f315520r = null;
        this.f315519q = 2;
        if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
