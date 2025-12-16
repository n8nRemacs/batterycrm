package androidx.view;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: Lifecycle.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.lifecycle.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22975H extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f46668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC22973F f46669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f46670s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22975H(AbstractC22973F abstractC22973F, p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super C22975H> continuation) {
        super(2, continuation);
        this.f46669r = abstractC22973F;
        this.f46670s = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new C22975H(this.f46669r, this.f46670s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C22975H) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f46668q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle f46674b = this.f46669r.getF46674b();
            this.f46668q = 1;
            if (C23048l0.a(f46674b, Lifecycle.State.f46682e, this.f46670s, this) == coroutine_suspended) {
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
