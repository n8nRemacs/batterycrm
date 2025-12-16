package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class agc extends id0 {
    public final Intent b;

    public agc(Intent intent) {
        super(14);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agc) && fni.a(this.b, ((agc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
