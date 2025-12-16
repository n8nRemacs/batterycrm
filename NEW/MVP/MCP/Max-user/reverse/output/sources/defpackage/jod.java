package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jod {
    public final Resources a;
    public final Resources.Theme b;

    public jod(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jod.class == obj.getClass()) {
            jod jodVar = (jod) obj;
            if (this.a.equals(jodVar.a) && Objects.equals(this.b, jodVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
