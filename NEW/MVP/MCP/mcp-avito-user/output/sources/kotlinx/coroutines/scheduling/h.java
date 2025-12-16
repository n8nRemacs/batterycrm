package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.AbstractC43313y0;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/y0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class h extends AbstractC43313y0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineScheduler f412173c;

    public h() {
        this(0, 0, 0L, null, 15, null);
    }

    public void close() throws InterruptedException {
        this.f412173c.close();
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        CoroutineScheduler.c(this.f412173c, runnable, 6);
    }

    @Override // kotlinx.coroutines.M
    public final void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        CoroutineScheduler.c(this.f412173c, runnable, 2);
    }

    @Override // kotlinx.coroutines.AbstractC43313y0
    @Y61.k
    /* renamed from: y */
    public final Executor getF412305c() {
        return this.f412173c;
    }

    public /* synthetic */ h(int i12, int i13, long j12, String str, int i14, C42822w c42822w) {
        this((i14 & 4) != 0 ? n.f412182e : j12, (i14 & 8) != 0 ? "CoroutineScheduler" : str, (i14 & 1) != 0 ? n.f412180c : i12, (i14 & 2) != 0 ? n.f412181d : i13);
    }

    public h(long j12, @Y61.k String str, int i12, int i13) {
        this.f412173c = new CoroutineScheduler(j12, str, i12, i13);
    }
}
