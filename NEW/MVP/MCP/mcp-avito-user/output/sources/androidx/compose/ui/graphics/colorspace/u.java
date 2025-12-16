package androidx.compose.ui.graphics.colorspace;

import j.c0;
import kotlin.Metadata;

/* compiled from: WhitePoint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/u;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f39471a;

    /* renamed from: b, reason: collision with root package name */
    public final float f39472b;

    public u(float f12, float f13) {
        this.f39471a = f12;
        this.f39472b = f13;
    }

    @c0
    @Y61.k
    public final float[] a() {
        float f12 = this.f39471a;
        float f13 = this.f39472b;
        return new float[]{f12 / f13, 1.0f, ((1.0f - f12) - f13) / f13};
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f39471a, uVar.f39471a) == 0 && Float.compare(this.f39472b, uVar.f39472b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39472b) + (Float.hashCode(this.f39471a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f39471a);
        sb2.append(", y=");
        return androidx.appcompat.app.r.k(')', this.f39472b, sb2);
    }
}
