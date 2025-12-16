package androidx.compose.material;

import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: TextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Vb {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33288a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f33289b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33290c;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33288a = 20;
        f33289b = 10;
        f33290c = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.v r23, @Y61.k Y41.p r24, @Y61.l androidx.compose.runtime.internal.C22096n r25, @Y61.l androidx.compose.runtime.internal.C22096n r26, @Y61.l androidx.compose.runtime.internal.C22096n r27, @Y61.l androidx.compose.runtime.internal.C22096n r28, boolean r29, float r30, @Y61.k androidx.compose.foundation.layout.T1 r31, @Y61.l androidx.compose.runtime.A r32, int r33) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Vb.a(androidx.compose.ui.v, Y41.p, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, boolean, float, androidx.compose.foundation.layout.T1, androidx.compose.runtime.A, int):void");
    }

    public static final int b(int i12, boolean z12, int i13, int i14, int i15, int i16, long j12, float f12, androidx.compose.foundation.layout.T1 t12) {
        float f13 = f33290c * f12;
        float f28512b = t12.getF28512b() * f12;
        float f28514d = t12.getF28514d() * f12;
        int iMax = Math.max(i12, i16);
        return C22713c.f(Math.max(kotlin.math.b.b(z12 ? i13 + f13 + iMax + f28514d : f28512b + iMax + f28514d), Math.max(i14, i15)), j12);
    }
}
