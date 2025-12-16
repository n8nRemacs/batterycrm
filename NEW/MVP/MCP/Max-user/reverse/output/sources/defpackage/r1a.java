package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r1a extends nc7 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public r1a(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1a.class == obj.getClass()) {
            r1a r1aVar = (r1a) obj;
            if (this.b == r1aVar.b && this.c == r1aVar.c && this.d == r1aVar.d && Arrays.equals(this.e, r1aVar.e) && Arrays.equals(this.f, r1aVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
