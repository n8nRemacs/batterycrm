package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class uxe implements pr9 {
    public final float a;
    public final float b;
    public final Bundle c;
    public final r5g d;
    public final List e;

    public uxe(float f, float f2, r5g r5gVar, Bundle bundle, List list) {
        this.a = f;
        this.b = f2;
        this.c = bundle;
        this.d = r5gVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxe)) {
            return false;
        }
        uxe uxeVar = (uxe) obj;
        return Float.compare(this.a, uxeVar.a) == 0 && Float.compare(this.b, uxeVar.b) == 0 && this.c.equals(uxeVar.c) && this.d.equals(uxeVar.d) && this.e.equals(uxeVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + hf3.b(Float.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowLinkContextMenu(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", headerTitle=");
        sb.append(this.d);
        sb.append(", actions=");
        return az1.j(sb, this.e, ")");
    }
}
