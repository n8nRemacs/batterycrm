package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class dmc extends lmc {
    public final Intent a;

    public dmc(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmc) && fni.a(this.a, ((dmc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.a + ")";
    }
}
