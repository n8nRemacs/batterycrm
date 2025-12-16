package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ww1 {
    public final List a;
    public final boolean b;

    public ww1(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww1)) {
            return false;
        }
        ww1 ww1Var = (ww1) obj;
        return fni.a(this.a, ww1Var.a) && this.b == ww1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CallsHistoryState(tabs=" + this.a + ", isBannerVisible=" + this.b + ")";
    }
}
