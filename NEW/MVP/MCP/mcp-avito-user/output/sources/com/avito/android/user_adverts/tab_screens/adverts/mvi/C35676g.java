package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processAdvertSelected$3", f = "UserAdvertsListActor.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35676g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAdvertsListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315422q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315423r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItemDomain f315424s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35676g(UserAdvertItemDomain userAdvertItemDomain, Continuation<? super C35676g> continuation) {
        super(2, continuation);
        this.f315424s = userAdvertItemDomain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35676g c35676g = new C35676g(this.f315424s, continuation);
        c35676g.f315423r = obj;
        return c35676g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35676g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315422q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f315423r;
            UserAdvertsListInternalAction.SingleSelect singleSelect = new UserAdvertsListInternalAction.SingleSelect(this.f315424s.f315030P);
            this.f315422q = 1;
            if (interfaceC43172j.emit(singleSelect, this) == coroutine_suspended) {
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
