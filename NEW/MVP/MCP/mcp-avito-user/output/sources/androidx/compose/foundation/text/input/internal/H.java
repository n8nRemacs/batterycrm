package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: CursorAnimationState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class H extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f30832q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f30833r;

    /* compiled from: CursorAnimationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {72, 77, 79, 81}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30834q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.N0 f30835r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I f30836s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlinx.coroutines.N0 n02, I i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f30835r = n02;
            this.f30836s = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f30835r, this.f30836s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0075 -> B:36:0x0078). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f30834q
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                androidx.compose.foundation.text.input.internal.I r10 = r11.f30836s
                if (r1 == 0) goto L35
                if (r1 == r9) goto L31
                if (r1 == r8) goto L2d
                if (r1 == r7) goto L29
                if (r1 != r6) goto L21
                kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L78
            L1f:
                r12 = move-exception
                goto L80
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L68
            L2d:
                kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L59
            L31:
                kotlin.C42729a0.b(r12)
                goto L45
            L35:
                kotlin.C42729a0.b(r12)
                kotlinx.coroutines.N0 r12 = r11.f30835r
                if (r12 == 0) goto L45
                r11.f30834q = r9
                java.lang.Object r12 = kotlinx.coroutines.Q0.c(r12, r11)
                if (r12 != r0) goto L45
                return r0
            L45:
                androidx.compose.runtime.v1 r12 = r10.f30840c     // Catch: java.lang.Throwable -> L1f
                androidx.compose.runtime.c3 r12 = (androidx.compose.runtime.C22040c3) r12     // Catch: java.lang.Throwable -> L1f
                r12.S6(r5)     // Catch: java.lang.Throwable -> L1f
                boolean r12 = r10.f30838a     // Catch: java.lang.Throwable -> L1f
                if (r12 != 0) goto L5f
                r11.f30834q = r8     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = kotlinx.coroutines.C43131e0.a(r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L59
                return r0
            L59:
                kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L5f:
                r11.f30834q = r7     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r3, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L68
                return r0
            L68:
                androidx.compose.runtime.v1 r12 = r10.f30840c     // Catch: java.lang.Throwable -> L1f
                androidx.compose.runtime.c3 r12 = (androidx.compose.runtime.C22040c3) r12     // Catch: java.lang.Throwable -> L1f
                r12.S6(r2)     // Catch: java.lang.Throwable -> L1f
                r11.f30834q = r6     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r3, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L78
                return r0
            L78:
                androidx.compose.runtime.v1 r12 = r10.f30840c     // Catch: java.lang.Throwable -> L1f
                androidx.compose.runtime.c3 r12 = (androidx.compose.runtime.C22040c3) r12     // Catch: java.lang.Throwable -> L1f
                r12.S6(r5)     // Catch: java.lang.Throwable -> L1f
                goto L5f
            L80:
                androidx.compose.runtime.v1 r0 = r10.f30840c
                androidx.compose.runtime.c3 r0 = (androidx.compose.runtime.C22040c3) r0
                r0.S6(r2)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.H.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i12, Continuation<? super H> continuation) {
        super(2, continuation);
        this.f30833r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        H h12 = new H(this.f30833r, continuation);
        h12.f30832q = obj;
        return h12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Boolean> continuation) {
        return ((H) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f30832q;
        I i12 = this.f30833r;
        kotlinx.coroutines.N0 andSet = i12.f30839b.getAndSet(null);
        AtomicReference<kotlinx.coroutines.N0> atomicReference = i12.f30839b;
        kotlinx.coroutines.N0 n0D = C43259k.d(t12, null, null, new a(andSet, i12, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, n0D)) {
                z12 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z12 = false;
                break;
            }
        }
        return Boxing.boxBoolean(z12);
    }
}
