package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class iuh implements avh {
    public final int a;
    public final String[] b;

    public iuh(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iuh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        iuh iuhVar = (iuh) obj;
        return this.a == iuhVar.a && Arrays.equals(this.b, iuhVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "OpenGallery(mode=" + this.a + ", mimeTypes=" + Arrays.toString(this.b) + ")";
    }
}
