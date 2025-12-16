package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<androidx.compose.ui.input.pointer.C, Boolean> f27308a = a.f27312l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f27309b = new c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f27310c = new b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final d f27311d = new d();

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "change", "", "invoke", "(Landroidx/compose/ui/input/pointer/C;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27312l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(androidx.compose.ui.input.pointer.C c12) {
            int i12 = c12.f40124i;
            androidx.compose.ui.input.pointer.U.f40189b.getClass();
            return Boolean.valueOf(!androidx.compose.ui.input.pointer.U.a(i12, androidx.compose.ui.input.pointer.U.f40191d));
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/K1$b", "Landroidx/compose/ui/x;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.x {
        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r12, Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(this, r12, pVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
        }

        @Override // androidx.compose.ui.x
        public final float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/K1$d", "Landroidx/compose/ui/unit/d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements androidx.compose.ui.unit.d {
        @Override // androidx.compose.ui.unit.n
        /* renamed from: K0 */
        public final float getF40390d() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: getDensity */
        public final float getF40389c() {
            return 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.C20433a2 r11, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.L1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.L1 r0 = (androidx.compose.foundation.gestures.L1) r0
            int r1 = r0.f27351t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27351t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.L1 r0 = new androidx.compose.foundation.gestures.L1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f27350s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27351t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.l0$e r11 = r0.f27349r
            androidx.compose.foundation.gestures.a2 r12 = r0.f27348q
            kotlin.C42729a0.b(r14)
            r14 = r11
            r11 = r12
            goto L58
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.C42729a0.b(r14)
            kotlin.jvm.internal.l0$e r14 = new kotlin.jvm.internal.l0$e
            r14.<init>()
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.f26797b
            androidx.compose.foundation.gestures.M1 r10 = new androidx.compose.foundation.gestures.M1
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f27348q = r11
            r0.f27349r = r14
            r0.f27351t = r3
            java.lang.Object r12 = r11.f(r2, r10, r0)
            if (r12 != r1) goto L58
            goto L62
        L58:
            float r12 = r14.f406839b
            long r11 = r11.h(r12)
            l0.g r1 = l0.g.a(r11)
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.K1.a(androidx.compose.foundation.gestures.a2, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static androidx.compose.ui.v b(androidx.compose.ui.v vVar, U1 u12, Orientation orientation, boolean z12, boolean z13, androidx.compose.foundation.interaction.m mVar) {
        return vVar.d0(new ScrollableElement(u12, orientation, z12, z13, mVar));
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/K1$c", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements G1 {
        @Override // androidx.compose.foundation.gestures.G1
        public final float a(float f12) {
            return f12;
        }
    }
}
