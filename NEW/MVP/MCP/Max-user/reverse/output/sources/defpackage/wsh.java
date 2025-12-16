package defpackage;

/* loaded from: classes2.dex */
public final class wsh {
    public static final vsh Companion = new vsh();
    public final String a;
    public final String b;

    public /* synthetic */ wsh(int i, String str, String str2) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, ush.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsh)) {
            return false;
        }
        wsh wshVar = (wsh) obj;
        return fni.a(this.a, wshVar.a) && fni.a(this.b, wshVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("WebAppOpenCodeReaderResponse(requestId=", this.a, ", value=", this.b, ")");
    }

    public wsh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
