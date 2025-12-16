package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Limit.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n0", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43211w0 implements InterfaceC43172j<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j f411813c;

    /* compiled from: Limit.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {139, 140}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.w0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C43211w0 f411814q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411815r;

        /* renamed from: s, reason: collision with root package name */
        public int f411816s;

        /* renamed from: u, reason: collision with root package name */
        public Object f411818u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411815r = obj;
            this.f411816s |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43211w0.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43211w0(Y41.p pVar, InterfaceC43172j interfaceC43172j) {
        this.f411812b = (SuspendLambda) pVar;
        this.f411813c = interfaceC43172j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C43211w0.a
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.w0$a r0 = (kotlinx.coroutines.flow.C43211w0.a) r0
            int r1 = r0.f411816s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411816s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.w0$a r0 = new kotlinx.coroutines.flow.w0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f411815r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411816s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlinx.coroutines.flow.w0 r8 = r0.f411814q
            kotlin.C42729a0.b(r9)
            goto L70
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f411818u
            kotlinx.coroutines.flow.w0 r2 = r0.f411814q
            kotlin.C42729a0.b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L57
        L42:
            kotlin.C42729a0.b(r9)
            r0.f411814q = r7
            r0.f411818u = r8
            r0.f411816s = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = r7.f411812b
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r2 = r9
            r9 = r8
            r8 = r7
        L57:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6f
            kotlinx.coroutines.flow.j r2 = r8.f411813c
            r0.f411814q = r8
            r5 = 0
            r0.f411818u = r5
            r0.f411816s = r3
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 != r1) goto L70
            return r1
        L6f:
            r4 = 0
        L70:
            if (r4 == 0) goto L75
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L75:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43211w0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
