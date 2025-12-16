package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class eib extends cda {
    public final Intent b;
    public final Uri c;

    public eib(Intent intent, Uri uri) {
        super(qqg.a);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eib)) {
            return false;
        }
        eib eibVar = (eib) obj;
        return fni.a(this.b, eibVar.b) && fni.a(this.c, eibVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
