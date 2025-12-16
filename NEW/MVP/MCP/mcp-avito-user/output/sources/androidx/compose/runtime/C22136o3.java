package androidx.compose.runtime;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.runtime.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22136o3 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f38514q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f38515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<U1<Object>, Continuation<? super kotlin.G0>, Object> f38516s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Object> f38517t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22136o3(Y41.p<? super U1<Object>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, InterfaceC22204y1<Object> interfaceC22204y1, Continuation<? super C22136o3> continuation) {
        super(2, continuation);
        this.f38516s = pVar;
        this.f38517t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C22136o3 c22136o3 = new C22136o3(this.f38516s, this.f38517t, continuation);
        c22136o3.f38515r = obj;
        return c22136o3;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C22136o3) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f38514q;
        if (i12 == 0) {
            C42729a0.b(obj);
            W1 w12 = new W1(this.f38517t, ((kotlinx.coroutines.T) this.f38515r).getF38162b());
            this.f38514q = 1;
            if (this.f38516s.invoke(w12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
