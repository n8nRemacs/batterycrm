package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.D0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ListenableWorker.java */
/* loaded from: classes10.dex */
public abstract class F {

    @j.N
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;

    @j.N
    private WorkerParameters mWorkerParams;

    /* compiled from: ListenableWorker.java */
    public static abstract class a {

        /* compiled from: ListenableWorker.java */
        @RestrictTo
        /* renamed from: androidx.work.F$a$a, reason: collision with other inner class name */
        public static final class C1949a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final C23544h f55380a;

            public C1949a() {
                this(C23544h.f55509c);
            }

            @Override // androidx.work.F.a
            @j.N
            public final C23544h a() {
                return this.f55380a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1949a.class != obj.getClass()) {
                    return false;
                }
                return this.f55380a.equals(((C1949a) obj).f55380a);
            }

            public final int hashCode() {
                return this.f55380a.hashCode() + (C1949a.class.getName().hashCode() * 31);
            }

            @j.N
            public final String toString() {
                return "Failure {mOutputData=" + this.f55380a + '}';
            }

            public C1949a(@j.N C23544h c23544h) {
                this.f55380a = c23544h;
            }
        }

        /* compiled from: ListenableWorker.java */
        @RestrictTo
        public static final class b extends a {
            @Override // androidx.work.F.a
            @j.N
            public final C23544h a() {
                return C23544h.f55509c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            @j.N
            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: ListenableWorker.java */
        @RestrictTo
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final C23544h f55381a;

            public c() {
                this(C23544h.f55509c);
            }

            @Override // androidx.work.F.a
            @j.N
            public final C23544h a() {
                return this.f55381a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f55381a.equals(((c) obj).f55381a);
            }

            public final int hashCode() {
                return this.f55381a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            @j.N
            public final String toString() {
                return "Success {mOutputData=" + this.f55381a + '}';
            }

            public c(@j.N C23544h c23544h) {
                this.f55381a = c23544h;
            }
        }

        @RestrictTo
        public a() {
        }

        @j.N
        public abstract C23544h a();
    }

    public F(@j.N Context context, @j.N WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getForegroundInfoAsync$0(b.a aVar) {
        aVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @j.N
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @j.N
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f55437f;
    }

    @j.N
    public D0<C23638w> getForegroundInfoAsync() {
        return androidx.concurrent.futures.b.a(new androidx.media3.exoplayer.analytics.m(20));
    }

    @j.N
    public final UUID getId() {
        return this.mWorkerParams.f55432a;
    }

    @j.N
    public final C23544h getInputData() {
        return this.mWorkerParams.f55433b;
    }

    @j.P
    @j.X
    public final Network getNetwork() {
        return this.mWorkerParams.f55435d.f55446c;
    }

    @j.F
    public final int getRunAttemptCount() {
        return this.mWorkerParams.f55436e;
    }

    @j.X
    public final int getStopReason() {
        return this.mStopReason.get();
    }

    @j.N
    public final Set<String> getTags() {
        return this.mWorkerParams.f55434c;
    }

    @j.N
    @RestrictTo
    public androidx.work.impl.utils.taskexecutor.b getTaskExecutor() {
        return this.mWorkerParams.f55439h;
    }

    @j.N
    @j.X
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f55435d.f55444a;
    }

    @j.N
    @j.X
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f55435d.f55445b;
    }

    @j.N
    @RestrictTo
    public e0 getWorkerFactory() {
        return this.mWorkerParams.f55440i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    @j.N
    public final D0<Void> setForegroundAsync(@j.N C23638w c23638w) {
        return this.mWorkerParams.f55442k.a(getApplicationContext(), getId(), c23638w);
    }

    @j.N
    public D0<Void> setProgressAsync(@j.N C23544h c23544h) {
        return this.mWorkerParams.f55441j.a(getApplicationContext(), getId(), c23544h);
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    @j.N
    @j.K
    public abstract D0<a> startWork();

    @RestrictTo
    public final void stop(int i12) {
        if (this.mStopReason.compareAndSet(-256, i12)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
