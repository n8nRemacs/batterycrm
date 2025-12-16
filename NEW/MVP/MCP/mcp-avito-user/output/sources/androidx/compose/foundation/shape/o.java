package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RoundedCornerShape.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final n f30153a;

    static {
        f fVarA = g.a();
        f30153a = new n(fVarA, fVarA, fVarA, fVarA);
    }

    @Y61.k
    public static final n a(float f12) {
        f fVarB = g.b(f12);
        return new n(fVarB, fVarB, fVarB, fVarB);
    }

    @Y61.k
    public static final n b(float f12, float f13, float f14, float f15) {
        return new n(g.b(f12), g.b(f13), g.b(f14), g.b(f15));
    }

    public static n c(float f12, float f13, float f14, float f15, int i12) {
        if ((i12 & 1) != 0) {
            f12 = 0;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        }
        if ((i12 & 2) != 0) {
            f13 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        if ((i12 & 4) != 0) {
            f14 = 0;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        }
        if ((i12 & 8) != 0) {
            f15 = 0;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        }
        return b(f12, f13, f14, f15);
    }
}
