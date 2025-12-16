package androidx.work;

import Fc1.G3;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class B implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55352b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55354d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B(Executor executor, Y41.a aVar) {
        this.f55353c = executor;
        this.f55354d = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r2v7, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.concurrent.futures.b.c
    public final Object d(b.a aVar) {
        switch (this.f55352b) {
            case 0:
                N0.b bVar = N0.f410716u2;
                CoroutineContext coroutineContext = (CoroutineContext) this.f55353c;
                aVar.a(new G3((N0) coroutineContext.get(bVar), 16), DirectExecutor.f55372b);
                return C43259k.d(kotlinx.coroutines.U.a(coroutineContext), null, CoroutineStart.f410680b, new D((SuspendLambda) this.f55354d, aVar, null), 1);
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                aVar.a(new C(atomicBoolean, 1), DirectExecutor.f55372b);
                ((Executor) this.f55353c).execute(new Me.m(atomicBoolean, aVar, (kotlin.jvm.internal.N) this.f55354d));
                return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B(CoroutineContext coroutineContext, Y41.p pVar) {
        CoroutineStart coroutineStart = CoroutineStart.f410680b;
        this.f55353c = coroutineContext;
        this.f55354d = (SuspendLambda) pVar;
    }
}
