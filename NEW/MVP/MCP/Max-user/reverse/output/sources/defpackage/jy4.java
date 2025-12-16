package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jy4 {
    public final DisplayCutout a;

    public jy4(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return iy4.d(this.a);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jy4.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((jy4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
