package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35694d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserAdvertsTooltipsQueue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/d;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue$storeTooltipResult$1", f = "UserAdvertsTooltipsQueue.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class N extends SuspendLambda implements Y41.p<InterfaceC35694d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315607q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315608r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f315609s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p12, Continuation<? super N> continuation) {
        super(2, continuation);
        this.f315609s = p12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        N n12 = new N(this.f315609s, continuation);
        n12.f315608r = obj;
        return n12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC35694d interfaceC35694d, Continuation<? super G0> continuation) {
        return ((N) create(interfaceC35694d, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315607q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC35694d interfaceC35694d = (InterfaceC35694d) this.f315608r;
            boolean z12 = interfaceC35694d instanceof InterfaceC35694d.a;
            P p12 = this.f315609s;
            if (z12) {
                InterfaceC35693c interfaceC35693c = ((InterfaceC35694d.a) interfaceC35694d).f315629a;
                this.f315607q = 1;
                if (P.b(p12, interfaceC35693c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC35694d instanceof InterfaceC35694d.b) {
                InterfaceC35693c interfaceC35693c2 = ((InterfaceC35694d.b) interfaceC35694d).f315630a;
                this.f315607q = 2;
                if (P.b(p12, interfaceC35693c2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (!(interfaceC35694d instanceof InterfaceC35694d.C9781d)) {
                boolean z13 = interfaceC35694d instanceof InterfaceC35694d.c;
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
