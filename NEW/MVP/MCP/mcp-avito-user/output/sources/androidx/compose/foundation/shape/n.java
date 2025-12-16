package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: RoundedCornerShape.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/n;", "Landroidx/compose/foundation/shape/e;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n extends e {
    @Override // androidx.compose.foundation.shape.e
    public final e b(f fVar, f fVar2, f fVar3, f fVar4) {
        return new n(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @Y61.k
    public final D0 d(long j12, float f12, float f13, float f14, float f15, @Y61.k LayoutDirection layoutDirection) {
        if (f12 + f13 + f14 + f15 == 0.0f) {
            return new D0.b(l0.o.c(j12));
        }
        l0.j jVarC = l0.o.c(j12);
        LayoutDirection layoutDirection2 = LayoutDirection.f42838b;
        float f16 = layoutDirection == layoutDirection2 ? f12 : f13;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        float f17 = layoutDirection == layoutDirection2 ? f13 : f12;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L);
        float f18 = layoutDirection == layoutDirection2 ? f14 : f15;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L);
        float f19 = layoutDirection == layoutDirection2 ? f15 : f14;
        return new D0.c(new l0.l(jVarC.f413390a, jVarC.f413391b, jVarC.f413392c, jVarC.f413393d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), null));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!L.f(this.f30147a, nVar.f30147a)) {
            return false;
        }
        if (!L.f(this.f30148b, nVar.f30148b)) {
            return false;
        }
        if (L.f(this.f30149c, nVar.f30149c)) {
            return L.f(this.f30150d, nVar.f30150d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30150d.hashCode() + ((this.f30149c.hashCode() + ((this.f30148b.hashCode() + (this.f30147a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f30147a + ", topEnd = " + this.f30148b + ", bottomEnd = " + this.f30149c + ", bottomStart = " + this.f30150d + ')';
    }
}
