package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: LazyGridState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C20689o0 f29065a;

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "", "Lkotlin/Q;", "Landroidx/compose/ui/unit/b;", "invoke", "(I)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Integer, List<? extends kotlin.Q<? extends Integer, ? extends C22712b>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f29067l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends kotlin.Q<? extends Integer, ? extends C22712b>> invoke(Integer num) {
            num.intValue();
            return C42784z0.f406748b;
        }
    }

    static {
        a aVar = new a();
        C42784z0 c42784z0 = C42784z0.f406748b;
        Orientation orientation = Orientation.f27425b;
        f29065a = new C20689o0(null, 0, false, 0.0f, aVar, 0.0f, false, kotlinx.coroutines.U.a(EmptyCoroutineContext.INSTANCE), androidx.compose.ui.unit.f.b(), 0, b.f29067l, c42784z0, 0, 0, 0, false, orientation, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.I0 a(int r7, int r8, @Y61.l androidx.compose.runtime.A r9) {
        /*
            r8 = r8 & 1
            r0 = 0
            if (r8 == 0) goto L6
            r7 = r0
        L6:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            androidx.compose.foundation.lazy.grid.I0$c r8 = androidx.compose.foundation.lazy.grid.I0.f29017w
            r8.getClass()
            androidx.compose.runtime.saveable.w r2 = androidx.compose.foundation.lazy.grid.I0.f29018x
            boolean r8 = r9.m(r7)
            boolean r0 = r9.m(r0)
            r8 = r8 | r0
            java.lang.Object r0 = r9.t()
            if (r8 != 0) goto L27
            androidx.compose.runtime.A$a r8 = androidx.compose.runtime.A.f37866a
            r8.getClass()
            androidx.compose.runtime.A$a$a r8 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r8) goto L2f
        L27:
            androidx.compose.foundation.lazy.grid.N0 r0 = new androidx.compose.foundation.lazy.grid.N0
            r0.<init>(r7)
            r9.H(r0)
        L2f:
            r3 = r0
            Y41.a r3 = (Y41.a) r3
            r5 = 0
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.j.c(r1, r2, r3, r4, r5, r6)
            androidx.compose.foundation.lazy.grid.I0 r7 = (androidx.compose.foundation.lazy.grid.I0) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.M0.a(int, int, androidx.compose.runtime.A):androidx.compose.foundation.lazy.grid.I0");
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/grid/M0$a", "Landroidx/compose/ui/layout/j0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22367j0 {

        /* renamed from: a, reason: collision with root package name */
        public final Map<AbstractC22348a, Integer> f29066a = kotlin.collections.P0.c();

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
            return this.f29066a;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final void u() {
        }
    }
}
