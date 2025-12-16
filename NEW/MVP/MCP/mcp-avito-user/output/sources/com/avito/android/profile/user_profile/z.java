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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/promoblock/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/promoblock/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileView$2", f = "UserProfileView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class z extends SuspendLambda implements Y41.p<com.avito.android.promoblock.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f226602q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f226603r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d12, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f226603r = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        z zVar = new z(this.f226603r, continuation);
        zVar.f226602q = obj;
        return zVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.promoblock.a aVar, Continuation<? super G0> continuation) {
        return ((z) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.promoblock.a aVar = (com.avito.android.promoblock.a) this.f226602q;
        D d12 = this.f226603r;
        d12.f224200d.accept(new InterfaceC15503a.y(aVar));
        return G0.f406611a;
    }
}
