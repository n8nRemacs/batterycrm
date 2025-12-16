package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/c0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43197r1 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f411716c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/d0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.flow.r1$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f411717b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f411718c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {219, 220}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.r1$a$a, reason: collision with other inner class name */
        public static final class C11732a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f411719q;

            /* renamed from: r, reason: collision with root package name */
            public int f411720r;

            /* renamed from: t, reason: collision with root package name */
            public Object f411722t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f411723u;

            public C11732a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f411719q = obj;
                this.f411720r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(Y41.p pVar, InterfaceC43172j interfaceC43172j) {
            this.f411717b = interfaceC43172j;
            this.f411718c = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.p, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C43197r1.a.C11732a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.r1$a$a r0 = (kotlinx.coroutines.flow.C43197r1.a.C11732a) r0
                int r1 = r0.f411720r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f411720r = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.r1$a$a r0 = new kotlinx.coroutines.flow.r1$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f411719q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f411720r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlinx.coroutines.flow.j r6 = r0.f411723u
                java.lang.Object r2 = r0.f411722t
                kotlin.C42729a0.b(r7)
                goto L52
            L3c:
                kotlin.C42729a0.b(r7)
                r0.f411722t = r6
                kotlinx.coroutines.flow.j r7 = r5.f411717b
                r0.f411723u = r7
                r0.f411720r = r4
                java.lang.Object r2 = r5.f411718c
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L50
                return r1
            L50:
                r2 = r6
                r6 = r7
            L52:
                r7 = 0
                r0.f411722t = r7
                r0.f411723u = r7
                r0.f411720r = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43197r1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C43197r1(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
        this.f411715b = interfaceC43160i;
        this.f411716c = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f411715b.collect(new a(this.f411716c, interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
