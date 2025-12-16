package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "action", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$requestUpdateCounter$1", f = "UserAdvertsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class I extends SuspendLambda implements Y41.p<UserAdvertsListInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f315215q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f315216r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35670a f315217s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, C35670a c35670a, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f315216r = str;
        this.f315217s = c35670a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I i12 = new I(this.f315216r, this.f315217s, continuation);
        i12.f315215q = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(UserAdvertsListInternalAction userAdvertsListInternalAction, Continuation<? super G0> continuation) {
        return ((I) create(userAdvertsListInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        UserAdvertsListInternalAction userAdvertsListInternalAction = (UserAdvertsListInternalAction) this.f315215q;
        nI0.i.f414995a.getClass();
        if (this.f315216r.equals("inactive") && (userAdvertsListInternalAction instanceof UserAdvertsListInternalAction.LoadingResult) && !((UserAdvertsListInternalAction.LoadingResult) userAdvertsListInternalAction).f315352c) {
            this.f315217s.f315276e.a();
        }
        return G0.f406611a;
    }
}
