package xV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ProgressBarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxV/e;", "LxV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements InterfaceC49889b {

    /* renamed from: a, reason: collision with root package name */
    public final float f442516a;

    public e(float f12) {
        this.f442516a = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f442516a, ((e) obj).f442516a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f442516a);
    }

    @k
    public final String toString() {
        return r.k(')', this.f442516a, new StringBuilder("SingleLine(value="));
    }
}
