package androidx.work;

import android.content.Context;
import androidx.work.F;
import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.Q0;

/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/F;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CoroutineWorker extends F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WorkerParameters f55360a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.M f55361b;

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Lkotlinx/coroutines/M;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlinx.coroutines.M {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f55362c = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final kotlinx.coroutines.scheduling.c f55363d = C43262l0.f411945a;

        @Override // kotlinx.coroutines.M
        public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
            f55363d.h(coroutineContext, runnable);
        }

        @Override // kotlinx.coroutines.M
        public final boolean p(@Y61.k CoroutineContext coroutineContext) {
            f55363d.getClass();
            return !false;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/w;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/w;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super C23638w>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f55364q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super C23638w> continuation) {
            b bVar = (b) create(t12, continuation);
            G0 g02 = G0.f406611a;
            bVar.invokeSuspend(g02);
            return g02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f55364q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f55364q = 1;
                throw new IllegalStateException("Not implemented");
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return obj;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super F.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f55366q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super F.a> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f55366q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f55366q = 1;
                obj = CoroutineWorker.this.b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    public CoroutineWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f55360a = workerParameters;
        this.f55361b = a.f55362c;
    }

    @Y61.l
    public abstract Object b(@Y61.k Continuation<? super F.a> continuation);

    @Override // androidx.work.F
    @Y61.k
    public final D0<C23638w> getForegroundInfoAsync() {
        return E.a(this.f55361b.plus(Q0.a()), new b(null));
    }

    @Override // androidx.work.F
    @Y61.k
    public final D0<F.a> startWork() {
        kotlinx.coroutines.M m12 = this.f55361b;
        if (kotlin.jvm.internal.L.f(m12, a.f55362c)) {
            m12 = this.f55360a.f55438g;
        }
        return E.a(m12.plus(Q0.a()), new c(null));
    }
}
