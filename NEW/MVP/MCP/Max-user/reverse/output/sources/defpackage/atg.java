package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class atg implements gud {
    public final ArrayList a;
    public final boolean b;

    public atg(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    @Override // defpackage.gud
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || atg.class != obj.getClass()) {
            return false;
        }
        atg atgVar = (atg) obj;
        return this.b == atgVar.b && this.a.equals(atgVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        return "UpdateDisplayLayoutV2Command{layouts=" + this.a + ", isSnapshot=" + this.b + '}';
    }
}
