package androidx.compose.material;

import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V6 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33279a;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33279a = 4;
        androidx.compose.ui.unit.z.e(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.v r24, @Y61.k Y41.p r25, @Y61.l androidx.compose.runtime.internal.C22096n r26, @Y61.l androidx.compose.runtime.internal.C22096n r27, @Y61.l androidx.compose.runtime.internal.C22096n r28, @Y61.l androidx.compose.runtime.internal.C22096n r29, boolean r30, float r31, @Y61.k Y41.l r32, @Y61.k androidx.compose.runtime.internal.C22096n r33, @Y61.k androidx.compose.foundation.layout.T1 r34, @Y61.l androidx.compose.runtime.A r35, int r36) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.V6.a(androidx.compose.ui.v, Y41.p, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, boolean, float, Y41.l, androidx.compose.runtime.internal.n, androidx.compose.foundation.layout.T1, androidx.compose.runtime.A, int):void");
    }

    public static final int b(int i12, int i13, int i14, int i15, int i16, float f12, long j12, float f13, androidx.compose.foundation.layout.T1 t12) {
        int iMax = Math.max(i14, Math.max(i16, E0.e.c(f12, i15, 0)));
        float f28512b = t12.getF28512b() * f13;
        return C22713c.f(Math.max(i12, Math.max(i13, kotlin.math.b.b(E0.e.b(f28512b, Math.max(f28512b, i15 / 2.0f), f12) + iMax + (t12.getF28514d() * f13)))), j12);
    }

    public static final int c(int i12, int i13, int i14, int i15, int i16, float f12, long j12, float f13, androidx.compose.foundation.layout.T1 t12) {
        int iMax = Math.max(i14, Math.max(E0.e.c(f12, i15, 0), i16)) + i12 + i13;
        LayoutDirection layoutDirection = LayoutDirection.f42838b;
        float fA2 = t12.a(layoutDirection) + t12.c(layoutDirection);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return C22713c.g(Math.max(iMax, kotlin.math.b.b((i15 + (fA2 * f13)) * f12)), j12);
    }
}
