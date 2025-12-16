package androidx.work.impl;

import androidx.work.impl.l0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.P0;

/* compiled from: WorkerWrapper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class n0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f55894q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0 f55895r;

    /* compiled from: WorkerWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/impl/l0$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/impl/l0$b;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super l0.b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f55896q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l0 f55897r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0 l0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55897r = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f55897r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super l0.b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f55896q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f55896q = 1;
                obj = l0.a(this.f55897r, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l0 l0Var, Continuation<? super n0> continuation) {
        super(2, continuation);
        this.f55895r = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new n0(this.f55895r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Boolean> continuation) {
        return ((n0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final l0.b aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f55894q;
        final l0 l0Var = this.f55895r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                P0 p02 = l0Var.f55770n;
                a aVar2 = new a(l0Var, null);
                this.f55894q = 1;
                obj = C43259k.g(p02, aVar2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            aVar = (l0.b) obj;
        } catch (WorkerStoppedException e12) {
            aVar = new l0.b.c(e12.f55553b);
        } catch (CancellationException unused) {
            aVar = new l0.b.a(null, 1, null);
        } catch (Throwable unused2) {
            int i13 = s0.f55932a;
            androidx.work.G.a().getClass();
            aVar = new l0.b.a(null, 1, null);
        }
        return l0Var.f55765i.q(new Callable() { // from class: androidx.work.impl.m0
            /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.m0.call():java.lang.Object");
            }
        });
    }
}
