package androidx.concurrent.futures;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.D0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.E1;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.K;

/* compiled from: SuspendToFutureAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/concurrent/futures/f;", "", "<init>", "()V", "a", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f43167a = new f();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f43168b = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final E1 f43169c = C43262l0.f411946b;

    /* compiled from: SuspendToFutureAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/concurrent/futures/f$a;", "T", "Lcom/google/common/util/concurrent/D0;", "Lkotlin/coroutines/Continuation;", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements D0<T>, Continuation<T> {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC43076a0<T> f43170b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final e<T> f43171c = new e<>();

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k InterfaceC43076a0<? extends T> interfaceC43076a0) {
            this.f43170b = interfaceC43076a0;
        }

        @Override // com.google.common.util.concurrent.D0
        public final void N(@k Runnable runnable, @k Executor executor) {
            this.f43171c.N(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z12) {
            boolean zCancel = this.f43171c.cancel(z12);
            if (zCancel) {
                ((V0) this.f43170b).c(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f43171c.get();
        }

        @Override // kotlin.coroutines.Continuation
        @k
        /* renamed from: getContext */
        public final CoroutineContext getF411447c() {
            return f.f43169c;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f43171c.f43139b instanceof a.c;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f43171c.isDone();
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@k Object obj) {
            Throwable thB = Z.b(obj);
            e<T> eVar = this.f43171c;
            if (thB == null) {
                eVar.j(obj);
            } else if (thB instanceof CancellationException) {
                eVar.cancel(false);
            } else {
                eVar.k(thB);
            }
        }

        @Override // java.util.concurrent.Future
        public final T get(long j12, @k TimeUnit timeUnit) {
            return this.f43171c.get(j12, timeUnit);
        }
    }

    /* compiled from: SuspendToFutureAdapter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/concurrent/futures/f$b", "Lkotlinx/coroutines/T;", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements T {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC43129d1 f43172b;

        public b() {
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            this.f43172b = K.f411877a;
        }

        @Override // kotlinx.coroutines.T
        @k
        /* renamed from: getCoroutineContext */
        public final CoroutineContext getF399611e() {
            return this.f43172b;
        }
    }

    /* compiled from: SuspendToFutureAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<Continuation<Object>, Object>, SuspendFunction {
        @Override // Y41.l
        public final Object invoke(Continuation<Object> continuation) {
            return ((InterfaceC43076a0) this.receiver).F(continuation);
        }
    }

    @k
    public static D0 a(@k CoroutineContext coroutineContext, boolean z12, @k p pVar) {
        InterfaceC43076a0 interfaceC43076a0A = C43259k.a(f43168b, coroutineContext, z12 ? CoroutineStart.f410683e : CoroutineStart.f410680b, pVar);
        a aVar = new a(interfaceC43076a0A);
        Continuation<G0> continuationCreateCoroutine = ContinuationKt.createCoroutine(new c(1, interfaceC43076a0A, InterfaceC43076a0.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), aVar);
        int i12 = Z.f406624c;
        continuationCreateCoroutine.resumeWith(G0.f406611a);
        return aVar;
    }
}
