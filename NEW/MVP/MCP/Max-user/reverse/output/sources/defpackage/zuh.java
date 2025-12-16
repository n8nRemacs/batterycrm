package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zuh implements avh {
    public final String[] a;
    public final int[] b;

    public zuh(String[] strArr, int[] iArr) {
        this.a = strArr;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zuh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        zuh zuhVar = (zuh) obj;
        return Arrays.equals(this.a, zuhVar.a) && Arrays.equals(this.b, zuhVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.j("VerifyCameraPermission(permissions=", Arrays.toString(this.a), ", grantResults=", Arrays.toString(this.b), ")");
    }
}
