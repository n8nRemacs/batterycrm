package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: AbsoluteRoundedCornerShape.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/c;", "Landroidx/compose/foundation/shape/e;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends e {
    @Override // androidx.compose.foundation.shape.e
    public final e b(f fVar, f fVar2, f fVar3, f fVar4) {
        return new c(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @Y61.k
    public final D0 d(long j12, float f12, float f13, float f14, float f15, @Y61.k LayoutDirection layoutDirection) {
        if (f12 + f13 + f14 + f15 == 0.0f) {
            return new D0.b(l0.o.c(j12));
        }
        l0.j jVarC = l0.o.c(j12);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        return new D0.c(new l0.l(jVarC.f413390a, jVarC.f413391b, jVarC.f413392c, jVarC.f413393d, jFloatToRawIntBits, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), null));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!L.f(this.f30147a, cVar.f30147a)) {
            return false;
        }
        if (!L.f(this.f30148b, cVar.f30148b)) {
            return false;
        }
        if (L.f(this.f30149c, cVar.f30149c)) {
            return L.f(this.f30150d, cVar.f30150d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30150d.hashCode() + ((this.f30149c.hashCode() + ((this.f30148b.hashCode() + (this.f30147a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.f30147a + ", topRight = " + this.f30148b + ", bottomRight = " + this.f30149c + ", bottomLeft = " + this.f30150d + ')';
    }
}
