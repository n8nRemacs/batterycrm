package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gc7 implements ry9 {
    public final byte[] a;
    public final String b;
    public final String c;

    public gc7(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ry9
    public final void a(u19 u19Var) {
        String str = this.b;
        if (str != null) {
            u19Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gc7.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((gc7) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.j(wy1.l("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
