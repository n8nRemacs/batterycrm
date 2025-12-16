package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20321u;
import androidx.compose.animation.core.R0;
import androidx.compose.foundation.lazy.layout.C20737p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutItemAnimation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {141, 148}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
/* loaded from: classes.dex */
final class r extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public androidx.compose.animation.core.V f29528q;

    /* renamed from: r, reason: collision with root package name */
    public int f29529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20737p f29530s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ R0 f29531t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f29532u;

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/c;", "Landroidx/compose/ui/unit/q;", "Landroidx/compose/animation/core/u;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20268c<androidx.compose.ui.unit.q, C20321u>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20737p f29533l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f29534m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20737p c20737p, long j12) {
            super(1);
            this.f29533l = c20737p;
            this.f29534m = j12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20268c<androidx.compose.ui.unit.q, C20321u> c20268c) {
            long jD2 = androidx.compose.ui.unit.q.d(c20268c.f().f42864a, this.f29534m);
            C20737p.b bVar = C20737p.f29480s;
            C20737p c20737p = this.f29533l;
            c20737p.h(jD2);
            c20737p.f29484c.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C20737p c20737p, R0 r02, long j12, Continuation continuation) {
        super(2, continuation);
        this.f29530s = c20737p;
        this.f29531t = r02;
        this.f29532u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new r(this.f29530s, this.f29531t, this.f29532u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.f29529r
            androidx.compose.foundation.lazy.layout.p r8 = r10.f29530s
            long r1 = r10.f29532u
            r3 = 2
            r4 = 1
            androidx.compose.animation.core.c<androidx.compose.ui.unit.q, androidx.compose.animation.core.u> r5 = r8.f29496o
            if (r0 == 0) goto L27
            if (r0 == r4) goto L21
            if (r0 != r3) goto L19
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L86
            goto L7e
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            androidx.compose.animation.core.V r0 = r10.f29528q
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L86
            goto L4d
        L27:
            kotlin.C42729a0.b(r11)
            boolean r0 = r5.g()     // Catch: java.util.concurrent.CancellationException -> L86
            androidx.compose.animation.core.R0 r6 = r10.f29531t
            if (r0 == 0) goto L37
            if (r6 == 0) goto L35
            goto L37
        L35:
            androidx.compose.animation.core.R0<androidx.compose.ui.unit.q> r6 = androidx.compose.foundation.lazy.layout.C20739s.f29535a     // Catch: java.util.concurrent.CancellationException -> L86
        L37:
            r0 = r6
            boolean r6 = r5.g()     // Catch: java.util.concurrent.CancellationException -> L86
            if (r6 != 0) goto L52
            androidx.compose.ui.unit.q r6 = androidx.compose.ui.unit.q.a(r1)     // Catch: java.util.concurrent.CancellationException -> L86
            r10.f29528q = r0     // Catch: java.util.concurrent.CancellationException -> L86
            r10.f29529r = r4     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r4 = r5.h(r6, r10)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r4 != r7) goto L4d
            return r7
        L4d:
            Y41.a<kotlin.G0> r4 = r8.f29484c     // Catch: java.util.concurrent.CancellationException -> L86
            r4.invoke()     // Catch: java.util.concurrent.CancellationException -> L86
        L52:
            r4 = r0
            java.lang.Object r0 = r5.f()     // Catch: java.util.concurrent.CancellationException -> L86
            androidx.compose.ui.unit.q r0 = (androidx.compose.ui.unit.q) r0     // Catch: java.util.concurrent.CancellationException -> L86
            long r5 = r0.f42864a     // Catch: java.util.concurrent.CancellationException -> L86
            long r0 = androidx.compose.ui.unit.q.d(r5, r1)     // Catch: java.util.concurrent.CancellationException -> L86
            androidx.compose.animation.core.c<androidx.compose.ui.unit.q, androidx.compose.animation.core.u> r2 = r8.f29496o     // Catch: java.util.concurrent.CancellationException -> L86
            androidx.compose.ui.unit.q r5 = androidx.compose.ui.unit.q.a(r0)     // Catch: java.util.concurrent.CancellationException -> L86
            androidx.compose.foundation.lazy.layout.r$a r6 = new androidx.compose.foundation.lazy.layout.r$a     // Catch: java.util.concurrent.CancellationException -> L86
            r6.<init>(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L86
            r0 = 0
            r10.f29528q = r0     // Catch: java.util.concurrent.CancellationException -> L86
            r10.f29529r = r3     // Catch: java.util.concurrent.CancellationException -> L86
            r3 = 0
            r9 = 4
            r0 = r2
            r1 = r5
            r2 = r4
            r4 = r6
            r5 = r10
            r6 = r9
            java.lang.Object r0 = androidx.compose.animation.core.C20268c.c(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r0 != r7) goto L7e
            return r7
        L7e:
            androidx.compose.foundation.lazy.layout.p$b r0 = androidx.compose.foundation.lazy.layout.C20737p.f29480s     // Catch: java.util.concurrent.CancellationException -> L86
            r0 = 0
            r8.g(r0)     // Catch: java.util.concurrent.CancellationException -> L86
            r8.f29488g = r0     // Catch: java.util.concurrent.CancellationException -> L86
        L86:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
