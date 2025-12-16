package defpackage;

import android.util.Size;

/* loaded from: classes2.dex */
public final class f8h {
    public final Size a;
    public final String b;
    public final String c;

    public f8h(Size size, String str, String str2) {
        this.a = size;
        this.b = str;
        this.c = str2;
    }

    public static f8h a(f8h f8hVar, Size size, String str, String str2, int i) {
        if ((i & 1) != 0) {
            size = f8hVar.a;
        }
        if ((i & 2) != 0) {
            str = f8hVar.b;
        }
        if ((i & 4) != 0) {
            str2 = f8hVar.c;
        }
        f8hVar.getClass();
        return new f8h(size, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8h)) {
            return false;
        }
        f8h f8hVar = (f8h) obj;
        return fni.a(this.a, f8hVar.a) && fni.a(this.b, f8hVar.b) && fni.a(this.c, f8hVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(previewSize=");
        sb.append(this.a);
        sb.append(", previewBase64=");
        sb.append(this.b);
        sb.append(", placeholderUri=");
        return ho7.l(sb, this.c, ")");
    }
}
