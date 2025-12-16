package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/g;", "T", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43154g<T> implements InterfaceC43160i<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<T> f411394b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Y41.l<T, Object> f411395c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Object f411396d;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.flow.g$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43154g<T> f411397b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0.h<Object> f411398c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<T> f411399d;

        /* compiled from: Distinct.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        public static final class C11718a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f411400q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ a<T> f411401r;

            /* renamed from: s, reason: collision with root package name */
            public int f411402s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11718a(a<? super T> aVar, Continuation<? super C11718a> continuation) {
                super(continuation);
                this.f411401r = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f411400q = obj;
                this.f411402s |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f411401r.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C43154g<T> c43154g, l0.h<Object> hVar, InterfaceC43172j<? super T> interfaceC43172j) {
            this.f411397b = c43154g;
            this.f411398c = hVar;
            this.f411399d = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v4, types: [Y41.p, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.C43154g.a.C11718a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.C43154g.a.C11718a) r0
                int r1 = r0.f411402s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f411402s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f411400q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f411402s
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r9)
                goto L63
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.C42729a0.b(r9)
                kotlinx.coroutines.flow.g<T> r9 = r7.f411397b
                Y41.l<T, java.lang.Object> r2 = r9.f411395c
                java.lang.Object r2 = r2.invoke(r8)
                kotlin.jvm.internal.l0$h<java.lang.Object> r4 = r7.f411398c
                T r5 = r4.f406842b
                kotlinx.coroutines.internal.a0 r6 = kotlinx.coroutines.flow.internal.z.f411583a
                if (r5 == r6) goto L56
                java.lang.Object r9 = r9.f411396d
                java.lang.Object r9 = r9.invoke(r5, r2)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L53
                goto L56
            L53:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L56:
                r4.f406842b = r2
                r0.f411402s = r3
                kotlinx.coroutines.flow.j<T> r9 = r7.f411399d
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L63
                return r1
            L63:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43154g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43154g(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k Y41.l<? super T, ? extends Object> lVar, @Y61.k Y41.p<Object, Object, Boolean> pVar) {
        this.f411394b = interfaceC43160i;
        this.f411395c = lVar;
        this.f411396d = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation) {
        l0.h hVar = new l0.h();
        hVar.f406842b = (T) kotlinx.coroutines.flow.internal.z.f411583a;
        Object objCollect = this.f411394b.collect(new a(this, hVar, interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
