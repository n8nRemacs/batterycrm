package Fc1;

import androidx.compose.runtime.C22026a;

/* loaded from: classes9.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5148a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5149b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5150c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f5151d;

    public P7(float f12, float f13, float f14, @Y61.k String str) {
        this.f5148a = f12;
        this.f5149b = f13;
        this.f5150c = f14;
        this.f5151d = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P7)) {
            return false;
        }
        P7 p72 = (P7) obj;
        return Float.compare(this.f5148a, p72.f5148a) == 0 && Float.compare(this.f5149b, p72.f5149b) == 0 && Float.compare(this.f5150c, p72.f5150c) == 0 && kotlin.jvm.internal.L.f(this.f5151d, p72.f5151d);
    }

    public final int hashCode() {
        return this.f5151d.hashCode() + androidx.appcompat.app.r.d(this.f5150c, androidx.appcompat.app.r.d(this.f5149b, Float.hashCode(this.f5148a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedbackRulerItem(start=");
        sb2.append(this.f5148a);
        sb2.append(", center=");
        sb2.append(this.f5149b);
        sb2.append(", end=");
        sb2.append(this.f5150c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f5151d, ')');
    }
}
