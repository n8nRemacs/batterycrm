package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import io.reactivex.rxjava3.core.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;
import lK0.InterfaceC43650a;

/* compiled from: UserViewedActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_viewed.screen.mvi.UserViewedActor$process$5", f = "UserViewedActor.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserViewedInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f318404q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f318405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43650a f318406s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC43650a interfaceC43650a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f318405r = eVar;
        this.f318406s = interfaceC43650a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f318405r, this.f318406s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserViewedInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f318404q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.favorite.h hVar = this.f318405r.f318408b;
            InterfaceC43650a.e eVar = (InterfaceC43650a.e) this.f318406s;
            I iG2 = hVar.g(eVar.f413721a, new AbstractC30567a.o(eVar.f413723c), eVar.f413722b, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0);
            this.f318404q = 1;
            if (C43292o.b(iG2, this) == coroutine_suspended) {
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
