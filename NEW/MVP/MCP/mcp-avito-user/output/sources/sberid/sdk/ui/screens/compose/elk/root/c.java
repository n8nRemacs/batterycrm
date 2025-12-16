package sberid.sdk.ui.screens.compose.elk.root;

import androidx.compose.runtime.InterfaceC22204y1;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "sberid.sdk.ui.screens.compose.elk.root.ELKScreenKt$ELKScreen$3", f = "ELKScreen.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f437800q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f437801r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f437802s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f437803t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<InterfaceC40658b.k> f437804u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z12, w wVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
        super(2, continuation);
        this.f437801r = z12;
        this.f437802s = wVar;
        this.f437803t = interfaceC22204y1;
        this.f437804u = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f437803t;
        InterfaceC22204y1<InterfaceC40658b.k> interfaceC22204y12 = this.f437804u;
        return new c(this.f437801r, this.f437802s, interfaceC22204y1, interfaceC22204y12, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f437800q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f437800q = 1;
            if (C43131e0.b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        if (this.f437801r) {
            List<InterfaceC40658b> list = i.f437814a;
            if (!((s) this.f437803t.getF42167b()).f437832a) {
                this.f437802s.le(new l(this.f437804u.getF42167b()));
            }
        }
        return G0.f406611a;
    }
}
