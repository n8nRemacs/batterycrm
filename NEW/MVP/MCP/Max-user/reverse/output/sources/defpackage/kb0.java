package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class kb0 {
    public final zr4 a;
    public final List b;
    public final int c;
    public final int d;
    public final u75 e;

    public kb0(zr4 zr4Var, List list, int i, int i2, u75 u75Var) {
        this.a = zr4Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = u75Var;
    }

    public static w86 a(zr4 zr4Var) {
        w86 w86Var = new w86();
        if (zr4Var == null) {
            throw new NullPointerException("Null surface");
        }
        w86Var.a = zr4Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        w86Var.b = list;
        w86Var.c = -1;
        w86Var.d = -1;
        w86Var.e = u75.d;
        return w86Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        return this.a.equals(kb0Var.a) && this.b.equals(kb0Var.b) && this.c == kb0Var.c && this.d == kb0Var.d && this.e.equals(kb0Var.e);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
