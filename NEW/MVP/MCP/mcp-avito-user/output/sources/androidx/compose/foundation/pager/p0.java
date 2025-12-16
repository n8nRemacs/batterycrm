package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.v;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: PagerState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f30020a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Z f30021b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f30022c;

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/pager/p0$b", "Landroidx/compose/ui/unit/d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.unit.d {
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

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f30020a = 56;
        f30021b = new Z(C42784z0.f406748b, 0, 0, 0, Orientation.f27426c, 0, 0, false, 0, null, null, 0.0f, 0, false, v.c.f28056a, new a(), false, null, null, kotlinx.coroutines.U.a(EmptyCoroutineContext.INSTANCE), 393216, null);
        f30022c = new b();
    }

    public static final long a(@Y61.k K k12, int i12) {
        long f29867b = (((i12 * (k12.getF29867b() + k12.getF29868c())) + k12.d()) + k12.getF29869d()) - k12.getF29868c();
        int iC2 = (int) (k12.getF29870e() == Orientation.f27426c ? k12.c() >> 32 : k12.c() & 4294967295L);
        return kotlin.ranges.s.b(f29867b - (iC2 - kotlin.ranges.s.g(k12.getF29880o().c(iC2, k12.getF29867b(), k12.d(), k12.getF29869d()), 0, iC2)), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.pager.m0 b(@Y61.k Y41.a r7, @Y61.l androidx.compose.runtime.A r8) {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            androidx.compose.foundation.pager.b$c r2 = androidx.compose.foundation.pager.C20808b.f29888K
            r2.getClass()
            androidx.compose.runtime.saveable.w r2 = androidx.compose.foundation.pager.C20808b.f29889L
            boolean r0 = r8.m(r0)
            r3 = 0
            boolean r3 = r8.k(r3)
            r0 = r0 | r3
            java.lang.Object r3 = r8.t()
            if (r0 != 0) goto L23
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r0) goto L2b
        L23:
            androidx.compose.foundation.pager.r0 r3 = new androidx.compose.foundation.pager.r0
            r3.<init>(r7)
            r8.H(r3)
        L2b:
            Y41.a r3 = (Y41.a) r3
            r5 = 0
            r6 = 4
            r4 = r8
            java.lang.Object r8 = androidx.compose.runtime.saveable.j.c(r1, r2, r3, r4, r5, r6)
            androidx.compose.foundation.pager.b r8 = (androidx.compose.foundation.pager.C20808b) r8
            androidx.compose.runtime.y1<Y41.a<java.lang.Integer>> r0 = r8.f29890J
            androidx.compose.runtime.i3 r0 = (androidx.compose.runtime.C22082i3) r0
            r0.setValue(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.p0.b(Y41.a, androidx.compose.runtime.A):androidx.compose.foundation.pager.m0");
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/pager/p0$a", "Landroidx/compose/ui/layout/j0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22367j0 {

        /* renamed from: a, reason: collision with root package name */
        public final Map<AbstractC22348a, Integer> f30023a = P0.c();

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getHeight */
        public final int getF40395b() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getWidth */
        public final int getF40394a() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Map<AbstractC22348a, Integer> t() {
            return this.f30023a;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final void u() {
        }
    }
}
