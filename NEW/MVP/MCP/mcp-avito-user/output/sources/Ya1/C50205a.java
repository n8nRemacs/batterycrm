package ya1;

import androidx.appcompat.app.r;

/* renamed from: ya1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50205a {

    /* renamed from: a, reason: collision with root package name */
    public final float f443190a;

    /* renamed from: b, reason: collision with root package name */
    public final float f443191b;

    /* renamed from: c, reason: collision with root package name */
    public final float f443192c;

    public C50205a(float f12, float f13, float f14) {
        this.f443190a = f12;
        this.f443191b = f13;
        this.f443192c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50205a)) {
            return false;
        }
        C50205a c50205a = (C50205a) obj;
        return Float.compare(this.f443190a, c50205a.f443190a) == 0 && Float.compare(this.f443191b, c50205a.f443191b) == 0 && Float.compare(this.f443192c, c50205a.f443192c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f443192c) + r.d(this.f443191b, Float.hashCode(this.f443190a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RGBAverage(r=");
        sb2.append(this.f443190a);
        sb2.append(", g=");
        sb2.append(this.f443191b);
        sb2.append(", b=");
        return r.k(')', this.f443192c, sb2);
    }
}
