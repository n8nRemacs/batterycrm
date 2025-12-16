package defpackage;

/* loaded from: classes2.dex */
public final class xoh {
    public static final woh Companion = new woh();
    public final String a;
    public final boolean b;

    public /* synthetic */ xoh(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, voh.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoh)) {
            return false;
        }
        xoh xohVar = (xoh) obj;
        return fni.a(this.a, xohVar.a) && this.b == xohVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppChangeScreenBrightness(requestId=" + this.a + ", maxBrightness=" + this.b + ")";
    }

    public xoh(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
