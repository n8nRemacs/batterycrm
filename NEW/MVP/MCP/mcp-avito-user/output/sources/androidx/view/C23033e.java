package androidx.view;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23033e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f46779q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f46780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C23035f<Object> f46781s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23033e(C23035f<Object> c23035f, Continuation<? super C23033e> continuation) {
        super(2, continuation);
        this.f46781s = c23035f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        C23033e c23033e = new C23033e(this.f46781s, continuation);
        c23033e.f46780r = obj;
        return c23033e;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C23033e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f46779q;
        C23035f<Object> c23035f = this.f46781s;
        if (i12 == 0) {
            C42729a0.b(obj);
            C22998c0 c22998c0 = new C22998c0(c23035f.f46786a, ((T) this.f46780r).getF398924i());
            this.f46779q = 1;
            if (c23035f.f46787b.invoke(c22998c0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        ((C23045k) c23035f.f46790e).invoke();
        return G0.f406611a;
    }
}
