package X91;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f18760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18761b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18762c;

    public v(Drawable drawable, String str, String str2) {
        this.f18760a = drawable;
        this.f18761b = str;
        this.f18762c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.f18760a, vVar.f18760a) && L.f(this.f18761b, vVar.f18761b) && L.f(this.f18762c, vVar.f18762c);
    }

    public final int hashCode() {
        Drawable drawable = this.f18760a;
        return this.f18762c.hashCode() + H.d((drawable == null ? 0 : drawable.hashCode()) * 31, 31, this.f18761b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepUiItem(icon=");
        sb2.append(this.f18760a);
        sb2.append(", caption=");
        sb2.append(this.f18761b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f18762c, ')');
    }
}
