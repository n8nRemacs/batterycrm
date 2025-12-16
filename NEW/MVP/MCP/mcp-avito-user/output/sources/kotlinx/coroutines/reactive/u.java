package kotlinx.coroutines.reactive;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.channels.InterfaceC43123w;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.internal.F;

/* compiled from: ReactiveFlow.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/reactive/u;", "", "T", "Lkotlinx/coroutines/flow/internal/f;", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class u<T> extends AbstractC43168f<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final org.reactivestreams.c<T> f412016e;

    /* compiled from: ReactiveFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {94, 96}, m = "collectImpl", n = {"this", "collector", "subscriber", "consumed", "this", "collector", "subscriber", "consumed"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f412017q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC43172j f412018r;

        /* renamed from: s, reason: collision with root package name */
        public Object f412019s;

        /* renamed from: t, reason: collision with root package name */
        public long f412020t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f412021u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u<T> f412022v;

        /* renamed from: w, reason: collision with root package name */
        public int f412023w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u<T> uVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f412022v = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f412021u = obj;
            this.f412023w |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f412022v.f(null, null, this);
        }
    }

    public /* synthetic */ u(org.reactivestreams.c cVar, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        this(cVar, (i13 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 4) != 0 ? -2 : i12, (i13 & 8) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    public final Object b(@Y61.k I0<? super T> i02, @Y61.k Continuation<? super G0> continuation) {
        Object objF = f(i02.getF399611e(), new F(i02.r()), continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new u(this.f412016e, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f, kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        CoroutineContext f411447c = continuation.getF411447c();
        ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
        CoroutineContext coroutineContext = this.f411466b;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(companion);
        if (continuationInterceptor == null || continuationInterceptor.equals(f411447c.get(companion))) {
            Object objF = f(f411447c.plus(coroutineContext), interfaceC43172j, continuation);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
        }
        Object objC = U.c(new v(interfaceC43172j, this, null), continuation);
        if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objC = G0.f406611a;
        }
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0037, B:40:0x00bd, B:26:0x0082, B:37:0x00a5, B:42:0x00c8, B:45:0x00cd, B:20:0x0055), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0037, B:40:0x00bd, B:26:0x0082, B:37:0x00a5, B:42:0x00c8, B:45:0x00cd, B:20:0x0055), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlinx.coroutines.reactive.C] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ba -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.CoroutineContext r13, kotlinx.coroutines.flow.InterfaceC43172j<? super T> r14, kotlin.coroutines.Continuation<? super kotlin.G0> r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.u.f(kotlin.coroutines.CoroutineContext, kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long g() {
        if (this.f411468d != BufferOverflow.f410777b) {
            return Long.MAX_VALUE;
        }
        int i12 = this.f411467c;
        if (i12 == -2) {
            InterfaceC43123w.f411026v2.getClass();
            return InterfaceC43123w.b.f411028b;
        }
        if (i12 == 0) {
            return 1L;
        }
        if (i12 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j12 = i12;
        if (j12 >= 1) {
            return j12;
        }
        throw new IllegalStateException("Check failed.");
    }

    public u(@Y61.k org.reactivestreams.c<T> cVar, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        super(coroutineContext, i12, bufferOverflow);
        this.f412016e = cVar;
    }
}
