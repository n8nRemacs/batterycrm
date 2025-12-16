package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import fJ0.InterfaceC40301a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processSelectSingleAction$$inlined$flatMapLatest$1", f = "UserAdvertsListActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class H extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAdvertsListInternalAction>, InterfaceC40301a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315210q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f315211r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f315212s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35670a f315213t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f315214u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Y41.a aVar, C35670a c35670a, Continuation continuation) {
        super(3, continuation);
        this.f315213t = c35670a;
        this.f315214u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, InterfaceC40301a interfaceC40301a, Continuation<? super G0> continuation) {
        H h12 = new H(this.f315214u, this.f315213t, continuation);
        h12.f315211r = interfaceC43172j;
        h12.f315212s = interfaceC40301a;
        return h12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i<UserAdvertsListInternalAction> interfaceC43160iW;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315210q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f315211r;
            InterfaceC40301a interfaceC40301a = (InterfaceC40301a) this.f315212s;
            if (interfaceC40301a instanceof InterfaceC40301a.d) {
                interfaceC43160iW = this.f315213t.b(interfaceC40301a, (UserAdvertsListState) this.f315214u.invoke());
            } else {
                interfaceC43160iW = C43175k.w();
            }
            this.f315210q = 1;
            if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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
