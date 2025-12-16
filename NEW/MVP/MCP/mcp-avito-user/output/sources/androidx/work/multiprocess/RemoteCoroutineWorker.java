package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.F;
import androidx.work.WorkerParameters;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;

/* compiled from: RemoteCoroutineWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/multiprocess/RemoteCoroutineWorker;", "Landroidx/work/multiprocess/RemoteListenableWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {

    /* compiled from: RemoteCoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", f = "RemoteCoroutineWorker.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super F.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f56103q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return RemoteCoroutineWorker.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super F.a> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f56103q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f56103q = 1;
                obj = RemoteCoroutineWorker.this.c();
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    public RemoteCoroutineWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    @Y61.k
    public final D0<F.a> b() {
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        CoroutineContext coroutineContextPlus = C43262l0.f411945a.plus(Q0.a());
        a aVar = new a(null);
        fVar.getClass();
        return androidx.concurrent.futures.f.a(coroutineContextPlus, false, aVar);
    }

    @Y61.l
    public abstract Object c();
}
