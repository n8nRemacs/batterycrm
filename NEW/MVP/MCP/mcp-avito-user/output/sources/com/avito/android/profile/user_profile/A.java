package com.avito.android.profile.user_profile;

import Ua0.InterfaceC15503a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserProfileView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/user_hat/e;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/component/user_hat/e;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileView$3", f = "UserProfileView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class A extends SuspendLambda implements Y41.p<com.avito.android.component.user_hat.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f224192q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f224193r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d12, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f224193r = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        A a12 = new A(this.f224193r, continuation);
        a12.f224192q = obj;
        return a12;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.component.user_hat.e eVar, Continuation<? super G0> continuation) {
        return ((A) create(eVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.component.user_hat.e eVar = (com.avito.android.component.user_hat.e) this.f224192q;
        D d12 = this.f224193r;
        d12.f224200d.accept(new InterfaceC15503a.w(eVar));
        return G0.f406611a;
    }
}
