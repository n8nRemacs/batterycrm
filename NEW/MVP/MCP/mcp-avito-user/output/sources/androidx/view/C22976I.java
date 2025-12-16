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
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.lifecycle.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22976I extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f46672q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22977J f46673r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22976I(C22977J c22977j, Continuation<? super C22976I> continuation) {
        super(2, continuation);
        this.f46673r = c22977j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        C22976I c22976i = new C22976I(this.f46673r, continuation);
        c22976i.f46672q = obj;
        return c22976i;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C22976I) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f46672q;
        C22977J c22977j = this.f46673r;
        Lifecycle lifecycle = c22977j.f46674b;
        if (lifecycle.getF46705d().compareTo(Lifecycle.State.f46680c) >= 0) {
            lifecycle.a(c22977j);
        } else {
            Q0.b(t12.getF115043e(), null);
        }
        return G0.f406611a;
    }
}
