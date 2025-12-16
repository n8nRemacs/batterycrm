package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43207v implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f411789b;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {113}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.v$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411790q;

        /* renamed from: r, reason: collision with root package name */
        public int f411791r;

        /* renamed from: t, reason: collision with root package name */
        public C43207v f411793t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411794u;

        /* renamed from: v, reason: collision with root package name */
        public int f411795v;

        /* renamed from: w, reason: collision with root package name */
        public int f411796w;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411790q = obj;
            this.f411791r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43207v.this.collect(null, this);
        }
    }

    public C43207v(Object[] objArr) {
        this.f411789b = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C43207v.a
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.v$a r0 = (kotlinx.coroutines.flow.C43207v.a) r0
            int r1 = r0.f411791r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411791r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$a r0 = new kotlinx.coroutines.flow.v$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f411790q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411791r
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r8 = r0.f411796w
            int r2 = r0.f411795v
            kotlinx.coroutines.flow.j r4 = r0.f411794u
            kotlinx.coroutines.flow.v r5 = r0.f411793t
            kotlin.C42729a0.b(r9)
            r9 = r4
            goto L5c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.C42729a0.b(r9)
            java.lang.Object[] r9 = r7.f411789b
            int r9 = r9.length
            r2 = 0
            r5 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L45:
            if (r2 >= r8) goto L5e
            java.lang.Object[] r4 = r5.f411789b
            r4 = r4[r2]
            r0.f411793t = r5
            r0.f411794u = r9
            r0.f411795v = r2
            r0.f411796w = r8
            r0.f411791r = r3
            java.lang.Object r4 = r9.emit(r4, r0)
            if (r4 != r1) goto L5c
            return r1
        L5c:
            int r2 = r2 + r3
            goto L45
        L5e:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43207v.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
