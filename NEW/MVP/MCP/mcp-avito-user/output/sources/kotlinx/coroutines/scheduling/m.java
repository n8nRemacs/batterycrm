package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.X;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/m;", "Lkotlinx/coroutines/scheduling/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m extends j {

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Runnable f412177d;

    public m(@Y61.k Runnable runnable, long j12, @Y61.k k kVar) {
        super(j12, kVar);
        this.f412177d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f412177d.run();
        } finally {
            this.f412175c.getClass();
        }
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f412177d;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(X.a(runnable));
        sb2.append(", ");
        sb2.append(this.f412174b);
        sb2.append(", ");
        sb2.append(this.f412175c);
        sb2.append(']');
        return sb2.toString();
    }
}
