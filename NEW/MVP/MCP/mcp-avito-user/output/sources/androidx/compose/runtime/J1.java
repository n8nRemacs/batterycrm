package androidx.compose.runtime;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PausableMonotonicFrameClock.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/J1;", "Landroidx/compose/runtime/V0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J1 implements V0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final V0 f37988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q0 f37989c = new Q0();

    /* compiled from: PausableMonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {61, 62}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
    public static final class a<R> extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public J1 f37990q;

        /* renamed from: r, reason: collision with root package name */
        public Y41.l f37991r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f37992s;

        /* renamed from: u, reason: collision with root package name */
        public int f37994u;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f37992s = obj;
            this.f37994u |= BeduinInputModel.MIN_TEXT_VERSION;
            return J1.this.N(null, this);
        }
    }

    public J1(@Y61.k V0 v02) {
        this.f37988b = v02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.V0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object N(@Y61.k Y41.l<? super java.lang.Long, ? extends R> r7, @Y61.k kotlin.coroutines.Continuation<? super R> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.runtime.J1.a
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.runtime.J1$a r0 = (androidx.compose.runtime.J1.a) r0
            int r1 = r0.f37994u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37994u = r1
            goto L18
        L13:
            androidx.compose.runtime.J1$a r0 = new androidx.compose.runtime.J1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f37992s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37994u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r8)
            goto L9f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            Y41.l r7 = r0.f37991r
            Y41.l r7 = (Y41.l) r7
            androidx.compose.runtime.J1 r2 = r0.f37990q
            kotlin.C42729a0.b(r8)
            goto L8f
        L3f:
            kotlin.C42729a0.b(r8)
            androidx.compose.runtime.Q0 r8 = r6.f37989c
            r0.f37990q = r6
            r2 = r7
            Y41.l r2 = (Y41.l) r2
            r0.f37991r = r2
            r0.f37994u = r4
            java.lang.Object r2 = r8.f38096a
            monitor-enter(r2)
            boolean r5 = r8.f38099d     // Catch: java.lang.Throwable -> La3
            monitor-exit(r2)
            if (r5 == 0) goto L58
            kotlin.G0 r8 = kotlin.G0.f406611a
            goto L8b
        L58:
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4, r5)
            r2.p()
            java.lang.Object r4 = r8.f38096a
            monitor-enter(r4)
            java.util.ArrayList r5 = r8.f38097b     // Catch: java.lang.Throwable -> La0
            r5.add(r2)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r4)
            androidx.compose.runtime.P0 r4 = new androidx.compose.runtime.P0
            r4.<init>(r8, r2)
            r2.r(r4)
            java.lang.Object r8 = r2.o()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto L82
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L82:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto L89
            goto L8b
        L89:
            kotlin.G0 r8 = kotlin.G0.f406611a
        L8b:
            if (r8 != r1) goto L8e
            return r1
        L8e:
            r2 = r6
        L8f:
            androidx.compose.runtime.V0 r8 = r2.f37988b
            r2 = 0
            r0.f37990q = r2
            r0.f37991r = r2
            r0.f37994u = r3
            java.lang.Object r8 = r8.N(r7, r0)
            if (r8 != r1) goto L9f
            return r1
        L9f:
            return r8
        La0:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        La3:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.J1.N(Y41.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r12, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
