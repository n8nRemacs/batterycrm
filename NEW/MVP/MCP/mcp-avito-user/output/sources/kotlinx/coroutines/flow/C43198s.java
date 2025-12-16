package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43198s implements InterfaceC43160i<Integer> {

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.s$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411729q;

        /* renamed from: r, reason: collision with root package name */
        public int f411730r;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC43172j f411732t;

        /* renamed from: u, reason: collision with root package name */
        public int[] f411733u;

        /* renamed from: v, reason: collision with root package name */
        public int f411734v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411729q = obj;
            this.f411730r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43198s.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Integer> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof kotlinx.coroutines.flow.C43198s.a
            if (r6 == 0) goto L13
            r6 = r7
            kotlinx.coroutines.flow.s$a r6 = (kotlinx.coroutines.flow.C43198s.a) r6
            int r0 = r6.f411730r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f411730r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.s$a r6 = new kotlinx.coroutines.flow.s$a
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f411729q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f411730r
            if (r1 == 0) goto L51
            r2 = 1
            if (r1 != r2) goto L49
            int r1 = r6.f411734v
            int[] r3 = r6.f411733u
            kotlinx.coroutines.flow.j r4 = r6.f411732t
            kotlin.C42729a0.b(r7)
        L2e:
            int r1 = r1 + r2
            if (r1 >= 0) goto L46
            r7 = r3[r1]
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r6.f411732t = r4
            r6.f411733u = r3
            r6.f411734v = r1
            r6.f411730r = r2
            java.lang.Object r7 = r4.emit(r7, r6)
            if (r7 != r0) goto L2e
            return r0
        L46:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L51:
            kotlin.C42729a0.b(r7)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43198s.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
