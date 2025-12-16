package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43178l implements InterfaceC43160i<Long> {

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2419"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.l$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411600q;

        /* renamed from: r, reason: collision with root package name */
        public int f411601r;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC43172j f411603t;

        /* renamed from: u, reason: collision with root package name */
        public Iterator f411604u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411600q = obj;
            this.f411601r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43178l.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Long> r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof kotlinx.coroutines.flow.C43178l.a
            if (r7 == 0) goto L13
            r7 = r8
            kotlinx.coroutines.flow.l$a r7 = (kotlinx.coroutines.flow.C43178l.a) r7
            int r0 = r7.f411601r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f411601r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.l$a r7 = new kotlinx.coroutines.flow.l$a
            r7.<init>(r8)
        L18:
            java.lang.Object r8 = r7.f411600q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f411601r
            if (r1 == 0) goto L55
            r2 = 1
            if (r1 != r2) goto L4d
            java.util.Iterator r1 = r7.f411604u
            kotlinx.coroutines.flow.j r3 = r7.f411603t
            kotlin.C42729a0.b(r8)
        L2c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L4a
            r8 = r1
            kotlin.collections.L0 r8 = (kotlin.collections.L0) r8
            long r4 = r8.a()
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r7.f411603t = r3
            r7.f411604u = r1
            r7.f411601r = r2
            java.lang.Object r8 = r3.emit(r8, r7)
            if (r8 != r0) goto L2c
            return r0
        L4a:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L4d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L55:
            kotlin.C42729a0.b(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43178l.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
