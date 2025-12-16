package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l0.g;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/a2;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20433a2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public U1 f27548a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.M1 f27549b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public InterfaceC20432a1 f27550c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Orientation f27551d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27552e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.input.nestedscroll.b f27553f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f27554g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27555h;

    /* renamed from: i, reason: collision with root package name */
    public int f27556i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public G1 f27557j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a f27558k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Y41.l<l0.g, l0.g> f27559l;

    /* compiled from: Scrollable.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/a2$a", "Landroidx/compose/foundation/gestures/t1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.a2$a */
    public static final class a implements InterfaceC20506t1 {
        public a() {
        }

        @Override // androidx.compose.foundation.gestures.InterfaceC20506t1
        public final long a(int i12, long j12) {
            C20433a2 c20433a2 = C20433a2.this;
            c20433a2.f27556i = i12;
            androidx.compose.foundation.M1 m12 = c20433a2.f27549b;
            return (m12 == null || !(c20433a2.f27548a.b() || c20433a2.f27548a.d())) ? C20433a2.a(c20433a2, c20433a2.f27557j, j12, i12) : m12.Q(j12, c20433a2.f27556i, c20433a2.f27559l);
        }

        @Override // androidx.compose.foundation.gestures.InterfaceC20506t1
        public final long b(int i12, long j12) {
            C20433a2 c20433a2 = C20433a2.this;
            return C20433a2.a(c20433a2, c20433a2.f27557j, j12, i12);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/g;", "delta", "invoke-MK-Hz9U", "(J)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.gestures.a2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<l0.g, l0.g> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final l0.g invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            C20433a2 c20433a2 = C20433a2.this;
            return l0.g.a(C20433a2.a(c20433a2, c20433a2.f27557j, j12, c20433a2.f27556i));
        }
    }

    public C20433a2(@Y61.k U1 u12, @Y61.l androidx.compose.foundation.M1 m12, @Y61.k InterfaceC20432a1 interfaceC20432a1, @Y61.k Orientation orientation, boolean z12, @Y61.k androidx.compose.ui.input.nestedscroll.b bVar, @Y61.k Y41.a<Boolean> aVar) {
        this.f27548a = u12;
        this.f27549b = m12;
        this.f27550c = interfaceC20432a1;
        this.f27551d = orientation;
        this.f27552e = z12;
        this.f27553f = bVar;
        this.f27554g = aVar;
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        this.f27556i = androidx.compose.ui.input.nestedscroll.i.f40106c;
        this.f27557j = K1.f27309b;
        this.f27558k = new a();
        this.f27559l = new b();
    }

    public static final long a(C20433a2 c20433a2, G1 g12, long j12, int i12) {
        long jA1;
        androidx.compose.ui.input.nestedscroll.f fVar = c20433a2.f27553f.f40077a;
        androidx.compose.ui.input.nestedscroll.f fVar2 = null;
        if (fVar != null && fVar.f42893o) {
            fVar2 = (androidx.compose.ui.input.nestedscroll.f) androidx.compose.ui.node.Z0.a(fVar);
        }
        if (fVar2 != null) {
            jA1 = fVar2.a1(i12, j12);
        } else {
            l0.g.f413384b.getClass();
            jA1 = 0;
        }
        long jI2 = l0.g.i(j12, jA1);
        long jE2 = c20433a2.e(c20433a2.h(g12.a(c20433a2.g(c20433a2.e(l0.g.b(c20433a2.f27551d == Orientation.f27426c ? 1 : 2, jI2, 0.0f))))));
        return l0.g.j(l0.g.j(jA1, jE2), c20433a2.f27553f.b(i12, jE2, l0.g.i(jI2, jE2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.Y1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.Y1 r0 = (androidx.compose.foundation.gestures.Y1) r0
            int r1 = r0.f27533u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27533u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.Y1 r0 = new androidx.compose.foundation.gestures.Y1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f27531s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27533u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.l0$g r12 = r0.f27530r
            androidx.compose.foundation.gestures.a2 r13 = r0.f27529q
            kotlin.C42729a0.b(r14)
            goto L5c
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.C42729a0.b(r14)
            kotlin.jvm.internal.l0$g r14 = new kotlin.jvm.internal.l0$g
            r14.<init>()
            r14.f406841b = r12
            r11.f27555h = r3
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.f26797b
            androidx.compose.foundation.gestures.Z1 r10 = new androidx.compose.foundation.gestures.Z1
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f27529q = r11
            r0.f27530r = r14
            r0.f27533u = r3
            java.lang.Object r12 = r11.f(r2, r10, r0)
            if (r12 != r1) goto L5a
            return r1
        L5a:
            r13 = r11
            r12 = r14
        L5c:
            r14 = 0
            r13.f27555h = r14
            long r12 = r12.f406841b
            androidx.compose.ui.unit.B r12 = androidx.compose.ui.unit.B.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20433a2.b(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object c(long j12, boolean z12, @Y61.k SuspendLambda suspendLambda) {
        if (z12) {
            Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = K1.f27308a;
            return kotlin.G0.f406611a;
        }
        long jB2 = androidx.compose.ui.unit.B.b(0.0f, 0.0f, this.f27551d == Orientation.f27426c ? 1 : 2, j12);
        C20437b2 c20437b2 = new C20437b2(this, null);
        androidx.compose.foundation.M1 m12 = this.f27549b;
        if (m12 == null || !(this.f27548a.b() || this.f27548a.d())) {
            Object objInvoke = c20437b2.invoke(androidx.compose.ui.unit.B.a(jB2), suspendLambda);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
        }
        Object objP = m12.P(jB2, c20437b2, suspendLambda);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : kotlin.G0.f406611a;
    }

    public final float d(float f12) {
        return this.f27552e ? f12 * (-1) : f12;
    }

    public final long e(long j12) {
        return this.f27552e ? l0.g.k(j12, -1.0f) : j12;
    }

    @Y61.l
    public final Object f(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p pVar, @Y61.k ContinuationImpl continuationImpl) {
        Object objE = this.f27548a.e(mutatePriority, new C20441c2(pVar, this, null), continuationImpl);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
    }

    public final float g(long j12) {
        return Float.intBitsToFloat((int) (this.f27551d == Orientation.f27426c ? j12 >> 32 : j12 & 4294967295L));
    }

    public final long h(float f12) {
        if (f12 == 0.0f) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        if (this.f27551d == Orientation.f27426c) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            g.a aVar = l0.g.f413384b;
            return jFloatToRawIntBits;
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        g.a aVar2 = l0.g.f413384b;
        return jFloatToRawIntBits2;
    }
}
