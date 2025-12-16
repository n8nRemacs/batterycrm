package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22164i;
import androidx.compose.runtime.snapshots.InterfaceC22163h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43123w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SnapshotFlow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {142, 146, 169}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes.dex */
final class v3 extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public androidx.collection.S0 f38789q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f38790r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43123w f38791s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC22163h f38792t;

    /* renamed from: u, reason: collision with root package name */
    public Object f38793u;

    /* renamed from: v, reason: collision with root package name */
    public int f38794v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f38795w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Object> f38796x;

    /* compiled from: SnapshotFlow.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.S0<Object> f38797l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.collection.S0<Object> s02) {
            super(1);
            this.f38797l = s02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            if (obj instanceof androidx.compose.runtime.snapshots.W) {
                int i12 = C22164i.f38715b;
                ((androidx.compose.runtime.snapshots.W) obj).q(4);
            }
            this.f38797l.e(obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/l;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<Set<? extends Object>, AbstractC22167l, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C43108m f38798l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C43108m c43108m) {
            super(2);
            this.f38798l = c43108m;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(java.util.Set<? extends java.lang.Object> r17, androidx.compose.runtime.snapshots.AbstractC22167l r18) {
            /*
                r16 = this;
                r0 = r17
                java.util.Set r0 = (java.util.Set) r0
                r1 = r18
                androidx.compose.runtime.snapshots.l r1 = (androidx.compose.runtime.snapshots.AbstractC22167l) r1
                boolean r1 = r0 instanceof androidx.compose.runtime.collection.g
                r2 = 4
                if (r1 == 0) goto L66
                r1 = r0
                androidx.compose.runtime.collection.g r1 = (androidx.compose.runtime.collection.g) r1
                androidx.collection.j1<T> r1 = r1.f38269b
                java.lang.Object[] r3 = r1.f25730b
                long[] r1 = r1.f25729a
                int r4 = r1.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L63
                r5 = 0
                r6 = r5
            L1d:
                r7 = r1[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L5e
                int r9 = r6 - r4
                int r9 = ~r9
                int r9 = r9 >>> 31
                r10 = 8
                int r9 = 8 - r9
                r11 = r5
            L37:
                if (r11 >= r9) goto L5c
                r12 = 255(0xff, double:1.26E-321)
                long r12 = r12 & r7
                r14 = 128(0x80, double:6.3E-322)
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L58
                int r12 = r6 << 3
                int r12 = r12 + r11
                r12 = r3[r12]
                boolean r13 = r12 instanceof androidx.compose.runtime.snapshots.W
                if (r13 == 0) goto L55
                androidx.compose.runtime.snapshots.W r12 = (androidx.compose.runtime.snapshots.W) r12
                int r13 = androidx.compose.runtime.snapshots.C22164i.f38715b
                boolean r12 = r12.p(r2)
                if (r12 == 0) goto L58
            L55:
                r1 = r16
                goto L94
            L58:
                long r7 = r7 >> r10
                int r11 = r11 + 1
                goto L37
            L5c:
                if (r9 != r10) goto L63
            L5e:
                if (r6 == r4) goto L63
                int r6 = r6 + 1
                goto L1d
            L63:
                r1 = r16
                goto L99
            L66:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r3 = r1 instanceof java.util.Collection
                if (r3 == 0) goto L77
                r3 = r1
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L77
                goto L63
            L77:
                java.util.Iterator r1 = r1.iterator()
            L7b:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L63
                java.lang.Object r3 = r1.next()
                boolean r4 = r3 instanceof androidx.compose.runtime.snapshots.W
                if (r4 == 0) goto L55
                androidx.compose.runtime.snapshots.W r3 = (androidx.compose.runtime.snapshots.W) r3
                int r4 = androidx.compose.runtime.snapshots.C22164i.f38715b
                boolean r3 = r3.p(r2)
                if (r3 == 0) goto L7b
                goto L55
            L94:
                kotlinx.coroutines.channels.m r2 = r1.f38798l
                r2.w(r0)
            L99:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.v3.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Y41.a<Object> aVar, Continuation<? super v3> continuation) {
        super(2, continuation);
        this.f38796x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        v3 v3Var = new v3(this.f38796x, continuation);
        v3Var.f38795w = obj;
        return v3Var;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((v3) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152 A[EDGE_INSN: B:117:0x0152->B:65:0x0152 BREAK  A[LOOP:0: B:34:0x00d2->B:92:0x01b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #4 {all -> 0x019a, blocks: (B:39:0x00df, B:41:0x00f4, B:43:0x0100, B:45:0x010a, B:63:0x0145, B:66:0x0154, B:70:0x016f, B:72:0x0178, B:50:0x011f, B:56:0x0133), top: B:110:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1 A[LOOP:0: B:34:0x00d2->B:92:0x01b1, LOOP_END] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.channels.K0, kotlinx.coroutines.channels.w] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlinx.coroutines.channels.w] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlinx.coroutines.channels.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0193 -> B:78:0x0194). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.v3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
