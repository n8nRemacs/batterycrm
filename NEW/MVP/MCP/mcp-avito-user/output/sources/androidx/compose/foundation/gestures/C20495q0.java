package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.unit.h;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20495q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f27918a;

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "<anonymous parameter 0>", "slopTriggerChange", "Ll0/g;", "<anonymous parameter 2>", "Lkotlin/G0;", "invoke-0AR0LA0", "(Landroidx/compose/ui/input/pointer/C;Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.gestures.q0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.input.pointer.C, androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27919l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super l0.g, kotlin.G0> lVar) {
            super(3);
            this.f27919l = lVar;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, androidx.compose.ui.input.pointer.C c13, l0.g gVar) {
            long j12 = gVar.f413387a;
            this.f27919l.invoke(l0.g.a(c13.f40118c));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.gestures.q0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f27920l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<kotlin.G0> aVar) {
            super(1);
            this.f27920l = aVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
            this.f27920l.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.q0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f27921l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f27918a = ((float) 0.125d) / 18;
    }

    /* JADX WARN: Path cross not found for [B:32:0x00d5, B:38:0x00f1], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:23:0x009f). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r18, @Y61.k androidx.compose.ui.input.pointer.C r19, @Y61.k androidx.compose.ui.input.pointer.PointerEventPass r20, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.a(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.C, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (l0.g.d(r8, 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r17, long r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.b(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0170 -> B:62:0x0176). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r18, long r19, int r21, @Y61.k Y41.p r22, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.c(androidx.compose.ui.input.pointer.c, long, int, Y41.p, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.l0$h] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.C] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r9, long r10, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.C20455g0
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.g0 r0 = (androidx.compose.foundation.gestures.C20455g0) r0
            int r1 = r0.f27712u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27712u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.g0 r0 = new androidx.compose.foundation.gestures.g0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f27711t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27712u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.jvm.internal.l0$a r9 = r0.f27710s
            kotlin.jvm.internal.l0$h r10 = r0.f27709r
            androidx.compose.ui.input.pointer.C r11 = r0.f27708q
            kotlin.C42729a0.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            goto L9e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.C42729a0.b(r12)
            androidx.compose.ui.input.pointer.s r12 = r9.C0()
            boolean r12 = k(r12, r10)
            if (r12 == 0) goto L46
            return r4
        L46:
            androidx.compose.ui.input.pointer.s r12 = r9.C0()
            java.lang.Object r12 = r12.f40278a
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L54:
            if (r5 >= r2) goto L69
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.C r7 = (androidx.compose.ui.input.pointer.C) r7
            long r7 = r7.f40116a
            boolean r7 = androidx.compose.ui.input.pointer.B.a(r7, r10)
            if (r7 == 0) goto L66
            goto L6a
        L66:
            int r5 = r5 + 1
            goto L54
        L69:
            r6 = r4
        L6a:
            r11 = r6
            androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11
            if (r11 != 0) goto L70
            return r4
        L70:
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            kotlin.jvm.internal.l0$h r12 = new kotlin.jvm.internal.l0$h
            r12.<init>()
            r12.f406842b = r11
            androidx.compose.ui.platform.x2 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            kotlin.jvm.internal.l0$a r2 = new kotlin.jvm.internal.l0$a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r2.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            androidx.compose.foundation.gestures.h0 r7 = new androidx.compose.foundation.gestures.h0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r0.f27708q = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r0.f27709r = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r0.f27710s = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r0.f27712u = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            java.lang.Object r9 = r9.U1(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            if (r9 != r1) goto L9d
            return r1
        L9d:
            r9 = r2
        L9e:
            boolean r9 = r9.f406838b     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            if (r9 == 0) goto Lb3
            T r9 = r10.f406842b     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            r4 = r9
            androidx.compose.ui.input.pointer.C r4 = (androidx.compose.ui.input.pointer.C) r4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lab
            if (r4 != 0) goto Lb3
        La9:
            r4 = r11
            goto Lb3
        Lab:
            T r9 = r10.f406842b
            androidx.compose.ui.input.pointer.C r9 = (androidx.compose.ui.input.pointer.C) r9
            if (r9 != 0) goto Lb2
            goto La9
        Lb2:
            r4 = r9
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.d(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016c -> B:62:0x0172). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r17, long r18, @Y61.k Y41.p r20, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.e(androidx.compose.ui.input.pointer.c, long, Y41.p, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0173 -> B:62:0x0179). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r18, long r19, int r21, @Y61.k Y41.p r22, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.f(androidx.compose.ui.input.pointer.c, long, int, Y41.p, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public static final Object g(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Y41.l<? super l0.g, kotlin.G0> lVar, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.p<? super androidx.compose.ui.input.pointer.C, ? super l0.g, kotlin.G0> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = C20444d1.c(k12, new C20498r0(c.f27921l, new l0.g(), null, new a(lVar), pVar, aVar2, new b(aVar), null), continuation);
        if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objC = kotlin.G0.f406611a;
        }
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }

    public static /* synthetic */ Object h(androidx.compose.ui.input.pointer.K k12, Y41.a aVar, Y41.p pVar, Continuation continuation, int i12) {
        C20483n0 c20483n0 = C20483n0.f27875l;
        if ((i12 & 2) != 0) {
            aVar = C20487o0.f27883l;
        }
        return g(k12, c20483n0, aVar, C20491p0.f27907l, pVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r4, long r5, @Y61.k Y41.l r7, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.E0
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.E0 r0 = (androidx.compose.foundation.gestures.E0) r0
            int r1 = r0.f27233t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27233t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.E0 r0 = new androidx.compose.foundation.gestures.E0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27232s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27233t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            Y41.l r4 = r0.f27231r
            Y41.l r4 = (Y41.l) r4
            androidx.compose.ui.input.pointer.c r5 = r0.f27230q
            kotlin.C42729a0.b(r8)
            r7 = r4
            r4 = r5
            goto L4c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.C42729a0.b(r8)
        L3c:
            r0.f27230q = r4
            r8 = r7
            Y41.l r8 = (Y41.l) r8
            r0.f27231r = r8
            r0.f27233t = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.input.pointer.C r8 = (androidx.compose.ui.input.pointer.C) r8
            if (r8 != 0) goto L56
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r4
        L56:
            boolean r5 = androidx.compose.ui.input.pointer.C22341t.c(r8)
            if (r5 == 0) goto L61
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        L61:
            r7.invoke(r8)
            long r5 = r8.f40116a
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.i(androidx.compose.ui.input.pointer.c, long, Y41.l, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r0 == 0.0f) goto L56;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00e8], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:23:0x0086). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r17, long r18, @Y61.k Y41.l r20, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20495q0.j(androidx.compose.ui.input.pointer.c, long, Y41.l, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean k(C22340s c22340s, long j12) {
        Object obj;
        ?? r62 = c22340s.f40278a;
        int size = ((Collection) r62).size();
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i12);
            if (androidx.compose.ui.input.pointer.B.a(((androidx.compose.ui.input.pointer.C) obj).f40116a, j12)) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) obj;
        if (c12 != null && c12.f40119d) {
            z12 = true;
        }
        return true ^ z12;
    }

    public static final float l(@Y61.k InterfaceC22544x2 interfaceC22544x2, int i12) {
        androidx.compose.ui.input.pointer.U.f40189b.getClass();
        return androidx.compose.ui.input.pointer.U.a(i12, androidx.compose.ui.input.pointer.U.f40191d) ? interfaceC22544x2.e() * f27918a : interfaceC22544x2.e();
    }
}
