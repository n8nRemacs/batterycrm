package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class xy2 extends id0 {
    public final Intent b;

    public xy2(Intent intent) {
        super(5);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy2) && fni.a(this.b, ((xy2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PickPhotoFromCamera(data=" + this.b + ")";
    }
}
