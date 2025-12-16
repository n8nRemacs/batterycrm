package androidx.compose.ui.unit;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDensity.android.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/g;", "Landroidx/compose/ui/unit/d;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final float f42846b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42847c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0.a f42848d;

    public g(float f12, float f13, @Y61.k C0.a aVar) {
        this.f42846b = f12;
        this.f42847c = f13;
        this.f42848d = aVar;
    }

    @Override // androidx.compose.ui.unit.n
    public final float E(long j12) {
        long jC2 = y.c(j12);
        A.f42832b.getClass();
        if (!A.b(jC2, A.f42833c)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float fA2 = this.f42848d.a(y.d(j12));
        h.a aVar = h.f42849c;
        return fA2;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0, reason: from getter */
    public final float getF40390d() {
        return this.f42847c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f42846b, gVar.f42846b) == 0 && Float.compare(this.f42847c, gVar.f42847c) == 0 && L.f(this.f42848d, gVar.f42848d);
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity, reason: from getter */
    public final float getF40389c() {
        return this.f42846b;
    }

    public final int hashCode() {
        return this.f42848d.hashCode() + androidx.appcompat.app.r.d(this.f42847c, Float.hashCode(this.f42846b) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.n
    public final long s(float f12) {
        return z.f(4294967296L, this.f42848d.b(f12));
    }

    @Y61.k
    public final String toString() {
        return "DensityWithConverter(density=" + this.f42846b + ", fontScale=" + this.f42847c + ", converter=" + this.f42848d + ')';
    }
}
