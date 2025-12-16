package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class baf extends f8d {
    public final int b;
    public final float c;

    public baf(int i) {
        fsi.a("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof baf)) {
            return false;
        }
        baf bafVar = (baf) obj;
        return this.b == bafVar.b && this.c == bafVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public baf(int i, float f) {
        boolean z = false;
        fsi.a("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        fsi.a("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
