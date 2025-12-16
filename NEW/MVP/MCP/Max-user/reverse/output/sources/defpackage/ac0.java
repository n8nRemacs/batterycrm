package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ac0 {
    public final String a;
    public final byte[] b;
    public final l9c c;

    public ac0(String str, byte[] bArr, l9c l9cVar) {
        this.a = str;
        this.b = bArr;
        this.c = l9cVar;
    }

    public static ka5 a() {
        ka5 ka5Var = new ka5();
        ka5Var.c = l9c.a;
        return ka5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ac0) {
            ac0 ac0Var = (ac0) obj;
            if (this.a.equals(ac0Var.a) && Arrays.equals(this.b, ac0Var.b) && this.c.equals(ac0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return ho7.l(sb, strEncodeToString, ")");
    }
}
