package ya1;

import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import kotlin.jvm.internal.L;

/* renamed from: ya1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50206b {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f443193a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f443194b;

    /* renamed from: c, reason: collision with root package name */
    public final float f443195c;

    /* renamed from: d, reason: collision with root package name */
    public final float f443196d;

    /* renamed from: e, reason: collision with root package name */
    public final float f443197e;

    /* renamed from: f, reason: collision with root package name */
    public final float f443198f;

    /* renamed from: g, reason: collision with root package name */
    public final float f443199g;

    /* renamed from: h, reason: collision with root package name */
    public final float f443200h;

    public C50206b(Bitmap bitmap, Bitmap bitmap2, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f443193a = bitmap;
        this.f443194b = bitmap2;
        this.f443195c = f12;
        this.f443196d = f13;
        this.f443197e = f14;
        this.f443198f = f15;
        this.f443199g = f16;
        this.f443200h = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50206b)) {
            return false;
        }
        C50206b c50206b = (C50206b) obj;
        return L.f(this.f443193a, c50206b.f443193a) && L.f(this.f443194b, c50206b.f443194b) && Float.compare(this.f443195c, c50206b.f443195c) == 0 && Float.compare(this.f443196d, c50206b.f443196d) == 0 && Float.compare(this.f443197e, c50206b.f443197e) == 0 && Float.compare(this.f443198f, c50206b.f443198f) == 0 && Float.compare(this.f443199g, c50206b.f443199g) == 0 && Float.compare(this.f443200h, c50206b.f443200h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f443200h) + r.d(this.f443199g, r.d(this.f443198f, r.d(this.f443197e, r.d(this.f443196d, r.d(this.f443195c, (this.f443194b.hashCode() + (this.f443193a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformedImage(borderedBitmap=");
        sb2.append(this.f443193a);
        sb2.append(", bitmap=");
        sb2.append(this.f443194b);
        sb2.append(", scaleToFrameX=");
        sb2.append(this.f443195c);
        sb2.append(", scaleToFrameY=");
        sb2.append(this.f443196d);
        sb2.append(", scaleToScreenX=");
        sb2.append(this.f443197e);
        sb2.append(", scaleToScreenY=");
        sb2.append(this.f443198f);
        sb2.append(", xOffset=");
        sb2.append(this.f443199g);
        sb2.append(", yOffset=");
        return r.k(')', this.f443200h, sb2);
    }
}
