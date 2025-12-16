package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class mv5 {
    public final File a;

    public mv5(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mv5)) {
            return false;
        }
        return fni.a(this.a, ((mv5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
