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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: PausingDispatcher.jvm.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {205}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
/* renamed from: androidx.lifecycle.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23046k0 extends SuspendLambda implements p<T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f46809q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f46810r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f46811s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f46812t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f46813u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23046k0(Lifecycle lifecycle, Lifecycle.State state, p<? super T, ? super Continuation<Object>, ? extends Object> pVar, Continuation<? super C23046k0> continuation) {
        super(2, continuation);
        this.f46811s = lifecycle;
        this.f46812t = state;
        this.f46813u = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        C23046k0 c23046k0 = new C23046k0(this.f46811s, this.f46812t, this.f46813u, continuation);
        c23046k0.f46810r = obj;
        return c23046k0;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<Object> continuation) {
        return ((C23046k0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws Throwable {
        C22972E c22972e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f46809q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22972e = (C22972E) this.f46810r;
            try {
                C42729a0.b(obj);
                c22972e.a();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c22972e.a();
                throw th;
            }
        }
        C42729a0.b(obj);
        N0 n02 = (N0) ((T) this.f46810r).getF398924i().get(N0.f410716u2);
        if (n02 == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        C23044j0 c23044j0 = new C23044j0();
        C22972E c22972e2 = new C22972E(this.f46811s, this.f46812t, c23044j0.f46807c, n02);
        try {
            ?? r82 = this.f46813u;
            this.f46810r = c22972e2;
            this.f46809q = 1;
            obj = C43259k.g(c23044j0, r82, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            c22972e = c22972e2;
            c22972e.a();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            c22972e = c22972e2;
            c22972e.a();
            throw th;
        }
    }
}
