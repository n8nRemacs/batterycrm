package androidx.work;

import android.content.Context;
import androidx.work.F;
import com.google.common.util.concurrent.D0;
import j.l0;
import kotlin.Metadata;

/* compiled from: Worker.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/F;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/F$a;", "doWork", "()Landroidx/work/F$a;", "Lcom/google/common/util/concurrent/D0;", "startWork", "()Lcom/google/common/util/concurrent/D0;", "Landroidx/work/w;", "getForegroundInfoAsync", "getForegroundInfo", "()Landroidx/work/w;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Worker extends F {

    /* compiled from: Worker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/w;", "invoke", "()Landroidx/work/w;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<C23638w> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C23638w invoke() {
            return Worker.this.getForegroundInfo();
        }
    }

    /* compiled from: Worker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/F$a;", "invoke", "()Landroidx/work/F$a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<F.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final F.a invoke() {
            return Worker.this.doWork();
        }
    }

    public Worker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Y61.k
    @l0
    public abstract F.a doWork();

    @Y61.k
    @l0
    public C23638w getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.F
    @Y61.k
    public D0<C23638w> getForegroundInfoAsync() {
        return androidx.concurrent.futures.b.a(new B(getBackgroundExecutor(), new a()));
    }

    @Override // androidx.work.F
    @Y61.k
    public final D0<F.a> startWork() {
        return androidx.concurrent.futures.b.a(new B(getBackgroundExecutor(), new b()));
    }
}
