package sberid.sdk.ui.screens.compose.elk.root;

import gc1.InterfaceC40658b;
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
@DebugMetadata(c = "sberid.sdk.ui.screens.compose.elk.root.ELKScreenKt$ELKScreen$2", f = "ELKScreen.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f437795q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f437796r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N41.g f437797s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f437798t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f437799u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z12, N41.g gVar, w wVar, InterfaceC40658b.k kVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f437796r = z12;
        this.f437797s = gVar;
        this.f437798t = wVar;
        this.f437799u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f437796r, this.f437797s, this.f437798t, this.f437799u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f437795q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f437795q = 1;
            if (C43131e0.b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        InterfaceC40658b.k kVar = this.f437799u;
        w wVar = this.f437798t;
        boolean z12 = this.f437797s.f11197d;
        boolean z13 = this.f437796r;
        if (z13 && z12) {
            wVar.le(new p(kVar));
        } else if (z13 && !z12) {
            wVar.le(new n(kVar));
        }
        return G0.f406611a;
    }
}
