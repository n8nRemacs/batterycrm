package androidx.compose.material3;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {735}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21849s extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37229q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f37230r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f37231s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f37232t;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.s$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0.h<kotlinx.coroutines.N0> f37233b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f37234c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f37235d;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {741}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.s$a$a, reason: collision with other inner class name */
        public static final class C1650a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f37236q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f37237r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Object f37238s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f37239t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1650a(Y41.p<Object, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Object obj, kotlinx.coroutines.T t12, Continuation<? super C1650a> continuation) {
                super(2, continuation);
                this.f37237r = (SuspendLambda) pVar;
                this.f37238s = obj;
                this.f37239t = t12;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C1650a(this.f37237r, this.f37238s, this.f37239t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1650a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f37236q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f37236q = 1;
                    if (this.f37237r.invoke(this.f37238s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                kotlinx.coroutines.U.b(this.f37239t, new C21712m());
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {738}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.material3.s$a$b */
        public static final class b extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f37240q;

            /* renamed from: r, reason: collision with root package name */
            public Object f37241r;

            /* renamed from: s, reason: collision with root package name */
            public kotlinx.coroutines.N0 f37242s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f37243t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f37244u;

            /* renamed from: v, reason: collision with root package name */
            public int f37245v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, Continuation<? super b> continuation) {
                super(continuation);
                this.f37244u = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f37243t = obj;
                this.f37245v |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f37244u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l0.h<kotlinx.coroutines.N0> hVar, kotlinx.coroutines.T t12, Y41.p<Object, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
            this.f37233b = hVar;
            this.f37234c = t12;
            this.f37235d = (SuspendLambda) pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.compose.material3.C21849s.a.b
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material3.s$a$b r0 = (androidx.compose.material3.C21849s.a.b) r0
                int r1 = r0.f37245v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37245v = r1
                goto L18
            L13:
                androidx.compose.material3.s$a$b r0 = new androidx.compose.material3.s$a$b
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f37243t
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f37245v
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f37241r
                java.lang.Object r0 = r0.f37240q
                androidx.compose.material3.s$a r0 = (androidx.compose.material3.C21849s.a) r0
                kotlin.C42729a0.b(r8)
                goto L5a
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.C42729a0.b(r8)
                kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r8 = r6.f37233b
                T r8 = r8.f406842b
                kotlinx.coroutines.N0 r8 = (kotlinx.coroutines.N0) r8
                if (r8 == 0) goto L59
                androidx.compose.material3.m r2 = new androidx.compose.material3.m
                r2.<init>()
                r8.c(r2)
                r0.f37240q = r6
                r0.f37241r = r7
                r0.f37242s = r8
                r0.f37245v = r3
                java.lang.Object r8 = r8.A(r0)
                if (r8 != r1) goto L59
                return r1
            L59:
                r0 = r6
            L5a:
                kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r8 = r0.f37233b
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.f410683e
                androidx.compose.material3.s$a$a r2 = new androidx.compose.material3.s$a$a
                kotlin.coroutines.jvm.internal.SuspendLambda r4 = r0.f37235d
                kotlinx.coroutines.T r0 = r0.f37234c
                r5 = 0
                r2.<init>(r4, r7, r0, r5)
                kotlinx.coroutines.N0 r7 = kotlinx.coroutines.C43259k.d(r0, r5, r1, r2, r3)
                r8.f406842b = r7
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21849s.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21849s(Y41.a<Object> aVar, Y41.p<Object, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super C21849s> continuation) {
        super(2, continuation);
        this.f37231s = (kotlin.jvm.internal.N) aVar;
        this.f37232t = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C21849s c21849s = new C21849s(this.f37231s, this.f37232t, continuation);
        c21849s.f37230r = obj;
        return c21849s;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21849s) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37229q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f37230r;
            l0.h hVar = new l0.h();
            InterfaceC43160i interfaceC43160iN = C22126m3.n(this.f37231s);
            a aVar = new a(hVar, t12, this.f37232t);
            this.f37229q = 1;
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
