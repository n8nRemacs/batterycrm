package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class dm2 extends id0 {
    public final Intent b;
    public final Uri c;

    public dm2(Intent intent, Uri uri) {
        super(4);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm2)) {
            return false;
        }
        dm2 dm2Var = (dm2) obj;
        return fni.a(this.b, dm2Var.b) && fni.a(this.c, dm2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
