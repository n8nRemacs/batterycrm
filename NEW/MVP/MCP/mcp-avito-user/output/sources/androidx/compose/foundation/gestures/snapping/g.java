package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.lazy.K;
import androidx.compose.foundation.lazy.Y;
import androidx.compose.foundation.lazy.w0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LazyListSnapLayoutInfoProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/g;", "Landroidx/compose/foundation/gestures/snapping/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f28007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f28008b;

    public g(w0 w0Var, v vVar) {
        this.f28007a = w0Var;
        this.f28008b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    @Override // androidx.compose.foundation.gestures.snapping.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r18) {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.lazy.w0 r1 = r0.f28007a
            androidx.compose.foundation.lazy.Y r2 = r1.j()
            java.util.List r2 = r2.h()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = 2139095040(0x7f800000, float:Infinity)
            r7 = r4
            r9 = r5
            r8 = -8388608(0xffffffffff800000, float:-Infinity)
        L1a:
            r10 = 0
            if (r7 >= r3) goto L93
            java.lang.Object r11 = r2.get(r7)
            androidx.compose.foundation.lazy.K r11 = (androidx.compose.foundation.lazy.K) r11
            boolean r12 = r11 instanceof androidx.compose.foundation.lazy.layout.T
            if (r12 == 0) goto L2b
            r12 = r11
            androidx.compose.foundation.lazy.layout.T r12 = (androidx.compose.foundation.lazy.layout.T) r12
            goto L2c
        L2b:
            r12 = 0
        L2c:
            if (r12 == 0) goto L36
            boolean r12 = r12.getF29662r()
            r13 = 1
            if (r12 != r13) goto L36
            goto L90
        L36:
            androidx.compose.foundation.lazy.Y r12 = r1.j()
            androidx.compose.foundation.gestures.Orientation r13 = r12.getF28950p()
            androidx.compose.foundation.gestures.Orientation r14 = androidx.compose.foundation.gestures.Orientation.f27425b
            if (r13 != r14) goto L4e
            long r12 = r12.c()
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
        L4c:
            int r12 = (int) r12
            goto L56
        L4e:
            long r12 = r12.c()
            r14 = 32
            long r12 = r12 >> r14
            goto L4c
        L56:
            androidx.compose.foundation.lazy.Y r13 = r1.j()
            int r13 = r13.d()
            androidx.compose.foundation.lazy.Y r14 = r1.j()
            int r14 = r14.getF28951q()
            int r15 = r11.getF28969q()
            int r11 = r11.getF28968p()
            androidx.compose.foundation.lazy.Y r16 = r1.j()
            r16.getF28948n()
            androidx.compose.foundation.gestures.snapping.v r6 = r0.f28008b
            int r6 = r6.c(r12, r15, r13, r14)
            float r6 = (float) r6
            float r11 = (float) r11
            float r11 = r11 - r6
            int r6 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r6 > 0) goto L87
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 <= 0) goto L87
            r8 = r11
        L87:
            int r6 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r6 < 0) goto L90
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 >= 0) goto L90
            r9 = r11
        L90:
            int r7 = r7 + 1
            goto L1a
        L93:
            androidx.compose.runtime.y1<androidx.compose.foundation.lazy.f0> r1 = r1.f29718e
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.foundation.lazy.f0 r1 = (androidx.compose.foundation.lazy.f0) r1
            androidx.compose.ui.unit.d r1 = r1.f28943i
            r2 = r18
            int r1 = androidx.compose.foundation.gestures.snapping.h.a(r2, r1)
            androidx.compose.foundation.gestures.snapping.d$a r2 = androidx.compose.foundation.gestures.snapping.d.f28003b
            r2.getClass()
            boolean r2 = androidx.compose.foundation.gestures.snapping.d.a(r1, r4)
            if (r2 == 0) goto Lbd
            float r1 = java.lang.Math.abs(r9)
            float r2 = java.lang.Math.abs(r8)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto Ld1
            goto Lc5
        Lbd:
            int r2 = androidx.compose.foundation.gestures.snapping.d.f28004c
            boolean r2 = androidx.compose.foundation.gestures.snapping.d.a(r1, r2)
            if (r2 == 0) goto Lc7
        Lc5:
            r8 = r9
            goto Ld1
        Lc7:
            int r2 = androidx.compose.foundation.gestures.snapping.d.f28005d
            boolean r1 = androidx.compose.foundation.gestures.snapping.d.a(r1, r2)
            if (r1 == 0) goto Ld0
            goto Ld1
        Ld0:
            r8 = r10
        Ld1:
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto Ld6
            goto Lde
        Ld6:
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto Ldd
            goto Lde
        Ldd:
            r10 = r8
        Lde:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.g.a(float):float");
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float b(float f12, float f13) {
        float fAbs = Math.abs(f13);
        Y yJ2 = this.f28007a.j();
        int f28969q = 0;
        if (!yJ2.h().isEmpty()) {
            int size = yJ2.h().size();
            Iterator<T> it = yJ2.h().iterator();
            while (it.hasNext()) {
                f28969q += ((K) it.next()).getF28969q();
            }
            f28969q /= size;
        }
        return Math.signum(f13) * kotlin.ranges.s.a(fAbs - f28969q, 0.0f);
    }
}
