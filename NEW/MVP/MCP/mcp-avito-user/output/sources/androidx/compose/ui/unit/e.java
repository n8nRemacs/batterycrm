package androidx.compose.ui.unit;

import kotlin.Metadata;

/* compiled from: Density.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/e;", "Landroidx/compose/ui/unit/d;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public final float f42844b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42845c;

    public e(float f12, float f13) {
        this.f42844b = f12;
        this.f42845c = f13;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0, reason: from getter */
    public final float getF42845c() {
        return this.f42845c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f42844b, eVar.f42844b) == 0 && Float.compare(this.f42845c, eVar.f42845c) == 0;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity, reason: from getter */
    public final float getF42844b() {
        return this.f42844b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42845c) + (Float.hashCode(this.f42844b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f42844b);
        sb2.append(", fontScale=");
        return androidx.appcompat.app.r.k(')', this.f42845c, sb2);
    }
}
