package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22713c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: LazyListState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f0 f28808a = new f0(null, 0, false, 0.0f, new a(), 0.0f, false, kotlinx.coroutines.U.a(EmptyCoroutineContext.INSTANCE), androidx.compose.ui.unit.f.b(), C22713c.b(0, 0, 15), C42784z0.f406748b, 0, 0, 0, false, Orientation.f27425b, 0, 0, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.w0 a(int r8, int r9, int r10, @Y61.l androidx.compose.runtime.A r11) {
        /*
            r0 = 1
            r10 = r10 & r0
            r1 = 0
            if (r10 == 0) goto L6
            r8 = r1
        L6:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            androidx.compose.foundation.lazy.w0$c r10 = androidx.compose.foundation.lazy.w0.f29712w
            r10.getClass()
            androidx.compose.runtime.saveable.w r3 = androidx.compose.foundation.lazy.w0.f29713x
            boolean r10 = r11.m(r8)
            r4 = r9 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ 48
            r5 = 32
            if (r4 <= r5) goto L21
            boolean r4 = r11.m(r1)
            if (r4 != 0) goto L27
        L21:
            r9 = r9 & 48
            if (r9 != r5) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            r9 = r10 | r0
            java.lang.Object r10 = r11.t()
            if (r9 != 0) goto L38
            androidx.compose.runtime.A$a r9 = androidx.compose.runtime.A.f37866a
            r9.getClass()
            androidx.compose.runtime.A$a$a r9 = androidx.compose.runtime.A.a.f37868b
            if (r10 != r9) goto L40
        L38:
            androidx.compose.foundation.lazy.B0 r10 = new androidx.compose.foundation.lazy.B0
            r10.<init>(r8, r1)
            r11.H(r10)
        L40:
            r4 = r10
            Y41.a r4 = (Y41.a) r4
            r6 = 0
            r7 = 4
            r5 = r11
            java.lang.Object r8 = androidx.compose.runtime.saveable.j.c(r2, r3, r4, r5, r6, r7)
            androidx.compose.foundation.lazy.w0 r8 = (androidx.compose.foundation.lazy.w0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.A0.a(int, int, int, androidx.compose.runtime.A):androidx.compose.foundation.lazy.w0");
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/A0$a", "Landroidx/compose/ui/layout/j0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22367j0 {

        /* renamed from: a, reason: collision with root package name */
        public final Map<AbstractC22348a, Integer> f28809a = P0.c();

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getHeight */
        public final int getF40585c() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getWidth */
        public final int getF40584b() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Map<AbstractC22348a, Integer> t() {
            return this.f28809a;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final void u() {
        }
    }
}
