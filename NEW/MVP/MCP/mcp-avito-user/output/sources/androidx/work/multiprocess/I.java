package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.C23538b;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.impl.s0;
import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RemoteWorkerWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.multiprocess.RemoteWorkerWrapperKt$executeRemoteWorker$future$1", f = "RemoteWorkerWrapper.kt", i = {}, l = {62, 64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class I extends SuspendLambda implements Y41.p<T, Continuation<? super F.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f56097q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C23538b f56098r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f56099s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f56100t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ WorkerParameters f56101u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.taskexecutor.c f56102v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C23538b c23538b, Context context, String str, WorkerParameters workerParameters, androidx.work.impl.utils.taskexecutor.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f56098r = c23538b;
        this.f56099s = context;
        this.f56100t = str;
        this.f56101u = workerParameters;
        this.f56102v = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        WorkerParameters workerParameters = this.f56101u;
        androidx.work.impl.utils.taskexecutor.c cVar = this.f56102v;
        return new I(this.f56098r, this.f56099s, this.f56100t, workerParameters, cVar, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super F.a> continuation) {
        return ((I) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C23538b c23538b = this.f56098r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f56097q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return (F.a) obj;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return (F.a) obj;
        }
        C42729a0.b(obj);
        try {
            androidx.work.F fB2 = c23538b.f55451e.b(this.f56099s, this.f56100t, this.f56101u);
            if (fB2 instanceof RemoteListenableWorker) {
                D0<F.a> d0B = ((RemoteListenableWorker) fB2).b();
                this.f56097q = 1;
                obj = s0.a(d0B, fB2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (F.a) obj;
            }
            D0<F.a> d0StartWork = fB2.startWork();
            this.f56097q = 2;
            obj = s0.a(d0StartWork, fB2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (F.a) obj;
        } catch (Throwable th2) {
            c23538b.getClass();
            throw th2;
        }
    }
}
