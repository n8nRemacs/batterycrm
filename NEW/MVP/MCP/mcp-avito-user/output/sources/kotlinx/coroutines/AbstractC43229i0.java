package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C43242l;

/* compiled from: DispatchedTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/i0;", "T", "Lkotlinx/coroutines/scheduling/j;", "Lkotlinx/coroutines/SchedulerTask;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.coroutines.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43229i0<T> extends kotlinx.coroutines.scheduling.j {

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public int f411859d;

    public AbstractC43229i0(int i12) {
        this.f411859d = i12;
    }

    @Y61.k
    public abstract Continuation<T> b();

    @Y61.l
    public Throwable d(@Y61.l Object obj) {
        E e12 = obj instanceof E ? (E) obj : null;
        if (e12 != null) {
            return e12.f410693a;
        }
        return null;
    }

    public final void g(@Y61.l Throwable th2, @Y61.l Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            C42833p.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        P.a(b().getF411447c(), new V("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    @Y61.l
    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object bVar;
        Object bVar2;
        kotlinx.coroutines.scheduling.k kVar = this.f412175c;
        try {
            C43242l c43242l = (C43242l) b();
            Continuation<T> continuation = c43242l.f411915f;
            Object obj = c43242l.f411917h;
            CoroutineContext f410748d = continuation.getF411447c();
            Object objB = kotlinx.coroutines.internal.g0.b(f410748d, obj);
            F1<?> f1D = objB != kotlinx.coroutines.internal.g0.f411898a ? K.d(continuation, f410748d, objB) : null;
            try {
                CoroutineContext f410748d2 = continuation.getF411447c();
                Object objH = h();
                Throwable thD = d(objH);
                N0 n02 = (thD == null && C43257j0.a(this.f411859d)) ? (N0) f410748d2.get(N0.f410716u2) : null;
                if (n02 != null && !n02.isActive()) {
                    CancellationException cancellationExceptionJ = n02.J();
                    a(objH, cancellationExceptionJ);
                    int i12 = kotlin.Z.f406624c;
                    continuation.resumeWith(new Z.b(cancellationExceptionJ));
                } else if (thD != null) {
                    int i13 = kotlin.Z.f406624c;
                    continuation.resumeWith(new Z.b(thD));
                } else {
                    int i14 = kotlin.Z.f406624c;
                    continuation.resumeWith(e(objH));
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                if (f1D == null || f1D.F0()) {
                    kotlinx.coroutines.internal.g0.a(f410748d, objB);
                }
                try {
                    kVar.getClass();
                    bVar2 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    int i15 = kotlin.Z.f406624c;
                    bVar2 = new Z.b(th2);
                }
                g(null, kotlin.Z.b(bVar2));
            } catch (Throwable th3) {
                if (f1D == null || f1D.F0()) {
                    kotlinx.coroutines.internal.g0.a(f410748d, objB);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                int i16 = kotlin.Z.f406624c;
                kVar.getClass();
                bVar = kotlin.G0.f406611a;
            } catch (Throwable th5) {
                int i17 = kotlin.Z.f406624c;
                bVar = new Z.b(th5);
            }
            g(th4, kotlin.Z.b(bVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(@Y61.l Object obj) {
        return obj;
    }

    public void a(@Y61.l Object obj, @Y61.k CancellationException cancellationException) {
    }
}
