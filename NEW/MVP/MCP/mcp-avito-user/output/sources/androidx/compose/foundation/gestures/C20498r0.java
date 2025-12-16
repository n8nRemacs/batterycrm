package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
/* renamed from: androidx.compose.foundation.gestures.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20498r0 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f27941A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ l0.g f27942B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Orientation f27943C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f27944D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f27945E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f27946F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f27947G;

    /* renamed from: q, reason: collision with root package name */
    public Object f27948q;

    /* renamed from: r, reason: collision with root package name */
    public Object f27949r;

    /* renamed from: s, reason: collision with root package name */
    public Object f27950s;

    /* renamed from: t, reason: collision with root package name */
    public l0.g f27951t;

    /* renamed from: u, reason: collision with root package name */
    public C20489o2 f27952u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f27953v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27954w;

    /* renamed from: x, reason: collision with root package name */
    public float f27955x;

    /* renamed from: y, reason: collision with root package name */
    public int f27956y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f27957z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20498r0(Y41.a<Boolean> aVar, l0.g gVar, Orientation orientation, Y41.q<? super androidx.compose.ui.input.pointer.C, ? super androidx.compose.ui.input.pointer.C, ? super l0.g, kotlin.G0> qVar, Y41.p<? super androidx.compose.ui.input.pointer.C, ? super l0.g, kotlin.G0> pVar, Y41.a<kotlin.G0> aVar2, Y41.l<? super androidx.compose.ui.input.pointer.C, kotlin.G0> lVar, Continuation<? super C20498r0> continuation) {
        super(2, continuation);
        this.f27941A = (kotlin.jvm.internal.N) aVar;
        this.f27942B = gVar;
        this.f27943C = orientation;
        this.f27944D = (kotlin.jvm.internal.N) qVar;
        this.f27945E = (kotlin.jvm.internal.N) pVar;
        this.f27946F = aVar2;
        this.f27947G = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.q, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        ?? r72 = this.f27947G;
        C20498r0 c20498r0 = new C20498r0(this.f27941A, this.f27942B, this.f27943C, this.f27944D, this.f27945E, this.f27946F, r72, continuation);
        c20498r0.f27957z = obj;
        return c20498r0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
        return ((C20498r0) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0545, code lost:
    
        if (r7 == 0.0f) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:130:0x03a6, B:131:0x03ab], limit reached: 234 */
    /* JADX WARN: Path cross not found for [B:134:0x03b2, B:130:0x03a6], limit reached: 234 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0365 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x039a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c5  */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v23, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v41, types: [Y41.q, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x02e3 -> B:90:0x029a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0406 -> B:161:0x043e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0432 -> B:158:0x0435). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0456 -> B:82:0x0278). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x04be -> B:176:0x04c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x014d -> B:29:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01c6 -> B:29:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x021c -> B:74:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x024b -> B:71:0x0250). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20498r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
