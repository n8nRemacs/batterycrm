package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class ok9 implements qk9 {
    public final Layout a;

    public ok9(Layout layout) {
        this.a = layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok9) && fni.a(this.a, ((ok9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Simple(bodyLayout=" + this.a + ")";
    }
}
