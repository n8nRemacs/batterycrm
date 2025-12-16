package androidx.work.impl.workers;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.CoroutineWorker;
import androidx.work.F;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ConstraintTrackingWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final WorkerParameters f56045c;

    /* compiled from: ConstraintTrackingWorker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CancellationException {

        /* renamed from: b, reason: collision with root package name */
        public final int f56046b;

        public a(int i12) {
            this.f56046b = i12;
        }
    }

    /* compiled from: ConstraintTrackingWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super F.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f56047q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super F.a> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f56047q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f56047q = 1;
                obj = ConstraintTrackingWorker.d(ConstraintTrackingWorker.this, this);
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

    public ConstraintTrackingWorker(@k Context context, @k WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f56045c = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.work.impl.workers.ConstraintTrackingWorker r4, androidx.work.F r5, androidx.work.impl.constraints.f r6, androidx.work.impl.model.H r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof androidx.work.impl.workers.a
            if (r0 == 0) goto L16
            r0 = r8
            androidx.work.impl.workers.a r0 = (androidx.work.impl.workers.a) r0
            int r1 = r0.f56051s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56051s = r1
            goto L1b
        L16:
            androidx.work.impl.workers.a r0 = new androidx.work.impl.workers.a
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.f56049q
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f56051s
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.C42729a0.b(r4)
            goto L46
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r4)
            androidx.work.impl.workers.b r4 = new androidx.work.impl.workers.b
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            r0.f56051s = r2
            java.lang.Object r4 = kotlinx.coroutines.U.c(r4, r0)
            if (r4 != r8) goto L46
            goto L47
        L46:
            r8 = r4
        L47:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.c(androidx.work.impl.workers.ConstraintTrackingWorker, androidx.work.F, androidx.work.impl.constraints.f, androidx.work.impl.model.H, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.work.impl.workers.ConstraintTrackingWorker r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.d(androidx.work.impl.workers.ConstraintTrackingWorker, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    @l
    public final Object b(@k Continuation<? super F.a> continuation) {
        return C43259k.g(A0.b(getBackgroundExecutor()), new b(null), continuation);
    }
}
