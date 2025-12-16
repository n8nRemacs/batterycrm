package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a5e;
import defpackage.awa;
import defpackage.b5e;
import defpackage.bwf;
import defpackage.bx4;
import defpackage.c1;
import defpackage.c5e;
import defpackage.cu7;
import defpackage.d5e;
import defpackage.d7j;
import defpackage.eoi;
import defpackage.g84;
import defpackage.gzf;
import defpackage.ha8;
import defpackage.hni;
import defpackage.ike;
import defpackage.k18;
import defpackage.l42;
import defpackage.ma8;
import defpackage.ok3;
import defpackage.p1b;
import defpackage.q2b;
import defpackage.qe6;
import defpackage.qqg;
import defpackage.rt7;
import defpackage.su7;
import defpackage.svi;
import defpackage.u5i;
import defpackage.uee;
import defpackage.y4e;
import defpackage.yd4;
import defpackage.z4e;
import defpackage.z74;
import defpackage.zn6;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Lma8;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lha8;", "Lla8;", "startWork", "()Lha8;", "Lqqg;", "onStopWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyd4;", "data", "setProgress", "(Lyd4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqe6;", "foregroundInfo", "setForeground", "(Lqe6;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lok3;", "job", "Lok3;", "Like;", "future", "Like;", "Lgzf;", "tamComponent$delegate", "Lk18;", "getTamComponent", "()Lgzf;", "tamComponent", "Lz74;", "coroutineContext", "Lz74;", "getCoroutineContext", "()Lz74;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SdkCoroutineWorker extends ma8 {
    private final z74 coroutineContext;
    private final ike future;
    private final ok3 job;

    /* renamed from: tamComponent$delegate, reason: from kotlin metadata */
    private final k18 tamComponent;

    public SdkCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.job = eoi.a();
        ike ikeVar = new ike();
        this.future = ikeVar;
        ikeVar.d(new awa(27, this), (uee) ((u5i) getTaskExecutor()).a);
        this.tamComponent = new bwf(new p1b(context, 27));
        this.coroutineContext = ((q2b) ((y4e) getTamComponent()).j()).a();
    }

    public static void a(SdkCoroutineWorker sdkCoroutineWorker) {
        if (sdkCoroutineWorker.future.a instanceof c1) {
            ((su7) sdkCoroutineWorker.job).cancel((CancellationException) null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(SdkCoroutineWorker sdkCoroutineWorker, Continuation<? super qe6> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public static /* synthetic */ Object onStopWork$suspendImpl(SdkCoroutineWorker sdkCoroutineWorker, Continuation<? super qqg> continuation) {
        return qqg.a;
    }

    public abstract Object doWork(Continuation continuation);

    /* renamed from: getCoroutineContext, reason: from getter */
    public z74 getC() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    @Override // defpackage.ma8
    public final ha8 getForegroundInfoAsync() {
        rt7 rt7VarA = eoi.a();
        ContextScope contextScopeA = d7j.a(getC().plus(rt7VarA));
        cu7 cu7Var = new cu7(rt7VarA);
        svi.e(contextScopeA, null, null, new z4e(cu7Var, this, null), 3);
        return cu7Var;
    }

    public final gzf getTamComponent() {
        return (gzf) this.tamComponent.getValue();
    }

    public Object onStopWork(Continuation<? super qqg> continuation) {
        return onStopWork$suspendImpl(this, continuation);
    }

    @Override // defpackage.ma8
    public final void onStopped() {
        this.future.cancel(false);
        svi.e(d7j.a(getC().plus(this.job)), null, null, new a5e(this, null), 3);
    }

    public final Object setForeground(qe6 qe6Var, Continuation<? super qqg> continuation) throws Throwable {
        ha8 foregroundAsync = setForegroundAsync(qe6Var);
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            l42 l42Var = new l42(1, hni.f(continuation));
            l42Var.o();
            foregroundAsync.d(new zn6(l42Var, 25, foregroundAsync), bx4.a);
            l42Var.e(new b5e(foregroundAsync, 0));
            Object objN = l42Var.n();
            if (objN == g84.a) {
                return objN;
            }
        }
        return qqg.a;
    }

    public final Object setProgress(yd4 yd4Var, Continuation<? super qqg> continuation) throws Throwable {
        ha8 progressAsync = setProgressAsync(yd4Var);
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            l42 l42Var = new l42(1, hni.f(continuation));
            l42Var.o();
            progressAsync.d(new c5e(l42Var, 0, progressAsync), bx4.a);
            l42Var.e(new b5e(progressAsync, 1));
            Object objN = l42Var.n();
            if (objN == g84.a) {
                return objN;
            }
        }
        return qqg.a;
    }

    @Override // defpackage.ma8
    public final ha8 startWork() {
        svi.e(d7j.a(getC().plus(this.job)), null, null, new d5e(this, null), 3);
        return this.future;
    }
}
