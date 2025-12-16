package kotlinx.coroutines.flow.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/h;", "T", "Lkotlinx/coroutines/flow/internal/f;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43170h<T> extends AbstractC43168f<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<InterfaceC43160i<T>> f411469e;

    /* renamed from: f, reason: collision with root package name */
    public final int f411470f;

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "inner", "Lkotlin/G0;", "emit", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.flow.internal.h$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N0 f411471b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.sync.l f411472c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I0<T> f411473d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ F<T> f411474e;

        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.h$a$a, reason: collision with other inner class name */
        public static final class C11719a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f411475q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i<T> f411476r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ F<T> f411477s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.sync.l f411478t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11719a(InterfaceC43160i interfaceC43160i, F f12, kotlinx.coroutines.sync.l lVar, Continuation continuation) {
                super(2, continuation);
                this.f411476r = interfaceC43160i;
                this.f411477s = f12;
                this.f411478t = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C11719a(this.f411476r, this.f411477s, this.f411478t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C11719a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f411475q;
                kotlinx.coroutines.sync.l lVar = this.f411478t;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC43160i<T> interfaceC43160i = this.f411476r;
                        F<T> f12 = this.f411477s;
                        this.f411475q = 1;
                        if (interfaceC43160i.collect(f12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    lVar.release();
                    return G0.f406611a;
                } catch (Throwable th2) {
                    lVar.release();
                    throw th2;
                }
            }
        }

        /* compiled from: Merge.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {62}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.internal.h$a$b */
        public static final class b extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f411479q;

            /* renamed from: r, reason: collision with root package name */
            public InterfaceC43160i f411480r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f411481s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a<T> f411482t;

            /* renamed from: u, reason: collision with root package name */
            public int f411483u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, Continuation<? super b> continuation) {
                super(continuation);
                this.f411482t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f411481s = obj;
                this.f411483u |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f411482t.emit(null, this);
            }
        }

        public a(N0 n02, kotlinx.coroutines.sync.l lVar, I0 i02, F f12) {
            this.f411471b = n02;
            this.f411472c = lVar;
            this.f411473d = i02;
            this.f411474e = f12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends T> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.C43170h.a.b
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.internal.h$a$b r0 = (kotlinx.coroutines.flow.internal.C43170h.a.b) r0
                int r1 = r0.f411483u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f411483u = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.h$a$b r0 = new kotlinx.coroutines.flow.internal.h$a$b
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f411481s
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f411483u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlinx.coroutines.flow.i r5 = r0.f411480r
                java.lang.Object r0 = r0.f411479q
                kotlinx.coroutines.flow.internal.h$a r0 = (kotlinx.coroutines.flow.internal.C43170h.a) r0
                kotlin.C42729a0.b(r6)
                goto L5a
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.C42729a0.b(r6)
                kotlinx.coroutines.N0 r6 = r4.f411471b
                if (r6 == 0) goto L4a
                boolean r2 = r6.isActive()
                if (r2 == 0) goto L45
                goto L4a
            L45:
                java.util.concurrent.CancellationException r5 = r6.J()
                throw r5
            L4a:
                r0.f411479q = r4
                r0.f411480r = r5
                r0.f411483u = r3
                kotlinx.coroutines.sync.l r6 = r4.f411472c
                java.lang.Object r6 = r6.c(r0)
                if (r6 != r1) goto L59
                return r1
            L59:
                r0 = r4
            L5a:
                kotlinx.coroutines.channels.I0<T> r6 = r0.f411473d
                kotlinx.coroutines.flow.internal.h$a$a r1 = new kotlinx.coroutines.flow.internal.h$a$a
                kotlinx.coroutines.sync.l r2 = r0.f411472c
                kotlinx.coroutines.flow.internal.F<T> r0 = r0.f411474e
                r3 = 0
                r1.<init>(r5, r0, r2, r3)
                r5 = 3
                kotlinx.coroutines.C43259k.d(r6, r3, r3, r1, r5)
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C43170h.a.emit(kotlinx.coroutines.flow.i, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public /* synthetic */ C43170h(InterfaceC43160i interfaceC43160i, int i12, CoroutineContext coroutineContext, int i13, BufferOverflow bufferOverflow, int i14, C42822w c42822w) {
        this(interfaceC43160i, i12, (i14 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i14 & 8) != 0 ? -2 : i13, (i14 & 16) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final String a() {
        return "concurrency=" + this.f411470f;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    public final Object b(@Y61.k I0<? super T> i02, @Y61.k Continuation<? super G0> continuation) {
        int i12 = kotlinx.coroutines.sync.p.f412281a;
        Object objCollect = this.f411469e.collect(new a((N0) continuation.getF411447c().get(N0.f410716u2), new kotlinx.coroutines.sync.l(this.f411470f), i02, new F(i02)), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new C43170h(this.f411469e, this.f411470f, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final K0<T> e(@Y61.k T t12) {
        C43167e c43167e = new C43167e(this, null);
        return F0.c(t12, this.f411466b, this.f411467c, BufferOverflow.f410777b, CoroutineStart.f410680b, c43167e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43170h(@Y61.k InterfaceC43160i<? extends InterfaceC43160i<? extends T>> interfaceC43160i, int i12, @Y61.k CoroutineContext coroutineContext, int i13, @Y61.k BufferOverflow bufferOverflow) {
        super(coroutineContext, i13, bufferOverflow);
        this.f411469e = interfaceC43160i;
        this.f411470f = i12;
    }
}
