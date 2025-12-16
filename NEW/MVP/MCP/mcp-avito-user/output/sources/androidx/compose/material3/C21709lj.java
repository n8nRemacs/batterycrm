package androidx.compose.material3;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: TextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21709lj {

    /* renamed from: a, reason: collision with root package name */
    public static final float f36816a;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f36816a = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.v.a r35, @Y61.k Y41.p r36, @Y61.l androidx.compose.runtime.internal.C22096n r37, @Y61.l androidx.compose.runtime.internal.C22096n r38, @Y61.l androidx.compose.runtime.internal.C22096n r39, @Y61.l androidx.compose.runtime.internal.C22096n r40, @Y61.l androidx.compose.runtime.internal.C22096n r41, @Y61.l androidx.compose.runtime.internal.C22096n r42, boolean r43, float r44, @Y61.k androidx.compose.runtime.internal.C22096n r45, @Y61.l androidx.compose.runtime.internal.C22096n r46, @Y61.k androidx.compose.foundation.layout.T1 r47, @Y61.l androidx.compose.runtime.A r48, int r49) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21709lj.a(androidx.compose.ui.v$a, Y41.p, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, boolean, float, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.foundation.layout.T1, androidx.compose.runtime.A, int):void");
    }

    public static final int b(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f12, long j12, float f13, androidx.compose.foundation.layout.T1 t12) {
        boolean z12 = i13 > 0;
        float f28514d = t12.getF28514d() + t12.getF28512b();
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float fB2 = f28514d * f13;
        if (z12) {
            fB2 = E0.e.b(C21457aj.f36050b * 2 * f13, fB2, f12);
        }
        return Math.max(C22712b.k(j12), Math.max(i14, Math.max(i15, kotlin.math.b.b(fB2 + E0.e.c(f12, 0, i13) + kotlin.comparisons.a.c(i12, i18, i16, i17, E0.e.c(f12, i13, 0))))) + i19);
    }

    public static final int c(boolean z12, int i12, int i13, androidx.compose.ui.layout.K0 k02) {
        if (!z12) {
            return i13;
        }
        InterfaceC22215f.f39074a.getClass();
        return InterfaceC22215f.a.f39086l.a(k02.f40346c, i12);
    }
}
