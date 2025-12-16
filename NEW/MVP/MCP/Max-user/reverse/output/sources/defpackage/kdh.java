package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class kdh implements ldh {
    public final float[] a;

    public kdh(float[] fArr) {
        this.a = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdh) && fni.a(this.a, ((kdh) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("WithCorners(corners=", Arrays.toString(this.a), ")");
    }
}
