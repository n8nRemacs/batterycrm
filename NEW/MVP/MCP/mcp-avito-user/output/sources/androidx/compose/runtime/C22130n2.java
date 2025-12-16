package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22166k;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Recomposer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1072}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
/* renamed from: androidx.compose.runtime.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22130n2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C22166k f38499q;

    /* renamed from: r, reason: collision with root package name */
    public int f38500r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f38501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Recomposer f38502t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.q<kotlinx.coroutines.T, V0, Continuation<? super kotlin.G0>, Object> f38503u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V0 f38504v;

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1072}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.n2$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f38505q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f38506r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.q<kotlinx.coroutines.T, V0, Continuation<? super kotlin.G0>, Object> f38507s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ V0 f38508t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.q<? super kotlinx.coroutines.T, ? super V0, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, V0 v02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38507s = qVar;
            this.f38508t = v02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f38507s, this.f38508t, continuation);
            aVar.f38506r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f38505q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f38506r;
                this.f38505q = 1;
                if (((C22145q2) this.f38507s).invoke(t12, this.f38508t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/l;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.n2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<Set<? extends Object>, AbstractC22167l, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Recomposer f38509l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Recomposer recomposer) {
            super(2);
            this.f38509l = recomposer;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:4:0x0010, B:6:0x0020, B:8:0x0026, B:11:0x0034, B:13:0x0044, B:15:0x0050, B:17:0x0059, B:19:0x0062, B:24:0x0070, B:25:0x0073, B:28:0x007a, B:38:0x00a0, B:29:0x007c, B:30:0x0082, B:32:0x0088, B:34:0x0090, B:37:0x009c), top: B:48:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(java.util.Set<? extends java.lang.Object> r20, androidx.compose.runtime.snapshots.AbstractC22167l r21) {
            /*
                r19 = this;
                r0 = 1
                r1 = r20
                java.util.Set r1 = (java.util.Set) r1
                r2 = r21
                androidx.compose.runtime.snapshots.l r2 = (androidx.compose.runtime.snapshots.AbstractC22167l) r2
                r2 = r19
                androidx.compose.runtime.Recomposer r3 = r2.f38509l
                java.lang.Object r4 = r3.f38109b
                monitor-enter(r4)
                kotlinx.coroutines.flow.Z1<androidx.compose.runtime.Recomposer$State> r5 = r3.f38128u     // Catch: java.lang.Throwable -> L6e
                java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L6e
                androidx.compose.runtime.Recomposer$State r5 = (androidx.compose.runtime.Recomposer.State) r5     // Catch: java.lang.Throwable -> L6e
                androidx.compose.runtime.Recomposer$State r6 = androidx.compose.runtime.Recomposer.State.f38136f     // Catch: java.lang.Throwable -> L6e
                int r5 = r5.compareTo(r6)     // Catch: java.lang.Throwable -> L6e
                if (r5 < 0) goto La5
                androidx.collection.S0<java.lang.Object> r5 = r3.f38114g     // Catch: java.lang.Throwable -> L6e
                boolean r6 = r1 instanceof androidx.compose.runtime.collection.g     // Catch: java.lang.Throwable -> L6e
                if (r6 == 0) goto L7c
                androidx.compose.runtime.collection.g r1 = (androidx.compose.runtime.collection.g) r1     // Catch: java.lang.Throwable -> L6e
                androidx.collection.j1<T> r1 = r1.f38269b     // Catch: java.lang.Throwable -> L6e
                java.lang.Object[] r6 = r1.f25730b     // Catch: java.lang.Throwable -> L6e
                long[] r1 = r1.f25729a     // Catch: java.lang.Throwable -> L6e
                int r7 = r1.length     // Catch: java.lang.Throwable -> L6e
                int r7 = r7 + (-2)
                if (r7 < 0) goto La0
                r9 = 0
            L34:
                r10 = r1[r9]     // Catch: java.lang.Throwable -> L6e
                long r12 = ~r10     // Catch: java.lang.Throwable -> L6e
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L78
                int r12 = r9 - r7
                int r12 = ~r12     // Catch: java.lang.Throwable -> L6e
                int r12 = r12 >>> 31
                r13 = 8
                int r12 = 8 - r12
                r14 = 0
            L4e:
                if (r14 >= r12) goto L76
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r10
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto L73
                int r15 = r9 << 3
                int r15 = r15 + r14
                r15 = r6[r15]     // Catch: java.lang.Throwable -> L6e
                boolean r8 = r15 instanceof androidx.compose.runtime.snapshots.W     // Catch: java.lang.Throwable -> L6e
                if (r8 == 0) goto L70
                r8 = r15
                androidx.compose.runtime.snapshots.W r8 = (androidx.compose.runtime.snapshots.W) r8     // Catch: java.lang.Throwable -> L6e
                int r16 = androidx.compose.runtime.snapshots.C22164i.f38715b     // Catch: java.lang.Throwable -> L6e
                boolean r8 = r8.p(r0)     // Catch: java.lang.Throwable -> L6e
                if (r8 != 0) goto L70
                goto L73
            L6e:
                r0 = move-exception
                goto Lb3
            L70:
                r5.e(r15)     // Catch: java.lang.Throwable -> L6e
            L73:
                long r10 = r10 >> r13
                int r14 = r14 + r0
                goto L4e
            L76:
                if (r12 != r13) goto La0
            L78:
                if (r9 == r7) goto La0
                int r9 = r9 + r0
                goto L34
            L7c:
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L6e
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
            L82:
                boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
                if (r6 == 0) goto La0
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L6e
                boolean r7 = r6 instanceof androidx.compose.runtime.snapshots.W     // Catch: java.lang.Throwable -> L6e
                if (r7 == 0) goto L9c
                r7 = r6
                androidx.compose.runtime.snapshots.W r7 = (androidx.compose.runtime.snapshots.W) r7     // Catch: java.lang.Throwable -> L6e
                int r8 = androidx.compose.runtime.snapshots.C22164i.f38715b     // Catch: java.lang.Throwable -> L6e
                boolean r7 = r7.p(r0)     // Catch: java.lang.Throwable -> L6e
                if (r7 != 0) goto L9c
                goto L82
            L9c:
                r5.e(r6)     // Catch: java.lang.Throwable -> L6e
                goto L82
            La0:
                kotlinx.coroutines.q r0 = r3.z()     // Catch: java.lang.Throwable -> L6e
                goto La6
            La5:
                r0 = 0
            La6:
                monitor-exit(r4)
                if (r0 == 0) goto Lb0
                int r1 = kotlin.Z.f406624c
                kotlin.G0 r1 = kotlin.G0.f406611a
                r0.resumeWith(r1)
            Lb0:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            Lb3:
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22130n2.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22130n2(Recomposer recomposer, Y41.q<? super kotlinx.coroutines.T, ? super V0, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, V0 v02, Continuation<? super C22130n2> continuation) {
        super(2, continuation);
        this.f38502t = recomposer;
        this.f38503u = qVar;
        this.f38504v = v02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C22130n2 c22130n2 = new C22130n2(this.f38502t, this.f38503u, this.f38504v, continuation);
        c22130n2.f38501s = obj;
        return c22130n2;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C22130n2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22130n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
