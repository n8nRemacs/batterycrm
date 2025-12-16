package androidx.window.core;

import android.graphics.Rect;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;

/* compiled from: Bounds.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/c;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f55178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55181d;

    public c(int i12, int i13, int i14, int i15) {
        this.f55178a = i12;
        this.f55179b = i13;
        this.f55180c = i14;
        this.f55181d = i15;
        if (i12 > i14) {
            throw new IllegalArgumentException(H.j(i12, i14, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i13 > i15) {
            throw new IllegalArgumentException(H.j(i13, i15, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f55181d - this.f55179b;
    }

    public final int b() {
        return this.f55180c - this.f55178a;
    }

    @Y61.k
    public final Rect c() {
        return new Rect(this.f55178a, this.f55179b, this.f55180c, this.f55181d);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f55178a == cVar.f55178a && this.f55179b == cVar.f55179b && this.f55180c == cVar.f55180c && this.f55181d == cVar.f55181d;
    }

    public final int hashCode() {
        return (((((this.f55178a * 31) + this.f55179b) * 31) + this.f55180c) * 31) + this.f55181d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        r.C(c.class, sb2, " { [");
        sb2.append(this.f55178a);
        sb2.append(',');
        sb2.append(this.f55179b);
        sb2.append(',');
        sb2.append(this.f55180c);
        sb2.append(',');
        return AK.c.i(this.f55181d, "] }", sb2);
    }

    public c(@Y61.k Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
