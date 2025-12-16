package androidx.compose.material.ripple;

import androidx.compose.runtime.H0;
import kotlin.Metadata;

/* compiled from: RippleTheme.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/l;", "", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f34097a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34098b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34099c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34100d;

    public l(float f12, float f13, float f14, float f15) {
        this.f34097a = f12;
        this.f34098b = f13;
        this.f34099c = f14;
        this.f34100d = f15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f34097a == lVar.f34097a && this.f34098b == lVar.f34098b && this.f34099c == lVar.f34099c && this.f34100d == lVar.f34100d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34100d) + androidx.appcompat.app.r.d(this.f34099c, androidx.appcompat.app.r.d(this.f34098b, Float.hashCode(this.f34097a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f34097a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f34098b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f34099c);
        sb2.append(", pressedAlpha=");
        return androidx.appcompat.app.r.k(')', this.f34100d, sb2);
    }
}
