package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes.dex */
public final class pr {
    public static final pr d;
    public final List a;
    public final List b;
    public final Drawable c;

    static {
        hd5 hd5Var = hd5.a;
        d = new pr(hd5Var, hd5Var, null);
    }

    public pr(List list, List list2, Drawable drawable) {
        this.a = list;
        this.b = list2;
        this.c = drawable;
    }

    public static pr a(pr prVar, List list, Drawable drawable) {
        List list2 = prVar.b;
        prVar.getClass();
        return new pr(list, list2, drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return fni.a(this.a, prVar.a) && fni.a(this.b, prVar.b) && fni.a(this.c, prVar.c);
    }

    public final int hashCode() {
        int iL = xrf.l(this.b, this.a.hashCode() * 31, 31);
        Drawable drawable = this.c;
        return iL + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "State(themes=" + this.a + ", modes=" + this.b + ", currentThemeDrawable=" + this.c + ")";
    }
}
