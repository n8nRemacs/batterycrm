package S41;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Thread.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS41/b;", "Ljava/lang/Thread;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f14804b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Y41.a<G0> aVar) {
        this.f14804b = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f14804b.invoke();
    }
}
