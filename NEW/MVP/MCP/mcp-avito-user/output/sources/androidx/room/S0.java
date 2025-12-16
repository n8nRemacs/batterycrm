package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: TransactionExecutor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/S0;", "Ljava/util/concurrent/Executor;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Executor f54331b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Runnable f54333d;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayDeque<Runnable> f54332c = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f54334e = new Object();

    public S0(@Y61.k Executor executor) {
        this.f54331b = executor;
    }

    public final void a() {
        synchronized (this.f54334e) {
            try {
                Runnable runnablePoll = this.f54332c.poll();
                Runnable runnable = runnablePoll;
                this.f54333d = runnable;
                if (runnablePoll != null) {
                    this.f54331b.execute(runnable);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@Y61.k Runnable runnable) {
        synchronized (this.f54334e) {
            try {
                this.f54332c.offer(new J11.c(17, runnable, this));
                if (this.f54333d == null) {
                    a();
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
