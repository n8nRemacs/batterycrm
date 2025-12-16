package com.avito.android.user_adverts.tab_screens.adverts;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: UserAdvertsListMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectBannerToBeduin$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {668}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315538q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35662a f315539r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C35662a c35662a, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f315539r = c35662a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f315539r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315538q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f315538q = 1;
            C35662a c35662a = this.f315539r;
            Object objCollect = C43175k.I(c35662a.f314901a.c(), C43175k.r(new C35663b(new C35664c(c35662a.f314903c.getState())))).collect(new C35665d(c35662a), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = G0.f406611a;
            }
            if (objCollect == coroutine_suspended) {
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
