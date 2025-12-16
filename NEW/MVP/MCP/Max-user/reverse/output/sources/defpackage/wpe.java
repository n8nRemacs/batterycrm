package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class wpe extends id0 {
    public final Intent b;

    public wpe(Intent intent) {
        super(19);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpe) && fni.a(this.b, ((wpe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
