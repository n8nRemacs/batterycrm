package androidx.compose.runtime;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.runtime.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22155s3 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f38561q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f38562r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<U1<Object>, Continuation<? super kotlin.G0>, Object> f38563s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Object> f38564t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22155s3(Y41.p<? super U1<Object>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, InterfaceC22204y1<Object> interfaceC22204y1, Continuation<? super C22155s3> continuation) {
        super(2, continuation);
        this.f38563s = pVar;
        this.f38564t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C22155s3 c22155s3 = new C22155s3(this.f38563s, this.f38564t, continuation);
        c22155s3.f38562r = obj;
        return c22155s3;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C22155s3) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f38561q;
        if (i12 == 0) {
            C42729a0.b(obj);
            W1 w12 = new W1(this.f38564t, ((kotlinx.coroutines.T) this.f38562r).getF38162b());
            this.f38561q = 1;
            if (this.f38563s.invoke(w12, this) == coroutine_suspended) {
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
