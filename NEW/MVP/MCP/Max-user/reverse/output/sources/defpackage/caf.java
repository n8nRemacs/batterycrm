package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class caf extends g8d {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = zxg.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public caf(int i) {
        hsi.a("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    @Override // defpackage.g8d
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.g8d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g8d.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof caf)) {
            return false;
        }
        caf cafVar = (caf) obj;
        return this.b == cafVar.b && this.c == cafVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public caf(int i, float f) {
        boolean z = false;
        hsi.a("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        hsi.a("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
