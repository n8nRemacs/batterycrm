package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class zf3 {
    public final List a;

    public zf3(List list) {
        this.a = list;
    }

    public final String a(Context context) {
        return ue3.N(this.a, "\n", null, null, new xd0(context, 2), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf3) && fni.a(this.a, ((zf3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CombinedError(errors=" + this.a + ")";
    }
}
