package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i8g extends g8d {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = zxg.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public i8g() {
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
        bundle.putInt(g8d.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i8g)) {
            return false;
        }
        i8g i8gVar = (i8g) obj;
        return this.c == i8gVar.c && this.b == i8gVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public i8g(boolean z) {
        this.b = true;
        this.c = z;
    }
}
