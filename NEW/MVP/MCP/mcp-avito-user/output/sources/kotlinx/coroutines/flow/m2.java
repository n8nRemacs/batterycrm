package kotlinx.coroutines.flow;

import androidx.compose.runtime.C22026a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: SharingStarted.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/m2;", "Lkotlinx/coroutines/flow/i2;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class m2 implements i2 {

    /* renamed from: b, reason: collision with root package name */
    public final long f411627b;

    /* renamed from: c, reason: collision with root package name */
    public final long f411628c;

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SharingCommand>, Integer, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411629q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f411630r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ int f411631s;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SharingCommand> interfaceC43172j, Integer num, Continuation<? super kotlin.G0> continuation) {
            int iIntValue = num.intValue();
            a aVar = m2.this.new a(continuation);
            aVar.f411630r = interfaceC43172j;
            aVar.f411631s = iIntValue;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f411629q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                kotlinx.coroutines.flow.m2 r7 = kotlinx.coroutines.flow.m2.this
                if (r1 == 0) goto L38
                if (r1 == r6) goto L34
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L28
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                goto L34
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                kotlinx.coroutines.flow.j r1 = r10.f411630r
                kotlin.C42729a0.b(r11)
                goto L7b
            L28:
                kotlinx.coroutines.flow.j r1 = r10.f411630r
                kotlin.C42729a0.b(r11)
                goto L6e
            L2e:
                kotlinx.coroutines.flow.j r1 = r10.f411630r
                kotlin.C42729a0.b(r11)
                goto L59
            L34:
                kotlin.C42729a0.b(r11)
                goto L89
            L38:
                kotlin.C42729a0.b(r11)
                kotlinx.coroutines.flow.j r1 = r10.f411630r
                int r11 = r10.f411631s
                if (r11 <= 0) goto L4c
                kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.f411255b
                r10.f411629q = r6
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L89
                return r0
            L4c:
                long r8 = r7.f411627b
                r10.f411630r = r1
                r10.f411629q = r5
                java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r8, r10)
                if (r11 != r0) goto L59
                return r0
            L59:
                long r5 = r7.f411628c
                r8 = 0
                int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r11 <= 0) goto L7b
                kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.f411256c
                r10.f411630r = r1
                r10.f411629q = r4
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L6e
                return r0
            L6e:
                long r4 = r7.f411628c
                r10.f411630r = r1
                r10.f411629q = r3
                java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r4, r10)
                if (r11 != r0) goto L7b
                return r0
            L7b:
                kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.f411257d
                r3 = 0
                r10.f411630r = r3
                r10.f411629q = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L89
                return r0
            L89:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<SharingCommand, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411633q;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f411633q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(SharingCommand sharingCommand, Continuation<? super Boolean> continuation) {
            return ((b) create(sharingCommand, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(((SharingCommand) this.f411633q) != SharingCommand.f411255b);
        }
    }

    public m2(long j12, long j13) {
        this.f411627b = j12;
        this.f411628c = j13;
        if (j12 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "stopTimeout(", " ms) cannot be negative").toString());
        }
        if (j13 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j13, "replayExpiration(", " ms) cannot be negative").toString());
        }
    }

    @Override // kotlinx.coroutines.flow.i2
    @Y61.k
    public final InterfaceC43160i<SharingCommand> a(@Y61.k n2<Integer> n2Var) {
        return C43175k.r(new C43194q0(new b(2, null), C43175k.Y(n2Var, new a(null))));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            if (this.f411627b == m2Var.f411627b && this.f411628c == m2Var.f411628c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.f411628c) + (Long.hashCode(this.f411627b) * 31);
    }

    @Y61.k
    public final String toString() {
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(2);
        long j12 = this.f411627b;
        if (j12 > 0) {
            bVar.add("stopTimeout=" + j12 + "ms");
        }
        long j13 = this.f411628c;
        if (j13 < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + j13 + "ms");
        }
        return C22026a.c(new StringBuilder("SharingStarted.WhileSubscribed("), C42745f0.O(C42745f0.p(bVar), null, null, null, null, 63), ')');
    }
}
