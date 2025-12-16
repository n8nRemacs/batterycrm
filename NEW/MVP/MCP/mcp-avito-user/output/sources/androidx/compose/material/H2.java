package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: ElevationOverlay.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/H2;", "Landroidx/compose/material/c4;", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H2 implements InterfaceC21128c4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H2 f32706a = new H2();

    @Override // androidx.compose.material.InterfaceC21128c4
    @InterfaceC22029a2
    @InterfaceC22132o
    public final long a(long j12, float f12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.C(-1687113661);
        C21365u5.f34242a.getClass();
        C21308q2 c21308q2A = C21365u5.a(a12);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        if (Float.compare(f12, 0) <= 0 || c21308q2A.g()) {
            a12.C(1169156439);
            a12.h();
        } else {
            a12.C(1169017931);
            androidx.compose.runtime.J3 j32 = C21141d4.f33519a;
            j12 = androidx.compose.ui.graphics.V.g(androidx.compose.ui.graphics.T.c(C21320r2.a(j12, a12), ((((float) Math.log(f12 + 1)) * 4.5f) + 2.0f) / 100.0f), j12);
            a12.h();
        }
        a12.h();
        return j12;
    }
}
