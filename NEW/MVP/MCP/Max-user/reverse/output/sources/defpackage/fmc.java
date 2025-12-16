package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class fmc extends lmc {
    public final s5g a;
    public final s5g b;
    public final List c;
    public final Bundle d;

    public fmc(s5g s5gVar, s5g s5gVar2, List list, Bundle bundle) {
        this.a = s5gVar;
        this.b = s5gVar2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmc)) {
            return false;
        }
        fmc fmcVar = (fmc) obj;
        return fni.a(this.a, fmcVar.a) && fni.a(this.b, fmcVar.b) && fni.a(this.c, fmcVar.c) && fni.a(this.d, fmcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s5g s5gVar = this.b;
        int iL = xrf.l(this.c, (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31, 31);
        Bundle bundle = this.d;
        return iL + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
