package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43201t implements InterfaceC43160i<Long> {

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.t$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411749q;

        /* renamed from: r, reason: collision with root package name */
        public int f411750r;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC43172j f411752t;

        /* renamed from: u, reason: collision with root package name */
        public long[] f411753u;

        /* renamed from: v, reason: collision with root package name */
        public int f411754v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411749q = obj;
            this.f411750r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43201t.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Long> r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r7 = this;
            boolean r8 = r9 instanceof kotlinx.coroutines.flow.C43201t.a
            if (r8 == 0) goto L13
            r8 = r9
            kotlinx.coroutines.flow.t$a r8 = (kotlinx.coroutines.flow.C43201t.a) r8
            int r0 = r8.f411750r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.f411750r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.t$a r8 = new kotlinx.coroutines.flow.t$a
            r8.<init>(r9)
        L18:
            java.lang.Object r9 = r8.f411749q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f411750r
            if (r1 == 0) goto L51
            r2 = 1
            if (r1 != r2) goto L49
            int r1 = r8.f411754v
            long[] r3 = r8.f411753u
            kotlinx.coroutines.flow.j r4 = r8.f411752t
            kotlin.C42729a0.b(r9)
        L2e:
            int r1 = r1 + r2
            if (r1 >= 0) goto L46
            r5 = r3[r1]
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r8.f411752t = r4
            r8.f411753u = r3
            r8.f411754v = r1
            r8.f411750r = r2
            java.lang.Object r9 = r4.emit(r9, r8)
            if (r9 != r0) goto L2e
            return r0
        L46:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L51:
            kotlin.C42729a0.b(r9)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43201t.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
