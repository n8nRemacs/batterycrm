package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Tooltip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", i = {}, l = {720}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21871sl extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f37284q;

    /* renamed from: r, reason: collision with root package name */
    public int f37285r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ tl f37286s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21871sl(tl tlVar, Continuation<? super C21871sl> continuation) {
        super(1, continuation);
        this.f37286s = tlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
        return new C21871sl(this.f37286s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((C21871sl) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37285r;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
        C42729a0.b(obj);
        tl tlVar = this.f37286s;
        this.f37285r = 1;
        new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this)).p();
        tlVar.getClass();
        Boxing.boxBoolean(true);
        throw null;
    }
}
