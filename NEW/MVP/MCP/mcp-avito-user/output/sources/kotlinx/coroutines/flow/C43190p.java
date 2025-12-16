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
/* renamed from: kotlinx.coroutines.flow.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43190p implements InterfaceC43160i<Object> {

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u245"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.p$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411670q;

        /* renamed from: r, reason: collision with root package name */
        public int f411671r;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC43172j f411673t;

        /* renamed from: u, reason: collision with root package name */
        public Iterator f411674u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411670q = obj;
            this.f411671r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43190p.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C43190p.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.p$a r0 = (kotlinx.coroutines.flow.C43190p.a) r0
            int r1 = r0.f411671r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411671r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.p$a r0 = new kotlinx.coroutines.flow.p$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f411670q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411671r
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.util.Iterator r6 = r0.f411674u
            kotlinx.coroutines.flow.j r2 = r0.f411673t
            kotlin.C42729a0.b(r7)
            r7 = r2
            goto L3d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C42729a0.b(r7)
            r7 = 0
            r4 = r7
            r7 = r6
            r6 = r4
        L3d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r6.next()
            r0.f411673t = r7
            r0.f411674u = r6
            r0.f411671r = r3
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L3d
            return r1
        L54:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43190p.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
