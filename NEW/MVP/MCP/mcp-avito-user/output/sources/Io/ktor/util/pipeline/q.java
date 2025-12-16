package io.ktor.util.pipeline;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.M1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.L;

/* compiled from: SuspendFunctionGun.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/pipeline/q;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/e;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class q<TSubject, TContext> extends e<TSubject, TContext> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Y41.q<e<TSubject, TContext>, TSubject, Continuation<? super G0>, Object>> f400536c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f400537d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public TSubject f400538e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Continuation<TSubject>[] f400539f;

    /* renamed from: g, reason: collision with root package name */
    public int f400540g;

    /* renamed from: h, reason: collision with root package name */
    public int f400541h;

    /* compiled from: SuspendFunctionGun.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"io/ktor/util/pipeline/q$a", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lio/ktor/util/CoroutineStackFrame;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Continuation<G0>, CoroutineStackFrame {

        /* renamed from: b, reason: collision with root package name */
        public int f400542b = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<TSubject, TContext> f400543c;

        public a(q<TSubject, TContext> qVar) {
            this.f400543c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Y61.l
        public final CoroutineStackFrame getCallerFrame() {
            Continuation<TSubject> continuation;
            int i12 = this.f400542b;
            q<TSubject, TContext> qVar = this.f400543c;
            if (i12 == Integer.MIN_VALUE) {
                this.f400542b = qVar.f400540g;
            }
            int i13 = this.f400542b;
            if (i13 < 0) {
                this.f400542b = BeduinInputModel.MIN_TEXT_VERSION;
                continuation = null;
            } else {
                try {
                    continuation = qVar.f400539f[i13];
                    if (continuation == null) {
                        continuation = p.f400535b;
                    } else {
                        this.f400542b = i13 - 1;
                    }
                } catch (Throwable unused) {
                    continuation = p.f400535b;
                }
            }
            if (continuation instanceof CoroutineStackFrame) {
                return (CoroutineStackFrame) continuation;
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        @Y61.k
        /* renamed from: getContext */
        public final CoroutineContext getF411447c() {
            CoroutineContext f410748d;
            q<TSubject, TContext> qVar = this.f400543c;
            Continuation<TSubject> continuation = qVar.f400539f[qVar.f400540g];
            if (continuation == null || (f410748d = continuation.getF411447c()) == null) {
                throw new IllegalStateException("Not started");
            }
            return f410748d;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Y61.l
        public final StackTraceElement getStackTraceElement() {
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@Y61.k Object obj) {
            int i12 = Z.f406624c;
            boolean z12 = obj instanceof Z.b;
            q<TSubject, TContext> qVar = this.f400543c;
            if (z12) {
                qVar.i(new Z.b(Z.b(obj)));
            } else {
                qVar.h(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k TSubject tsubject, @Y61.k TContext tcontext, @Y61.k List<? extends Y41.q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super G0>, ? extends Object>> list) {
        super(tcontext);
        this.f400536c = list;
        this.f400537d = new a(this);
        this.f400538e = tsubject;
        this.f400539f = new Continuation[list.size()];
        this.f400540g = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.pipeline.e
    @Y61.l
    public final Object b(@Y61.k Object obj, @Y61.k ContinuationImpl continuationImpl) {
        this.f400541h = 0;
        if (this.f400536c.size() == 0) {
            return obj;
        }
        this.f400538e = obj;
        if (this.f400540g < 0) {
            return f(continuationImpl);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // io.ktor.util.pipeline.e
    public final void c() {
        this.f400541h = this.f400536c.size();
    }

    @Override // io.ktor.util.pipeline.e
    @Y61.k
    public final TSubject e() {
        return this.f400538e;
    }

    @Override // io.ktor.util.pipeline.e
    @Y61.l
    public final Object f(@Y61.k Continuation<? super TSubject> continuation) {
        Object coroutine_suspended;
        if (this.f400541h == this.f400536c.size()) {
            coroutine_suspended = this.f400538e;
        } else {
            Continuation<TSubject> continuationIntercepted = IntrinsicsKt.intercepted(continuation);
            int i12 = this.f400540g + 1;
            this.f400540g = i12;
            Continuation<TSubject>[] continuationArr = this.f400539f;
            continuationArr[i12] = continuationIntercepted;
            if (h(true)) {
                int i13 = this.f400540g;
                if (i13 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f400540g = i13 - 1;
                continuationArr[i13] = null;
                coroutine_suspended = this.f400538e;
            } else {
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // io.ktor.util.pipeline.e
    @Y61.l
    public final Object g(@Y61.k TSubject tsubject, @Y61.k Continuation<? super TSubject> continuation) {
        this.f400538e = tsubject;
        return f(continuation);
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF398827h() {
        return this.f400537d.getF411447c();
    }

    public final boolean h(boolean z12) {
        int i12;
        List<Y41.q<e<TSubject, TContext>, TSubject, Continuation<? super G0>, Object>> list;
        do {
            i12 = this.f400541h;
            list = this.f400536c;
            if (i12 == list.size()) {
                if (z12) {
                    return true;
                }
                int i13 = Z.f406624c;
                i(this.f400538e);
                return false;
            }
            this.f400541h = i12 + 1;
            try {
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                i(new Z.b(th2));
                return false;
            }
        } while (list.get(i12).invoke(this, this.f400538e, this.f400537d) != IntrinsicsKt.getCOROUTINE_SUSPENDED());
        return false;
    }

    public final void i(Object obj) {
        Throwable thB;
        int i12 = this.f400540g;
        if (i12 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<TSubject>[] continuationArr = this.f400539f;
        Continuation<TSubject> continuation = continuationArr[i12];
        this.f400540g = i12 - 1;
        continuationArr[i12] = null;
        int i13 = Z.f406624c;
        if (!(obj instanceof Z.b)) {
            continuation.resumeWith(obj);
            return;
        }
        Throwable thB2 = Z.b(obj);
        try {
            Throwable cause = thB2.getCause();
            if (cause != null && !L.f(thB2.getCause(), cause) && (thB = M1.b(thB2, cause)) != null) {
                thB.setStackTrace(thB2.getStackTrace());
                thB2 = thB;
            }
        } catch (Throwable unused) {
        }
        int i14 = Z.f406624c;
        continuation.resumeWith(new Z.b(thB2));
    }
}
