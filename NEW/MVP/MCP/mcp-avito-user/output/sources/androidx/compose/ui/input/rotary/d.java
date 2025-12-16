package androidx.compose.ui.input.rotary;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RotaryScrollEvent.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/rotary/d;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f40313a;

    /* renamed from: b, reason: collision with root package name */
    public final float f40314b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40315c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40316d;

    public d(float f12, float f13, int i12, long j12) {
        this.f40313a = f12;
        this.f40314b = f13;
        this.f40315c = j12;
        this.f40316d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f40313a == this.f40313a && dVar.f40314b == this.f40314b && dVar.f40315c == this.f40315c && dVar.f40316d == this.f40316d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40316d) + r.g(r.d(this.f40314b, Float.hashCode(this.f40313a) * 31, 31), 31, this.f40315c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f40313a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f40314b);
        sb2.append(",uptimeMillis=");
        sb2.append(this.f40315c);
        sb2.append(",deviceId=");
        return r.t(sb2, this.f40316d, ')');
    }
}
