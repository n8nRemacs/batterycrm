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
/* renamed from: kotlinx.coroutines.flow.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43204u implements InterfaceC43160i<Integer> {

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2417"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.u$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411774q;

        /* renamed from: r, reason: collision with root package name */
        public int f411775r;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC43172j f411777t;

        /* renamed from: u, reason: collision with root package name */
        public Iterator f411778u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411774q = obj;
            this.f411775r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43204u.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Integer> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof kotlinx.coroutines.flow.C43204u.a
            if (r5 == 0) goto L13
            r5 = r6
            kotlinx.coroutines.flow.u$a r5 = (kotlinx.coroutines.flow.C43204u.a) r5
            int r0 = r5.f411775r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f411775r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.u$a r5 = new kotlinx.coroutines.flow.u$a
            r5.<init>(r6)
        L18:
            java.lang.Object r6 = r5.f411774q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f411775r
            if (r1 == 0) goto L55
            r2 = 1
            if (r1 != r2) goto L4d
            java.util.Iterator r1 = r5.f411778u
            kotlinx.coroutines.flow.j r3 = r5.f411777t
            kotlin.C42729a0.b(r6)
        L2c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4a
            r6 = r1
            kotlin.collections.K0 r6 = (kotlin.collections.K0) r6
            int r6 = r6.a()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            r5.f411777t = r3
            r5.f411778u = r1
            r5.f411775r = r2
            java.lang.Object r6 = r3.emit(r6, r5)
            if (r6 != r0) goto L2c
            return r0
        L4a:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L4d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L55:
            kotlin.C42729a0.b(r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43204u.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
