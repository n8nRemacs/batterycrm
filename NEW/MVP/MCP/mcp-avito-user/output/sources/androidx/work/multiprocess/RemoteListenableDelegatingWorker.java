package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.impl.Y;
import androidx.work.impl.s0;
import androidx.work.multiprocess.C23625f;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.M;
import kotlinx.coroutines.T;

/* compiled from: RemoteListenableDelegatingWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;", "Landroidx/work/F;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RemoteListenableDelegatingWorker extends androidx.work.F {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f56105e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f56106a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WorkerParameters f56107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C23625f f56108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ComponentName f56109d;

    /* compiled from: RemoteListenableDelegatingWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/work/multiprocess/RemoteListenableDelegatingWorker$a;", "", "<init>", "()V", "", "ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", "Ljava/lang/String;", "TAG", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RemoteListenableDelegatingWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$1", f = "RemoteListenableDelegatingWorker.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super F.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f56110q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return RemoteListenableDelegatingWorker.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super F.a> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f56110q;
            if (i12 == 0) {
                C42729a0.b(obj);
                String strC = RemoteListenableDelegatingWorker.this.getInputData().c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                String strC2 = RemoteListenableDelegatingWorker.this.getInputData().c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                String strC3 = RemoteListenableDelegatingWorker.this.getInputData().c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                if (strC == null) {
                    throw new IllegalArgumentException("Need to specify a package name for the Remote Service.");
                }
                if (strC2 == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the Remote Service.");
                }
                if (strC3 == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                }
                RemoteListenableDelegatingWorker.this.f56109d = new ComponentName(strC, strC2);
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = RemoteListenableDelegatingWorker.this;
                D0<byte[]> d0A = remoteListenableDelegatingWorker.f56108c.a(remoteListenableDelegatingWorker.f56109d, new Ba1.B(18, strC3, remoteListenableDelegatingWorker));
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = RemoteListenableDelegatingWorker.this;
                this.f56110q = 1;
                obj = s0.a(d0A, remoteListenableDelegatingWorker2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ParcelableResult parcelableResult = (ParcelableResult) androidx.work.multiprocess.parcelable.a.b((byte[]) obj, ParcelableResult.CREATOR);
            androidx.work.G.a().getClass();
            C23625f c23625f = RemoteListenableDelegatingWorker.this.f56108c;
            synchronized (c23625f.f56157c) {
                try {
                    C23625f.a aVar = c23625f.f56158d;
                    if (aVar != null) {
                        c23625f.f56155a.unbindService(aVar);
                        c23625f.f56158d = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return parcelableResult.f56183b;
        }
    }

    static {
        new a(null);
    }

    public RemoteListenableDelegatingWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f56106a = context;
        this.f56107b = workerParameters;
        this.f56108c = new C23625f(context, workerParameters.f55437f);
    }

    @Override // androidx.work.F
    @SuppressLint({"NewApi"})
    public final void onStopped() {
        super.onStopped();
        ComponentName componentName = this.f56109d;
        if (componentName != null) {
            this.f56108c.a(componentName, new Ae0.c(this, 18));
        }
    }

    @Override // androidx.work.F
    @Y61.k
    public final D0<F.a> startWork() {
        M m12 = Y.f(this.f56106a.getApplicationContext()).f55560e.f56029b;
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        b bVar = new b(null);
        fVar.getClass();
        return androidx.concurrent.futures.f.a(m12, true, bVar);
    }
}
