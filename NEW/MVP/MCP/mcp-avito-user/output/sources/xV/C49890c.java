package xV;

import Y61.k;
import Y61.l;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.app.r;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxV/c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xV.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C49890c {

    /* renamed from: a, reason: collision with root package name */
    public final float f442510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442511b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Path f442512c = new Path();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f442513d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RectF f442514e;

    public C49890c(float f12, @InterfaceC42156l int i12) {
        this.f442510a = f12;
        this.f442511b = i12;
        Paint paint = new Paint(1);
        paint.setColor(i12);
        this.f442513d = paint;
        this.f442514e = new RectF();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49890c)) {
            return false;
        }
        C49890c c49890c = (C49890c) obj;
        return Float.compare(this.f442510a, c49890c.f442510a) == 0 && this.f442511b == c49890c.f442511b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f442511b) + (Float.hashCode(this.f442510a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Segment(value=");
        sb2.append(this.f442510a);
        sb2.append(", color=");
        return r.t(sb2, this.f442511b, ')');
    }
}
