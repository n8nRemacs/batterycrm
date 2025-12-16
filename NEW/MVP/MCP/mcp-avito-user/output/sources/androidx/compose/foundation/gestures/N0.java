package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20431a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import okhttp3.internal.http.StatusLine;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {StatusLine.HTTP_MISDIRECTED_REQUEST, 423, 425, 432, 434, 437}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class N0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f27368q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f27369r;

    /* renamed from: s, reason: collision with root package name */
    public int f27370s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27371t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I0 f27372u;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/a0$b;", "Lkotlin/S;", "name", "dragDelta", "Lkotlin/G0;", "processDelta", "<anonymous>", "(LY41/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {428}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<Y41.l<? super AbstractC20431a0.b, ? extends kotlin.G0>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.h f27373q;

        /* renamed from: r, reason: collision with root package name */
        public int f27374r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f27375s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0.h<AbstractC20431a0> f27376t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ I0 f27377u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.h<AbstractC20431a0> hVar, I0 i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27376t = hVar;
            this.f27377u = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27376t, this.f27377u, continuation);
            aVar.f27375s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Y41.l<? super AbstractC20431a0.b, ? extends kotlin.G0> lVar, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(lVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0043 -> B:25:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:24:0x0052). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f27374r
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                kotlin.jvm.internal.l0$h r1 = r6.f27373q
                java.lang.Object r3 = r6.f27375s
                Y41.l r3 = (Y41.l) r3
                kotlin.C42729a0.b(r7)
                goto L52
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f27375s
                Y41.l r7 = (Y41.l) r7
                r3 = r7
            L25:
                kotlin.jvm.internal.l0$h<androidx.compose.foundation.gestures.a0> r1 = r6.f27376t
                T r7 = r1.f406842b
                boolean r4 = r7 instanceof androidx.compose.foundation.gestures.AbstractC20431a0.d
                if (r4 != 0) goto L58
                boolean r4 = r7 instanceof androidx.compose.foundation.gestures.AbstractC20431a0.a
                if (r4 != 0) goto L58
                boolean r4 = r7 instanceof androidx.compose.foundation.gestures.AbstractC20431a0.b
                r5 = 0
                if (r4 == 0) goto L39
                androidx.compose.foundation.gestures.a0$b r7 = (androidx.compose.foundation.gestures.AbstractC20431a0.b) r7
                goto L3a
            L39:
                r7 = r5
            L3a:
                if (r7 == 0) goto L3f
                r3.invoke(r7)
            L3f:
                androidx.compose.foundation.gestures.I0 r7 = r6.f27377u
                kotlinx.coroutines.channels.m r7 = r7.f27272v
                if (r7 == 0) goto L55
                r6.f27375s = r3
                r6.f27373q = r1
                r6.f27374r = r2
                java.lang.Object r7 = r7.M(r6)
                if (r7 != r0) goto L52
                return r0
            L52:
                r5 = r7
                androidx.compose.foundation.gestures.a0 r5 = (androidx.compose.foundation.gestures.AbstractC20431a0) r5
            L55:
                r1.f406842b = r5
                goto L25
            L58:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.N0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(I0 i02, Continuation<? super N0> continuation) {
        super(2, continuation);
        this.f27372u = i02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        N0 n02 = new N0(this.f27372u, continuation);
        n02.f27371t = obj;
        return n02;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((N0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:34|35|(1:37)|14|55|38|(2:44|(2:46|(1:48)))(2:40|(1:42))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:38:0x00ac, B:40:0x00b2, B:44:0x00c4, B:46:0x00c8), top: B:55:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:38:0x00ac, B:40:0x00b2, B:44:0x00c4, B:46:0x00c8), top: B:55:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0083 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bf -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c6 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d3 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e1 -> B:11:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.N0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
