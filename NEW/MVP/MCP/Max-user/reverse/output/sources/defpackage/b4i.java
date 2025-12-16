package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class b4i extends a4i {
    public b4i(g4i g4iVar, WindowInsets windowInsets) {
        super(g4iVar, windowInsets);
    }

    @Override // defpackage.e4i
    public g4i a() {
        return g4i.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.e4i
    public jy4 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new jy4(displayCutout);
    }

    @Override // defpackage.z3i, defpackage.e4i
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4i)) {
            return false;
        }
        b4i b4iVar = (b4i) obj;
        return Objects.equals(this.c, b4iVar.c) && Objects.equals(this.g, b4iVar.g);
    }

    @Override // defpackage.e4i
    public int hashCode() {
        return this.c.hashCode();
    }
}
