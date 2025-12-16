package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AbsoluteCutCornerShape.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/a;", "Landroidx/compose/foundation/shape/e;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends e {
    @Override // androidx.compose.foundation.shape.e
    public final e b(f fVar, f fVar2, f fVar3, f fVar4) {
        return new a(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @Y61.k
    public final D0 d(long j12, float f12, float f13, float f14, float f15, @Y61.k LayoutDirection layoutDirection) {
        if (f12 + f13 + f15 + f14 == 0.0f) {
            return new D0.b(l0.o.c(j12));
        }
        C22277p c22277pA = C22315w.a();
        c22277pA.i(0.0f, f12);
        c22277pA.r(f12, 0.0f);
        int i12 = (int) (j12 >> 32);
        c22277pA.r(Float.intBitsToFloat(i12) - f13, 0.0f);
        c22277pA.r(Float.intBitsToFloat(i12), f13);
        int i13 = (int) (j12 & 4294967295L);
        c22277pA.r(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13) - f14);
        c22277pA.r(Float.intBitsToFloat(i12) - f14, Float.intBitsToFloat(i13));
        c22277pA.r(f15, Float.intBitsToFloat(i13));
        c22277pA.r(0.0f, Float.intBitsToFloat(i13) - f15);
        c22277pA.close();
        return new D0.a(c22277pA);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!L.f(this.f30147a, aVar.f30147a)) {
            return false;
        }
        if (!L.f(this.f30148b, aVar.f30148b)) {
            return false;
        }
        if (L.f(this.f30149c, aVar.f30149c)) {
            return L.f(this.f30150d, aVar.f30150d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30150d.hashCode() + ((this.f30149c.hashCode() + ((this.f30148b.hashCode() + (this.f30147a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + this.f30147a + ", topRight = " + this.f30148b + ", bottomRight = " + this.f30149c + ", bottomLeft = " + this.f30150d + ')';
    }
}
