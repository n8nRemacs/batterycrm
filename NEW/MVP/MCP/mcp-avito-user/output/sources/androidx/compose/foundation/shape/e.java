package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CornerBasedShape.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/e;", "Landroidx/compose/ui/graphics/h1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e implements h1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f30147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f30148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f30149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f30150d;

    public e(@Y61.k f fVar, @Y61.k f fVar2, @Y61.k f fVar3, @Y61.k f fVar4) {
        this.f30147a = fVar;
        this.f30148b = fVar2;
        this.f30149c = fVar3;
        this.f30150d = fVar4;
    }

    public static /* synthetic */ e c(e eVar, f fVar, f fVar2, f fVar3, f fVar4, int i12) {
        if ((i12 & 1) != 0) {
            fVar = eVar.f30147a;
        }
        if ((i12 & 2) != 0) {
            fVar2 = eVar.f30148b;
        }
        if ((i12 & 4) != 0) {
            fVar3 = eVar.f30149c;
        }
        if ((i12 & 8) != 0) {
            fVar4 = eVar.f30150d;
        }
        return eVar.b(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.ui.graphics.h1
    @Y61.k
    public final D0 a(long j12, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar) {
        float fA2 = this.f30147a.a(j12, dVar);
        float fA3 = this.f30148b.a(j12, dVar);
        float fA4 = this.f30149c.a(j12, dVar);
        float fA5 = this.f30150d.a(j12, dVar);
        float fD2 = l0.n.d(j12);
        float f12 = fA2 + fA5;
        if (f12 > fD2) {
            float f13 = fD2 / f12;
            fA2 *= f13;
            fA5 *= f13;
        }
        float f14 = fA5;
        float f15 = fA3 + fA4;
        if (f15 > fD2) {
            float f16 = fD2 / f15;
            fA3 *= f16;
            fA4 *= f16;
        }
        if (fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f || f14 < 0.0f) {
            androidx.compose.foundation.internal.e.a("Corner size in Px can't be negative(topStart = " + fA2 + ", topEnd = " + fA3 + ", bottomEnd = " + fA4 + ", bottomStart = " + f14 + ")!");
        }
        return d(j12, fA2, fA3, fA4, f14, layoutDirection);
    }

    @Y61.k
    public abstract e b(@Y61.k f fVar, @Y61.k f fVar2, @Y61.k f fVar3, @Y61.k f fVar4);

    @Y61.k
    public abstract D0 d(long j12, float f12, float f13, float f14, float f15, @Y61.k LayoutDirection layoutDirection);
}
