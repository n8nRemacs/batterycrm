package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class wv3 {
    public final w10 a;
    public final String b;
    public final List c;

    public wv3(w10 w10Var, String str, ArrayList arrayList) {
        this.a = w10Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wv3) {
            wv3 wv3Var = (wv3) obj;
            String str = wv3Var.b;
            w10 w10Var = wv3Var.a;
            if (Objects.equals(this.b, str) && Objects.equals(this.a, w10Var) && Objects.equals(this.c, w10Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartMessage{media='");
        sb.append(this.a);
        sb.append("'text='");
        sb.append(this.b);
        sb.append("'elements='");
        return az1.j(sb, this.c, "'}");
    }
}
