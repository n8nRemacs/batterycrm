package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class eqb extends g8d {
    public static final String c;
    public final float b;

    static {
        String str = zxg.a;
        c = Integer.toString(1, 36);
    }

    public eqb() {
        this.b = -1.0f;
    }

    @Override // defpackage.g8d
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.g8d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g8d.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eqb) {
            return this.b == ((eqb) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public eqb(float f) {
        hsi.a("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }
}
