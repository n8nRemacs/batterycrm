package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class ojc implements rjc {
    public final s5g a;
    public final s5g b;
    public final List c;
    public final Bundle d;

    public ojc(s5g s5gVar, s5g s5gVar2, List list, Bundle bundle) {
        this.a = s5gVar;
        this.b = s5gVar2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojc)) {
            return false;
        }
        ojc ojcVar = (ojc) obj;
        return fni.a(this.a, ojcVar.a) && fni.a(this.b, ojcVar.b) && fni.a(this.c, ojcVar.c) && fni.a(this.d, ojcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s5g s5gVar = this.b;
        return this.d.hashCode() + xrf.l(this.c, (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowConfirmationDialog(title=" + this.a + ", subtitle=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
