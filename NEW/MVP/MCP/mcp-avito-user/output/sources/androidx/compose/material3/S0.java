package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class S0 extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f35390q;

    /* renamed from: r, reason: collision with root package name */
    public int f35391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T0 f35392s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(T0 t02, Continuation<? super S0> continuation) {
        super(1, continuation);
        this.f35392s = t02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
        return new S0(this.f35392s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((S0) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35391r;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
        C42729a0.b(obj);
        T0 t02 = this.f35392s;
        this.f35391r = 1;
        new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this)).p();
        t02.getClass();
        throw null;
    }
}
