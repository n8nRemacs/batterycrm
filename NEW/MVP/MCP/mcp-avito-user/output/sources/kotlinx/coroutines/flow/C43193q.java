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
/* renamed from: kotlinx.coroutines.flow.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43193q implements InterfaceC43160i<Object> {

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u247"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.q$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411687q;

        /* renamed from: r, reason: collision with root package name */
        public int f411688r;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC43172j f411690t;

        /* renamed from: u, reason: collision with root package name */
        public Iterator f411691u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411687q = obj;
            this.f411688r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43193q.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof kotlinx.coroutines.flow.C43193q.a
            if (r5 == 0) goto L13
            r5 = r6
            kotlinx.coroutines.flow.q$a r5 = (kotlinx.coroutines.flow.C43193q.a) r5
            int r0 = r5.f411688r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f411688r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.q$a r5 = new kotlinx.coroutines.flow.q$a
            r5.<init>(r6)
        L18:
            java.lang.Object r6 = r5.f411687q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f411688r
            if (r1 == 0) goto L4e
            r2 = 1
            if (r1 != r2) goto L46
            java.util.Iterator r1 = r5.f411691u
            kotlinx.coroutines.flow.j r3 = r5.f411690t
            kotlin.C42729a0.b(r6)
        L2c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L43
            java.lang.Object r6 = r1.next()
            r5.f411690t = r3
            r5.f411691u = r1
            r5.f411688r = r2
            java.lang.Object r6 = r3.emit(r6, r5)
            if (r6 != r0) goto L2c
            return r0
        L43:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L4e:
            kotlin.C42729a0.b(r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43193q.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
