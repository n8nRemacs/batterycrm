package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a27 extends g8d {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = zxg.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public a27() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.g8d
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.g8d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g8d.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a27)) {
            return false;
        }
        a27 a27Var = (a27) obj;
        return this.c == a27Var.c && this.b == a27Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public a27(boolean z) {
        this.b = true;
        this.c = z;
    }
}
