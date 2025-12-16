package androidx.compose.material;

import androidx.compose.runtime.C22126m3;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {722}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21359u extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34217q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f34218r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f34219s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f34220t;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.u$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0.h<kotlinx.coroutines.N0> f34221b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f34222c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f34223d;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {729}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.u$a$a, reason: collision with other inner class name */
        public static final class C1638a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f34224q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f34225r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Object f34226s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f34227t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1638a(Y41.p<Object, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Object obj, kotlinx.coroutines.T t12, Continuation<? super C1638a> continuation) {
                super(2, continuation);
                this.f34225r = (SuspendLambda) pVar;
                this.f34226s = obj;
                this.f34227t = t12;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new C1638a(this.f34225r, this.f34226s, this.f34227t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1638a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f34224q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f34224q = 1;
                    if (this.f34225r.invoke(this.f34226s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                kotlinx.coroutines.U.b(this.f34227t, new AnchoredDragFinishedSignal());
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {725}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.material.u$a$b */
        public static final class b extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f34228q;

            /* renamed from: r, reason: collision with root package name */
            public Object f34229r;

            /* renamed from: s, reason: collision with root package name */
            public kotlinx.coroutines.N0 f34230s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f34231t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f34232u;

            /* renamed from: v, reason: collision with root package name */
            public int f34233v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, Continuation<? super b> continuation) {
                super(continuation);
                this.f34232u = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f34231t = obj;
                this.f34233v |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f34232u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l0.h<kotlinx.coroutines.N0> hVar, kotlinx.coroutines.T t12, Y41.p<Object, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
            this.f34221b = hVar;
            this.f34222c = t12;
            this.f34223d = (SuspendLambda) pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.compose.material.C21359u.a.b
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.u$a$b r0 = (androidx.compose.material.C21359u.a.b) r0
                int r1 = r0.f34233v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34233v = r1
                goto L18
            L13:
                androidx.compose.material.u$a$b r0 = new androidx.compose.material.u$a$b
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f34231t
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f34233v
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f34229r
                java.lang.Object r0 = r0.f34228q
                androidx.compose.material.u$a r0 = (androidx.compose.material.C21359u.a) r0
                kotlin.C42729a0.b(r8)
                goto L5a
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.C42729a0.b(r8)
                kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r8 = r6.f34221b
                T r8 = r8.f406842b
                kotlinx.coroutines.N0 r8 = (kotlinx.coroutines.N0) r8
                if (r8 == 0) goto L59
                androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                r2.<init>()
                r8.c(r2)
                r0.f34228q = r6
                r0.f34229r = r7
                r0.f34230s = r8
                r0.f34233v = r3
                java.lang.Object r8 = r8.A(r0)
                if (r8 != r1) goto L59
                return r1
            L59:
                r0 = r6
            L5a:
                kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r8 = r0.f34221b
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.f410683e
                androidx.compose.material.u$a$a r2 = new androidx.compose.material.u$a$a
                kotlin.coroutines.jvm.internal.SuspendLambda r4 = r0.f34223d
                kotlinx.coroutines.T r0 = r0.f34222c
                r5 = 0
                r2.<init>(r4, r7, r0, r5)
                kotlinx.coroutines.N0 r7 = kotlinx.coroutines.C43259k.d(r0, r5, r1, r2, r3)
                r8.f406842b = r7
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21359u.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21359u(Y41.a<Object> aVar, Y41.p<Object, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super C21359u> continuation) {
        super(2, continuation);
        this.f34219s = (kotlin.jvm.internal.N) aVar;
        this.f34220t = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C21359u c21359u = new C21359u(this.f34219s, this.f34220t, continuation);
        c21359u.f34218r = obj;
        return c21359u;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21359u) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34217q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f34218r;
            l0.h hVar = new l0.h();
            InterfaceC43160i interfaceC43160iN = C22126m3.n(this.f34219s);
            a aVar = new a(hVar, t12, this.f34220t);
            this.f34217q = 1;
            if (interfaceC43160iN.collect(aVar, this) == coroutine_suspended) {
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
