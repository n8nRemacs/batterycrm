package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.X;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43313y0;
import kotlinx.coroutines.Y;

/* compiled from: Deprecated.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/y0;", "", "corePoolSize", "maxPoolSize", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public class d extends AbstractC43313y0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineScheduler f412170c;

    public /* synthetic */ d(int i12, int i13, long j12, String str, int i14, C42822w c42822w) {
        this(j12, (i14 & 8) != 0 ? "CoroutineScheduler" : str, i12, i13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        this.f412170c.close();
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        try {
            CoroutineScheduler.c(this.f412170c, runnable, 6);
        } catch (RejectedExecutionException unused) {
            Y.f410745j.U(runnable);
        }
    }

    @Override // kotlinx.coroutines.M
    public final void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        try {
            CoroutineScheduler.c(this.f412170c, runnable, 2);
        } catch (RejectedExecutionException unused) {
            Y.f410745j.U(runnable);
        }
    }

    @Override // kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        return super.toString() + "[scheduler = " + this.f412170c + ']';
    }

    @Override // kotlinx.coroutines.AbstractC43313y0
    @Y61.k
    /* renamed from: y */
    public final Executor getF412305c() {
        return this.f412170c;
    }

    public d(long j12, @Y61.k String str, int i12, int i13) {
        this.f412170c = new CoroutineScheduler(j12, str, i12, i13);
    }

    public d(int i12, int i13, String str, int i14, C42822w c42822w) {
        this(n.f412182e, (i14 & 4) != 0 ? n.f412178a : str, (i14 & 1) != 0 ? n.f412180c : i12, (i14 & 2) != 0 ? n.f412181d : i13);
    }

    public /* synthetic */ d(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? n.f412180c : i12, (i14 & 2) != 0 ? n.f412181d : i13);
    }

    @InterfaceC42830m
    public /* synthetic */ d(int i12, int i13) {
        this(i12, i13, n.f412182e, null, 8, null);
    }
}
