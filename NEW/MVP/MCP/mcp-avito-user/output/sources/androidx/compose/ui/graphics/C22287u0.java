package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IntervalTree.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/u0;", "T", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* renamed from: androidx.compose.ui.graphics.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22287u0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f39762a;

    /* renamed from: b, reason: collision with root package name */
    public final float f39763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final T f39764c;

    public C22287u0(float f12, float f13, @Y61.l T t12) {
        this.f39762a = f12;
        this.f39763b = f13;
        this.f39764c = t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C22287u0 c22287u0 = (C22287u0) obj;
            return this.f39762a == c22287u0.f39762a && this.f39763b == c22287u0.f39763b && kotlin.jvm.internal.L.f(this.f39764c, c22287u0.f39764c);
        }
        return false;
    }

    public final int hashCode() {
        int iD2 = androidx.appcompat.app.r.d(this.f39763b, Float.hashCode(this.f39762a) * 31, 31);
        T t12 = this.f39764c;
        return iD2 + (t12 != null ? t12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f39762a);
        sb2.append(", end=");
        sb2.append(this.f39763b);
        sb2.append(", data=");
        return androidx.compose.foundation.H.n(sb2, this.f39764c, ')');
    }

    public /* synthetic */ C22287u0(float f12, float f13, Object obj, int i12, C42822w c42822w) {
        this(f12, f13, (i12 & 4) != 0 ? null : obj);
    }
}
